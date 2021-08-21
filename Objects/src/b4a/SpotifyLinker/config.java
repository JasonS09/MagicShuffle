package b4a.SpotifyLinker;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class config extends Activity implements B4AActivity{
	public static config mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.SpotifyLinker", "b4a.SpotifyLinker.config");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (config).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.SpotifyLinker", "b4a.SpotifyLinker.config");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.SpotifyLinker.config", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (config) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (config) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return config.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (config) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (config) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            config mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (config) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }


public static class _track{
public boolean IsInitialized;
public int LabelNum;
public String LabelName;
public boolean Selected;
public void Initialize() {
IsInitialized = true;
LabelNum = 0;
LabelName = "";
Selected = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _link{
public boolean IsInitialized;
public int LabelNum;
public String LabelLink;
public String uris;
public boolean Selected;
public void Initialize() {
IsInitialized = true;
LabelNum = 0;
LabelLink = "";
uris = "";
Selected = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example3.customlistview _clvtracks = null;
public b4a.example3.customlistview _clvlinks = null;
public b4a.SpotifyLinker.b4xorderedmap _selectedtracks = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtfilter = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblname = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnum = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.main _main = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.common _common = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Activity.LoadLayout(\"Config\")";
mostCurrent._activity.LoadLayout("Config",mostCurrent.activityBA);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Activity.Title = \"Configuration\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("Configuration"));
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="SelectedTracks.Initialize";
mostCurrent._selectedtracks._initialize /*String*/ (null,processBA);
 };
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="If Common.Tracks.Size > 0 Then";
if (mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="BuildTrackItems";
_buildtrackitems();
 };
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="If Common.LinkedTracks.Size > 0 Then";
if (mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="BuildLinkItems";
_buildlinkitems();
 };
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="End Sub";
return "";
}
public static String  _buildtrackitems() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buildtrackitems", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buildtrackitems", null));}
int _i = 0;
b4a.SpotifyLinker.config._track _track = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub BuildTrackItems";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="For i = 0 To Common.Tracks.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim track As Track";
_track = new b4a.SpotifyLinker.config._track();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="track.Initialize";
_track.Initialize();
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="track.LabelNum = i+1";
_track.LabelNum /*int*/  = (int) (_i+1);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="track.LabelName = Common.Tracks.Keys.Get(i)";
_track.LabelName /*String*/  = BA.ObjectToString(mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i));
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Dim Pnl As B4XView = XUI.CreatePanel(Null)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._xui.CreatePanel(processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Pnl.Color = XUI.Color_White";
_pnl.setColor(mostCurrent._xui.Color_White);
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="Pnl.SetLayoutAnimated(0dip, 0dip, 0dip, CLVTrack";
_pnl.SetLayoutAnimated(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),mostCurrent._clvtracks._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="CLVTracks.Add(Pnl, track)";
mostCurrent._clvtracks._add(_pnl,(Object)(_track));
 }
};
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="End Sub";
return "";
}
public static String  _buildlinkitems() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buildlinkitems", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buildlinkitems", null));}
int _i = 0;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub BuildLinkItems";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="For i = 0 To Common.LinkedTracks.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="AddLink(Common.LinkedTracks.Get(i))";
_addlink((b4a.SpotifyLinker.common._orderedmap)(mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 }
};
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="config";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public static String  _addlink(b4a.SpotifyLinker.common._orderedmap _linkmap) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addlink", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addlink", new Object[] {_linkmap}));}
b4a.SpotifyLinker.config._link _link = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub AddLink(linkMap As OrderedMap)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim link As Link";
_link = new b4a.SpotifyLinker.config._link();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="link.Initialize";
_link.Initialize();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="link.LabelNum = CLVLinks.Size+1";
_link.LabelNum /*int*/  = (int) (mostCurrent._clvlinks._getsize()+1);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="link.LabelLink = StringifyLink(linkMap)";
_link.LabelLink /*String*/  = _stringifylink(_linkmap);
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="link.uris = StringifyUris(linkMap)";
_link.uris /*String*/  = _stringifyuris(_linkmap);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Dim Pnl As B4XView = XUI.CreatePanel(Null)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._xui.CreatePanel(processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Pnl.Color = XUI.Color_White";
_pnl.setColor(mostCurrent._xui.Color_White);
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="Pnl.SetLayoutAnimated(0dip, 0dip, 0dip, CLVLinks.";
_pnl.SetLayoutAnimated(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),mostCurrent._clvlinks._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="CLVLinks.Add(Pnl, link)";
mostCurrent._clvlinks._add(_pnl,(Object)(_link));
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="End Sub";
return "";
}
public static String  _stringifylink(b4a.SpotifyLinker.common._orderedmap _link) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "stringifylink", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "stringifylink", new Object[] {_link}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _stringlink = null;
int _i = 0;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub StringifyLink(link As OrderedMap) As String";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim stringLink As StringBuilder";
_stringlink = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="stringLink.Initialize";
_stringlink.Initialize();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="For i = 0 To link.keys.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_link.Keys /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="If i = link.keys.Size-1 Then";
if (_i==_link.Keys /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="stringLink.Append(link.Keys.Get(i))";
_stringlink.Append(BA.ObjectToString(_link.Keys /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 }else {
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="stringLink.Append(link.Keys.Get(i) & \" - \")";
_stringlink.Append(BA.ObjectToString(_link.Keys /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))+" - ");
 };
 }
};
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="Return stringLink.ToString";
if (true) return _stringlink.ToString();
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="End Sub";
return "";
}
public static String  _stringifyuris(b4a.SpotifyLinker.common._orderedmap _link) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "stringifyuris", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "stringifyuris", new Object[] {_link}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _stringuris = null;
int _i = 0;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub StringifyUris(link As OrderedMap) As String";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim stringUris As StringBuilder";
_stringuris = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="stringUris.Initialize";
_stringuris.Initialize();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="For i = 0 To link.keys.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_link.Keys /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="If i = link.keys.Size-1 Then";
if (_i==_link.Keys /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="stringUris.Append(link.Map.Get(link.Keys.Get(i)";
_stringuris.Append(BA.ObjectToString(_link.Map /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_link.Keys /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))));
 }else {
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="stringUris.Append(link.Map.Get(link.Keys.Get(i)";
_stringuris.Append(BA.ObjectToString(_link.Map /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_link.Keys /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))+",");
 };
 }
};
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Return stringUris.ToString";
if (true) return _stringuris.ToString();
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="End Sub";
return "";
}
public static String  _baddlink_click() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "baddlink_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "baddlink_click", null));}
int _i = 0;
b4a.SpotifyLinker.config._track _track = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub BAddLink_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If SelectedTracks.Keys.Size < 2 Then";
if (mostCurrent._selectedtracks._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).getSize()<2) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="ToastMessageShow(\"You have not selected at least";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("You have not selected at least two tracks from the list."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Common.LinkedTracks.Add(ToOrderedMap(SelectedTrac";
mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_toorderedmap(mostCurrent._selectedtracks)));
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Common.KVS.Put(\"linked_tracks\", Common.LinkedTrac";
mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._put /*String*/ (null,"linked_tracks",(Object)(mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="AddLink(Common.LinkedTracks.Get(Common.LinkedTrac";
_addlink((b4a.SpotifyLinker.common._orderedmap)(mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="For i = 0 To CLVTracks.Size-1";
{
final int step8 = 1;
final int limit8 = (int) (mostCurrent._clvtracks._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Dim track As Track = CLVTracks.GetValue(i)";
_track = (b4a.SpotifyLinker.config._track)(mostCurrent._clvtracks._getvalue(_i));
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="If track.Selected Then";
if (_track.Selected /*boolean*/ ) { 
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="SelectTrack(track)";
_selecttrack(_track);
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="StyleTrack(track, CLVTracks.GetPanel(i))";
_styletrack(_track,mostCurrent._clvtracks._getpanel(_i));
 };
 }
};
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="SelectedTracks.Clear";
mostCurrent._selectedtracks._clear /*String*/ (null);
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="CLVLinks.Refresh";
mostCurrent._clvlinks._refresh();
RDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="End Sub";
return "";
}
public static b4a.SpotifyLinker.common._orderedmap  _toorderedmap(b4a.SpotifyLinker.b4xorderedmap _toconvert) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "toorderedmap", false))
	 {return ((b4a.SpotifyLinker.common._orderedmap) Debug.delegate(mostCurrent.activityBA, "toorderedmap", new Object[] {_toconvert}));}
b4a.SpotifyLinker.common._orderedmap _orderedmap = null;
Object _key = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub ToOrderedMap(toConvert As B4XOrderedMap) As Or";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim orderedMap As OrderedMap";
_orderedmap = new b4a.SpotifyLinker.common._orderedmap();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="orderedMap.Initialize";
_orderedmap.Initialize();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="orderedMap.Map.Initialize";
_orderedmap.Map /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="orderedMap.Keys.Initialize";
_orderedmap.Keys /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="For Each key In toConvert.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _toconvert._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = group5.Get(index5);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="orderedMap.Map.Put(key, toConvert.Get(key))";
_orderedmap.Map /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_key,_toconvert._get /*Object*/ (null,_key));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="orderedMap.Keys.Add(key)";
_orderedmap.Keys /*anywheresoftware.b4a.objects.collections.List*/ .Add(_key);
 }
};
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="Return orderedMap";
if (true) return _orderedmap;
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="End Sub";
return null;
}
public static String  _selecttrack(b4a.SpotifyLinker.config._track _track) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "selecttrack", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "selecttrack", new Object[] {_track}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub SelectTrack(track As Track)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="track.Selected = Not(track.Selected)";
_track.Selected /*boolean*/  = anywheresoftware.b4a.keywords.Common.Not(_track.Selected /*boolean*/ );
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="If track.Selected Then";
if (_track.Selected /*boolean*/ ) { 
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="SelectedTracks.Put(track.LabelName, Common.Track";
mostCurrent._selectedtracks._put /*String*/ (null,(Object)(_track.LabelName /*String*/ ),mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_track.LabelName /*String*/ )));
 }else {
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="SelectedTracks.Remove(track.LabelName)";
mostCurrent._selectedtracks._remove /*String*/ (null,(Object)(_track.LabelName /*String*/ ));
 };
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="End Sub";
return "";
}
public static String  _styletrack(b4a.SpotifyLinker.config._track _track,anywheresoftware.b4a.objects.B4XViewWrapper _trackpnl) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "styletrack", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "styletrack", new Object[] {_track,_trackpnl}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub StyleTrack(track As Track, trackPnl As B4XView";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="LblName = trackPnl.GetView(0)";
mostCurrent._lblname = _trackpnl.GetView((int) (0));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="LblName.Tag = trackPnl";
mostCurrent._lblname.setTag((Object)(_trackpnl.getObject()));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="LblNum = trackPnl.GetView(1)";
mostCurrent._lblnum = _trackpnl.GetView((int) (1));
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="LblName.Text = track.LabelName";
mostCurrent._lblname.setText(BA.ObjectToCharSequence(_track.LabelName /*String*/ ));
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="If track.Selected Then";
if (_track.Selected /*boolean*/ ) { 
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="LblNum.TextColor = XUI.Color_Green";
mostCurrent._lblnum.setTextColor(mostCurrent._xui.Color_Green);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="LblNum.Text = Chr(2713)";
mostCurrent._lblnum.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (2713))));
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="LblName.TextColor = XUI.Color_Green";
mostCurrent._lblname.setTextColor(mostCurrent._xui.Color_Green);
 }else {
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="LblNum.TextColor = XUI.Color_Black";
mostCurrent._lblnum.setTextColor(mostCurrent._xui.Color_Black);
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="LblNum.Text = track.LabelNum";
mostCurrent._lblnum.setText(BA.ObjectToCharSequence(_track.LabelNum /*int*/ ));
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="LblName.TextColor = XUI.Color_Black";
mostCurrent._lblname.setTextColor(mostCurrent._xui.Color_Black);
 };
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="End Sub";
return "";
}
public static String  _bcleardata_click() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bcleardata_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bcleardata_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub BClearData_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Common.Tracks.Clear";
mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="SelectedTracks.Clear";
mostCurrent._selectedtracks._clear /*String*/ (null);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Common.LinkedTracks.Clear";
mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="If Common.KVS.ContainsKey(\"tracks\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"tracks")) { 
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Common.KVS.Remove(\"tracks\")";
mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._remove /*String*/ (null,"tracks");
 };
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="If Common.KVS.ContainsKey(\"albums\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"albums")) { 
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="Common.KVS.Remove(\"albums\")";
mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._remove /*String*/ (null,"albums");
 };
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="If Common.KVS.ContainsKey(\"linked_tracks\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"linked_tracks")) { 
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="Common.KVS.Remove(\"linked_tracks\")";
mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._remove /*String*/ (null,"linked_tracks");
 };
RDebugUtils.currentLine=3538961;
 //BA.debugLineNum = 3538961;BA.debugLine="CLVTracks.Clear";
mostCurrent._clvtracks._clear();
RDebugUtils.currentLine=3538962;
 //BA.debugLineNum = 3538962;BA.debugLine="CLVLinks.Clear";
mostCurrent._clvlinks._clear();
RDebugUtils.currentLine=3538963;
 //BA.debugLineNum = 3538963;BA.debugLine="End Sub";
return "";
}
public static String  _bclearlinks_click() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bclearlinks_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bclearlinks_click", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub BClearLinks_Click";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="ClearLinks";
_clearlinks();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public static String  _clearlinks() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clearlinks", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clearlinks", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub ClearLinks";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Common.LinkedTracks.Clear";
mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="CLVLinks.Clear";
mostCurrent._clvlinks._clear();
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="If Common.KVS.ContainsKey(\"linked_tracks\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"linked_tracks")) { 
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Common.KVS.Remove(\"linked_tracks\")";
mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._remove /*String*/ (null,"linked_tracks");
 };
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="End Sub";
return "";
}
public static String  _bclose_click() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bclose_click", null));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub BClose_Click";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public static void  _bgettracks_click() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bgettracks_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "bgettracks_click", null); return;}
ResumableSub_BGetTracks_Click rsub = new ResumableSub_BGetTracks_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BGetTracks_Click extends BA.ResumableSub {
public ResumableSub_BGetTracks_Click(b4a.SpotifyLinker.config parent) {
this.parent = parent;
}
b4a.SpotifyLinker.config parent;
Object _r = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="config";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Common.Tracks.Clear";
parent.mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="SelectedTracks.Clear";
parent.mostCurrent._selectedtracks._clear /*String*/ (null);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="If Common.KVS.ContainsKey(\"tracks\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"tracks")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Common.KVS.Remove(\"tracks\")";
parent.mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._remove /*String*/ (null,"tracks");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="CLVTracks.Clear";
parent.mostCurrent._clvtracks._clear();
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Wait For (GetTracks) Complete (r As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "config", "bgettracks_click"), _gettracks());
this.state = 9;
return;
case 9:
//C
this.state = 5;
_r = (Object) result[0];
;
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="If Common.Tracks.Size > 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._getsize /*int*/ (null)>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="BuildTrackItems";
_buildtrackitems();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _gettracks() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gettracks", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "gettracks", null));}
ResumableSub_GetTracks rsub = new ResumableSub_GetTracks(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetTracks extends BA.ResumableSub {
public ResumableSub_GetTracks(b4a.SpotifyLinker.config parent) {
this.parent = parent;
}
b4a.SpotifyLinker.config parent;
b4a.SpotifyLinker.b4xorderedmap _ids = null;
b4a.SpotifyLinker.httpjob _j = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _stringsids = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.List _albums = null;
anywheresoftware.b4a.objects.collections.Map _album = null;
anywheresoftware.b4a.objects.collections.Map _tracklist = null;
anywheresoftware.b4a.objects.collections.List _trackitemlist = null;
anywheresoftware.b4a.objects.collections.Map _track = null;
int step6;
int limit6;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
anywheresoftware.b4a.BA.IterableList group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="config";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Wait For (GetAlbums) Complete (ids As B4XOrderedM";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "config", "gettracks"), _getalbums());
this.state = 27;
return;
case 27:
//C
this.state = 1;
_ids = (b4a.SpotifyLinker.b4xorderedmap) result[0];
;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SpotifyLinker.httpjob();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="j.Initialize(\"j\", Me)";
_j._initialize /*String*/ (null,processBA,"j",config.getObject());
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Dim stringsIds As StringBuilder";
_stringsids = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="stringsIds.Initialize";
_stringsids.Initialize();
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="For i = 0 To ids.Size-1";
if (true) break;

case 1:
//for
this.state = 10;
step6 = 1;
limit6 = (int) (_ids._getsize /*int*/ (null)-1);
_i = (int) (0) ;
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
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="If i = ids.Size-1 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_i==_ids._getsize /*int*/ (null)-1) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="stringsIds.Append(ids.Get(ids.Keys.Get(i)))";
_stringsids.Append(BA.ObjectToString(_ids._get /*Object*/ (null,_ids._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="stringsIds.Append(ids.Get(ids.Keys.Get(i)) & \",";
_stringsids.Append(BA.ObjectToString(_ids._get /*Object*/ (null,_ids._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i)))+",");
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
;
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="j.Download2(\"https://api.spotify.com/v1/albums\",";
_j._download2 /*String*/ (null,"https://api.spotify.com/v1/albums",new String[]{"ids",_stringsids.ToString()});
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+parent.mostCurrent._common._token /*String*/ );
RDebugUtils.currentLine=2818067;
 //BA.debugLineNum = 2818067;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "config", "gettracks"), (Object)(_j));
this.state = 30;
return;
case 30:
//C
this.state = 11;
_j = (b4a.SpotifyLinker.httpjob) result[0];
;
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
if (true) break;

case 11:
//if
this.state = 26;
if (_j._success /*boolean*/  && _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==200) { 
this.state = 13;
}else 
{RDebugUtils.currentLine=2818084;
 //BA.debugLineNum = 2818084;BA.debugLine="Else If Not(j.Response.StatusCode = -1) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==-1)) { 
this.state = 23;
}else {
this.state = 25;
}}
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=2818070;
 //BA.debugLineNum = 2818070;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring /*String*/ (null));
RDebugUtils.currentLine=2818072;
 //BA.debugLineNum = 2818072;BA.debugLine="Dim albums As List = jp.NextObject.Get(\"albums\")";
_albums = new anywheresoftware.b4a.objects.collections.List();
_albums = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jp.NextObject().Get((Object)("albums"))));
RDebugUtils.currentLine=2818074;
 //BA.debugLineNum = 2818074;BA.debugLine="For Each album As Map In albums";
if (true) break;

case 14:
//for
this.state = 21;
_album = new anywheresoftware.b4a.objects.collections.Map();
group20 = _albums;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 21;
if (index20 < groupLen20) {
this.state = 16;
_album = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group20.Get(index20)));}
if (true) break;

case 32:
//C
this.state = 31;
index20++;
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=2818075;
 //BA.debugLineNum = 2818075;BA.debugLine="Dim trackList As Map = album.Get(\"tracks\")";
_tracklist = new anywheresoftware.b4a.objects.collections.Map();
_tracklist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_album.Get((Object)("tracks"))));
RDebugUtils.currentLine=2818076;
 //BA.debugLineNum = 2818076;BA.debugLine="Dim trackItemList As List = trackList.Get(\"item";
_trackitemlist = new anywheresoftware.b4a.objects.collections.List();
_trackitemlist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_tracklist.Get((Object)("items"))));
RDebugUtils.currentLine=2818078;
 //BA.debugLineNum = 2818078;BA.debugLine="For Each track As Map In trackItemList";
if (true) break;

case 17:
//for
this.state = 20;
_track = new anywheresoftware.b4a.objects.collections.Map();
group23 = _trackitemlist;
index23 = 0;
groupLen23 = group23.getSize();
this.state = 33;
if (true) break;

case 33:
//C
this.state = 20;
if (index23 < groupLen23) {
this.state = 19;
_track = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group23.Get(index23)));}
if (true) break;

case 34:
//C
this.state = 33;
index23++;
if (true) break;

case 19:
//C
this.state = 34;
RDebugUtils.currentLine=2818079;
 //BA.debugLineNum = 2818079;BA.debugLine="Common.Tracks.Put(ToTitleCase(track.Get(\"name\"";
parent.mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_totitlecase(BA.ObjectToString(_track.Get((Object)("name"))),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))),_track.Get((Object)("uri")));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 32;
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 26;
;
RDebugUtils.currentLine=2818083;
 //BA.debugLineNum = 2818083;BA.debugLine="Common.KVS.Put(\"tracks\", ToOrderedMap(Common.Tra";
parent.mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._put /*String*/ (null,"tracks",(Object)(_toorderedmap(parent.mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ )));
 if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=2818085;
 //BA.debugLineNum = 2818085;BA.debugLine="Common.HandleHTTPError(j.GetString)";
parent.mostCurrent._common._handlehttperror /*String*/ (mostCurrent.activityBA,_j._getstring /*String*/ (null));
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=2818087;
 //BA.debugLineNum = 2818087;BA.debugLine="Log(\"Error getting the tracks.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42818087","Error getting the tracks.",0);
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=2818090;
 //BA.debugLineNum = 2818090;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=2818091;
 //BA.debugLineNum = 2818091;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _bremovelink_click() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bremovelink_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bremovelink_click", null));}
int _i = 0;
b4a.SpotifyLinker.config._link _link = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub BRemoveLink_Click";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If CLVLinks.Size > 0 Then";
if (mostCurrent._clvlinks._getsize()>0) { 
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="If Common.LinkedTracks.Size = 1 Then";
if (mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="ClearLinks";
_clearlinks();
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="Do While i < CLVLinks.Size";
while (_i<mostCurrent._clvlinks._getsize()) {
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="Dim link As Link = CLVLinks.GetValue(i)";
_link = (b4a.SpotifyLinker.config._link)(mostCurrent._clvlinks._getvalue(_i));
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="If link.Selected Then";
if (_link.Selected /*boolean*/ ) { 
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="Common.LinkedTracks.RemoveAt(i)";
mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="CLVLinks.RemoveAt(i)";
mostCurrent._clvlinks._removeat(_i);
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="i=i-1";
_i = (int) (_i-1);
 };
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="i = i+1";
_i = (int) (_i+1);
 }
;
 };
RDebugUtils.currentLine=3211287;
 //BA.debugLineNum = 3211287;BA.debugLine="Common.KVS.Put(\"linked_tracks\", Common.LinkedTrac";
mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._put /*String*/ (null,"linked_tracks",(Object)(mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=3211288;
 //BA.debugLineNum = 3211288;BA.debugLine="CLVLinks.Refresh";
mostCurrent._clvlinks._refresh();
RDebugUtils.currentLine=3211289;
 //BA.debugLineNum = 3211289;BA.debugLine="End Sub";
return "";
}
public static String  _bsave_click() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bsave_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bsave_click", null));}
int _i = 0;
b4a.SpotifyLinker.config._link _linkk = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub BSave_Click";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Common.LinkList.Clear";
mostCurrent._common._linklist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="If CLVLinks.Size > 0 Then";
if (mostCurrent._clvlinks._getsize()>0) { 
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="For i = 0 To CLVLinks.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._clvlinks._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Dim linkk As Link = CLVLinks.GetValue(i)";
_linkk = (b4a.SpotifyLinker.config._link)(mostCurrent._clvlinks._getvalue(_i));
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Common.LinkList.Add(linkk)";
mostCurrent._common._linklist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_linkk));
 }
};
 };
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="Common.KVS.Put(\"links\", Common.LinkList)";
mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._put /*String*/ (null,"links",(Object)(mostCurrent._common._linklist /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="ToastMessageShow(\"Your linked tracks have been sa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Your linked tracks have been saved."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="End Sub";
return "";
}
public static String  _clvlinks_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clvlinks_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clvlinks_itemclick", new Object[] {_index,_value}));}
b4a.SpotifyLinker.config._link _link = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub CLVLinks_ItemClick (Index As Int, Valu";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim link As Link = Value";
_link = (b4a.SpotifyLinker.config._link)(_value);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="link.Selected = Not(link.Selected)";
_link.Selected /*boolean*/  = anywheresoftware.b4a.keywords.Common.Not(_link.Selected /*boolean*/ );
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="StyleLink(Value, CLVLinks.GetPanel(Index))";
_stylelink((b4a.SpotifyLinker.config._link)(_value),mostCurrent._clvlinks._getpanel(_index));
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
return "";
}
public static String  _stylelink(b4a.SpotifyLinker.config._link _link,anywheresoftware.b4a.objects.B4XViewWrapper _linkpnl) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "stylelink", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "stylelink", new Object[] {_link,_linkpnl}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub StyleLink(link As Link, linkPnl As B4XView)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="LblName = linkPnl.GetView(0)";
mostCurrent._lblname = _linkpnl.GetView((int) (0));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="LblNum = linkPnl.GetView(1)";
mostCurrent._lblnum = _linkpnl.GetView((int) (1));
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="LblName.Text = link.LabelLink";
mostCurrent._lblname.setText(BA.ObjectToCharSequence(_link.LabelLink /*String*/ ));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="If link.Selected Then";
if (_link.Selected /*boolean*/ ) { 
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="LblNum.TextColor = XUI.Color_Green";
mostCurrent._lblnum.setTextColor(mostCurrent._xui.Color_Green);
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="LblNum.Text = Chr(2713)";
mostCurrent._lblnum.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (2713))));
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="LblName.TextColor = XUI.Color_Green";
mostCurrent._lblname.setTextColor(mostCurrent._xui.Color_Green);
 }else {
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="LblNum.TextColor = XUI.Color_Black";
mostCurrent._lblnum.setTextColor(mostCurrent._xui.Color_Black);
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="LblNum.Text = link.LabelNum";
mostCurrent._lblnum.setText(BA.ObjectToCharSequence(_link.LabelNum /*int*/ ));
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="LblName.TextColor = XUI.Color_Black";
mostCurrent._lblname.setTextColor(mostCurrent._xui.Color_Black);
 };
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="End Sub";
return "";
}
public static String  _clvlinks_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clvlinks_visiblerangechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clvlinks_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _extrasize = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub CLVLinks_VisibleRangeChanged (FirstInd";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim extraSize As Int = 25";
_extrasize = (int) (25);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="For i = Max(0, FirstIndex-extraSize) To Min(LastI";
{
final int step2 = 1;
final int limit2 = (int) (anywheresoftware.b4a.keywords.Common.Min(_lastindex+_extrasize,mostCurrent._clvlinks._getsize()-1));
_i = (int) (anywheresoftware.b4a.keywords.Common.Max(0,_firstindex-_extrasize)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Dim Pnl As B4XView = CLVLinks.GetPanel(i)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._clvlinks._getpanel(_i);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="If i > FirstIndex-extraSize And i < LastIndex+ex";
if (_i>_firstindex-_extrasize && _i<_lastindex+_extrasize) { 
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="If Pnl.NumberOfViews = 0 Then";
if (_pnl.getNumberOfViews()==0) { 
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Pnl.LoadLayout(\"track\")";
_pnl.LoadLayout("track",mostCurrent.activityBA);
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="StyleLink(CLVLinks.GetValue(i), Pnl)";
_stylelink((b4a.SpotifyLinker.config._link)(mostCurrent._clvlinks._getvalue(_i)),_pnl);
 };
 }else {
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="If Pnl.NumberOfViews > 0 Then";
if (_pnl.getNumberOfViews()>0) { 
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Pnl.RemoveAllViews";
_pnl.RemoveAllViews();
 };
 };
 }
};
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="End Sub";
return "";
}
public static String  _clvtracks_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clvtracks_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clvtracks_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub CLVTracks_ItemClick (Index As Int, Val";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="SelectTrack(Value)";
_selecttrack((b4a.SpotifyLinker.config._track)(_value));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="StyleTrack(Value, CLVTracks.GetPanel(Index))";
_styletrack((b4a.SpotifyLinker.config._track)(_value),mostCurrent._clvtracks._getpanel(_index));
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="End Sub";
return "";
}
public static String  _clvtracks_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clvtracks_visiblerangechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clvtracks_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _extrasize = 0;
int _i = 0;
b4a.SpotifyLinker.config._track _track = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub CLVTracks_VisibleRangeChanged (FirstIn";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim extraSize As Int = 25";
_extrasize = (int) (25);
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="For i = Max(0, FirstIndex-extraSize) To Min(LastI";
{
final int step2 = 1;
final int limit2 = (int) (anywheresoftware.b4a.keywords.Common.Min(_lastindex+_extrasize,mostCurrent._clvtracks._getsize()-1));
_i = (int) (anywheresoftware.b4a.keywords.Common.Max(0,_firstindex-_extrasize)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim track As Track = CLVTracks.GetValue(i)";
_track = (b4a.SpotifyLinker.config._track)(mostCurrent._clvtracks._getvalue(_i));
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Dim Pnl As B4XView = CLVTracks.GetPanel(i)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = mostCurrent._clvtracks._getpanel(_i);
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="Dim matcher As Matcher";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="matcher = Regex.Matcher2(txtFilter.Text, Regex.C";
_matcher = anywheresoftware.b4a.keywords.Common.Regex.Matcher2(mostCurrent._txtfilter.getText(),anywheresoftware.b4a.keywords.Common.Regex.CASE_INSENSITIVE,_track.LabelName /*String*/ );
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="If i > FirstIndex-extraSize And i < LastIndex+ex";
if (_i>_firstindex-_extrasize && _i<_lastindex+_extrasize && _matcher.Find()) { 
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="If Pnl.NumberOfViews = 0 Then";
if (_pnl.getNumberOfViews()==0) { 
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Pnl.LoadLayout(\"track\")";
_pnl.LoadLayout("track",mostCurrent.activityBA);
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="StyleTrack(track, Pnl)";
_styletrack(_track,_pnl);
 };
 }else {
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="If Pnl.NumberOfViews > 0 Then";
if (_pnl.getNumberOfViews()>0) { 
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="Pnl.RemoveAllViews";
_pnl.RemoveAllViews();
 };
 };
 }
};
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getalbums() throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getalbums", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getalbums", null));}
ResumableSub_GetAlbums rsub = new ResumableSub_GetAlbums(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetAlbums extends BA.ResumableSub {
public ResumableSub_GetAlbums(b4a.SpotifyLinker.config parent) {
this.parent = parent;
}
b4a.SpotifyLinker.config parent;
String _dsoid = "";
b4a.SpotifyLinker.httpjob _j = null;
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.List _albums = null;
b4a.SpotifyLinker.b4xorderedmap _ids = null;
anywheresoftware.b4a.objects.collections.Map _album = null;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="config";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If Common.KVS.ContainsKey(\"albums\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"albums")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Return Common.ToB4XOrderedMap(Common.KVS.Get(\"al";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(parent.mostCurrent._common._tob4xorderedmap /*b4a.SpotifyLinker.b4xorderedmap*/ (mostCurrent.activityBA,(b4a.SpotifyLinker.common._orderedmap)(parent.mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._get /*Object*/ (null,"albums")))));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Dim DSOID As String = \"2cbWJP4X5b9sKEDW80uc5r\"";
_dsoid = "2cbWJP4X5b9sKEDW80uc5r";
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SpotifyLinker.httpjob();
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="j.Initialize(\"j\", Me)";
_j._initialize /*String*/ (null,processBA,"j",config.getObject());
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="j.Download(\"https://api.spotify.com/v1/artists/\"";
_j._download /*String*/ (null,"https://api.spotify.com/v1/artists/"+_dsoid+"/albums");
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+parent.mostCurrent._common._token /*String*/ );
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "config", "getalbums"), (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_j = (b4a.SpotifyLinker.httpjob) result[0];
;
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
if (true) break;

case 5:
//if
this.state = 12;
if (_j._success /*boolean*/  && _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==200) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring /*String*/ (null));
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="Dim albums As List = jp.NextObject.Get(\"items\")";
_albums = new anywheresoftware.b4a.objects.collections.List();
_albums = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jp.NextObject().Get((Object)("items"))));
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="Dim ids As B4XOrderedMap";
_ids = new b4a.SpotifyLinker.b4xorderedmap();
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="ids.Initialize";
_ids._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="For Each album As Map In albums";
if (true) break;

case 8:
//for
this.state = 11;
_album = new anywheresoftware.b4a.objects.collections.Map();
group16 = _albums;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index16 < groupLen16) {
this.state = 10;
_album = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group16.Get(index16)));}
if (true) break;

case 18:
//C
this.state = 17;
index16++;
if (true) break;

case 10:
//C
this.state = 18;
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="ids.Put(ToTitleCase(album.Get(\"name\"), Null), a";
_ids._put /*String*/ (null,(Object)(_totitlecase(BA.ObjectToString(_album.Get((Object)("name"))),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)))),_album.Get((Object)("id")));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=2752535;
 //BA.debugLineNum = 2752535;BA.debugLine="Common.KVS.Put(\"albums\", ToOrderedMap(ids))";
parent.mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._put /*String*/ (null,"albums",(Object)(_toorderedmap(_ids)));
RDebugUtils.currentLine=2752536;
 //BA.debugLineNum = 2752536;BA.debugLine="Return ids";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_ids));return;};
 if (true) break;
;
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";

case 12:
//if
this.state = 15;
if (anywheresoftware.b4a.keywords.Common.Not(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==-1)) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=2752540;
 //BA.debugLineNum = 2752540;BA.debugLine="Common.HandleHTTPError(j.GetString)";
parent.mostCurrent._common._handlehttperror /*String*/ (mostCurrent.activityBA,_j._getstring /*String*/ (null));
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=2752543;
 //BA.debugLineNum = 2752543;BA.debugLine="Log(\"Error getting the albums.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("42752543","Error getting the albums.",0);
RDebugUtils.currentLine=2752544;
 //BA.debugLineNum = 2752544;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=2752545;
 //BA.debugLineNum = 2752545;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _totitlecase(String _str,anywheresoftware.b4a.objects.collections.List _exclude) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "totitlecase", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "totitlecase", new Object[] {_str,_exclude}));}
String _s = "";
String[] _news = null;
int _i = 0;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub ToTitleCase (str As String, exclude As List) A";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim s As String";
_s = "";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim NewS() As String = Regex.Split(\" \", str.Trim)";
_news = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_str.trim());
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="For i = 0 To NewS.Length -1";
{
final int step3 = 1;
final int limit3 = (int) (_news.length-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="If (exclude.IsInitialized And exclude.IndexOf(Ne";
if ((_exclude.IsInitialized() && _exclude.IndexOf((Object)(_news[_i]))!=-1)) { 
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="s = s & NewS(i) & \" \"";
_s = _s+_news[_i]+" ";
 }else {
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="If NewS(i).Length > 1 Then";
if (_news[_i].length()>1) { 
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="s = s & _ 				 	NewS(i).SubString2(0,1).ToUppe";
_s = _s+_news[_i].substring((int) (0),(int) (1)).toUpperCase()+_news[_i].substring((int) (1))+" ";
 }else {
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="s = s & NewS(i).ToUpperCase & \" \"";
_s = _s+_news[_i].toUpperCase()+" ";
 };
 };
 }
};
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="End Sub";
return "";
}
public static String  _txtfilter_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="config";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtfilter_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtfilter_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub txtFilter_TextChanged (Old As String,";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="CLVTracks.Refresh";
mostCurrent._clvtracks._refresh();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return "";
}
}