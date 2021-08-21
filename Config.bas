B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Type Track(LabelNum As Int, LabelName As String, Selected As Boolean)
	Type Link(LabelNum As Int, LabelLink As String, uris As String, Selected As Boolean)
	Private XUI As XUI
	Private CLVTracks As CustomListView
	Private CLVLinks As CustomListView
	Private SelectedTracks As B4XOrderedMap
	Private txtFilter As EditText
	Private LblName As B4XView
	Private LblNum As B4XView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Config")
	Activity.Title = "Configuration"
	
	If FirstTime Then
		SelectedTracks.Initialize
	End If
	
	If Common.Tracks.Size > 0 Then
		BuildTrackItems
	End If
	
	If Common.LinkedTracks.Size > 0 Then
		BuildLinkItems
	End If
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub BuildTrackItems
	For i = 0 To Common.Tracks.Size-1
		Dim track As Track
		track.Initialize
		track.LabelNum = i+1
		track.LabelName = Common.Tracks.Keys.Get(i)
		Dim Pnl As B4XView = XUI.CreatePanel(Null)
		Pnl.Color = XUI.Color_White
		Pnl.SetLayoutAnimated(0dip, 0dip, 0dip, CLVTracks.AsView.Width, 50dip)
		CLVTracks.Add(Pnl, track)
	Next
End Sub

Sub SelectTrack(track As Track)
	track.Selected = Not(track.Selected)
	
	If track.Selected Then
		SelectedTracks.Put(track.LabelName, Common.Tracks.Get(track.LabelName))
	Else
		SelectedTracks.Remove(track.LabelName)
	End If
End Sub

Sub StyleTrack(track As Track, trackPnl As B4XView)
	LblName = trackPnl.GetView(0)
	LblName.Tag = trackPnl
	LblNum = trackPnl.GetView(1)
	LblName.Text = track.LabelName
	
	If track.Selected Then
		LblNum.TextColor = XUI.Color_Green
		LblNum.Text = Chr(2713)
		LblName.TextColor = XUI.Color_Green
	Else
		LblNum.TextColor = XUI.Color_Black
		LblNum.Text = track.LabelNum
		LblName.TextColor = XUI.Color_Black
	End If
End Sub

Sub BuildLinkItems
	For i = 0 To Common.LinkedTracks.Size-1
		AddLink(Common.LinkedTracks.Get(i))
	Next
End Sub

Sub AddLink(linkMap As OrderedMap)
	Dim link As Link
	link.Initialize
	link.LabelNum = CLVLinks.Size+1
	link.LabelLink = StringifyLink(linkMap)
	link.uris = StringifyUris(linkMap)
	Dim Pnl As B4XView = XUI.CreatePanel(Null)
	Pnl.Color = XUI.Color_White
	Pnl.SetLayoutAnimated(0dip, 0dip, 0dip, CLVLinks.AsView.Width, 50dip)
	CLVLinks.Add(Pnl, link)
End Sub

Sub StringifyLink(link As OrderedMap) As String
	Dim stringLink As StringBuilder
	stringLink.Initialize
	
	For i = 0 To link.keys.Size-1
		If i = link.keys.Size-1 Then
			stringLink.Append(link.Keys.Get(i))
		Else
			stringLink.Append(link.Keys.Get(i) & " - ")
		End If
	Next
	
	Return stringLink.ToString
End Sub

Sub StringifyUris(link As OrderedMap) As String
	Dim stringUris As StringBuilder
	stringUris.Initialize
	
	For i = 0 To link.keys.Size-1
		If i = link.keys.Size-1 Then
			stringUris.Append(link.Map.Get(link.Keys.Get(i)))
		Else
			stringUris.Append(link.Map.Get(link.Keys.Get(i)) & ",")
		End If
	Next
	
	Return stringUris.ToString
End Sub

Sub StyleLink(link As Link, linkPnl As B4XView)
	LblName = linkPnl.GetView(0)
	LblNum = linkPnl.GetView(1)
	LblName.Text = link.LabelLink
	
	If link.Selected Then
		LblNum.TextColor = XUI.Color_Green
		LblNum.Text = Chr(2713)
		LblName.TextColor = XUI.Color_Green
	Else
		LblNum.TextColor = XUI.Color_Black
		LblNum.Text = link.LabelNum
		LblName.TextColor = XUI.Color_Black
	End If
End Sub

Sub ToOrderedMap(toConvert As B4XOrderedMap) As OrderedMap
	Dim orderedMap As OrderedMap
	orderedMap.Initialize
	orderedMap.Map.Initialize
	orderedMap.Keys.Initialize
	
	For Each key In toConvert.Keys
		orderedMap.Map.Put(key, toConvert.Get(key))
		orderedMap.Keys.Add(key)
	Next

	Return orderedMap
End Sub

Sub ToTitleCase (str As String, exclude As List) As String
	Dim s As String
	Dim NewS() As String = Regex.Split(" ", str.Trim)
	
	For i = 0 To NewS.Length -1
		If (exclude.IsInitialized And exclude.IndexOf(NewS(i)) <> -1)  Then
			s = s & NewS(i) & " "
		Else
			If NewS(i).Length > 1 Then 
				s = s & _
				 	NewS(i).SubString2(0,1).ToUpperCase & NewS(i).SubString(1) & _
					" "
			Else 
				s = s & NewS(i).ToUpperCase & " "
			End If
		End If
	Next
	
	Return s
End Sub

Sub ClearLinks
	Common.LinkedTracks.Clear
	CLVLinks.Clear
		
	If Common.KVS.ContainsKey("linked_tracks") Then
		Common.KVS.Remove("linked_tracks")
	End If
End Sub

Sub GetAlbums As ResumableSub
	If Common.KVS.ContainsKey("albums") Then
		Return Common.ToB4XOrderedMap(Common.KVS.Get("albums"))
	End If
	
	Dim DSOID As String = "2cbWJP4X5b9sKEDW80uc5r"
	Dim j As HttpJob
	j.Initialize("j", Me)
	j.Download("https://api.spotify.com/v1/artists/" & DSOID & "/albums")
	j.GetRequest.SetHeader("Authorization", "Bearer " & Common.Token)
	Wait For (j) JobDone(j As HttpJob)
	
	If j.Success And j.Response.StatusCode = 200 Then
		Dim jp As JSONParser
		jp.Initialize(j.GetString)
		Dim albums As List = jp.NextObject.Get("items")
		Dim ids As B4XOrderedMap
		ids.Initialize

		For Each album As Map In albums
			ids.Put(ToTitleCase(album.Get("name"), Null), album.Get("id"))
		Next
		
		Common.KVS.Put("albums", ToOrderedMap(ids))
		Return ids
	End If
	
	If Not(j.Response.StatusCode = -1) Then
		Common.HandleHTTPError(j.GetString)
	End If
	
	Log("Error getting the albums.")
	Return Null
End Sub

Sub GetTracks As ResumableSub	
	Wait For (GetAlbums) Complete (ids As B4XOrderedMap)
	Dim j As HttpJob
	j.Initialize("j", Me)
	Dim stringsIds As StringBuilder
	stringsIds.Initialize
	
	For i = 0 To ids.Size-1
		If i = ids.Size-1 Then
			stringsIds.Append(ids.Get(ids.Keys.Get(i)))
		Else
			stringsIds.Append(ids.Get(ids.Keys.Get(i)) & ",")
		End If
	Next
	
	j.Download2("https://api.spotify.com/v1/albums", _
	 			Array As String("ids", stringsIds.ToString))
	
	j.GetRequest.SetHeader("Authorization", "Bearer " & Common.Token)
	Wait For (j) JobDone(j As HttpJob)
	
	If j.Success And j.Response.StatusCode = 200 Then
		Dim jp As JSONParser
		jp.Initialize(j.GetString)
		Dim albums As List = jp.NextObject.Get("albums")
		
		For Each album As Map In albums
			Dim trackList As Map = album.Get("tracks")
			Dim trackItemList As List = trackList.Get("items")
			
			For Each track As Map In trackItemList
				Common.Tracks.Put(ToTitleCase(track.Get("name"), Null), track.Get("uri"))
			Next
		Next
				
		Common.KVS.Put("tracks", ToOrderedMap(Common.Tracks))
	Else If Not(j.Response.StatusCode = -1) Then
		Common.HandleHTTPError(j.GetString)
	Else
		Log("Error getting the tracks.")
	End If
	
	Return Null
End Sub

Private Sub BGetTracks_Click
	Common.Tracks.Clear
	SelectedTracks.Clear
	
	If Common.KVS.ContainsKey("tracks") Then
		Common.KVS.Remove("tracks")
	End If
	
	CLVTracks.Clear
	Wait For (GetTracks) Complete (r As Object)
	
	If Common.Tracks.Size > 0 Then
		BuildTrackItems
	End If
End Sub

Private Sub CLVTracks_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
	Dim extraSize As Int = 25
	For i = Max(0, FirstIndex-extraSize) To Min(LastIndex+extraSize, CLVTracks.Size-1)
		Dim track As Track = CLVTracks.GetValue(i)
		Dim Pnl As B4XView = CLVTracks.GetPanel(i)
		Dim matcher As Matcher
		matcher = Regex.Matcher2(txtFilter.Text, Regex.CASE_INSENSITIVE, track.LabelName)
		If i > FirstIndex-extraSize And i < LastIndex+extraSize And matcher.Find Then
			If Pnl.NumberOfViews = 0 Then	
					Pnl.LoadLayout("track")
					StyleTrack(track, Pnl)
			End If
		Else
			If Pnl.NumberOfViews > 0 Then
				Pnl.RemoveAllViews
			End If
		End If
	Next
End Sub

Private Sub CLVTracks_ItemClick (Index As Int, Value As Object)
	SelectTrack(Value)
	StyleTrack(Value, CLVTracks.GetPanel(Index))
End Sub

Private Sub BAddLink_Click
	If SelectedTracks.Keys.Size < 2 Then
		ToastMessageShow("You have not selected at least two tracks from the list.", False)
		Return
	End If
	
	Common.LinkedTracks.Add(ToOrderedMap(SelectedTracks))
	Common.KVS.Put("linked_tracks", Common.LinkedTracks)
	AddLink(Common.LinkedTracks.Get(Common.LinkedTracks.Size-1))
	
	For i = 0 To CLVTracks.Size-1
		Dim track As Track = CLVTracks.GetValue(i)
		
		If track.Selected Then
			SelectTrack(track)
			StyleTrack(track, CLVTracks.GetPanel(i))
		End If
	Next
	
	SelectedTracks.Clear
	CLVLinks.Refresh
End Sub

Private Sub CLVLinks_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
	Dim extraSize As Int = 25
		
	For i = Max(0, FirstIndex-extraSize) To Min(LastIndex+extraSize, CLVLinks.Size-1)
		Dim Pnl As B4XView = CLVLinks.GetPanel(i)
			
		If i > FirstIndex-extraSize And i < LastIndex+extraSize Then
			If Pnl.NumberOfViews = 0 Then
				Pnl.LoadLayout("track")
				StyleLink(CLVLinks.GetValue(i), Pnl)
			End If
		Else
			If Pnl.NumberOfViews > 0 Then
				Pnl.RemoveAllViews
			End If
		End If
	Next
End Sub

Private Sub BRemoveLink_Click
	If CLVLinks.Size > 0 Then
		Dim i As Int = 0
		
		If Common.LinkedTracks.Size = 1 Then
			ClearLinks
			Return
		End If
		
		Do While i < CLVLinks.Size
			
			Dim link As Link = CLVLinks.GetValue(i)
			
			If link.Selected Then
				Common.LinkedTracks.RemoveAt(i)
				CLVLinks.RemoveAt(i)
				i=i-1
			End If
			
			i = i+1
		Loop
	End If
	
	Common.KVS.Put("linked_tracks", Common.LinkedTracks)
	CLVLinks.Refresh
End Sub

Private Sub txtFilter_TextChanged (Old As String, New As String)
	CLVTracks.Refresh
End Sub

Private Sub BClose_Click
	Activity.Finish
End Sub

Private Sub BSave_Click
	Common.LinkList.Clear
	
	If CLVLinks.Size > 0 Then
		For i = 0 To CLVLinks.Size-1
			Dim linkk As Link = CLVLinks.GetValue(i)
			Common.LinkList.Add(linkk)
		Next
	End If
	
	Common.KVS.Put("links", Common.LinkList)
	ToastMessageShow("Your linked tracks have been saved.", False)
End Sub

Private Sub CLVLinks_ItemClick (Index As Int, Value As Object)
	Dim link As Link = Value
	link.Selected = Not(link.Selected)
	StyleLink(Value, CLVLinks.GetPanel(Index))
End Sub

Private Sub BClearData_Click
	Common.Tracks.Clear
	SelectedTracks.Clear
	Common.LinkedTracks.Clear
	
	If Common.KVS.ContainsKey("tracks") Then
		Common.KVS.Remove("tracks")
	End If
	
	If Common.KVS.ContainsKey("albums") Then
		Common.KVS.Remove("albums")
	End If
	
	If Common.KVS.ContainsKey("linked_tracks") Then
		Common.KVS.Remove("linked_tracks")
	End If
	
	CLVTracks.Clear
	CLVLinks.Clear
End Sub

Private Sub BClearLinks_Click
	ClearLinks
End Sub