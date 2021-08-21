
package b4a.SpotifyLinker;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class madewithlove {
    public static RemoteObject myClass;
	public madewithlove() {
	}
    public static PCBA staticBA = new PCBA(null, madewithlove.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.SpotifyLinker.main _main = null;
public static b4a.SpotifyLinker.starter _starter = null;
public static b4a.SpotifyLinker.config _config = null;
public static b4a.SpotifyLinker.common _common = null;
public static b4a.SpotifyLinker.httputils2service _httputils2service = null;
public static b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public static b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}