
package b4a.SpotifyLinker;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xorderedmap {
    public static RemoteObject myClass;
	public b4xorderedmap() {
	}
    public static PCBA staticBA = new PCBA(null, b4xorderedmap.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.SpotifyLinker.main _main = null;
public static b4a.SpotifyLinker.starter _starter = null;
public static b4a.SpotifyLinker.config _config = null;
public static b4a.SpotifyLinker.common _common = null;
public static b4a.SpotifyLinker.httputils2service _httputils2service = null;
public static b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public static b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"list",_ref.getField(false, "_list"),"map",_ref.getField(false, "_map")};
}
}