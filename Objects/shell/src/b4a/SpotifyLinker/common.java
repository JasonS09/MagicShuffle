
package b4a.SpotifyLinker;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class common implements IRemote{
	public static common mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public common() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, common.class);
    static {
		mostCurrent = new common();
        remoteMe = RemoteObject.declareNull("b4a.SpotifyLinker.common");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("common"), "b4a.SpotifyLinker.common");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.SpotifyLinker.common"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _kvs = RemoteObject.declareNull("b4a.SpotifyLinker.keyvaluestore");
public static RemoteObject _token = RemoteObject.createImmutable("");
public static RemoteObject _tracks = RemoteObject.declareNull("b4a.SpotifyLinker.b4xorderedmap");
public static RemoteObject _linkedtracks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _linklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.SpotifyLinker.main _main = null;
public static b4a.SpotifyLinker.starter _starter = null;
public static b4a.SpotifyLinker.config _config = null;
public static b4a.SpotifyLinker.httputils2service _httputils2service = null;
public static b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public static b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4a.SpotifyLinker.b4xcollections.class),"Config",Debug.moduleToString(b4a.SpotifyLinker.config.class),"DateUtils",common.mostCurrent._dateutils,"HttpUtils2Service",Debug.moduleToString(b4a.SpotifyLinker.httputils2service.class),"KVS",common._kvs,"LinkedTracks",common._linkedtracks,"LinkList",common._linklist,"Main",Debug.moduleToString(b4a.SpotifyLinker.main.class),"Starter",Debug.moduleToString(b4a.SpotifyLinker.starter.class),"Token",common._token,"Tracks",common._tracks,"XUIViewsUtils",Debug.moduleToString(b4a.SpotifyLinker.xuiviewsutils.class)};
}
}