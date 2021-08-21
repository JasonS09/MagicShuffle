
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

public class config implements IRemote{
	public static config mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public config() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("config"), "b4a.SpotifyLinker.config");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, config.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _clvtracks = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _clvlinks = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _selectedtracks = RemoteObject.declareNull("b4a.SpotifyLinker.b4xorderedmap");
public static RemoteObject _txtfilter = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblnum = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.SpotifyLinker.main _main = null;
public static b4a.SpotifyLinker.starter _starter = null;
public static b4a.SpotifyLinker.common _common = null;
public static b4a.SpotifyLinker.httputils2service _httputils2service = null;
public static b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public static b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",config.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.SpotifyLinker.b4xcollections.class),"CLVLinks",config.mostCurrent._clvlinks,"CLVTracks",config.mostCurrent._clvtracks,"Common",Debug.moduleToString(b4a.SpotifyLinker.common.class),"DateUtils",config.mostCurrent._dateutils,"HttpUtils2Service",Debug.moduleToString(b4a.SpotifyLinker.httputils2service.class),"LblName",config.mostCurrent._lblname,"LblNum",config.mostCurrent._lblnum,"Main",Debug.moduleToString(b4a.SpotifyLinker.main.class),"SelectedTracks",config.mostCurrent._selectedtracks,"Starter",Debug.moduleToString(b4a.SpotifyLinker.starter.class),"txtFilter",config.mostCurrent._txtfilter,"XUI",config.mostCurrent._xui,"XUIViewsUtils",Debug.moduleToString(b4a.SpotifyLinker.xuiviewsutils.class)};
}
}