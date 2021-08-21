B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=11
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Type OrderedMap(Keys As List, Map As Map)
	Dim KVS As KeyValueStore
	Dim Token As String
	Dim Tracks As B4XOrderedMap
	Dim LinkedTracks As List
	Dim LinkList As List
End Sub

Sub HandleHTTPError(response As String)
	Dim jp As JSONParser
	jp.Initialize(response)
	Log(response)
	Try 
		Dim error As Map = jp.NextObject.Get("error")
		ToastMessageShow(error.Get("message"), False)
	Catch
		Log(LastException)
		ToastMessageShow("There was an unknown error when connecting to Spotify.", False)
	End Try
End Sub

Sub ToB4XOrderedMap(toConvert As OrderedMap) As B4XOrderedMap
	Dim orderedMap As B4XOrderedMap
	orderedMap.Initialize
	
	For Each key As String In toConvert.Keys
		orderedMap.Put(key, toConvert.Map.Get(key))
	Next
	
	Return orderedMap
End Sub