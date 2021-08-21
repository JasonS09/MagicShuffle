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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.SpotifyLinker", "b4a.SpotifyLinker.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "b4a.SpotifyLinker", "b4a.SpotifyLinker.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.SpotifyLinker.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (config.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (config.previousOne != null) {
				__a = config.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(config.mostCurrent == null ? null : config.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, httputils2service.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static String _clientid = "";
public static String _clientsecret = "";
public static String _redirecturi = "";
public anywheresoftware.b4a.objects.EditTextWrapper _txtusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtplaylist = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bshuffle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bconfig = null;
public static String _playlistid = "";
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.config _config = null;
public b4a.SpotifyLinker.common _common = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.Title = \"MagicShuffle\"";
mostCurrent._activity.setTitle(BA.ObjectToCharSequence("MagicShuffle"));
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Common.KVS.Initialize(File.DirInternal, \"datasto";
mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._initialize /*String*/ (null,processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"datastore");
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="If Common.KVS.ContainsKey(\"user\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"user")) { 
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="TxtUsername.Text = Common.KVS.Get(\"user\")";
mostCurrent._txtusername.setText(BA.ObjectToCharSequence(mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._get /*Object*/ (null,"user")));
 };
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="If Common.KVS.ContainsKey(\"tracks\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"tracks")) { 
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="Common.Tracks = Common.ToB4XOrderedMap(Common.K";
mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/  = mostCurrent._common._tob4xorderedmap /*b4a.SpotifyLinker.b4xorderedmap*/ (mostCurrent.activityBA,(b4a.SpotifyLinker.common._orderedmap)(mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._get /*Object*/ (null,"tracks")));
 }else {
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Common.Tracks.Initialize";
mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._initialize /*String*/ (null,processBA);
 };
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="If Common.KVS.ContainsKey(\"playlist_name\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"playlist_name")) { 
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="TxtPlaylist.Text = Common.KVS.Get(\"playlist_nam";
mostCurrent._txtplaylist.setText(BA.ObjectToCharSequence(mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._get /*Object*/ (null,"playlist_name")));
 };
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="If Common.KVS.ContainsKey(\"links\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"links")) { 
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="Common.LinkList = Common.KVS.Get(\"links\")";
mostCurrent._common._linklist /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._get /*Object*/ (null,"links")));
 }else {
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="Common.LinkList.Initialize";
mostCurrent._common._linklist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="If Common.KVS.ContainsKey(\"linked_tracks\") Then";
if (mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._containskey /*boolean*/ (null,"linked_tracks")) { 
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="Common.LinkedTracks = Common.KVS.Get(\"linked_tr";
mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._get /*Object*/ (null,"linked_tracks")));
 }else {
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="Common.LinkedTracks.Initialize";
mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
 };
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
String _uri = "";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="i = GetIntent";
_i = _getintent();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="If i.Action = i.ACTION_VIEW And Common.Token = \"\"";
if ((_i.getAction()).equals(_i.ACTION_VIEW) && (mostCurrent._common._token /*String*/ ).equals("")) { 
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Dim uri As String";
_uri = "";
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="uri=i.GetData";
_uri = _i.GetData();
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="AuthorizeApp(Regex.Split(\"&\", Regex.Split(\"=\", u";
_authorizeapp(anywheresoftware.b4a.keywords.Common.Regex.Split("&",anywheresoftware.b4a.keywords.Common.Regex.Split("=",_uri)[(int) (1)])[(int) (0)]);
 };
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.IntentWrapper  _getintent() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getintent", false))
	 {return ((anywheresoftware.b4a.objects.IntentWrapper) Debug.delegate(mostCurrent.activityBA, "getintent", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _sr = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub GetIntent As Intent";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim sR As Reflector";
_sr = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="sR.Target=sR.GetActivity";
_sr.Target = (Object)(_sr.GetActivity(processBA));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Return sR.RunMethod(\"getIntent\")";
if (true) return (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_sr.RunMethod("getIntent")));
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="End Sub";
return null;
}
public static void  _authorizeapp(String _code) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "authorizeapp", false))
	 {Debug.delegate(mostCurrent.activityBA, "authorizeapp", new Object[] {_code}); return;}
ResumableSub_AuthorizeApp rsub = new ResumableSub_AuthorizeApp(null,_code);
rsub.resume(processBA, null);
}
public static class ResumableSub_AuthorizeApp extends BA.ResumableSub {
public ResumableSub_AuthorizeApp(b4a.SpotifyLinker.main parent,String _code) {
this.parent = parent;
this._code = _code;
}
b4a.SpotifyLinker.main parent;
String _code;
b4a.SpotifyLinker.httpjob _j = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
String _authorization = "";
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SpotifyLinker.httpjob();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim authorization As String = clientId & \":\" & cl";
_authorization = parent._clientid+":"+parent._clientsecret;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="j.Initialize(\"j\", Me)";
_j._initialize /*String*/ (null,processBA,"j",main.getObject());
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="j.PostString(\"https://accounts.spotify.com/api/to";
_j._poststring /*String*/ (null,"https://accounts.spotify.com/api/token","grant_type=authorization_code&"+"code="+_code+"&"+"redirect_uri="+parent.mostCurrent._redirecturi);
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-fo";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", _";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Basic "+_su.EncodeBase64(_authorization.getBytes("UTF8")));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "authorizeapp"), (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_j = (b4a.SpotifyLinker.httpjob) result[0];
;
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_j._success /*boolean*/  && _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==200) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring /*String*/ (null));
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="Dim Map As Map = jp.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = _jp.NextObject();
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="Common.Token = Map.Get(\"access_token\")";
parent.mostCurrent._common._token /*String*/  = BA.ObjectToString(_map.Get((Object)("access_token")));
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="Authorize";
_authorize();
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="GetUserId";
_getuserid();
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";

case 4:
//if
this.state = 11;
if (anywheresoftware.b4a.keywords.Common.Not(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==-1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="Common.HandleHTTPError(j.GetString)";
parent.mostCurrent._common._handlehttperror /*String*/ (mostCurrent.activityBA,_j._getstring /*String*/ (null));
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="If j.Response.StatusCode = 401 Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==401) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="Deauthorize";
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
RDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="Log(\"Error in app Authorization\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4720927","Error in app Authorization",0);
RDebugUtils.currentLine=720928;
 //BA.debugLineNum = 720928;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _addsongstoplaylist(String _shuffled) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addsongstoplaylist", false))
	 {Debug.delegate(mostCurrent.activityBA, "addsongstoplaylist", new Object[] {_shuffled}); return;}
ResumableSub_AddSongsToPlaylist rsub = new ResumableSub_AddSongsToPlaylist(null,_shuffled);
rsub.resume(processBA, null);
}
public static class ResumableSub_AddSongsToPlaylist extends BA.ResumableSub {
public ResumableSub_AddSongsToPlaylist(b4a.SpotifyLinker.main parent,String _shuffled) {
this.parent = parent;
this._shuffled = _shuffled;
}
b4a.SpotifyLinker.main parent;
String _shuffled;
Object _playlist = null;
b4a.SpotifyLinker.httpjob _j = null;
anywheresoftware.b4a.objects.StringUtils _su = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Wait For (GetPlaylist) Complete (playlist As Obje";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "addsongstoplaylist"), _getplaylist());
this.state = 13;
return;
case 13:
//C
this.state = 1;
_playlist = (Object) result[0];
;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SpotifyLinker.httpjob();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="j.Initialize(\"j\", Me)";
_j._initialize /*String*/ (null,processBA,"j",main.getObject());
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="j.PostString(\"https://api.spotify.com/v1/playlist";
_j._poststring /*String*/ (null,"https://api.spotify.com/v1/playlists/"+parent.mostCurrent._playlistid+"/tracks?uris="+_su.EncodeUrl(_shuffled,"UTF-8"),"");
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+parent.mostCurrent._common._token /*String*/ );
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "addsongstoplaylist"), (Object)(_j));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_j = (b4a.SpotifyLinker.httpjob) result[0];
;
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="If Not(j.Success And j.Response.StatusCode = 201)";
if (true) break;

case 1:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(_j._success /*boolean*/  && _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==201)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";
if (true) break;

case 4:
//if
this.state = 11;
if (anywheresoftware.b4a.keywords.Common.Not(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==-1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Log(j.Response.StatusCode)";
anywheresoftware.b4a.keywords.Common.LogImpl("4983053",BA.NumberToString(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Common.HandleHTTPError(j.GetString)";
parent.mostCurrent._common._handlehttperror /*String*/ (mostCurrent.activityBA,_j._getstring /*String*/ (null));
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="If j.Response.StatusCode = 401 Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==401) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Deauthorize";
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
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="Log(\"Error removing the playlist.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4983060","Error removing the playlist.",0);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getplaylist() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getplaylist", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getplaylist", null));}
ResumableSub_GetPlaylist rsub = new ResumableSub_GetPlaylist(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetPlaylist extends BA.ResumableSub {
public ResumableSub_GetPlaylist(b4a.SpotifyLinker.main parent) {
this.parent = parent;
}
b4a.SpotifyLinker.main parent;
b4a.SpotifyLinker.httpjob _j = null;
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
anywheresoftware.b4a.objects.collections.List _playlists = null;
anywheresoftware.b4a.objects.collections.Map _playlist = null;
String _id = "";
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If Not(PlayListId = \"\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not((parent.mostCurrent._playlistid).equals(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SpotifyLinker.httpjob();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="j.Initialize(\"j\", Me)";
_j._initialize /*String*/ (null,processBA,"j",main.getObject());
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="j.Download2(\"https://api.spotify.com/v1/users/\" &";
_j._download2 /*String*/ (null,"https://api.spotify.com/v1/users/"+parent.mostCurrent._txtusername.getText()+"/playlists",new String[]{"limit","50"});
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+parent.mostCurrent._common._token /*String*/ );
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getplaylist"), (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 5;
_j = (b4a.SpotifyLinker.httpjob) result[0];
;
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
if (true) break;

case 5:
//if
this.state = 22;
if (_j._success /*boolean*/  && _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==200) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="Else If Not(j.Response.StatusCode = -1) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==-1)) { 
this.state = 17;
}}
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring /*String*/ (null));
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Dim playlists As List = jp.NextObject.Get(\"items";
_playlists = new anywheresoftware.b4a.objects.collections.List();
_playlists = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jp.NextObject().Get((Object)("items"))));
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="For Each playlist As Map In playlists";
if (true) break;

case 8:
//for
this.state = 15;
_playlist = new anywheresoftware.b4a.objects.collections.Map();
group13 = _playlists;
index13 = 0;
groupLen13 = group13.getSize();
this.state = 24;
if (true) break;

case 24:
//C
this.state = 15;
if (index13 < groupLen13) {
this.state = 10;
_playlist = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group13.Get(index13)));}
if (true) break;

case 25:
//C
this.state = 24;
index13++;
if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="If playlist.Get(\"name\") = TxtPlaylist.Text Then";
if (true) break;

case 11:
//if
this.state = 14;
if ((_playlist.Get((Object)("name"))).equals((Object)(parent.mostCurrent._txtplaylist.getText()))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Dim id As String = playlist.Get(\"id\")";
_id = BA.ObjectToString(_playlist.Get((Object)("id")));
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="PlayListId = id";
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
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=851992;
 //BA.debugLineNum = 851992;BA.debugLine="Common.HandleHTTPError(j.GetString)";
parent.mostCurrent._common._handlehttperror /*String*/ (mostCurrent.activityBA,_j._getstring /*String*/ (null));
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="If j.Response.StatusCode = 401 Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==401) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="Deauthorize";
_deauthorize();
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=851996;
 //BA.debugLineNum = 851996;BA.debugLine="Log(\"Error getting playlists.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4851996","Error getting playlists.",0);
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=851999;
 //BA.debugLineNum = 851999;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=852000;
 //BA.debugLineNum = 852000;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _deauthorize() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "deauthorize", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "deauthorize", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Deauthorize";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="TxtUsername.Enabled = False";
mostCurrent._txtusername.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="TxtPlaylist.Enabled = False";
mostCurrent._txtplaylist.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="BShuffle.Enabled = False";
mostCurrent._bshuffle.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="BConfig.Enabled = False";
mostCurrent._bconfig.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="End Sub";
return "";
}
public static String  _authorize() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "authorize", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "authorize", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Authorize";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="TxtUsername.Enabled = True";
mostCurrent._txtusername.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="TxtPlaylist.Enabled = True";
mostCurrent._txtplaylist.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="BShuffle.Enabled = True";
mostCurrent._bshuffle.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="BConfig.Enabled = True";
mostCurrent._bconfig.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="End Sub";
return "";
}
public static void  _getuserid() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getuserid", false))
	 {Debug.delegate(mostCurrent.activityBA, "getuserid", null); return;}
ResumableSub_GetUserId rsub = new ResumableSub_GetUserId(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_GetUserId extends BA.ResumableSub {
public ResumableSub_GetUserId(b4a.SpotifyLinker.main parent) {
this.parent = parent;
}
b4a.SpotifyLinker.main parent;
b4a.SpotifyLinker.httpjob _j = null;
anywheresoftware.b4a.objects.collections.JSONParser _jp = null;
String _userid = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SpotifyLinker.httpjob();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="j.Initialize(\"j\", Me)";
_j._initialize /*String*/ (null,processBA,"j",main.getObject());
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="j.Download(\"https://api.spotify.com/v1/me\")";
_j._download /*String*/ (null,"https://api.spotify.com/v1/me");
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+parent.mostCurrent._common._token /*String*/ );
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getuserid"), (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 1;
_j = (b4a.SpotifyLinker.httpjob) result[0];
;
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="If j.Success And j.Response.StatusCode = 200 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_j._success /*boolean*/  && _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==200) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="jp.Initialize(j.GetString)";
_jp.Initialize(_j._getstring /*String*/ (null));
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Dim userId As String = jp.NextObject.Get(\"id\")";
_userid = BA.ObjectToString(_jp.NextObject().Get((Object)("id")));
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="TxtUsername.Text = userId";
parent.mostCurrent._txtusername.setText(BA.ObjectToCharSequence(_userid));
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="Common.KVS.Put(\"user\", userId)";
parent.mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._put /*String*/ (null,"user",(Object)(_userid));
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";

case 4:
//if
this.state = 11;
if (anywheresoftware.b4a.keywords.Common.Not(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==-1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="Common.HandleHTTPError(j.GetString)";
parent.mostCurrent._common._handlehttperror /*String*/ (mostCurrent.activityBA,_j._getstring /*String*/ (null));
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="If j.Response.StatusCode = 401 Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==401) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Deauthorize";
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
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="Log(\"Error getting user id\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4786455","Error getting user id",0);
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _authorizeuser() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "authorizeuser", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "authorizeuser", null));}
String _getparams = "";
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub AuthorizeUser";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim getParams As String = \"client_id=\" & clientId";
_getparams = "client_id="+_clientid+"&"+"response_type=code&"+"redirect_uri="+mostCurrent._redirecturi+"&"+"scope=user-modify-playback-state "+"playlist-modify-public "+"playlist-read-private "+"user-read-playback-state "+"user-read-private "+"user-read-email&"+"state=wR4ljc";
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="StartActivity(p.OpenBrowser(\"https://accounts.spo";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_p.OpenBrowser("https://accounts.spotify.com/authorize?"+_getparams)));
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="End Sub";
return "";
}
public static String  _bconfig_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bconfig_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bconfig_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub BConfig_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="StartActivity(Config)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._config.getObject()));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public static String  _bconnect_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bconnect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bconnect_click", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub BConnect_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="AuthorizeUser";
_authorizeuser();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public static String  _bexit_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bexit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bexit_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub BExit_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static void  _bshuffle_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bshuffle_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "bshuffle_click", null); return;}
ResumableSub_BShuffle_Click rsub = new ResumableSub_BShuffle_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BShuffle_Click extends BA.ResumableSub {
public ResumableSub_BShuffle_Click(b4a.SpotifyLinker.main parent) {
this.parent = parent;
}
b4a.SpotifyLinker.main parent;
Object _o = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If Common.Tracks.Size = 0 Or Common.LinkList.Size";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._getsize /*int*/ (null)==0 || parent.mostCurrent._common._linklist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="ToastMessageShow(\"No tracks have been saved.\", F";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No tracks have been saved."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Log(\"No tracks have been saved.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("41114115","No tracks have been saved.",0);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Wait For (RemoveItemsFromPlaylist) Complete (o As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "bshuffle_click"), _removeitemsfromplaylist());
this.state = 5;
return;
case 5:
//C
this.state = -1;
_o = (Object) result[0];
;
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="AddSongsToPlaylist(Shuffle(RebuildTracks))";
_addsongstoplaylist(_shuffle(_rebuildtracks()));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Common.KVS.Put(\"playlist_name\", TxtPlaylist.Text)";
parent.mostCurrent._common._kvs /*b4a.SpotifyLinker.keyvaluestore*/ ._put /*String*/ (null,"playlist_name",(Object)(parent.mostCurrent._txtplaylist.getText()));
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _removeitemsfromplaylist() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "removeitemsfromplaylist", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "removeitemsfromplaylist", null));}
ResumableSub_RemoveItemsFromPlaylist rsub = new ResumableSub_RemoveItemsFromPlaylist(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RemoveItemsFromPlaylist extends BA.ResumableSub {
public ResumableSub_RemoveItemsFromPlaylist(b4a.SpotifyLinker.main parent) {
this.parent = parent;
}
b4a.SpotifyLinker.main parent;
Object _playlist = null;
b4a.SpotifyLinker.httpjob _j = null;
anywheresoftware.b4a.objects.collections.List _data = null;
String _track = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongenerator = null;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Wait For (GetPlaylist) Complete (playlist As Obje";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "removeitemsfromplaylist"), _getplaylist());
this.state = 17;
return;
case 17:
//C
this.state = 1;
_playlist = (Object) result[0];
;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SpotifyLinker.httpjob();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="j.Initialize(\"j\", Me)";
_j._initialize /*String*/ (null,processBA,"j",main.getObject());
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="For Each track As String In Common.Tracks.Values";
if (true) break;

case 1:
//for
this.state = 4;
group6 = parent.mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
index6 = 0;
groupLen6 = group6.getSize();
this.state = 18;
if (true) break;

case 18:
//C
this.state = 4;
if (index6 < groupLen6) {
this.state = 3;
_track = BA.ObjectToString(group6.Get(index6));}
if (true) break;

case 19:
//C
this.state = 18;
index6++;
if (true) break;

case 3:
//C
this.state = 19;
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="data.Add(CreateMap(\"uri\":track))";
_data.Add((Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("uri"),(Object)(_track)}).getObject()));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Dim JSONGenerator As JSONGenerator";
_jsongenerator = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="JSONGenerator.Initialize(CreateMap(\"tracks\":data)";
_jsongenerator.Initialize(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("tracks"),(Object)(_data.getObject())}));
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="j.PostString(\"https://api.spotify.com/v1/playlist";
_j._poststring /*String*/ (null,"https://api.spotify.com/v1/playlists/"+parent.mostCurrent._playlistid+"/tracks",_jsongenerator.ToString());
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="j.GetRequest.InitializeDelete2(\"https://api.spoti";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).InitializeDelete2("https://api.spotify.com/v1/playlists/"+parent.mostCurrent._playlistid+"/tracks",_jsongenerator.ToString().getBytes("UTF8"));
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="j.GetRequest.SetHeader(\"Authorization\", \"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+parent.mostCurrent._common._token /*String*/ );
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "removeitemsfromplaylist"), (Object)(_j));
this.state = 20;
return;
case 20:
//C
this.state = 5;
_j = (b4a.SpotifyLinker.httpjob) result[0];
;
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="If Not(j.Success And j.Response.StatusCode = 200)";
if (true) break;

case 5:
//if
this.state = 16;
if (anywheresoftware.b4a.keywords.Common.Not(_j._success /*boolean*/  && _j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==200)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="If Not(j.Response.StatusCode = -1) Then";
if (true) break;

case 8:
//if
this.state = 15;
if (anywheresoftware.b4a.keywords.Common.Not(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==-1)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="Common.HandleHTTPError(j.GetString)";
parent.mostCurrent._common._handlehttperror /*String*/ (mostCurrent.activityBA,_j._getstring /*String*/ (null));
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="If j.Response.StatusCode = 401 Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()==401) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="Deauthorize";
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
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="Log(\"Error removing the playlist.\")";
anywheresoftware.b4a.keywords.Common.LogImpl("4917533","Error removing the playlist.",0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _shuffle(b4a.SpotifyLinker.b4xorderedmap _auxtracks) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "shuffle", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "shuffle", new Object[] {_auxtracks}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _shuffledbuilder = null;
int _r = 0;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Shuffle(auxTracks As B4XOrderedMap)	 As String";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim shuffledBuilder As StringBuilder";
_shuffledbuilder = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="shuffledBuilder.Initialize";
_shuffledbuilder.Initialize();
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Do While Not(auxTracks.Size = 0)";
while (anywheresoftware.b4a.keywords.Common.Not(_auxtracks._getsize /*int*/ (null)==0)) {
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Dim r As Int = Rnd(0, auxTracks.Size)";
_r = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),_auxtracks._getsize /*int*/ (null));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="If auxTracks.Size = 1 Then";
if (_auxtracks._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="shuffledBuilder.Append(auxTracks.Get(auxTracks.";
_shuffledbuilder.Append(BA.ObjectToString(_auxtracks._get /*Object*/ (null,_auxtracks._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0)))));
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="Return shuffledBuilder.ToString";
if (true) return _shuffledbuilder.ToString();
 };
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="shuffledBuilder.Append(auxTracks.Get(auxTracks.K";
_shuffledbuilder.Append(BA.ObjectToString(_auxtracks._get /*Object*/ (null,_auxtracks._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_r)))+",");
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="auxTracks.Remove(auxTracks.Keys.Get(r))";
_auxtracks._remove /*String*/ (null,_auxtracks._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_r));
 }
;
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="End Sub";
return "";
}
public static b4a.SpotifyLinker.b4xorderedmap  _rebuildtracks() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rebuildtracks", false))
	 {return ((b4a.SpotifyLinker.b4xorderedmap) Debug.delegate(mostCurrent.activityBA, "rebuildtracks", null));}
b4a.SpotifyLinker.b4xorderedmap _auxtracks = null;
Object _key = null;
int _i = 0;
String _auxkey = "";
b4a.SpotifyLinker.common._orderedmap _link = null;
String _kkey = "";
b4a.SpotifyLinker.config._link _linkk = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub RebuildTracks As B4XOrderedMap";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim auxTracks As B4XOrderedMap";
_auxtracks = new b4a.SpotifyLinker.b4xorderedmap();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="auxTracks.Initialize";
_auxtracks._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="For Each key In Common.Tracks.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = group3.Get(index3);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="auxTracks.Put(key, Common.Tracks.Get(key))";
_auxtracks._put /*String*/ (null,_key,mostCurrent._common._tracks /*b4a.SpotifyLinker.b4xorderedmap*/ ._get /*Object*/ (null,_key));
 }
};
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Do While i < auxTracks.Keys.Size";
while (_i<_auxtracks._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).getSize()) {
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Dim auxKey As String = auxTracks.Keys.Get(i)";
_auxkey = BA.ObjectToString(_auxtracks._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get(_i));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="For Each link As OrderedMap In Common.LinkedTrac";
{
final anywheresoftware.b4a.BA.IterableList group9 = mostCurrent._common._linkedtracks /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_link = (b4a.SpotifyLinker.common._orderedmap)(group9.Get(index9));
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="For Each kkey As String In link.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _link.Keys /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_kkey = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="If auxKey = kkey Then";
if ((_auxkey).equals(_kkey)) { 
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="auxTracks.Remove(auxKey)";
_auxtracks._remove /*String*/ (null,(Object)(_auxkey));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="i = i-1";
_i = (int) (_i-1);
 };
 }
};
 }
};
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="i = i+1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="For Each linkk As Link In Common.LinkList";
{
final anywheresoftware.b4a.BA.IterableList group19 = mostCurrent._common._linklist /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_linkk = (b4a.SpotifyLinker.config._link)(group19.Get(index19));
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="auxTracks.Put(linkk.LabelLink, linkk.uris)";
_auxtracks._put /*String*/ (null,(Object)(_linkk.LabelLink /*String*/ ),(Object)(_linkk.uris /*String*/ ));
 }
};
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="Return auxTracks";
if (true) return _auxtracks;
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="End Sub";
return null;
}
}