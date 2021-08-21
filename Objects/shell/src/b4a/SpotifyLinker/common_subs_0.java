package b4a.SpotifyLinker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class common_subs_0 {


public static RemoteObject  _handlehttperror(RemoteObject _ba,RemoteObject _response) throws Exception{
try {
		Debug.PushSubsStack("HandleHTTPError (common) ","common",3,_ba,common.mostCurrent,14);
if (RapidSub.canDelegate("handlehttperror")) { return b4a.SpotifyLinker.common.remoteMe.runUserSub(false, "common","handlehttperror", _ba, _response);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _error = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("response", _response);
 BA.debugLineNum = 14;BA.debugLine="Sub HandleHTTPError(response As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(16384);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 16;BA.debugLine="jp.Initialize(response)";
Debug.ShouldStop(32768);
_jp.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 17;BA.debugLine="Log(response)";
Debug.ShouldStop(65536);
common.mostCurrent.__c.runVoidMethod ("LogImpl","43735555",_response,0);
 BA.debugLineNum = 18;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 19;BA.debugLine="Dim error As Map = jp.NextObject.Get(\"error\")";
Debug.ShouldStop(262144);
_error = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_error = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _jp.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("error")))));Debug.locals.put("error", _error);
 BA.debugLineNum = 20;BA.debugLine="ToastMessageShow(error.Get(\"message\"), False)";
Debug.ShouldStop(524288);
common.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_error.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))))),(Object)(common.mostCurrent.__c.getField(true,"False")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 22;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
common.mostCurrent.__c.runVoidMethod ("LogImpl","43735560",BA.ObjectToString(common.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 23;BA.debugLine="ToastMessageShow(\"There was an unknown error whe";
Debug.ShouldStop(4194304);
common.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("There was an unknown error when connecting to Spotify.")),(Object)(common.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Type OrderedMap(Keys As List, Map As Map)";
;
 //BA.debugLineNum = 7;BA.debugLine="Dim KVS As KeyValueStore";
common._kvs = RemoteObject.createNew ("b4a.SpotifyLinker.keyvaluestore");
 //BA.debugLineNum = 8;BA.debugLine="Dim Token As String";
common._token = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim Tracks As B4XOrderedMap";
common._tracks = RemoteObject.createNew ("b4a.SpotifyLinker.b4xorderedmap");
 //BA.debugLineNum = 10;BA.debugLine="Dim LinkedTracks As List";
common._linkedtracks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 11;BA.debugLine="Dim LinkList As List";
common._linklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tob4xorderedmap(RemoteObject _ba,RemoteObject _toconvert) throws Exception{
try {
		Debug.PushSubsStack("ToB4XOrderedMap (common) ","common",3,_ba,common.mostCurrent,27);
if (RapidSub.canDelegate("tob4xorderedmap")) { return b4a.SpotifyLinker.common.remoteMe.runUserSub(false, "common","tob4xorderedmap", _ba, _toconvert);}
RemoteObject _orderedmap = RemoteObject.declareNull("b4a.SpotifyLinker.b4xorderedmap");
RemoteObject _key = RemoteObject.createImmutable("");
;
Debug.locals.put("toConvert", _toconvert);
 BA.debugLineNum = 27;BA.debugLine="Sub ToB4XOrderedMap(toConvert As OrderedMap) As B4";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Dim orderedMap As B4XOrderedMap";
Debug.ShouldStop(134217728);
_orderedmap = RemoteObject.createNew ("b4a.SpotifyLinker.b4xorderedmap");Debug.locals.put("orderedMap", _orderedmap);
 BA.debugLineNum = 29;BA.debugLine="orderedMap.Initialize";
Debug.ShouldStop(268435456);
_orderedmap.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 31;BA.debugLine="For Each key As String In toConvert.Keys";
Debug.ShouldStop(1073741824);
{
final RemoteObject group3 = _toconvert.getField(false,"Keys" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 32;BA.debugLine="orderedMap.Put(key, toConvert.Map.Get(key))";
Debug.ShouldStop(-2147483648);
_orderedmap.runClassMethod (b4a.SpotifyLinker.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_key)),(Object)(_toconvert.getField(false,"Map" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key)))));
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 35;BA.debugLine="Return orderedMap";
Debug.ShouldStop(4);
if (true) return _orderedmap;
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}