package b4a.SpotifyLinker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class config_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"Config\")";
Debug.ShouldStop(67108864);
config.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Config")),config.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="Activity.Title = \"Configuration\"";
Debug.ShouldStop(134217728);
config.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("Configuration"));
 BA.debugLineNum = 30;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(536870912);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 31;BA.debugLine="SelectedTracks.Initialize";
Debug.ShouldStop(1073741824);
config.mostCurrent._selectedtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,config.processBA);
 };
 BA.debugLineNum = 34;BA.debugLine="If Common.Tracks.Size > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",config.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 35;BA.debugLine="BuildTrackItems";
Debug.ShouldStop(4);
_buildtrackitems();
 };
 BA.debugLineNum = 38;BA.debugLine="If Common.LinkedTracks.Size > 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 39;BA.debugLine="BuildLinkItems";
Debug.ShouldStop(64);
_buildlinkitems();
 };
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","activity_resume");}
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlink(RemoteObject _linkmap) throws Exception{
try {
		Debug.PushSubsStack("AddLink (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,97);
if (RapidSub.canDelegate("addlink")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","addlink", _linkmap);}
RemoteObject _link = RemoteObject.declareNull("b4a.SpotifyLinker.config._link");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("linkMap", _linkmap);
 BA.debugLineNum = 97;BA.debugLine="Sub AddLink(linkMap As OrderedMap)";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Dim link As Link";
Debug.ShouldStop(2);
_link = RemoteObject.createNew ("b4a.SpotifyLinker.config._link");Debug.locals.put("link", _link);
 BA.debugLineNum = 99;BA.debugLine="link.Initialize";
Debug.ShouldStop(4);
_link.runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="link.LabelNum = CLVLinks.Size+1";
Debug.ShouldStop(8);
_link.setField ("LabelNum" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {config.mostCurrent._clvlinks.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 101;BA.debugLine="link.LabelLink = StringifyLink(linkMap)";
Debug.ShouldStop(16);
_link.setField ("LabelLink" /*RemoteObject*/ ,_stringifylink(_linkmap));
 BA.debugLineNum = 102;BA.debugLine="link.uris = StringifyUris(linkMap)";
Debug.ShouldStop(32);
_link.setField ("uris" /*RemoteObject*/ ,_stringifyuris(_linkmap));
 BA.debugLineNum = 103;BA.debugLine="Dim Pnl As B4XView = XUI.CreatePanel(Null)";
Debug.ShouldStop(64);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = config.mostCurrent._xui.runMethod(false,"CreatePanel",config.processBA,(Object)(BA.ObjectToString(config.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Pnl", _pnl);Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 104;BA.debugLine="Pnl.Color = XUI.Color_White";
Debug.ShouldStop(128);
_pnl.runMethod(true,"setColor",config.mostCurrent._xui.getField(true,"Color_White"));
 BA.debugLineNum = 105;BA.debugLine="Pnl.SetLayoutAnimated(0dip, 0dip, 0dip, CLVLinks.";
Debug.ShouldStop(256);
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(config.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(config.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(config.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(config.mostCurrent._clvlinks.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(config.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 106;BA.debugLine="CLVLinks.Add(Pnl, link)";
Debug.ShouldStop(512);
config.mostCurrent._clvlinks.runVoidMethod ("_add",(Object)(_pnl),(Object)((_link)));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _baddlink_click() throws Exception{
try {
		Debug.PushSubsStack("BAddLink_Click (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,320);
if (RapidSub.canDelegate("baddlink_click")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","baddlink_click");}
int _i = 0;
RemoteObject _track = RemoteObject.declareNull("b4a.SpotifyLinker.config._track");
 BA.debugLineNum = 320;BA.debugLine="Private Sub BAddLink_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="If SelectedTracks.Keys.Size < 2 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",config.mostCurrent._selectedtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 322;BA.debugLine="ToastMessageShow(\"You have not selected at least";
Debug.ShouldStop(2);
config.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("You have not selected at least two tracks from the list.")),(Object)(config.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 323;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 326;BA.debugLine="Common.LinkedTracks.Add(ToOrderedMap(SelectedTrac";
Debug.ShouldStop(32);
config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_toorderedmap(config.mostCurrent._selectedtracks))));
 BA.debugLineNum = 327;BA.debugLine="Common.KVS.Put(\"linked_tracks\", Common.LinkedTrac";
Debug.ShouldStop(64);
config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("linked_tracks")),(Object)((config.mostCurrent._common._linkedtracks /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 328;BA.debugLine="AddLink(Common.LinkedTracks.Get(Common.LinkedTrac";
Debug.ShouldStop(128);
_addlink((config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 330;BA.debugLine="For i = 0 To CLVTracks.Size-1";
Debug.ShouldStop(512);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {config.mostCurrent._clvtracks.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 331;BA.debugLine="Dim track As Track = CLVTracks.GetValue(i)";
Debug.ShouldStop(1024);
_track = (config.mostCurrent._clvtracks.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 333;BA.debugLine="If track.Selected Then";
Debug.ShouldStop(4096);
if (_track.getField(true,"Selected" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 334;BA.debugLine="SelectTrack(track)";
Debug.ShouldStop(8192);
_selecttrack(_track);
 BA.debugLineNum = 335;BA.debugLine="StyleTrack(track, CLVTracks.GetPanel(i))";
Debug.ShouldStop(16384);
_styletrack(_track,config.mostCurrent._clvtracks.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 339;BA.debugLine="SelectedTracks.Clear";
Debug.ShouldStop(262144);
config.mostCurrent._selectedtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 340;BA.debugLine="CLVLinks.Refresh";
Debug.ShouldStop(524288);
config.mostCurrent._clvlinks.runVoidMethod ("_refresh");
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bcleardata_click() throws Exception{
try {
		Debug.PushSubsStack("BClearData_Click (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,417);
if (RapidSub.canDelegate("bcleardata_click")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","bcleardata_click");}
 BA.debugLineNum = 417;BA.debugLine="Private Sub BClearData_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="Common.Tracks.Clear";
Debug.ShouldStop(2);
config.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 419;BA.debugLine="SelectedTracks.Clear";
Debug.ShouldStop(4);
config.mostCurrent._selectedtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 420;BA.debugLine="Common.LinkedTracks.Clear";
Debug.ShouldStop(8);
config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 422;BA.debugLine="If Common.KVS.ContainsKey(\"tracks\") Then";
Debug.ShouldStop(32);
if (config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("tracks"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 423;BA.debugLine="Common.KVS.Remove(\"tracks\")";
Debug.ShouldStop(64);
config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("tracks")));
 };
 BA.debugLineNum = 426;BA.debugLine="If Common.KVS.ContainsKey(\"albums\") Then";
Debug.ShouldStop(512);
if (config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("albums"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 427;BA.debugLine="Common.KVS.Remove(\"albums\")";
Debug.ShouldStop(1024);
config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("albums")));
 };
 BA.debugLineNum = 430;BA.debugLine="If Common.KVS.ContainsKey(\"linked_tracks\") Then";
Debug.ShouldStop(8192);
if (config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("linked_tracks"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 431;BA.debugLine="Common.KVS.Remove(\"linked_tracks\")";
Debug.ShouldStop(16384);
config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("linked_tracks")));
 };
 BA.debugLineNum = 434;BA.debugLine="CLVTracks.Clear";
Debug.ShouldStop(131072);
config.mostCurrent._clvtracks.runVoidMethod ("_clear");
 BA.debugLineNum = 435;BA.debugLine="CLVLinks.Clear";
Debug.ShouldStop(262144);
config.mostCurrent._clvlinks.runVoidMethod ("_clear");
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bclearlinks_click() throws Exception{
try {
		Debug.PushSubsStack("BClearLinks_Click (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,438);
if (RapidSub.canDelegate("bclearlinks_click")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","bclearlinks_click");}
 BA.debugLineNum = 438;BA.debugLine="Private Sub BClearLinks_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 439;BA.debugLine="ClearLinks";
Debug.ShouldStop(4194304);
_clearlinks();
 BA.debugLineNum = 440;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bclose_click() throws Exception{
try {
		Debug.PushSubsStack("BClose_Click (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,393);
if (RapidSub.canDelegate("bclose_click")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","bclose_click");}
 BA.debugLineNum = 393;BA.debugLine="Private Sub BClose_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
config.mostCurrent._activity.runVoidMethod ("Finish");
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
public static void  _bgettracks_click() throws Exception{
try {
		Debug.PushSubsStack("BGetTracks_Click (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,279);
if (RapidSub.canDelegate("bgettracks_click")) { b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","bgettracks_click"); return;}
ResumableSub_BGetTracks_Click rsub = new ResumableSub_BGetTracks_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BGetTracks_Click extends BA.ResumableSub {
public ResumableSub_BGetTracks_Click(b4a.SpotifyLinker.config parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.config parent;
RemoteObject _r = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BGetTracks_Click (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,279);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 280;BA.debugLine="Common.Tracks.Clear";
Debug.ShouldStop(8388608);
parent.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 281;BA.debugLine="SelectedTracks.Clear";
Debug.ShouldStop(16777216);
parent.mostCurrent._selectedtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 283;BA.debugLine="If Common.KVS.ContainsKey(\"tracks\") Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("tracks"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 284;BA.debugLine="Common.KVS.Remove(\"tracks\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("tracks")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 287;BA.debugLine="CLVTracks.Clear";
Debug.ShouldStop(1073741824);
parent.mostCurrent._clvtracks.runVoidMethod ("_clear");
 BA.debugLineNum = 288;BA.debugLine="Wait For (GetTracks) Complete (r As Object)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", config.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "config", "bgettracks_click"), _gettracks());
this.state = 9;
return;
case 9:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 290;BA.debugLine="If Common.Tracks.Size > 0 Then";
Debug.ShouldStop(2);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 291;BA.debugLine="BuildTrackItems";
Debug.ShouldStop(4);
_buildtrackitems();
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _complete(RemoteObject _r) throws Exception{
}
public static RemoteObject  _bremovelink_click() throws Exception{
try {
		Debug.PushSubsStack("BRemoveLink_Click (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,362);
if (RapidSub.canDelegate("bremovelink_click")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","bremovelink_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _link = RemoteObject.declareNull("b4a.SpotifyLinker.config._link");
 BA.debugLineNum = 362;BA.debugLine="Private Sub BRemoveLink_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 363;BA.debugLine="If CLVLinks.Size > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",config.mostCurrent._clvlinks.runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 364;BA.debugLine="Dim i As Int = 0";
Debug.ShouldStop(2048);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 366;BA.debugLine="If Common.LinkedTracks.Size = 1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 367;BA.debugLine="ClearLinks";
Debug.ShouldStop(16384);
_clearlinks();
 BA.debugLineNum = 368;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 371;BA.debugLine="Do While i < CLVLinks.Size";
Debug.ShouldStop(262144);
while (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, config.mostCurrent._clvlinks.runMethod(true,"_getsize")))) {
 BA.debugLineNum = 373;BA.debugLine="Dim link As Link = CLVLinks.GetValue(i)";
Debug.ShouldStop(1048576);
_link = (config.mostCurrent._clvlinks.runMethod(false,"_getvalue",(Object)(_i)));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 375;BA.debugLine="If link.Selected Then";
Debug.ShouldStop(4194304);
if (_link.getField(true,"Selected" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 376;BA.debugLine="Common.LinkedTracks.RemoveAt(i)";
Debug.ShouldStop(8388608);
config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runVoidMethod ("RemoveAt",(Object)(_i));
 BA.debugLineNum = 377;BA.debugLine="CLVLinks.RemoveAt(i)";
Debug.ShouldStop(16777216);
config.mostCurrent._clvlinks.runVoidMethod ("_removeat",(Object)(_i));
 BA.debugLineNum = 378;BA.debugLine="i=i-1";
Debug.ShouldStop(33554432);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 };
 BA.debugLineNum = 381;BA.debugLine="i = i+1";
Debug.ShouldStop(268435456);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 };
 BA.debugLineNum = 385;BA.debugLine="Common.KVS.Put(\"linked_tracks\", Common.LinkedTrac";
Debug.ShouldStop(1);
config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("linked_tracks")),(Object)((config.mostCurrent._common._linkedtracks /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 386;BA.debugLine="CLVLinks.Refresh";
Debug.ShouldStop(2);
config.mostCurrent._clvlinks.runVoidMethod ("_refresh");
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bsave_click() throws Exception{
try {
		Debug.PushSubsStack("BSave_Click (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,397);
if (RapidSub.canDelegate("bsave_click")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","bsave_click");}
int _i = 0;
RemoteObject _linkk = RemoteObject.declareNull("b4a.SpotifyLinker.config._link");
 BA.debugLineNum = 397;BA.debugLine="Private Sub BSave_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="Common.LinkList.Clear";
Debug.ShouldStop(8192);
config.mostCurrent._common._linklist /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 400;BA.debugLine="If CLVLinks.Size > 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",config.mostCurrent._clvlinks.runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 401;BA.debugLine="For i = 0 To CLVLinks.Size-1";
Debug.ShouldStop(65536);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {config.mostCurrent._clvlinks.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 402;BA.debugLine="Dim linkk As Link = CLVLinks.GetValue(i)";
Debug.ShouldStop(131072);
_linkk = (config.mostCurrent._clvlinks.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("linkk", _linkk);Debug.locals.put("linkk", _linkk);
 BA.debugLineNum = 403;BA.debugLine="Common.LinkList.Add(linkk)";
Debug.ShouldStop(262144);
config.mostCurrent._common._linklist /*RemoteObject*/ .runVoidMethod ("Add",(Object)((_linkk)));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 407;BA.debugLine="Common.KVS.Put(\"links\", Common.LinkList)";
Debug.ShouldStop(4194304);
config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("links")),(Object)((config.mostCurrent._common._linklist /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 408;BA.debugLine="ToastMessageShow(\"Your linked tracks have been sa";
Debug.ShouldStop(8388608);
config.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Your linked tracks have been saved.")),(Object)(config.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildlinkitems() throws Exception{
try {
		Debug.PushSubsStack("BuildLinkItems (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,91);
if (RapidSub.canDelegate("buildlinkitems")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","buildlinkitems");}
int _i = 0;
 BA.debugLineNum = 91;BA.debugLine="Sub BuildLinkItems";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="For i = 0 To Common.LinkedTracks.Size-1";
Debug.ShouldStop(134217728);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 93;BA.debugLine="AddLink(Common.LinkedTracks.Get(i))";
Debug.ShouldStop(268435456);
_addlink((config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtrackitems() throws Exception{
try {
		Debug.PushSubsStack("BuildTrackItems (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,51);
if (RapidSub.canDelegate("buildtrackitems")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","buildtrackitems");}
int _i = 0;
RemoteObject _track = RemoteObject.declareNull("b4a.SpotifyLinker.config._track");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 51;BA.debugLine="Sub BuildTrackItems";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="For i = 0 To Common.Tracks.Size-1";
Debug.ShouldStop(524288);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {config.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 53;BA.debugLine="Dim track As Track";
Debug.ShouldStop(1048576);
_track = RemoteObject.createNew ("b4a.SpotifyLinker.config._track");Debug.locals.put("track", _track);
 BA.debugLineNum = 54;BA.debugLine="track.Initialize";
Debug.ShouldStop(2097152);
_track.runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="track.LabelNum = i+1";
Debug.ShouldStop(4194304);
_track.setField ("LabelNum" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 56;BA.debugLine="track.LabelName = Common.Tracks.Keys.Get(i)";
Debug.ShouldStop(8388608);
_track.setField ("LabelName" /*RemoteObject*/ ,BA.ObjectToString(config.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 57;BA.debugLine="Dim Pnl As B4XView = XUI.CreatePanel(Null)";
Debug.ShouldStop(16777216);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = config.mostCurrent._xui.runMethod(false,"CreatePanel",config.processBA,(Object)(BA.ObjectToString(config.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Pnl", _pnl);Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 58;BA.debugLine="Pnl.Color = XUI.Color_White";
Debug.ShouldStop(33554432);
_pnl.runMethod(true,"setColor",config.mostCurrent._xui.getField(true,"Color_White"));
 BA.debugLineNum = 59;BA.debugLine="Pnl.SetLayoutAnimated(0dip, 0dip, 0dip, CLVTrack";
Debug.ShouldStop(67108864);
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(config.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(config.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(config.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(config.mostCurrent._clvtracks.runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(config.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 60;BA.debugLine="CLVTracks.Add(Pnl, track)";
Debug.ShouldStop(134217728);
config.mostCurrent._clvtracks.runVoidMethod ("_add",(Object)(_pnl),(Object)((_track)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearlinks() throws Exception{
try {
		Debug.PushSubsStack("ClearLinks (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,190);
if (RapidSub.canDelegate("clearlinks")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","clearlinks");}
 BA.debugLineNum = 190;BA.debugLine="Sub ClearLinks";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="Common.LinkedTracks.Clear";
Debug.ShouldStop(1073741824);
config.mostCurrent._common._linkedtracks /*RemoteObject*/ .runVoidMethod ("Clear");
 BA.debugLineNum = 192;BA.debugLine="CLVLinks.Clear";
Debug.ShouldStop(-2147483648);
config.mostCurrent._clvlinks.runVoidMethod ("_clear");
 BA.debugLineNum = 194;BA.debugLine="If Common.KVS.ContainsKey(\"linked_tracks\") Then";
Debug.ShouldStop(2);
if (config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("linked_tracks"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 195;BA.debugLine="Common.KVS.Remove(\"linked_tracks\")";
Debug.ShouldStop(4);
config.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("linked_tracks")));
 };
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvlinks_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVLinks_ItemClick (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,411);
if (RapidSub.canDelegate("clvlinks_itemclick")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","clvlinks_itemclick", _index, _value);}
RemoteObject _link = RemoteObject.declareNull("b4a.SpotifyLinker.config._link");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 411;BA.debugLine="Private Sub CLVLinks_ItemClick (Index As Int, Valu";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 412;BA.debugLine="Dim link As Link = Value";
Debug.ShouldStop(134217728);
_link = (_value);Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 413;BA.debugLine="link.Selected = Not(link.Selected)";
Debug.ShouldStop(268435456);
_link.setField ("Selected" /*RemoteObject*/ ,config.mostCurrent.__c.runMethod(true,"Not",(Object)(_link.getField(true,"Selected" /*RemoteObject*/ ))));
 BA.debugLineNum = 414;BA.debugLine="StyleLink(Value, CLVLinks.GetPanel(Index))";
Debug.ShouldStop(536870912);
_stylelink((_value),config.mostCurrent._clvlinks.runMethod(false,"_getpanel",(Object)(_index)));
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvlinks_visiblerangechanged(RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("CLVLinks_VisibleRangeChanged (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,343);
if (RapidSub.canDelegate("clvlinks_visiblerangechanged")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","clvlinks_visiblerangechanged", _firstindex, _lastindex);}
RemoteObject _extrasize = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 343;BA.debugLine="Private Sub CLVLinks_VisibleRangeChanged (FirstInd";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Dim extraSize As Int = 25";
Debug.ShouldStop(8388608);
_extrasize = BA.numberCast(int.class, 25);Debug.locals.put("extraSize", _extrasize);Debug.locals.put("extraSize", _extrasize);
 BA.debugLineNum = 346;BA.debugLine="For i = Max(0, FirstIndex-extraSize) To Min(LastI";
Debug.ShouldStop(33554432);
{
final int step2 = 1;
final int limit2 = (int) (0 + config.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,_extrasize}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {config.mostCurrent._clvlinks.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)))).<Double>get().doubleValue());
_i = (int) (0 + config.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,_extrasize}, "-",1, 1)))).<Double>get().doubleValue()) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 347;BA.debugLine="Dim Pnl As B4XView = CLVLinks.GetPanel(i)";
Debug.ShouldStop(67108864);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = config.mostCurrent._clvlinks.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Pnl", _pnl);Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 349;BA.debugLine="If i > FirstIndex-extraSize And i < LastIndex+ex";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,_extrasize}, "-",1, 1))) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,_extrasize}, "+",1, 1)))) { 
 BA.debugLineNum = 350;BA.debugLine="If Pnl.NumberOfViews = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 351;BA.debugLine="Pnl.LoadLayout(\"track\")";
Debug.ShouldStop(1073741824);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("track")),config.mostCurrent.activityBA);
 BA.debugLineNum = 352;BA.debugLine="StyleLink(CLVLinks.GetValue(i), Pnl)";
Debug.ShouldStop(-2147483648);
_stylelink((config.mostCurrent._clvlinks.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i)))),_pnl);
 };
 }else {
 BA.debugLineNum = 355;BA.debugLine="If Pnl.NumberOfViews > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_pnl.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 356;BA.debugLine="Pnl.RemoveAllViews";
Debug.ShouldStop(8);
_pnl.runVoidMethod ("RemoveAllViews");
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvtracks_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVTracks_ItemClick (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,315);
if (RapidSub.canDelegate("clvtracks_itemclick")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","clvtracks_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 315;BA.debugLine="Private Sub CLVTracks_ItemClick (Index As Int, Val";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 316;BA.debugLine="SelectTrack(Value)";
Debug.ShouldStop(134217728);
_selecttrack((_value));
 BA.debugLineNum = 317;BA.debugLine="StyleTrack(Value, CLVTracks.GetPanel(Index))";
Debug.ShouldStop(268435456);
_styletrack((_value),config.mostCurrent._clvtracks.runMethod(false,"_getpanel",(Object)(_index)));
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvtracks_visiblerangechanged(RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("CLVTracks_VisibleRangeChanged (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,295);
if (RapidSub.canDelegate("clvtracks_visiblerangechanged")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","clvtracks_visiblerangechanged", _firstindex, _lastindex);}
RemoteObject _extrasize = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _track = RemoteObject.declareNull("b4a.SpotifyLinker.config._track");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _matcher = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 295;BA.debugLine="Private Sub CLVTracks_VisibleRangeChanged (FirstIn";
Debug.ShouldStop(64);
 BA.debugLineNum = 296;BA.debugLine="Dim extraSize As Int = 25";
Debug.ShouldStop(128);
_extrasize = BA.numberCast(int.class, 25);Debug.locals.put("extraSize", _extrasize);Debug.locals.put("extraSize", _extrasize);
 BA.debugLineNum = 297;BA.debugLine="For i = Max(0, FirstIndex-extraSize) To Min(LastI";
Debug.ShouldStop(256);
{
final int step2 = 1;
final int limit2 = (int) (0 + config.mostCurrent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,_extrasize}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {config.mostCurrent._clvtracks.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)))).<Double>get().doubleValue());
_i = (int) (0 + config.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,_extrasize}, "-",1, 1)))).<Double>get().doubleValue()) ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 298;BA.debugLine="Dim track As Track = CLVTracks.GetValue(i)";
Debug.ShouldStop(512);
_track = (config.mostCurrent._clvtracks.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("track", _track);Debug.locals.put("track", _track);
 BA.debugLineNum = 299;BA.debugLine="Dim Pnl As B4XView = CLVTracks.GetPanel(i)";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = config.mostCurrent._clvtracks.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Pnl", _pnl);Debug.locals.put("Pnl", _pnl);
 BA.debugLineNum = 300;BA.debugLine="Dim matcher As Matcher";
Debug.ShouldStop(2048);
_matcher = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("matcher", _matcher);
 BA.debugLineNum = 301;BA.debugLine="matcher = Regex.Matcher2(txtFilter.Text, Regex.C";
Debug.ShouldStop(4096);
_matcher = config.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher2",(Object)(config.mostCurrent._txtfilter.runMethod(true,"getText")),(Object)(config.mostCurrent.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_track.getField(true,"LabelName" /*RemoteObject*/ )));Debug.locals.put("matcher", _matcher);
 BA.debugLineNum = 302;BA.debugLine="If i > FirstIndex-extraSize And i < LastIndex+ex";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,_extrasize}, "-",1, 1))) && RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,_extrasize}, "+",1, 1))) && RemoteObject.solveBoolean(".",_matcher.runMethod(true,"Find"))) { 
 BA.debugLineNum = 303;BA.debugLine="If Pnl.NumberOfViews = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 304;BA.debugLine="Pnl.LoadLayout(\"track\")";
Debug.ShouldStop(32768);
_pnl.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("track")),config.mostCurrent.activityBA);
 BA.debugLineNum = 305;BA.debugLine="StyleTrack(track, Pnl)";
Debug.ShouldStop(65536);
_styletrack(_track,_pnl);
 };
 }else {
 BA.debugLineNum = 308;BA.debugLine="If Pnl.NumberOfViews > 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_pnl.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 309;BA.debugLine="Pnl.RemoveAllViews";
Debug.ShouldStop(1048576);
_pnl.runVoidMethod ("RemoveAllViews");
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalbums() throws Exception{
try {
		Debug.PushSubsStack("GetAlbums (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,199);
if (RapidSub.canDelegate("getalbums")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","getalbums");}
ResumableSub_GetAlbums rsub = new ResumableSub_GetAlbums(null);
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
public static class ResumableSub_GetAlbums extends BA.ResumableSub {
public ResumableSub_GetAlbums(b4a.SpotifyLinker.config parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.config parent;
RemoteObject _dsoid = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.SpotifyLinker.httpjob");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _albums = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ids = RemoteObject.declareNull("b4a.SpotifyLinker.b4xorderedmap");
RemoteObject _album = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetAlbums (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,199);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 200;BA.debugLine="If Common.KVS.ContainsKey(\"albums\") Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("albums"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 201;BA.debugLine="Return Common.ToB4XOrderedMap(Common.KVS.Get(\"al";
Debug.ShouldStop(256);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent._common.runMethod(false,"_tob4xorderedmap" /*RemoteObject*/ ,config.mostCurrent.activityBA,(Object)((parent.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("albums"))))))));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 204;BA.debugLine="Dim DSOID As String = \"2cbWJP4X5b9sKEDW80uc5r\"";
Debug.ShouldStop(2048);
_dsoid = BA.ObjectToString("2cbWJP4X5b9sKEDW80uc5r");Debug.locals.put("DSOID", _dsoid);Debug.locals.put("DSOID", _dsoid);
 BA.debugLineNum = 205;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4096);
_j = RemoteObject.createNew ("b4a.SpotifyLinker.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 206;BA.debugLine="j.Initialize(\"j\", Me)";
Debug.ShouldStop(8192);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_initialize" /*RemoteObject*/ ,config.processBA,(Object)(BA.ObjectToString("j")),(Object)(config.getObject()));
 BA.debugLineNum = 207;BA.debugLine="j.Download(\"https://api.spotify.com/v1/artists/\"";
Debug.ShouldStop(16384);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://api.spotify.com/v1/artists/"),_dsoid,RemoteObject.createImmutable("/albums"))));
 BA.debugLineNum = 208;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
Debug.ShouldStop(32768);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),parent.mostCurrent._common._token /*RemoteObject*/ )));
 BA.debugLineNum = 209;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", config.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "config", "getalbums"), (_j));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 211;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
Debug.ShouldStop(262144);
if (true) break;

case 5:
//if
this.state = 12;
if (RemoteObject.solveBoolean(".",_j.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 200))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 212;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(524288);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 213;BA.debugLine="jp.Initialize(j.GetString)";
Debug.ShouldStop(1048576);
_jp.runVoidMethod ("Initialize",(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 214;BA.debugLine="Dim albums As List = jp.NextObject.Get(\"items\")";
Debug.ShouldStop(2097152);
_albums = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_albums = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _jp.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("albums", _albums);
 BA.debugLineNum = 215;BA.debugLine="Dim ids As B4XOrderedMap";
Debug.ShouldStop(4194304);
_ids = RemoteObject.createNew ("b4a.SpotifyLinker.b4xorderedmap");Debug.locals.put("ids", _ids);
 BA.debugLineNum = 216;BA.debugLine="ids.Initialize";
Debug.ShouldStop(8388608);
_ids.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,config.processBA);
 BA.debugLineNum = 218;BA.debugLine="For Each album As Map In albums";
Debug.ShouldStop(33554432);
if (true) break;

case 8:
//for
this.state = 11;
_album = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group16 = _albums;
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("album", _album);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index16 < groupLen16) {
this.state = 10;
_album = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group16.runMethod(false,"Get",index16));}
if (true) break;

case 18:
//C
this.state = 17;
index16++;
Debug.locals.put("album", _album);
if (true) break;

case 10:
//C
this.state = 18;
 BA.debugLineNum = 219;BA.debugLine="ids.Put(ToTitleCase(album.Get(\"name\"), Null), a";
Debug.ShouldStop(67108864);
_ids.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_totitlecase(BA.ObjectToString(_album.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.mostCurrent.__c.getField(false,"Null"))))),(Object)(_album.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("album", _album);
;
 BA.debugLineNum = 222;BA.debugLine="Common.KVS.Put(\"albums\", ToOrderedMap(ids))";
Debug.ShouldStop(536870912);
parent.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("albums")),(Object)((_toorderedmap(_ids))));
 BA.debugLineNum = 223;BA.debugLine="Return ids";
Debug.ShouldStop(1073741824);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ids));return;};
 if (true) break;
;
 BA.debugLineNum = 226;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";
Debug.ShouldStop(2);

case 12:
//if
this.state = 15;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, -(double) (0 + 1)))))).<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 227;BA.debugLine="Common.HandleHTTPError(j.GetString)";
Debug.ShouldStop(4);
parent.mostCurrent._common.runVoidMethod ("_handlehttperror" /*RemoteObject*/ ,config.mostCurrent.activityBA,(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 230;BA.debugLine="Log(\"Error getting the albums.\")";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42752543",RemoteObject.createImmutable("Error getting the albums."),0);
 BA.debugLineNum = 231;BA.debugLine="Return Null";
Debug.ShouldStop(64);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.mostCurrent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _gettracks() throws Exception{
try {
		Debug.PushSubsStack("GetTracks (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,234);
if (RapidSub.canDelegate("gettracks")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","gettracks");}
ResumableSub_GetTracks rsub = new ResumableSub_GetTracks(null);
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
public static class ResumableSub_GetTracks extends BA.ResumableSub {
public ResumableSub_GetTracks(b4a.SpotifyLinker.config parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.SpotifyLinker.config parent;
RemoteObject _ids = RemoteObject.declareNull("b4a.SpotifyLinker.b4xorderedmap");
RemoteObject _j = RemoteObject.declareNull("b4a.SpotifyLinker.httpjob");
RemoteObject _stringsids = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _albums = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _album = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tracklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _trackitemlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _track = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step6;
int limit6;
RemoteObject group20;
int index20;
int groupLen20;
RemoteObject group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetTracks (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,234);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 235;BA.debugLine="Wait For (GetAlbums) Complete (ids As B4XOrderedM";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", config.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "config", "gettracks"), _getalbums());
this.state = 27;
return;
case 27:
//C
this.state = 1;
_ids = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("ids", _ids);
;
 BA.debugLineNum = 236;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(2048);
_j = RemoteObject.createNew ("b4a.SpotifyLinker.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 237;BA.debugLine="j.Initialize(\"j\", Me)";
Debug.ShouldStop(4096);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_initialize" /*RemoteObject*/ ,config.processBA,(Object)(BA.ObjectToString("j")),(Object)(config.getObject()));
 BA.debugLineNum = 238;BA.debugLine="Dim stringsIds As StringBuilder";
Debug.ShouldStop(8192);
_stringsids = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("stringsIds", _stringsids);
 BA.debugLineNum = 239;BA.debugLine="stringsIds.Initialize";
Debug.ShouldStop(16384);
_stringsids.runVoidMethod ("Initialize");
 BA.debugLineNum = 241;BA.debugLine="For i = 0 To ids.Size-1";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//for
this.state = 10;
step6 = 1;
limit6 = RemoteObject.solve(new RemoteObject[] {_ids.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 10;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 3;
if (true) break;

case 29:
//C
this.state = 28;
_i = ((int)(0 + _i + step6)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 242;BA.debugLine="If i = ids.Size-1 Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_ids.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 243;BA.debugLine="stringsIds.Append(ids.Get(ids.Keys.Get(i)))";
Debug.ShouldStop(262144);
_stringsids.runVoidMethod ("Append",(Object)(BA.ObjectToString(_ids.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)(_ids.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 245;BA.debugLine="stringsIds.Append(ids.Get(ids.Keys.Get(i)) & \",";
Debug.ShouldStop(1048576);
_stringsids.runVoidMethod ("Append",(Object)(RemoteObject.concat(_ids.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)(_ids.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(","))));
 if (true) break;

case 9:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 249;BA.debugLine="j.Download2(\"https://api.spotify.com/v1/albums\",";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_download2" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://api.spotify.com/v1/albums")),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("ids"),_stringsids.runMethod(true,"ToString")})));
 BA.debugLineNum = 252;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),parent.mostCurrent._common._token /*RemoteObject*/ )));
 BA.debugLineNum = 253;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", config.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "config", "gettracks"), (_j));
this.state = 30;
return;
case 30:
//C
this.state = 11;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 255;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 11:
//if
this.state = 26;
if (RemoteObject.solveBoolean(".",_j.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, 200))) { 
this.state = 13;
}else 
{ BA.debugLineNum = 270;BA.debugLine="Else If Not(j.Response.StatusCode = -1) Then";
Debug.ShouldStop(8192);
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_j.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode"),BA.numberCast(double.class, -(double) (0 + 1)))))).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 25;
}}
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 256;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(-2147483648);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 257;BA.debugLine="jp.Initialize(j.GetString)";
Debug.ShouldStop(1);
_jp.runVoidMethod ("Initialize",(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 258;BA.debugLine="Dim albums As List = jp.NextObject.Get(\"albums\")";
Debug.ShouldStop(2);
_albums = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_albums = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _jp.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("albums")))));Debug.locals.put("albums", _albums);
 BA.debugLineNum = 260;BA.debugLine="For Each album As Map In albums";
Debug.ShouldStop(8);
if (true) break;

case 14:
//for
this.state = 21;
_album = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _albums;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("album", _album);
this.state = 31;
if (true) break;

case 31:
//C
this.state = 21;
if (index20 < groupLen20) {
this.state = 16;
_album = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));}
if (true) break;

case 32:
//C
this.state = 31;
index20++;
Debug.locals.put("album", _album);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 261;BA.debugLine="Dim trackList As Map = album.Get(\"tracks\")";
Debug.ShouldStop(16);
_tracklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tracklist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _album.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tracks")))));Debug.locals.put("trackList", _tracklist);
 BA.debugLineNum = 262;BA.debugLine="Dim trackItemList As List = trackList.Get(\"item";
Debug.ShouldStop(32);
_trackitemlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_trackitemlist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _tracklist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("trackItemList", _trackitemlist);
 BA.debugLineNum = 264;BA.debugLine="For Each track As Map In trackItemList";
Debug.ShouldStop(128);
if (true) break;

case 17:
//for
this.state = 20;
_track = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group23 = _trackitemlist;
index23 = 0;
groupLen23 = group23.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("track", _track);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 20;
if (index23 < groupLen23) {
this.state = 19;
_track = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group23.runMethod(false,"Get",index23));}
if (true) break;

case 34:
//C
this.state = 33;
index23++;
Debug.locals.put("track", _track);
if (true) break;

case 19:
//C
this.state = 34;
 BA.debugLineNum = 265;BA.debugLine="Common.Tracks.Put(ToTitleCase(track.Get(\"name\"";
Debug.ShouldStop(256);
parent.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_totitlecase(BA.ObjectToString(_track.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.mostCurrent.__c.getField(false,"Null"))))),(Object)(_track.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uri"))))));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 32;
Debug.locals.put("track", _track);
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 26;
Debug.locals.put("album", _album);
;
 BA.debugLineNum = 269;BA.debugLine="Common.KVS.Put(\"tracks\", ToOrderedMap(Common.Tra";
Debug.ShouldStop(4096);
parent.mostCurrent._common._kvs /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(BA.ObjectToString("tracks")),(Object)((_toorderedmap(parent.mostCurrent._common._tracks /*RemoteObject*/ ))));
 if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 271;BA.debugLine="Common.HandleHTTPError(j.GetString)";
Debug.ShouldStop(16384);
parent.mostCurrent._common.runVoidMethod ("_handlehttperror" /*RemoteObject*/ ,config.mostCurrent.activityBA,(Object)(_j.runClassMethod (b4a.SpotifyLinker.httpjob.class, "_getstring" /*RemoteObject*/ )));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 273;BA.debugLine="Log(\"Error getting the tracks.\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42818087",RemoteObject.createImmutable("Error getting the tracks."),0);
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 276;BA.debugLine="Return Null";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.mostCurrent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Type Track(LabelNum As Int, LabelName As String,";
;
 //BA.debugLineNum = 15;BA.debugLine="Type Link(LabelNum As Int, LabelLink As String, u";
;
 //BA.debugLineNum = 16;BA.debugLine="Private XUI As XUI";
config.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 17;BA.debugLine="Private CLVTracks As CustomListView";
config.mostCurrent._clvtracks = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 18;BA.debugLine="Private CLVLinks As CustomListView";
config.mostCurrent._clvlinks = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 19;BA.debugLine="Private SelectedTracks As B4XOrderedMap";
config.mostCurrent._selectedtracks = RemoteObject.createNew ("b4a.SpotifyLinker.b4xorderedmap");
 //BA.debugLineNum = 20;BA.debugLine="Private txtFilter As EditText";
config.mostCurrent._txtfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LblName As B4XView";
config.mostCurrent._lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LblNum As B4XView";
config.mostCurrent._lblnum = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _selecttrack(RemoteObject _track) throws Exception{
try {
		Debug.PushSubsStack("SelectTrack (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,64);
if (RapidSub.canDelegate("selecttrack")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","selecttrack", _track);}
Debug.locals.put("track", _track);
 BA.debugLineNum = 64;BA.debugLine="Sub SelectTrack(track As Track)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="track.Selected = Not(track.Selected)";
Debug.ShouldStop(1);
_track.setField ("Selected" /*RemoteObject*/ ,config.mostCurrent.__c.runMethod(true,"Not",(Object)(_track.getField(true,"Selected" /*RemoteObject*/ ))));
 BA.debugLineNum = 67;BA.debugLine="If track.Selected Then";
Debug.ShouldStop(4);
if (_track.getField(true,"Selected" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 68;BA.debugLine="SelectedTracks.Put(track.LabelName, Common.Track";
Debug.ShouldStop(8);
config.mostCurrent._selectedtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_track.getField(true,"LabelName" /*RemoteObject*/ ))),(Object)(config.mostCurrent._common._tracks /*RemoteObject*/ .runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_track.getField(true,"LabelName" /*RemoteObject*/ ))))));
 }else {
 BA.debugLineNum = 70;BA.debugLine="SelectedTracks.Remove(track.LabelName)";
Debug.ShouldStop(32);
config.mostCurrent._selectedtracks.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_track.getField(true,"LabelName" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stringifylink(RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("StringifyLink (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,109);
if (RapidSub.canDelegate("stringifylink")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","stringifylink", _link);}
RemoteObject _stringlink = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("link", _link);
 BA.debugLineNum = 109;BA.debugLine="Sub StringifyLink(link As OrderedMap) As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Dim stringLink As StringBuilder";
Debug.ShouldStop(8192);
_stringlink = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("stringLink", _stringlink);
 BA.debugLineNum = 111;BA.debugLine="stringLink.Initialize";
Debug.ShouldStop(16384);
_stringlink.runVoidMethod ("Initialize");
 BA.debugLineNum = 113;BA.debugLine="For i = 0 To link.keys.Size-1";
Debug.ShouldStop(65536);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_link.getField(false,"Keys" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 114;BA.debugLine="If i = link.keys.Size-1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_link.getField(false,"Keys" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 115;BA.debugLine="stringLink.Append(link.Keys.Get(i))";
Debug.ShouldStop(262144);
_stringlink.runVoidMethod ("Append",(Object)(BA.ObjectToString(_link.getField(false,"Keys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }else {
 BA.debugLineNum = 117;BA.debugLine="stringLink.Append(link.Keys.Get(i) & \" - \")";
Debug.ShouldStop(1048576);
_stringlink.runVoidMethod ("Append",(Object)(RemoteObject.concat(_link.getField(false,"Keys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" - "))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 121;BA.debugLine="Return stringLink.ToString";
Debug.ShouldStop(16777216);
if (true) return _stringlink.runMethod(true,"ToString");
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
public static RemoteObject  _stringifyuris(RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("StringifyUris (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,124);
if (RapidSub.canDelegate("stringifyuris")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","stringifyuris", _link);}
RemoteObject _stringuris = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("link", _link);
 BA.debugLineNum = 124;BA.debugLine="Sub StringifyUris(link As OrderedMap) As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Dim stringUris As StringBuilder";
Debug.ShouldStop(268435456);
_stringuris = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("stringUris", _stringuris);
 BA.debugLineNum = 126;BA.debugLine="stringUris.Initialize";
Debug.ShouldStop(536870912);
_stringuris.runVoidMethod ("Initialize");
 BA.debugLineNum = 128;BA.debugLine="For i = 0 To link.keys.Size-1";
Debug.ShouldStop(-2147483648);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_link.getField(false,"Keys" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 129;BA.debugLine="If i = link.keys.Size-1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_link.getField(false,"Keys" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 130;BA.debugLine="stringUris.Append(link.Map.Get(link.Keys.Get(i)";
Debug.ShouldStop(2);
_stringuris.runVoidMethod ("Append",(Object)(BA.ObjectToString(_link.getField(false,"Map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_link.getField(false,"Keys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))))));
 }else {
 BA.debugLineNum = 132;BA.debugLine="stringUris.Append(link.Map.Get(link.Keys.Get(i)";
Debug.ShouldStop(8);
_stringuris.runVoidMethod ("Append",(Object)(RemoteObject.concat(_link.getField(false,"Map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_link.getField(false,"Keys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable(","))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 136;BA.debugLine="Return stringUris.ToString";
Debug.ShouldStop(128);
if (true) return _stringuris.runMethod(true,"ToString");
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stylelink(RemoteObject _link,RemoteObject _linkpnl) throws Exception{
try {
		Debug.PushSubsStack("StyleLink (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,139);
if (RapidSub.canDelegate("stylelink")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","stylelink", _link, _linkpnl);}
Debug.locals.put("link", _link);
Debug.locals.put("linkPnl", _linkpnl);
 BA.debugLineNum = 139;BA.debugLine="Sub StyleLink(link As Link, linkPnl As B4XView)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="LblName = linkPnl.GetView(0)";
Debug.ShouldStop(2048);
config.mostCurrent._lblname = _linkpnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 141;BA.debugLine="LblNum = linkPnl.GetView(1)";
Debug.ShouldStop(4096);
config.mostCurrent._lblnum = _linkpnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 142;BA.debugLine="LblName.Text = link.LabelLink";
Debug.ShouldStop(8192);
config.mostCurrent._lblname.runMethod(true,"setText",BA.ObjectToCharSequence(_link.getField(true,"LabelLink" /*RemoteObject*/ )));
 BA.debugLineNum = 144;BA.debugLine="If link.Selected Then";
Debug.ShouldStop(32768);
if (_link.getField(true,"Selected" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 145;BA.debugLine="LblNum.TextColor = XUI.Color_Green";
Debug.ShouldStop(65536);
config.mostCurrent._lblnum.runMethod(true,"setTextColor",config.mostCurrent._xui.getField(true,"Color_Green"));
 BA.debugLineNum = 146;BA.debugLine="LblNum.Text = Chr(2713)";
Debug.ShouldStop(131072);
config.mostCurrent._lblnum.runMethod(true,"setText",BA.ObjectToCharSequence(config.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 2713)))));
 BA.debugLineNum = 147;BA.debugLine="LblName.TextColor = XUI.Color_Green";
Debug.ShouldStop(262144);
config.mostCurrent._lblname.runMethod(true,"setTextColor",config.mostCurrent._xui.getField(true,"Color_Green"));
 }else {
 BA.debugLineNum = 149;BA.debugLine="LblNum.TextColor = XUI.Color_Black";
Debug.ShouldStop(1048576);
config.mostCurrent._lblnum.runMethod(true,"setTextColor",config.mostCurrent._xui.getField(true,"Color_Black"));
 BA.debugLineNum = 150;BA.debugLine="LblNum.Text = link.LabelNum";
Debug.ShouldStop(2097152);
config.mostCurrent._lblnum.runMethod(true,"setText",BA.ObjectToCharSequence(_link.getField(true,"LabelNum" /*RemoteObject*/ )));
 BA.debugLineNum = 151;BA.debugLine="LblName.TextColor = XUI.Color_Black";
Debug.ShouldStop(4194304);
config.mostCurrent._lblname.runMethod(true,"setTextColor",config.mostCurrent._xui.getField(true,"Color_Black"));
 };
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _styletrack(RemoteObject _track,RemoteObject _trackpnl) throws Exception{
try {
		Debug.PushSubsStack("StyleTrack (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,74);
if (RapidSub.canDelegate("styletrack")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","styletrack", _track, _trackpnl);}
Debug.locals.put("track", _track);
Debug.locals.put("trackPnl", _trackpnl);
 BA.debugLineNum = 74;BA.debugLine="Sub StyleTrack(track As Track, trackPnl As B4XView";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="LblName = trackPnl.GetView(0)";
Debug.ShouldStop(1024);
config.mostCurrent._lblname = _trackpnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 76;BA.debugLine="LblName.Tag = trackPnl";
Debug.ShouldStop(2048);
config.mostCurrent._lblname.runMethod(false,"setTag",(_trackpnl.getObject()));
 BA.debugLineNum = 77;BA.debugLine="LblNum = trackPnl.GetView(1)";
Debug.ShouldStop(4096);
config.mostCurrent._lblnum = _trackpnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 78;BA.debugLine="LblName.Text = track.LabelName";
Debug.ShouldStop(8192);
config.mostCurrent._lblname.runMethod(true,"setText",BA.ObjectToCharSequence(_track.getField(true,"LabelName" /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="If track.Selected Then";
Debug.ShouldStop(32768);
if (_track.getField(true,"Selected" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="LblNum.TextColor = XUI.Color_Green";
Debug.ShouldStop(65536);
config.mostCurrent._lblnum.runMethod(true,"setTextColor",config.mostCurrent._xui.getField(true,"Color_Green"));
 BA.debugLineNum = 82;BA.debugLine="LblNum.Text = Chr(2713)";
Debug.ShouldStop(131072);
config.mostCurrent._lblnum.runMethod(true,"setText",BA.ObjectToCharSequence(config.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 2713)))));
 BA.debugLineNum = 83;BA.debugLine="LblName.TextColor = XUI.Color_Green";
Debug.ShouldStop(262144);
config.mostCurrent._lblname.runMethod(true,"setTextColor",config.mostCurrent._xui.getField(true,"Color_Green"));
 }else {
 BA.debugLineNum = 85;BA.debugLine="LblNum.TextColor = XUI.Color_Black";
Debug.ShouldStop(1048576);
config.mostCurrent._lblnum.runMethod(true,"setTextColor",config.mostCurrent._xui.getField(true,"Color_Black"));
 BA.debugLineNum = 86;BA.debugLine="LblNum.Text = track.LabelNum";
Debug.ShouldStop(2097152);
config.mostCurrent._lblnum.runMethod(true,"setText",BA.ObjectToCharSequence(_track.getField(true,"LabelNum" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="LblName.TextColor = XUI.Color_Black";
Debug.ShouldStop(4194304);
config.mostCurrent._lblname.runMethod(true,"setTextColor",config.mostCurrent._xui.getField(true,"Color_Black"));
 };
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toorderedmap(RemoteObject _toconvert) throws Exception{
try {
		Debug.PushSubsStack("ToOrderedMap (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,155);
if (RapidSub.canDelegate("toorderedmap")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","toorderedmap", _toconvert);}
RemoteObject _orderedmap = RemoteObject.declareNull("b4a.SpotifyLinker.common._orderedmap");
RemoteObject _key = RemoteObject.declareNull("Object");
Debug.locals.put("toConvert", _toconvert);
 BA.debugLineNum = 155;BA.debugLine="Sub ToOrderedMap(toConvert As B4XOrderedMap) As Or";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Dim orderedMap As OrderedMap";
Debug.ShouldStop(134217728);
_orderedmap = RemoteObject.createNew ("b4a.SpotifyLinker.common._orderedmap");Debug.locals.put("orderedMap", _orderedmap);
 BA.debugLineNum = 157;BA.debugLine="orderedMap.Initialize";
Debug.ShouldStop(268435456);
_orderedmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 158;BA.debugLine="orderedMap.Map.Initialize";
Debug.ShouldStop(536870912);
_orderedmap.getField(false,"Map" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 159;BA.debugLine="orderedMap.Keys.Initialize";
Debug.ShouldStop(1073741824);
_orderedmap.getField(false,"Keys" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="For Each key In toConvert.Keys";
Debug.ShouldStop(1);
{
final RemoteObject group5 = _toconvert.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = group5.runMethod(false,"Get",index5);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 162;BA.debugLine="orderedMap.Map.Put(key, toConvert.Get(key))";
Debug.ShouldStop(2);
_orderedmap.getField(false,"Map" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(_key),(Object)(_toconvert.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)(_key))));
 BA.debugLineNum = 163;BA.debugLine="orderedMap.Keys.Add(key)";
Debug.ShouldStop(4);
_orderedmap.getField(false,"Keys" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_key));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 166;BA.debugLine="Return orderedMap";
Debug.ShouldStop(32);
if (true) return _orderedmap;
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _totitlecase(RemoteObject _str,RemoteObject _exclude) throws Exception{
try {
		Debug.PushSubsStack("ToTitleCase (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,169);
if (RapidSub.canDelegate("totitlecase")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","totitlecase", _str, _exclude);}
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _news = null;
int _i = 0;
Debug.locals.put("str", _str);
Debug.locals.put("exclude", _exclude);
 BA.debugLineNum = 169;BA.debugLine="Sub ToTitleCase (str As String, exclude As List) A";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Dim s As String";
Debug.ShouldStop(512);
_s = RemoteObject.createImmutable("");Debug.locals.put("s", _s);
 BA.debugLineNum = 171;BA.debugLine="Dim NewS() As String = Regex.Split(\" \", str.Trim)";
Debug.ShouldStop(1024);
_news = config.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_str.runMethod(true,"trim")));Debug.locals.put("NewS", _news);Debug.locals.put("NewS", _news);
 BA.debugLineNum = 173;BA.debugLine="For i = 0 To NewS.Length -1";
Debug.ShouldStop(4096);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_news.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 174;BA.debugLine="If (exclude.IsInitialized And exclude.IndexOf(Ne";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean(".",_exclude.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("!",_exclude.runMethod(true,"IndexOf",(Object)((_news.getArrayElement(true,BA.numberCast(int.class, _i))))),BA.numberCast(double.class, -(double) (0 + 1))))) { 
 BA.debugLineNum = 175;BA.debugLine="s = s & NewS(i) & \" \"";
Debug.ShouldStop(16384);
_s = RemoteObject.concat(_s,_news.getArrayElement(true,BA.numberCast(int.class, _i)),RemoteObject.createImmutable(" "));Debug.locals.put("s", _s);
 }else {
 BA.debugLineNum = 177;BA.debugLine="If NewS(i).Length > 1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_news.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 178;BA.debugLine="s = s & _ 				 	NewS(i).SubString2(0,1).ToUppe";
Debug.ShouldStop(131072);
_s = RemoteObject.concat(_s,_news.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1))).runMethod(true,"toUpperCase"),_news.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(" "));Debug.locals.put("s", _s);
 }else {
 BA.debugLineNum = 182;BA.debugLine="s = s & NewS(i).ToUpperCase & \" \"";
Debug.ShouldStop(2097152);
_s = RemoteObject.concat(_s,_news.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"toUpperCase"),RemoteObject.createImmutable(" "));Debug.locals.put("s", _s);
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 187;BA.debugLine="Return s";
Debug.ShouldStop(67108864);
if (true) return _s;
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtfilter_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtFilter_TextChanged (config) ","config",2,config.mostCurrent.activityBA,config.mostCurrent,389);
if (RapidSub.canDelegate("txtfilter_textchanged")) { return b4a.SpotifyLinker.config.remoteMe.runUserSub(false, "config","txtfilter_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 389;BA.debugLine="Private Sub txtFilter_TextChanged (Old As String,";
Debug.ShouldStop(16);
 BA.debugLineNum = 390;BA.debugLine="CLVTracks.Refresh";
Debug.ShouldStop(32);
config.mostCurrent._clvtracks.runVoidMethod ("_refresh");
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}