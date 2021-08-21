package b4a.SpotifyLinker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class common {
private static common mostCurrent = new common();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _orderedmap{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List Keys;
public anywheresoftware.b4a.objects.collections.Map Map;
public void Initialize() {
IsInitialized = true;
Keys = new anywheresoftware.b4a.objects.collections.List();
Map = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.SpotifyLinker.keyvaluestore _kvs = null;
public static String _token = "";
public static b4a.SpotifyLinker.b4xorderedmap _tracks = null;
public static anywheresoftware.b4a.objects.collections.List _linkedtracks = null;
public static anywheresoftware.b4a.objects.collections.List _linklist = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.main _main = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.config _config = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public static b4a.SpotifyLinker.b4xorderedmap  _tob4xorderedmap(anywheresoftware.b4a.BA _ba,b4a.SpotifyLinker.common._orderedmap _toconvert) throws Exception{
RDebugUtils.currentModule="common";
if (Debug.shouldDelegate(null, "tob4xorderedmap", false))
	 {return ((b4a.SpotifyLinker.b4xorderedmap) Debug.delegate(null, "tob4xorderedmap", new Object[] {_ba,_toconvert}));}
b4a.SpotifyLinker.b4xorderedmap _orderedmap = null;
String _key = "";
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub ToB4XOrderedMap(toConvert As OrderedMap) As B4";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim orderedMap As B4XOrderedMap";
_orderedmap = new b4a.SpotifyLinker.b4xorderedmap();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="orderedMap.Initialize";
_orderedmap._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="For Each key As String In toConvert.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _toconvert.Keys /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="orderedMap.Put(key, toConvert.Map.Get(key))";
_orderedmap._put /*String*/ (null,(Object)(_key),_toconvert.Map /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="Return orderedMap";
if (true) return _orderedmap;
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="End Sub";
return null;
}
public static String  _handlehttperror(anywheresoftware.b4a.BA _ba,String _response) throws Exception{
RDebugUtils.currentModule="common";
if (Debug.shouldDelegate(null, "handlehttperror", false))
	 {return ((String) Debug.delegate(null, "handlehttperror", new Object[] {_ba,_response}));}
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _error = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub HandleHTTPError(response As String)";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="jp.Initialize(response)";
_jp.Initialize(_response);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.LogImpl("43735555",_response,0);
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Try";
try {RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Dim error As Map = jp.NextObject.Get(\"error\")";
_error = new anywheresoftware.b4a.objects.collections.Map();
_error = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_jp.NextObject().Get((Object)("error"))));
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="ToastMessageShow(error.Get(\"message\"), False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_error.Get((Object)("message"))),anywheresoftware.b4a.keywords.Common.False);
 } 
       catch (Exception e8) {
			(_ba.processBA == null ? _ba : _ba.processBA).setLastException(e8);RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("43735560",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(_ba)),0);
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="ToastMessageShow(\"There was an unknown error whe";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("There was an unknown error when connecting to Spotify."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="End Sub";
return "";
}
}