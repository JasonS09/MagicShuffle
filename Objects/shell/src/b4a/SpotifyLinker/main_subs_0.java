package b4a.SpotifyLinker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,89);
if (RapidSub.canDelegate("activity_create")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 89;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(33554432);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 91;BA.debugLine="Activity.Title = \"MagicShuffle\"";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("MagicShuffle"));
 BA.debugLineNum = 93;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(268435456);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="Common.KVS.Initialize(File.DirInternal, \"datasto";
Debug.ShouldStop(536870912);
main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("datastore")));
 BA.debugLineNum = 96;BA.debugLine="If Common.KVS.ContainsKey(\"user\") Then";
Debug.ShouldStop(-2147483648);
if (main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("user"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="TxtUsername.Text = Common.KVS.Get(\"user\")";
Debug.ShouldStop(1);
main.mostCurrent._txtusername.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("user")))));
 };
 BA.debugLineNum = 100;BA.debugLine="If Common.KVS.ContainsKey(\"tracks\") Then";
Debug.ShouldStop(8);
if (main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("tracks"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 101;BA.debugLine="Common.Tracks = Common.ToB4XOrderedMap(Common.K";
Debug.ShouldStop(16);
main.mostCurrent._common._tracks /*RemoteObject*/  = main.mostCurrent._common.runMethod(false,"_tob4xorderedmap" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)((main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("tracks"))))));
 }else {
 BA.debugLineNum = 103;BA.debugLine="Common.Tracks.Initialize";
Debug.ShouldStop(64);
main.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 };
 BA.debugLineNum = 106;BA.debugLine="If Common.KVS.ContainsKey(\"playlist_name\") Then";
Debug.ShouldStop(512);
if (main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("playlist_name"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 107;BA.debugLine="TxtPlaylist.Text = Common.KVS.Get(\"playlist_nam";
Debug.ShouldStop(1024);
main.mostCurrent._txtplaylist.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("playlist_name")))));
 };
 BA.debugLineNum = 110;BA.debugLine="If Common.KVS.ContainsKey(\"links\") Then";
Debug.ShouldStop(8192);
if (main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("links"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 111;BA.debugLine="Common.LinkList = Common.KVS.Get(\"links\")";
Debug.ShouldStop(16384);
main.mostCurrent._common._linklist /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("links"))));
 }else {
 BA.debugLineNum = 113;BA.debugLine="Common.LinkList.Initialize";
Debug.ShouldStop(65536);
main.mostCurrent._common._linklist /*RemoteObject*/ .runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 116;BA.debugLine="If Common.KVS.ContainsKey(\"linked_tracks\") Then";
Debug.ShouldStop(524288);
if (main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("linked_tracks"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 117;BA.debugLine="Common.LinkedTracks = Common.KVS.Get(\"linked_tr";
Debug.ShouldStop(1048576);
main.mostCurrent._common._linkedtracks /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), main.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("linked_tracks"))));
 }else {
 BA.debugLineNum = 119;BA.debugLine="Common.LinkedTracks.Initialize";
Debug.ShouldStop(4194304);
main.mostCurrent._common._linkedtracks /*RemoteObject*/ .runVoidMethod ("Initialize");
 };
 };
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,134);
if (RapidSub.canDelegate("activity_pause")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 134;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,124);
if (RapidSub.canDelegate("activity_resume")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","activity_resume");}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _uri = RemoteObject.createImmutable("");
 BA.debugLineNum = 124;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Dim i As Intent";
Debug.ShouldStop(268435456);
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="i = GetIntent";
Debug.ShouldStop(536870912);
_i = _getintent();Debug.locals.put("i", _i);
 BA.debugLineNum = 127;BA.debugLine="If i.Action = i.ACTION_VIEW And Common.Token = \"\"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_i.runMethod(true,"getAction"),_i.getField(true,"ACTION_VIEW")) && RemoteObject.solveBoolean("=",main.mostCurrent._common._token /*RemoteObject*/ ,BA.ObjectToString(""))) { 
 BA.debugLineNum = 128;BA.debugLine="Dim uri As String";
Debug.ShouldStop(-2147483648);
_uri = RemoteObject.createImmutable("");Debug.locals.put("uri", _uri);
 BA.debugLineNum = 129;BA.debugLine="uri=i.GetData";
Debug.ShouldStop(1);
_uri = _i.runMethod(true,"GetData");Debug.locals.put("uri", _uri);
 BA.debugLineNum = 130;BA.debugLine="AuthorizeApp(Regex.Split(\"&\", Regex.Split(\"=\", u";
Debug.ShouldStop(2);
_authorizeapp(main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("&")),(Object)(main.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("=")),(Object)(_uri)).getArrayElement(true,BA.numberCast(int.class, 1)))).getArrayElement(true,BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _addsongstoplaylist(RemoteObject _shuffled) throws Exception{
try {
		Debug.PushSubsStack("AddSongsToPlaylist (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,353);
if (RapidSub.canDelegate("addsongstoplaylist")) { b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","addsongstoplaylist", _shuffled); return;}
ResumableSub_AddSongsToPlaylist rsub = new ResumableSub_AddSongsToPlaylist(null,_shuffled);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AddSongsToPlaylist extends BA.ResumableSub {
public ResumableSub_AddSongsToPlaylist(b4a.SpotifyLinker.main parent,RemoteObject _shuffled) {
this.parent = parent;
this._shuffled = _shuffled;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.main parent;
RemoteObject _shuffled;
RemoteObject _playlist = RemoteObject.declareNull("Object");
RemoteObject _j = RemoteObject.declareNull("b4a.SpotifyLinker.httpjob");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AddSongsToPlaylist (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,353);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("shuffled", _shuffled);
 BA.debugLineNum = 354;BA.debugLine="Wait For (GetPlaylist) Complete (playlist As Obje";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "addsongstoplaylist"), _getplaylist());
this.state = 13;
return;
case 13:
//C
this.state = 1;
_playlist = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("playlist", _playlist);
;
 BA.debugLineNum = 355;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4);
_j = RemoteObject.createNew ("b4a.SpotifyLinker.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 356;BA.debugLine="j.Initialize(\"j\", Me)";
Debug.ShouldStop(8);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("j")),(Object)(main.getObject()));
 BA.debugLineNum = 357;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(16);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 358;BA.debugLine="j.PostString(\"https://api.spotify.com/v1/playlist";
Debug.ShouldStop(32);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://api.spotify.com/v1/playlists/"),parent.mostCurrent._playlistid,RemoteObject.createImmutable("/tracks?uris="),_su.runMethod(true,"EncodeUrl",(Object)(_shuffled),(Object)(RemoteObject.createImmutable("UTF-8"))))),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 361;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
Debug.ShouldStop(256);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),parent.mostCurrent._common._token /*RemoteObject*/ )));
 BA.debugLineNum = 362;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "addsongstoplaylist"), (_j));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 364;BA.debugLine="If Not(j.Success And j.Response.StatusCode = 201)";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_j.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 201))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 365;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 11;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, -(double) (0 + 1)))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 366;BA.debugLine="Log(j.Response.StatusCode)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4983053",BA.NumberToString(_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 367;BA.debugLine="Common.HandleHTTPError(j.GetString)";
Debug.ShouldStop(16384);
parent.mostCurrent._common.runVoidMethod ("_handlehttperror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 368;BA.debugLine="If j.Response.StatusCode = 401 Then";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 401))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 369;BA.debugLine="Deauthorize";
Debug.ShouldStop(65536);
_deauthorize();
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 373;BA.debugLine="Log(\"Error removing the playlist.\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4983060",RemoteObject.createImmutable("Error removing the playlist."),0);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _playlist) throws Exception{
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _authorize() throws Exception{
try {
		Debug.PushSubsStack("Authorize (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,151);
if (RapidSub.canDelegate("authorize")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","authorize");}
 BA.debugLineNum = 151;BA.debugLine="Sub Authorize";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="TxtUsername.Enabled = True";
Debug.ShouldStop(8388608);
main.mostCurrent._txtusername.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 153;BA.debugLine="TxtPlaylist.Enabled = True";
Debug.ShouldStop(16777216);
main.mostCurrent._txtplaylist.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 154;BA.debugLine="BShuffle.Enabled = True";
Debug.ShouldStop(33554432);
main.mostCurrent._bshuffle.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 155;BA.debugLine="BConfig.Enabled = True";
Debug.ShouldStop(67108864);
main.mostCurrent._bconfig.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _authorizeapp(RemoteObject _code) throws Exception{
try {
		Debug.PushSubsStack("AuthorizeApp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,224);
if (RapidSub.canDelegate("authorizeapp")) { b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","authorizeapp", _code); return;}
ResumableSub_AuthorizeApp rsub = new ResumableSub_AuthorizeApp(null,_code);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AuthorizeApp extends BA.ResumableSub {
public ResumableSub_AuthorizeApp(b4a.SpotifyLinker.main parent,RemoteObject _code) {
this.parent = parent;
this._code = _code;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.main parent;
RemoteObject _code;
RemoteObject _j = RemoteObject.declareNull("b4a.SpotifyLinker.httpjob");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _authorization = RemoteObject.createImmutable("");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AuthorizeApp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,224);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("code", _code);
 BA.debugLineNum = 225;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1);
_j = RemoteObject.createNew ("b4a.SpotifyLinker.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 226;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(2);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 227;BA.debugLine="Dim authorization As String = clientId & \":\" & cl";
Debug.ShouldStop(4);
_authorization = RemoteObject.concat(parent._clientid,RemoteObject.createImmutable(":"),parent._clientsecret);Debug.locals.put("authorization", _authorization);Debug.locals.put("authorization", _authorization);
 BA.debugLineNum = 228;BA.debugLine="j.Initialize(\"j\", Me)";
Debug.ShouldStop(8);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("j")),(Object)(main.getObject()));
 BA.debugLineNum = 229;BA.debugLine="j.PostString(\"https://accounts.spotify.com/api/to";
Debug.ShouldStop(16);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://accounts.spotify.com/api/token")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("grant_type=authorization_code&"),RemoteObject.createImmutable("code="),_code,RemoteObject.createImmutable("&"),RemoteObject.createImmutable("redirect_uri="),parent.mostCurrent._redirecturi)));
 BA.debugLineNum = 232;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-fo";
Debug.ShouldStop(128);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 233;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", _";
Debug.ShouldStop(256);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Basic "),_su.runMethod(true,"EncodeBase64",(Object)(_authorization.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8"))))))));
 BA.debugLineNum = 235;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "authorizeapp"), (_j));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 237;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(".",_j.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 200))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 238;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(8192);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 239;BA.debugLine="jp.Initialize(j.GetString)";
Debug.ShouldStop(16384);
_jp.runVoidMethod ("Initialize",(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 240;BA.debugLine="Dim Map As Map = jp.NextObject";
Debug.ShouldStop(32768);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = _jp.runMethod(false,"NextObject");Debug.locals.put("Map", _map);Debug.locals.put("Map", _map);
 BA.debugLineNum = 241;BA.debugLine="Common.Token = Map.Get(\"access_token\")";
Debug.ShouldStop(65536);
parent.mostCurrent._common._token /*RemoteObject*/  = BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("access_token")))));
 BA.debugLineNum = 243;BA.debugLine="Authorize";
Debug.ShouldStop(262144);
_authorize();
 BA.debugLineNum = 244;BA.debugLine="GetUserId";
Debug.ShouldStop(524288);
_getuserid();
 BA.debugLineNum = 245;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 248;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";
Debug.ShouldStop(8388608);

case 4:
//if
this.state = 11;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, -(double) (0 + 1)))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 249;BA.debugLine="Common.HandleHTTPError(j.GetString)";
Debug.ShouldStop(16777216);
parent.mostCurrent._common.runVoidMethod ("_handlehttperror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 250;BA.debugLine="If j.Response.StatusCode = 401 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 401))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 251;BA.debugLine="Deauthorize";
Debug.ShouldStop(67108864);
_deauthorize();
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 255;BA.debugLine="Log(\"Error in app Authorization\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4720927",RemoteObject.createImmutable("Error in app Authorization"),0);
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _authorizeuser() throws Exception{
try {
		Debug.PushSubsStack("AuthorizeUser (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,209);
if (RapidSub.canDelegate("authorizeuser")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","authorizeuser");}
RemoteObject _getparams = RemoteObject.createImmutable("");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 BA.debugLineNum = 209;BA.debugLine="Sub AuthorizeUser";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim getParams As String = \"client_id=\" & clientId";
Debug.ShouldStop(131072);
_getparams = RemoteObject.concat(RemoteObject.createImmutable("client_id="),main._clientid,RemoteObject.createImmutable("&"),RemoteObject.createImmutable("response_type=code&"),RemoteObject.createImmutable("redirect_uri="),main.mostCurrent._redirecturi,RemoteObject.createImmutable("&"),RemoteObject.createImmutable("scope=user-modify-playback-state "),RemoteObject.createImmutable("playlist-modify-public "),RemoteObject.createImmutable("playlist-read-private "),RemoteObject.createImmutable("user-read-playback-state "),RemoteObject.createImmutable("user-read-private "),RemoteObject.createImmutable("user-read-email&"),RemoteObject.createImmutable("state=wR4ljc"));Debug.locals.put("getParams", _getparams);Debug.locals.put("getParams", _getparams);
 BA.debugLineNum = 220;BA.debugLine="Dim p As PhoneIntents";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");Debug.locals.put("p", _p);
 BA.debugLineNum = 221;BA.debugLine="StartActivity(p.OpenBrowser(\"https://accounts.spo";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((_p.runMethod(false,"OpenBrowser",(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://accounts.spotify.com/authorize?"),_getparams))))));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bconfig_click() throws Exception{
try {
		Debug.PushSubsStack("BConfig_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,397);
if (RapidSub.canDelegate("bconfig_click")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","bconfig_click");}
 BA.debugLineNum = 397;BA.debugLine="Private Sub BConfig_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="StartActivity(Config)";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._config.getObject())));
 BA.debugLineNum = 399;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bconnect_click() throws Exception{
try {
		Debug.PushSubsStack("BConnect_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,377);
if (RapidSub.canDelegate("bconnect_click")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","bconnect_click");}
 BA.debugLineNum = 377;BA.debugLine="Sub BConnect_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 378;BA.debugLine="AuthorizeUser";
Debug.ShouldStop(33554432);
_authorizeuser();
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bexit_click() throws Exception{
try {
		Debug.PushSubsStack("BExit_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,393);
if (RapidSub.canDelegate("bexit_click")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","bexit_click");}
 BA.debugLineNum = 393;BA.debugLine="Private Sub BExit_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _bshuffle_click() throws Exception{
try {
		Debug.PushSubsStack("BShuffle_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,381);
if (RapidSub.canDelegate("bshuffle_click")) { b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","bshuffle_click"); return;}
ResumableSub_BShuffle_Click rsub = new ResumableSub_BShuffle_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BShuffle_Click extends BA.ResumableSub {
public ResumableSub_BShuffle_Click(b4a.SpotifyLinker.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.main parent;
RemoteObject _o = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BShuffle_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,381);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 382;BA.debugLine="If Common.Tracks.Size = 0 Or Common.LinkList.Size";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",parent.mostCurrent._common._linklist /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 383;BA.debugLine="ToastMessageShow(\"No tracks have been saved.\", F";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No tracks have been saved.")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 384;BA.debugLine="Log(\"No tracks have been saved.\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","41114115",RemoteObject.createImmutable("No tracks have been saved."),0);
 BA.debugLineNum = 385;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 388;BA.debugLine="Wait For (RemoveItemsFromPlaylist) Complete (o As";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "bshuffle_click"), _removeitemsfromplaylist());
this.state = 5;
return;
case 5:
//C
this.state = -1;
_o = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("o", _o);
;
 BA.debugLineNum = 389;BA.debugLine="AddSongsToPlaylist(Shuffle(RebuildTracks))";
Debug.ShouldStop(16);
_addsongstoplaylist(_shuffle(_rebuildtracks()));
 BA.debugLineNum = 390;BA.debugLine="Common.KVS.Put(\"playlist_name\", TxtPlaylist.Text)";
Debug.ShouldStop(32);
parent.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("playlist_name")),(Object)((parent.mostCurrent._txtplaylist.runMethod(true,"getText"))));
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _deauthorize() throws Exception{
try {
		Debug.PushSubsStack("Deauthorize (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,144);
if (RapidSub.canDelegate("deauthorize")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","deauthorize");}
 BA.debugLineNum = 144;BA.debugLine="Sub Deauthorize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="TxtUsername.Enabled = False";
Debug.ShouldStop(65536);
main.mostCurrent._txtusername.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 146;BA.debugLine="TxtPlaylist.Enabled = False";
Debug.ShouldStop(131072);
main.mostCurrent._txtplaylist.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="BShuffle.Enabled = False";
Debug.ShouldStop(262144);
main.mostCurrent._bshuffle.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 148;BA.debugLine="BConfig.Enabled = False";
Debug.ShouldStop(524288);
main.mostCurrent._bconfig.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getintent() throws Exception{
try {
		Debug.PushSubsStack("GetIntent (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,138);
if (RapidSub.canDelegate("getintent")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","getintent");}
RemoteObject _sr = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 138;BA.debugLine="Sub GetIntent As Intent";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Dim sR As Reflector";
Debug.ShouldStop(1024);
_sr = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("sR", _sr);
 BA.debugLineNum = 140;BA.debugLine="sR.Target=sR.GetActivity";
Debug.ShouldStop(2048);
_sr.setField ("Target",(_sr.runMethod(false,"GetActivity",main.processBA)));
 BA.debugLineNum = 141;BA.debugLine="Return sR.RunMethod(\"getIntent\")";
Debug.ShouldStop(4096);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _sr.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getIntent"))));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getplaylist() throws Exception{
try {
		Debug.PushSubsStack("GetPlaylist (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,284);
if (RapidSub.canDelegate("getplaylist")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","getplaylist");}
ResumableSub_GetPlaylist rsub = new ResumableSub_GetPlaylist(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetPlaylist extends BA.ResumableSub {
public ResumableSub_GetPlaylist(b4a.SpotifyLinker.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.main parent;
RemoteObject _j = RemoteObject.declareNull("b4a.SpotifyLinker.httpjob");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _playlists = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetPlaylist (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,284);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 285;BA.debugLine="If Not(PlayListId = \"\") Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",parent.mostCurrent._playlistid,RemoteObject.createImmutable(""))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 286;BA.debugLine="Return Null";
Debug.ShouldStop(536870912);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.mostCurrent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 289;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1);
_j = RemoteObject.createNew ("b4a.SpotifyLinker.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 290;BA.debugLine="j.Initialize(\"j\", Me)";
Debug.ShouldStop(2);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("j")),(Object)(main.getObject()));
 BA.debugLineNum = 291;BA.debugLine="j.Download2(\"https://api.spotify.com/v1/users/\" &";
Debug.ShouldStop(4);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_download2" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://api.spotify.com/v1/users/"),parent.mostCurrent._txtusername.runMethod(true,"getText"),RemoteObject.createImmutable("/playlists"))),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("limit"),RemoteObject.createImmutable("50")})));
 BA.debugLineNum = 293;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
Debug.ShouldStop(16);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),parent.mostCurrent._common._token /*RemoteObject*/ )));
 BA.debugLineNum = 294;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getplaylist"), (_j));
this.state = 23;
return;
case 23:
//C
this.state = 5;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 296;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
Debug.ShouldStop(128);
if (true) break;

case 5:
//if
this.state = 22;
if (RemoteObject.solveBoolean(".",_j.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 200))) { 
this.state = 7;
}else 
{ BA.debugLineNum = 307;BA.debugLine="Else If Not(j.Response.StatusCode = -1) Then";
Debug.ShouldStop(262144);
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, -(double) (0 + 1)))))).<Boolean>get().booleanValue()) { 
this.state = 17;
}}
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 297;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(256);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 298;BA.debugLine="jp.Initialize(j.GetString)";
Debug.ShouldStop(512);
_jp.runVoidMethod ("Initialize",(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 299;BA.debugLine="Dim playlists As List = jp.NextObject.Get(\"items";
Debug.ShouldStop(1024);
_playlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playlists = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _jp.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("playlists", _playlists);
 BA.debugLineNum = 301;BA.debugLine="For Each playlist As Map In playlists";
Debug.ShouldStop(4096);
if (true) break;

case 8:
//for
this.state = 15;
_playlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group13 = _playlists;
index13 = 0;
groupLen13 = group13.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("playlist", _playlist);
this.state = 24;
if (true) break;

case 24:
//C
this.state = 15;
if (index13 < groupLen13) {
this.state = 10;
_playlist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group13.runMethod(false,"Get",index13));}
if (true) break;

case 25:
//C
this.state = 24;
index13++;
Debug.locals.put("playlist", _playlist);
if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 302;BA.debugLine="If playlist.Get(\"name\") = TxtPlaylist.Text Then";
Debug.ShouldStop(8192);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_playlist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),(parent.mostCurrent._txtplaylist.runMethod(true,"getText")))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 303;BA.debugLine="Dim id As String = playlist.Get(\"id\")";
Debug.ShouldStop(16384);
_id = BA.ObjectToString(_playlist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 304;BA.debugLine="PlayListId = id";
Debug.ShouldStop(32768);
parent.mostCurrent._playlistid = _id;
 if (true) break;

case 14:
//C
this.state = 25;
;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 22;
Debug.locals.put("playlist", _playlist);
;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 308;BA.debugLine="Common.HandleHTTPError(j.GetString)";
Debug.ShouldStop(524288);
parent.mostCurrent._common.runVoidMethod ("_handlehttperror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 309;BA.debugLine="If j.Response.StatusCode = 401 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 401))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 310;BA.debugLine="Deauthorize";
Debug.ShouldStop(2097152);
_deauthorize();
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 312;BA.debugLine="Log(\"Error getting playlists.\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4851996",RemoteObject.createImmutable("Error getting playlists."),0);
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 315;BA.debugLine="Return Null";
Debug.ShouldStop(67108864);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.mostCurrent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _getuserid() throws Exception{
try {
		Debug.PushSubsStack("GetUserId (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,258);
if (RapidSub.canDelegate("getuserid")) { b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","getuserid"); return;}
ResumableSub_GetUserId rsub = new ResumableSub_GetUserId(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetUserId extends BA.ResumableSub {
public ResumableSub_GetUserId(b4a.SpotifyLinker.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.main parent;
RemoteObject _j = RemoteObject.declareNull("b4a.SpotifyLinker.httpjob");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _userid = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetUserId (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,258);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 259;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4);
_j = RemoteObject.createNew ("b4a.SpotifyLinker.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 260;BA.debugLine="j.Initialize(\"j\", Me)";
Debug.ShouldStop(8);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("j")),(Object)(main.getObject()));
 BA.debugLineNum = 261;BA.debugLine="j.Download(\"https://api.spotify.com/v1/me\")";
Debug.ShouldStop(16);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("https://api.spotify.com/v1/me")));
 BA.debugLineNum = 262;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
Debug.ShouldStop(32);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),parent.mostCurrent._common._token /*RemoteObject*/ )));
 BA.debugLineNum = 263;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getuserid"), (_j));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 265;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(".",_j.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 200))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 266;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(512);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 267;BA.debugLine="jp.Initialize(j.GetString)";
Debug.ShouldStop(1024);
_jp.runVoidMethod ("Initialize",(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 268;BA.debugLine="Dim userId As String = jp.NextObject.Get(\"id\")";
Debug.ShouldStop(2048);
_userid = BA.ObjectToString(_jp.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("userId", _userid);Debug.locals.put("userId", _userid);
 BA.debugLineNum = 269;BA.debugLine="TxtUsername.Text = userId";
Debug.ShouldStop(4096);
parent.mostCurrent._txtusername.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_userid));
 BA.debugLineNum = 270;BA.debugLine="Common.KVS.Put(\"user\", userId)";
Debug.ShouldStop(8192);
parent.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("user")),(Object)((_userid)));
 BA.debugLineNum = 271;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 274;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";
Debug.ShouldStop(131072);

case 4:
//if
this.state = 11;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, -(double) (0 + 1)))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 275;BA.debugLine="Common.HandleHTTPError(j.GetString)";
Debug.ShouldStop(262144);
parent.mostCurrent._common.runVoidMethod ("_handlehttperror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 276;BA.debugLine="If j.Response.StatusCode = 401 Then";
Debug.ShouldStop(524288);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 401))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 277;BA.debugLine="Deauthorize";
Debug.ShouldStop(1048576);
_deauthorize();
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 281;BA.debugLine="Log(\"Error getting user id\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4786455",RemoteObject.createImmutable("Error getting user id"),0);
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 80;BA.debugLine="Private redirectUri As String = \"http://jsspotify";
main.mostCurrent._redirecturi = BA.ObjectToString("http://jsspotifylinker.myd");
 //BA.debugLineNum = 81;BA.debugLine="Private TxtUsername As EditText";
main.mostCurrent._txtusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private TxtPlaylist As EditText";
main.mostCurrent._txtplaylist = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private BShuffle As Button";
main.mostCurrent._bshuffle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private BConfig As Button";
main.mostCurrent._bconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private PlayListId As String";
main.mostCurrent._playlistid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
config_subs_0._process_globals();
common_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.main");
starter.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.starter");
config.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.config");
common.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.common");
keyvaluestore.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.keyvaluestore");
httputils2service.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.httpjob");
animatedcounter.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.xuiviewsutils");
b4xbitset.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xbytesbuilder");
b4xcollections.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xcollections");
b4xorderedmap.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.b4xset");
preoptimizedclv.myClass = BA.getDeviceClass ("b4a.SpotifyLinker.preoptimizedclv");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 72;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 73;BA.debugLine="Private clientId As String = \"e5670e31bc99419f839";
main._clientid = BA.ObjectToString("e5670e31bc99419f83957d70e0c71df5");
 //BA.debugLineNum = 74;BA.debugLine="Private clientSecret As String = \"032d2156bdab454";
main._clientsecret = BA.ObjectToString("032d2156bdab45468bfc6286bfce43b5");
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _rebuildtracks() throws Exception{
try {
		Debug.PushSubsStack("RebuildTracks (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,176);
if (RapidSub.canDelegate("rebuildtracks")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","rebuildtracks");}
RemoteObject _auxtracks = RemoteObject.declareNull("b4a.SpotifyLinker.b4xorderedmap");
RemoteObject _key = RemoteObject.declareNull("Object");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _auxkey = RemoteObject.createImmutable("");
RemoteObject _link = RemoteObject.declareNull("b4a.SpotifyLinker.common._orderedmap");
RemoteObject _kkey = RemoteObject.createImmutable("");
RemoteObject _linkk = RemoteObject.declareNull("b4a.SpotifyLinker.config._link");
 BA.debugLineNum = 176;BA.debugLine="Sub RebuildTracks As B4XOrderedMap";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="Dim auxTracks As B4XOrderedMap";
Debug.ShouldStop(65536);
_auxtracks = RemoteObject.createNew ("b4a.SpotifyLinker.b4xorderedmap");Debug.locals.put("auxTracks", _auxtracks);
 BA.debugLineNum = 178;BA.debugLine="auxTracks.Initialize";
Debug.ShouldStop(131072);
_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 180;BA.debugLine="For Each key In Common.Tracks.Keys";
Debug.ShouldStop(524288);
{
final RemoteObject group3 = main.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = group3.runMethod(false,"Get",index3);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 181;BA.debugLine="auxTracks.Put(key, Common.Tracks.Get(key))";
Debug.ShouldStop(1048576);
_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)(_key),(Object)(main.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)(_key))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 184;BA.debugLine="Dim i As Int = 0";
Debug.ShouldStop(8388608);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 186;BA.debugLine="Do While i < auxTracks.Keys.Size";
Debug.ShouldStop(33554432);
while (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, _auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(true,"getSize")))) {
 BA.debugLineNum = 188;BA.debugLine="Dim auxKey As String = auxTracks.Keys.Get(i)";
Debug.ShouldStop(134217728);
_auxkey = BA.ObjectToString(_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)));Debug.locals.put("auxKey", _auxkey);Debug.locals.put("auxKey", _auxkey);
 BA.debugLineNum = 190;BA.debugLine="For Each link As OrderedMap In Common.LinkedTrac";
Debug.ShouldStop(536870912);
{
final RemoteObject group9 = main.mostCurrent._common._linkedtracks /*RemoteObject*/ ;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_link = (group9.runMethod(false,"Get",index9));Debug.locals.put("link", _link);
Debug.locals.put("link", _link);
 BA.debugLineNum = 191;BA.debugLine="For Each kkey As String In link.Keys";
Debug.ShouldStop(1073741824);
{
final RemoteObject group10 = _link.getField(false,"Keys" /*RemoteObject*/ );
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_kkey = BA.ObjectToString(group10.runMethod(false,"Get",index10));Debug.locals.put("kkey", _kkey);
Debug.locals.put("kkey", _kkey);
 BA.debugLineNum = 192;BA.debugLine="If auxKey = kkey Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_auxkey,_kkey)) { 
 BA.debugLineNum = 193;BA.debugLine="auxTracks.Remove(auxKey)";
Debug.ShouldStop(1);
_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_auxkey)));
 BA.debugLineNum = 194;BA.debugLine="i = i-1";
Debug.ShouldStop(2);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 };
 }
}Debug.locals.put("kkey", _kkey);
;
 }
}Debug.locals.put("link", _link);
;
 BA.debugLineNum = 199;BA.debugLine="i = i+1";
Debug.ShouldStop(64);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 202;BA.debugLine="For Each linkk As Link In Common.LinkList";
Debug.ShouldStop(512);
{
final RemoteObject group19 = main.mostCurrent._common._linklist /*RemoteObject*/ ;
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_linkk = (group19.runMethod(false,"Get",index19));Debug.locals.put("linkk", _linkk);
Debug.locals.put("linkk", _linkk);
 BA.debugLineNum = 203;BA.debugLine="auxTracks.Put(linkk.LabelLink, linkk.uris)";
Debug.ShouldStop(1024);
_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_linkk.getField(true,"LabelLink" /*RemoteObject*/ ))),(Object)((_linkk.getField(true,"uris" /*RemoteObject*/ ))));
 }
}Debug.locals.put("linkk", _linkk);
;
 BA.debugLineNum = 206;BA.debugLine="Return auxTracks";
Debug.ShouldStop(8192);
if (true) return _auxtracks;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeitemsfromplaylist() throws Exception{
try {
		Debug.PushSubsStack("RemoveItemsFromPlaylist (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,318);
if (RapidSub.canDelegate("removeitemsfromplaylist")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","removeitemsfromplaylist");}
ResumableSub_RemoveItemsFromPlaylist rsub = new ResumableSub_RemoveItemsFromPlaylist(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RemoveItemsFromPlaylist extends BA.ResumableSub {
public ResumableSub_RemoveItemsFromPlaylist(b4a.SpotifyLinker.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.main parent;
RemoteObject _playlist = RemoteObject.declareNull("Object");
RemoteObject _j = RemoteObject.declareNull("b4a.SpotifyLinker.httpjob");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _track = RemoteObject.createImmutable("");
RemoteObject _jsongenerator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RemoveItemsFromPlaylist (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,318);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 319;BA.debugLine="Wait For (GetPlaylist) Complete (playlist As Obje";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "removeitemsfromplaylist"), _getplaylist());
this.state = 17;
return;
case 17:
//C
this.state = 1;
_playlist = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("playlist", _playlist);
;
 BA.debugLineNum = 320;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(-2147483648);
_j = RemoteObject.createNew ("b4a.SpotifyLinker.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 321;BA.debugLine="j.Initialize(\"j\", Me)";
Debug.ShouldStop(1);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("j")),(Object)(main.getObject()));
 BA.debugLineNum = 322;BA.debugLine="Dim data As List";
Debug.ShouldStop(2);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 323;BA.debugLine="data.Initialize";
Debug.ShouldStop(4);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 325;BA.debugLine="For Each track As String In Common.Tracks.Values";
Debug.ShouldStop(16);
if (true) break;

case 1:
//for
this.state = 4;
group6 = parent.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("track", _track);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 4;
if (index6 < groupLen6) {
this.state = 3;
_track = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("track", _track);}
if (true) break;

case 19:
//C
this.state = 18;
index6++;
Debug.locals.put("track", _track);
if (true) break;

case 3:
//C
this.state = 19;
 BA.debugLineNum = 326;BA.debugLine="data.Add(CreateMap(\"uri\":track))";
Debug.ShouldStop(32);
_data.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("uri")),(_track)})).getObject())));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("track", _track);
;
 BA.debugLineNum = 329;BA.debugLine="Dim JSONGenerator As JSONGenerator";
Debug.ShouldStop(256);
_jsongenerator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSONGenerator", _jsongenerator);
 BA.debugLineNum = 330;BA.debugLine="JSONGenerator.Initialize(CreateMap(\"tracks\":data)";
Debug.ShouldStop(512);
_jsongenerator.runVoidMethod ("Initialize",(Object)(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("tracks")),(_data.getObject())}))));
 BA.debugLineNum = 331;BA.debugLine="j.PostString(\"https://api.spotify.com/v1/playlist";
Debug.ShouldStop(1024);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://api.spotify.com/v1/playlists/"),parent.mostCurrent._playlistid,RemoteObject.createImmutable("/tracks"))),(Object)(_jsongenerator.runMethod(true,"ToString")));
 BA.debugLineNum = 333;BA.debugLine="j.GetRequest.InitializeDelete2(\"https://api.spoti";
Debug.ShouldStop(4096);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("InitializeDelete2",(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://api.spotify.com/v1/playlists/"),parent.mostCurrent._playlistid,RemoteObject.createImmutable("/tracks"))),(Object)(_jsongenerator.runMethod(true,"ToString").runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 335;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
Debug.ShouldStop(16384);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),parent.mostCurrent._common._token /*RemoteObject*/ )));
 BA.debugLineNum = 337;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "removeitemsfromplaylist"), (_j));
this.state = 20;
return;
case 20:
//C
this.state = 5;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 339;BA.debugLine="If Not(j.Success And j.Response.StatusCode = 200)";
Debug.ShouldStop(262144);
if (true) break;

case 5:
//if
this.state = 16;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_j.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 200))))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 340;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";
Debug.ShouldStop(524288);
if (true) break;

case 8:
//if
this.state = 15;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, -(double) (0 + 1)))))).<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 341;BA.debugLine="Common.HandleHTTPError(j.GetString)";
Debug.ShouldStop(1048576);
parent.mostCurrent._common.runVoidMethod ("_handlehttperror" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 342;BA.debugLine="If j.Response.StatusCode = 401 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 401))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 343;BA.debugLine="Deauthorize";
Debug.ShouldStop(4194304);
_deauthorize();
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 347;BA.debugLine="Log(\"Error removing the playlist.\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4917533",RemoteObject.createImmutable("Error removing the playlist."),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 350;BA.debugLine="Return Null";
Debug.ShouldStop(536870912);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.mostCurrent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _shuffle(RemoteObject _auxtracks) throws Exception{
try {
		Debug.PushSubsStack("Shuffle (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,158);
if (RapidSub.canDelegate("shuffle")) { return b4a.SpotifyLinker.main.remoteMe.runUserSub(false, "main","shuffle", _auxtracks);}
RemoteObject _shuffledbuilder = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _r = RemoteObject.createImmutable(0);
Debug.locals.put("auxTracks", _auxtracks);
 BA.debugLineNum = 158;BA.debugLine="Sub Shuffle(auxTracks As B4XOrderedMap)	 As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Dim shuffledBuilder As StringBuilder";
Debug.ShouldStop(1073741824);
_shuffledbuilder = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("shuffledBuilder", _shuffledbuilder);
 BA.debugLineNum = 160;BA.debugLine="shuffledBuilder.Initialize";
Debug.ShouldStop(-2147483648);
_shuffledbuilder.runVoidMethod ("Initialize");
 BA.debugLineNum = 162;BA.debugLine="Do While Not(auxTracks.Size = 0)";
Debug.ShouldStop(2);
while (main.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))))).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 163;BA.debugLine="Dim r As Int = Rnd(0, auxTracks.Size)";
Debug.ShouldStop(4);
_r = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ )));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 164;BA.debugLine="If auxTracks.Size = 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 165;BA.debugLine="shuffledBuilder.Append(auxTracks.Get(auxTracks.";
Debug.ShouldStop(16);
_shuffledbuilder.runVoidMethod ("Append",(Object)(BA.ObjectToString(_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)(_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))))));
 BA.debugLineNum = 166;BA.debugLine="Return shuffledBuilder.ToString";
Debug.ShouldStop(32);
if (true) return _shuffledbuilder.runMethod(true,"ToString");
 };
 BA.debugLineNum = 169;BA.debugLine="shuffledBuilder.Append(auxTracks.Get(auxTracks.K";
Debug.ShouldStop(256);
_shuffledbuilder.runVoidMethod ("Append",(Object)(RemoteObject.concat(_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)(_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_r)))),RemoteObject.createImmutable(","))));
 BA.debugLineNum = 170;BA.debugLine="auxTracks.Remove(auxTracks.Keys.Get(r))";
Debug.ShouldStop(512);
_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)(_auxtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_r))));
 }
;
 BA.debugLineNum = 173;BA.debugLine="Return \"\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}