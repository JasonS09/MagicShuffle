package b4a.SpotifyLinker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xfloattextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.SpotifyLinker.b4xfloattextfield");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SpotifyLinker.b4xfloattextfield.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mtextfield = null;
public int _animationduration = 0;
public float _largelabeltextsize = 0f;
public float _smalllabeltextsize = 0f;
public boolean _largelabel = false;
public anywheresoftware.b4a.objects.B4XCanvas _measuringcanvas = null;
public int _hintcolor = 0;
public int _nonfocusedhintcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _hintimageview = null;
public String _hinttext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _hintfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largefocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _largenotfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallfocused = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smallnotfocused = null;
public boolean _focused = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblclear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblv = null;
public anywheresoftware.b4a.objects.collections.Map _mprops = null;
public Object _tag = null;
public String _keyboardtype = "";
public boolean _multiline = false;
public b4a.SpotifyLinker.b4xfloattextfield _mnexttextfield = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public int _hintlabellargeoffsetx = 0;
public int _hintlabelsmalloffsety = 0;
public int _hintlabelsmalloffsetx = 0;
public long _lastswitchtextfieldtime = 0L;
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.main _main = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.config _config = null;
public b4a.SpotifyLinker.common _common = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public String  _base_resize(b4a.SpotifyLinker.b4xfloattextfield __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _firstdistance = 0;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (__ref._multiline /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_firstdistance = __c.DipToCurrent((int) (22));};
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="If lblV.IsInitialized Then";
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance),(int) (0),__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_height));
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__c.DipToCurrent((int) (2)));
 };
RDebugUtils.currentLine=14680072;
 //BA.debugLineNum = 14680072;BA.debugLine="If lblClear.IsInitialized Then";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_width-__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_firstdistance),(int) (0),__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (_height));
 };
RDebugUtils.currentLine=14680075;
 //BA.debugLineNum = 14680075;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=14680076;
 //BA.debugLineNum = 14680076;BA.debugLine="End Sub";
return "";
}
public String  _updatelabel(b4a.SpotifyLinker.b4xfloattextfield __ref,String _txt,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "updatelabel", true))
	 {return ((String) Debug.delegate(ba, "updatelabel", new Object[] {_txt,_force}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _goingtolarge = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group1 = new anywheresoftware.b4a.objects.B4XViewWrapper[]{__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ };
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1[index1];
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if (_lbl.IsInitialized()) { 
_lbl.setVisible(__ref._focused /*boolean*/  && _txt.length()>0);};
 }
};
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = _txt.length()==0;
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==__ref._largelabel /*boolean*/  && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="Dim b As B4XBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="If Focused Then";
if (__ref._focused /*boolean*/ ) { 
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = __ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 }else {
RDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = __ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;}
else {
_b = __ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;};
 };
RDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="If b.IsInitialized = False Then Return";
if (_b.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="HintImageView.SetBitmap(b)";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=14745615;
 //BA.debugLineNum = 14745615;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
RDebugUtils.currentLine=14745616;
 //BA.debugLineNum = 14745616;BA.debugLine="HintImageView.SetLayoutAnimated (AnimationDurati";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabellargeoffsetx /*int*/ ,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_b.getHeight()/(double)2),(int) (_b.getWidth()),(int) (_b.getHeight()));
RDebugUtils.currentLine=14745617;
 //BA.debugLineNum = 14745617;BA.debugLine="LargeLabel = True";
__ref._largelabel /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=14745619;
 //BA.debugLineNum = 14745619;BA.debugLine="HintImageView.SetLayoutAnimated(AnimationDuratio";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._hintlabelsmalloffsetx /*int*/ ,__ref._hintlabelsmalloffsety /*int*/ ,(int) (_b.getWidth()),(int) (_b.getHeight()));
RDebugUtils.currentLine=14745620;
 //BA.debugLineNum = 14745620;BA.debugLine="LargeLabel = False";
__ref._largelabel /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=14745622;
 //BA.debugLineNum = 14745622;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="Private mTextField As B4XView";
_mtextfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="Public AnimationDuration As Int = 200";
_animationduration = (int) (200);
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
_largelabeltextsize = (float) (18);
_smalllabeltextsize = (float) (14);
RDebugUtils.currentLine=14090248;
 //BA.debugLineNum = 14090248;BA.debugLine="Private LargeLabel As Boolean";
_largelabel = false;
RDebugUtils.currentLine=14090249;
 //BA.debugLineNum = 14090249;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
_measuringcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=14090250;
 //BA.debugLineNum = 14090250;BA.debugLine="Public HintColor As Int";
_hintcolor = 0;
RDebugUtils.currentLine=14090251;
 //BA.debugLineNum = 14090251;BA.debugLine="Public NonFocusedHintColor As Int";
_nonfocusedhintcolor = 0;
RDebugUtils.currentLine=14090252;
 //BA.debugLineNum = 14090252;BA.debugLine="Private HintImageView As B4XView";
_hintimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14090253;
 //BA.debugLineNum = 14090253;BA.debugLine="Public HintText As String";
_hinttext = "";
RDebugUtils.currentLine=14090254;
 //BA.debugLineNum = 14090254;BA.debugLine="Public HintFont As B4XFont";
_hintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=14090255;
 //BA.debugLineNum = 14090255;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
_largefocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_largenotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_smallnotfocused = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=14090256;
 //BA.debugLineNum = 14090256;BA.debugLine="Public Focused As Boolean";
_focused = false;
RDebugUtils.currentLine=14090257;
 //BA.debugLineNum = 14090257;BA.debugLine="Public lblClear As B4XView";
_lblclear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14090258;
 //BA.debugLineNum = 14090258;BA.debugLine="Public lblV As B4XView";
_lblv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14090259;
 //BA.debugLineNum = 14090259;BA.debugLine="Private mProps As Map";
_mprops = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090260;
 //BA.debugLineNum = 14090260;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=14090261;
 //BA.debugLineNum = 14090261;BA.debugLine="Private KeyboardType As String 'ignore";
_keyboardtype = "";
RDebugUtils.currentLine=14090262;
 //BA.debugLineNum = 14090262;BA.debugLine="Private Multiline As Boolean";
_multiline = false;
RDebugUtils.currentLine=14090263;
 //BA.debugLineNum = 14090263;BA.debugLine="Private mNextTextField As B4XFloatTextField";
_mnexttextfield = new b4a.SpotifyLinker.b4xfloattextfield();
RDebugUtils.currentLine=14090265;
 //BA.debugLineNum = 14090265;BA.debugLine="Private IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=14090270;
 //BA.debugLineNum = 14090270;BA.debugLine="Public HintLabelLargeOffsetX, HintLabelSmallOffse";
_hintlabellargeoffsetx = 0;
_hintlabelsmalloffsety = __c.DipToCurrent((int) (2));
_hintlabelsmalloffsetx = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=14090271;
 //BA.debugLineNum = 14090271;BA.debugLine="Private LastSwitchTextFieldTime As Long";
_lastswitchtextfieldtime = 0L;
RDebugUtils.currentLine=14090272;
 //BA.debugLineNum = 14090272;BA.debugLine="End Sub";
return "";
}
public String  _createacceptbutton(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createacceptbutton", true))
	 {return ((String) Debug.delegate(ba, "createacceptbutton", null));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub CreateAcceptButton";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowAccept"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr((int) (0xe5ca))));
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="lblV.Tag = \"v\"";
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("v"));
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createbutton(b4a.SpotifyLinker.b4xfloattextfield __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createbutton", new Object[] {_text}));}
anywheresoftware.b4a.objects.LabelWrapper _lc = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim lc As Label";
_lc = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="lc.Initialize(\"lc\")";
_lc.Initialize(ba,"lc");
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Dim x As B4XView = lc";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="x = lc";
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lc.getObject()));
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
_x.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (20)));
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="x.Text = Text";
_x.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="x.TextColor = mTextField.TextColor";
_x.setTextColor(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor());
RDebugUtils.currentLine=14614536;
 //BA.debugLineNum = 14614536;BA.debugLine="x.Visible = False";
_x.setVisible(__c.False);
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
_x.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_x.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=14614539;
 //BA.debugLineNum = 14614539;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createbitmap(b4a.SpotifyLinker.b4xfloattextfield __ref,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createbitmap", new Object[] {_r,_color,_fnt}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (__c.Max(1,_r.getWidth()+__c.DipToCurrent((int) (2)))),(int) (__c.Max(1,_r.getHeight()+__c.DipToCurrent((int) (2)))));
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="c.Initialize(p)";
_c.Initialize(_p);
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) (_p.getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
_c.DrawText(ba,__ref._hinttext /*String*/ ,(float) (_p.getWidth()/(double)2),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _c.CreateBitmap();
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="c.Release";
_c.Release();
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="End Sub";
return null;
}
public String  _createclearbutton(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createclearbutton", true))
	 {return ((String) Debug.delegate(ba, "createclearbutton", null));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Private Sub CreateClearButton";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ((__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("ShowClear"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr((int) (0xe14c))));
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="lblClear.Tag = \"clear\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("clear"));
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="End Sub";
return "";
}
public String  _createrevealbutton(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createrevealbutton", true))
	 {return ((String) Debug.delegate(ba, "createrevealbutton", null));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub CreateRevealButton";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__c.Chr((int) (0xe8f4))));
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createtextfield(b4a.SpotifyLinker.b4xfloattextfield __ref,boolean _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createtextfield", new Object[] {_password}));}
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
RDebugUtils.currentLine=15532048;
 //BA.debugLineNum = 15532048;BA.debugLine="Dim tf As EditText";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15532049;
 //BA.debugLineNum = 15532049;BA.debugLine="tf.Initialize(\"tf\")";
_tf.Initialize(ba,"tf");
RDebugUtils.currentLine=15532050;
 //BA.debugLineNum = 15532050;BA.debugLine="tf.SingleLine = Not(Multiline)";
_tf.setSingleLine(__c.Not(__ref._multiline /*boolean*/ ));
RDebugUtils.currentLine=15532051;
 //BA.debugLineNum = 15532051;BA.debugLine="tf.PasswordMode = Password";
_tf.setPasswordMode(_password);
RDebugUtils.currentLine=15532052;
 //BA.debugLineNum = 15532052;BA.debugLine="If Password Then";
if (_password) { 
RDebugUtils.currentLine=15532053;
 //BA.debugLineNum = 15532053;BA.debugLine="If KeyboardType <> \"Text\" Then";
if ((__ref._keyboardtype /*String*/ ).equals("Text") == false) { 
RDebugUtils.currentLine=15532054;
 //BA.debugLineNum = 15532054;BA.debugLine="tf.InputType = Bit.Or(tf.INPUT_TYPE_NUMBERS, 16";
_tf.setInputType(__c.Bit.Or(_tf.INPUT_TYPE_NUMBERS,(int) (16)));
 }else {
RDebugUtils.currentLine=15532056;
 //BA.debugLineNum = 15532056;BA.debugLine="tf.InputType = Bit.Or(0x00000080, 0x00080000) '";
_tf.setInputType(__c.Bit.Or((int) (0x00000080),(int) (0x00080000)));
 };
 }else {
RDebugUtils.currentLine=15532059;
 //BA.debugLineNum = 15532059;BA.debugLine="Select KeyboardType";
switch (BA.switchObjectToInt(__ref._keyboardtype /*String*/ ,"Numbers","Decimal")) {
case 0: {
RDebugUtils.currentLine=15532061;
 //BA.debugLineNum = 15532061;BA.debugLine="tf.InputType = tf.INPUT_TYPE_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_NUMBERS);
 break; }
case 1: {
RDebugUtils.currentLine=15532063;
 //BA.debugLineNum = 15532063;BA.debugLine="tf.InputType = tf.INPUT_TYPE_DECIMAL_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_DECIMAL_NUMBERS);
 break; }
}
;
 };
RDebugUtils.currentLine=15532066;
 //BA.debugLineNum = 15532066;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
RDebugUtils.currentLine=15532090;
 //BA.debugLineNum = 15532090;BA.debugLine="End Sub";
return null;
}
public String  _createtextfieldall(b4a.SpotifyLinker.b4xfloattextfield __ref,boolean _passwordmode,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "createtextfieldall", true))
	 {return ((String) Debug.delegate(ba, "createtextfieldall", new Object[] {_passwordmode,_font1,_textcolor}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_passwordmode);
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="mTextField.Font = Font1";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setFont(_font1);
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="mTextField.TextColor = TextColor";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="setNextField(mNextTextField)";
__ref._setnextfield /*String*/ (null,__ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/ );
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="End Sub";
return "";
}
public String  _setnextfield(b4a.SpotifyLinker.b4xfloattextfield __ref,b4a.SpotifyLinker.b4xfloattextfield _field) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "setnextfield", true))
	 {return ((String) Debug.delegate(ba, "setnextfield", new Object[] {_field}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
Object _o = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="If Field.IsInitialized = False Then Return";
if (_field.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="If Multiline = False Then";
if (__ref._multiline /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If Field <> Me Then";
if ((_field).equals((b4a.SpotifyLinker.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="IME.AddHandleActionEvent(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .AddHandleActionEvent((android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),ba);
 };
RDebugUtils.currentLine=15335431;
 //BA.debugLineNum = 15335431;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="et.ForceDoneButton = True";
_et.setForceDoneButton(__c.True);
 };
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="Dim o As Object = Field";
_o = (Object)(_field);
RDebugUtils.currentLine=15335436;
 //BA.debugLineNum = 15335436;BA.debugLine="mNextTextField = o";
__ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/  = (b4a.SpotifyLinker.b4xfloattextfield)(_o);
RDebugUtils.currentLine=15335437;
 //BA.debugLineNum = 15335437;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.SpotifyLinker.b4xfloattextfield __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _passedlabel = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
boolean _passwordmode = false;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="mProps = Props";
__ref._mprops /*anywheresoftware.b4a.objects.collections.Map*/  = _props;
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_passedlabel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="iv.Initialize(\"HintImageView\")";
_iv.Initialize(ba,"HintImageView");
RDebugUtils.currentLine=14221320;
 //BA.debugLineNum = 14221320;BA.debugLine="HintImageView = iv";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
__ref._keyboardtype /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("KeyboardType"),(Object)("Text")));
RDebugUtils.currentLine=14221327;
 //BA.debugLineNum = 14221327;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
__ref._hintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HintColor")));
RDebugUtils.currentLine=14221328;
 //BA.debugLineNum = 14221328;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
__ref._nonfocusedhintcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("NonFocusedHintColor")));
RDebugUtils.currentLine=14221330;
 //BA.debugLineNum = 14221330;BA.debugLine="HintText = Props.Get(\"Hint\")";
__ref._hinttext /*String*/  = BA.ObjectToString(_props.Get((Object)("Hint")));
RDebugUtils.currentLine=14221331;
 //BA.debugLineNum = 14221331;BA.debugLine="HintFont = PassedLabel.Font";
__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _passedlabel.getFont();
RDebugUtils.currentLine=14221332;
 //BA.debugLineNum = 14221332;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = BA.ObjectToBoolean(_props.GetDefault((Object)("PasswordField"),(Object)(__c.False)));
RDebugUtils.currentLine=14221333;
 //BA.debugLineNum = 14221333;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
__ref._multiline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("Multiline"),(Object)(__c.False)));
RDebugUtils.currentLine=14221334;
 //BA.debugLineNum = 14221334;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && __ref._multiline /*boolean*/ ) { 
RDebugUtils.currentLine=14221335;
 //BA.debugLineNum = 14221335;BA.debugLine="Multiline = False";
__ref._multiline /*boolean*/  = __c.False;
RDebugUtils.currentLine=14221336;
 //BA.debugLineNum = 14221336;BA.debugLine="Log(\"Multiline not supported with password mode.";
__c.LogImpl("914221336","Multiline not supported with password mode.",0);
 };
RDebugUtils.currentLine=14221338;
 //BA.debugLineNum = 14221338;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
__ref._createtextfieldall /*String*/ (null,_passwordmode,_passedlabel.getFont(),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_lbl.getTextColor())));
RDebugUtils.currentLine=14221340;
 //BA.debugLineNum = 14221340;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=14221341;
 //BA.debugLineNum = 14221341;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=14221342;
 //BA.debugLineNum = 14221342;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=14221343;
 //BA.debugLineNum = 14221343;BA.debugLine="MeasuringCanvas.Initialize(p)";
__ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=14221344;
 //BA.debugLineNum = 14221344;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=14221345;
 //BA.debugLineNum = 14221345;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && BA.ObjectToBoolean(_props.GetDefault((Object)("ShowRevealButton"),(Object)(__c.False)))) { 
RDebugUtils.currentLine=14221346;
 //BA.debugLineNum = 14221346;BA.debugLine="CreateRevealButton";
__ref._createrevealbutton /*String*/ (null);
 }else {
RDebugUtils.currentLine=14221348;
 //BA.debugLineNum = 14221348;BA.debugLine="CreateClearButton";
__ref._createclearbutton /*String*/ (null);
 };
RDebugUtils.currentLine=14221350;
 //BA.debugLineNum = 14221350;BA.debugLine="CreateAcceptButton";
__ref._createacceptbutton /*String*/ (null);
RDebugUtils.currentLine=14221351;
 //BA.debugLineNum = 14221351;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=14221352;
 //BA.debugLineNum = 14221352;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._largelabeltextsize /*float*/ );
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
__ref._largefocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._largenotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._smalllabeltextsize /*float*/ );
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = __ref._measuringcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._hinttext /*String*/ ,_f);
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
__ref._smallfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._hintcolor /*int*/ ,_f);
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref._smallnotfocused /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._createbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_r,__ref._nonfocusedhintcolor /*int*/ ,_f);
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="End Sub";
return "";
}
public b4a.SpotifyLinker.b4xfloattextfield  _getnextfield(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "getnextfield", true))
	 {return ((b4a.SpotifyLinker.b4xfloattextfield) Debug.delegate(ba, "getnextfield", null));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Return mNextTextField";
if (true) return __ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/ ;
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="End Sub";
return null;
}
public String  _gettext(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Return mTextField.Text";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _gettextfield(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "gettextfield", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "gettextfield", null));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub getTextField As B4XView";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Return mTextField";
if (true) return __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="End Sub";
return null;
}
public boolean  _ime_handleaction(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "ime_handleaction", true))
	 {return ((Boolean) Debug.delegate(ba, "ime_handleaction", null));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub ime_HandleAction As Boolean";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if (__ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()) { 
if (true) return __c.True;};
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="End Sub";
return false;
}
public String  _tf_enterpressed(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "tf_enterpressed", null));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub tf_EnterPressed";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="tf_Action";
__ref._tf_action /*String*/ (null);
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.SpotifyLinker.b4xfloattextfield __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="If xui.IsB4A Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="HintLabelLargeOffsetX = 6dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (6));
 }else {
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="HintLabelLargeOffsetX = 12dip";
__ref._hintlabellargeoffsetx /*int*/  = __c.DipToCurrent((int) (12));
 };
RDebugUtils.currentLine=14155785;
 //BA.debugLineNum = 14155785;BA.debugLine="IME.Initialize(\"ime\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("ime");
RDebugUtils.currentLine=14155791;
 //BA.debugLineNum = 14155791;BA.debugLine="End Sub";
return "";
}
public String  _lc_click(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "lc_click", true))
	 {return ((String) Debug.delegate(ba, "lc_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub lc_Click";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="Select btn.Tag";
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("clear"),(Object)("reveal"),(Object)("hide"),(Object)("v"))) {
case 0: {
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="setText(\"\")";
__ref._settext /*String*/ (null,"");
 break; }
case 1: {
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="SwitchFromPasswordToRegular (True)";
__ref._switchfrompasswordtoregular /*void*/ (null,__c.True);
 break; }
case 2: {
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="SwitchFromPasswordToRegular(False)";
__ref._switchfrompasswordtoregular /*void*/ (null,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=15728650;
 //BA.debugLineNum = 15728650;BA.debugLine="tf_EnterPressed";
__ref._tf_enterpressed /*String*/ (null);
RDebugUtils.currentLine=15728651;
 //BA.debugLineNum = 15728651;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if (__ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()==__c.False || (__ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/ ).equals((b4a.SpotifyLinker.b4xfloattextfield)(this))) { 
RDebugUtils.currentLine=15728653;
 //BA.debugLineNum = 15728653;BA.debugLine="IME.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
 };
 break; }
}
;
RDebugUtils.currentLine=15728659;
 //BA.debugLineNum = 15728659;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.SpotifyLinker.b4xfloattextfield __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_s}));}
String _old = "";
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub setText(s As String)";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="mTextField.Text = s";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_s));
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="If IsPaused(Me) Then tf_TextChanged(old, s)";
if (__c.IsPaused(ba,this)) { 
__ref._tf_textchanged /*String*/ (null,_old,_s);};
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="End Sub";
return "";
}
public void  _switchfrompasswordtoregular(b4a.SpotifyLinker.b4xfloattextfield __ref,boolean _toregular) throws Exception{
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "switchfrompasswordtoregular", true))
	 {Debug.delegate(ba, "switchfrompasswordtoregular", new Object[] {_toregular}); return;}
ResumableSub_SwitchFromPasswordToRegular rsub = new ResumableSub_SwitchFromPasswordToRegular(this,__ref,_toregular);
rsub.resume(ba, null);
}
public static class ResumableSub_SwitchFromPasswordToRegular extends BA.ResumableSub {
public ResumableSub_SwitchFromPasswordToRegular(b4a.SpotifyLinker.b4xfloattextfield parent,b4a.SpotifyLinker.b4xfloattextfield __ref,boolean _toregular) {
this.parent = parent;
this.__ref = __ref;
this._toregular = _toregular;
this.__ref = parent;
}
b4a.SpotifyLinker.b4xfloattextfield __ref;
b4a.SpotifyLinker.b4xfloattextfield parent;
boolean _toregular;
String _text = "";
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper _oldfield = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xfloattextfield";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim text As String = mTextField.Text";
_text = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextColor();
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont();
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="Dim oldfield As B4XView = mTextField";
_oldfield = new anywheresoftware.b4a.objects.B4XViewWrapper();
_oldfield = __ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
__ref._createtextfieldall /*String*/ (null,parent.__c.Not(_toregular),_font1,_textcolor);
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="mTextField.Text = text";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="If lblClear.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="If ToRegular = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_toregular==parent.__c.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr((int) (0xe8f4))));
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="lblClear.Tag = \"reveal\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("reveal"));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=14549005;
 //BA.debugLineNum = 14549005;BA.debugLine="lblClear.Tag = \"hide\"";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("hide"));
RDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.Chr((int) (0xe8f5))));
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=14549008;
 //BA.debugLineNum = 14549008;BA.debugLine="lblClear.BringToFront";
__ref._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
 if (true) break;
;
RDebugUtils.currentLine=14549010;
 //BA.debugLineNum = 14549010;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";

case 10:
//if
this.state = 15;
if (__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
__ref._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=14549011;
 //BA.debugLineNum = 14549011;BA.debugLine="HintImageView.BringToFront";
__ref._hintimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=14549012;
 //BA.debugLineNum = 14549012;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=14549017;
 //BA.debugLineNum = 14549017;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=14549018;
 //BA.debugLineNum = 14549018;BA.debugLine="et.SelectionStart = mTextField.Text.Length";
_et.setSelectionStart(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().length());
RDebugUtils.currentLine=14549020;
 //BA.debugLineNum = 14549020;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now";
__ref._lastswitchtextfieldtime /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=14549021;
 //BA.debugLineNum = 14549021;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=14549022;
 //BA.debugLineNum = 14549022;BA.debugLine="oldfield.RemoveViewFromParent";
_oldfield.RemoveViewFromParent();
RDebugUtils.currentLine=14549024;
 //BA.debugLineNum = 14549024;BA.debugLine="LastSwitchTextFieldTime = DateTime.Now + 200";
__ref._lastswitchtextfieldtime /*long*/  = (long) (parent.__c.DateTime.getNow()+200);
RDebugUtils.currentLine=14549025;
 //BA.debugLineNum = 14549025;BA.debugLine="et.Enabled = False";
_et.setEnabled(parent.__c.False);
RDebugUtils.currentLine=14549026;
 //BA.debugLineNum = 14549026;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xfloattextfield", "switchfrompasswordtoregular"),(int) (50));
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
RDebugUtils.currentLine=14549027;
 //BA.debugLineNum = 14549027;BA.debugLine="et.Enabled = True";
_et.setEnabled(parent.__c.True);
RDebugUtils.currentLine=14549028;
 //BA.debugLineNum = 14549028;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xfloattextfield", "switchfrompasswordtoregular"),(int) (50));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=14549029;
 //BA.debugLineNum = 14549029;BA.debugLine="et.RequestFocus";
_et.RequestFocus();
RDebugUtils.currentLine=14549030;
 //BA.debugLineNum = 14549030;BA.debugLine="IME.ShowKeyboard(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=14549032;
 //BA.debugLineNum = 14549032;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Passwo";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(int) (1))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=14549033;
 //BA.debugLineNum = 14549033;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Passwo";
parent.__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PasswordRevealChanged",(Object)(_toregular));
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=14549035;
 //BA.debugLineNum = 14549035;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _requestfocusandshowkeyboard(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "requestfocusandshowkeyboard", true))
	 {return ((String) Debug.delegate(ba, "requestfocusandshowkeyboard", null));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="mTextField.RequestFocus";
__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="IME.ShowKeyboard(mTextField)";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .ShowKeyboard((android.view.View)(__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="End Sub";
return "";
}
public String  _tf_textchanged(b4a.SpotifyLinker.b4xfloattextfield __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_textchanged", true))
	 {return ((String) Debug.delegate(ba, "tf_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="UpdateLabel(New, False)";
__ref._updatelabel /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(int) (2))) { 
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TextChanged",(Object)(_old),(Object)(_new));
 };
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="End Sub";
return "";
}
public String  _tf_action(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_action", true))
	 {return ((String) Debug.delegate(ba, "tf_action", null));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub tf_Action";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if (__ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/ .IsInitialized /*boolean*/ () && (__ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/ ).equals((b4a.SpotifyLinker.b4xfloattextfield)(this)) == false) { 
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="mNextTextField.TextField.RequestFocus";
__ref._mnexttextfield /*b4a.SpotifyLinker.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
 };
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed",(int) (0))) { 
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_EnterPressed");
 };
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="End Sub";
return "";
}
public String  _tf_beginedit(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_beginedit", true))
	 {return ((String) Debug.delegate(ba, "tf_beginedit", null));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub tf_BeginEdit";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="tf_FocusChanged(True)";
__ref._tf_focuschanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="End Sub";
return "";
}
public String  _tf_focuschanged(b4a.SpotifyLinker.b4xfloattextfield __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "tf_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Focused = HasFocus";
__ref._focused /*boolean*/  = _hasfocus;
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="UpdateLabel(mTextField.Text, True)";
__ref._updatelabel /*String*/ (null,__ref._mtextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),__c.True);
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_FocusC";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(int) (1))) { 
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="If LastSwitchTextFieldTime + 100 < DateTime.Now";
if (__ref._lastswitchtextfieldtime /*long*/ +100<__c.DateTime.getNow()) { 
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Focus";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_FocusChanged",(Object)(__ref._focused /*boolean*/ ));
 };
 };
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="End Sub";
return "";
}
public String  _tf_endedit(b4a.SpotifyLinker.b4xfloattextfield __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xfloattextfield";
if (Debug.shouldDelegate(ba, "tf_endedit", true))
	 {return ((String) Debug.delegate(ba, "tf_endedit", null));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub tf_EndEdit";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="tf_FocusChanged(False)";
__ref._tf_focuschanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}