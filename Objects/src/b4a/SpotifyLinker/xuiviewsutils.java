package b4a.SpotifyLinker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xuiviewsutils {
private static xuiviewsutils mostCurrent = new xuiviewsutils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _utilsinitialized = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.main _main = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.config _config = null;
public b4a.SpotifyLinker.common _common = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public static String  _performhapticfeedback(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "performhapticfeedback", true))
	 {return ((String) Debug.delegate(null, "performhapticfeedback", new Object[] {_ba,_view}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="Initialize";
_initialize(_ba);
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="Dim jo As JavaObject = View";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="jo.RunMethod(\"performHapticFeedback\", Array(1))";
_jo.RunMethod("performHapticFeedback",new Object[]{(Object)(1)});
RDebugUtils.currentLine=27983882;
 //BA.debugLineNum = 27983882;BA.debugLine="End Sub";
return "";
}
public static String  _settextorcsbuildertolabel(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(null, "settextorcsbuildertolabel", new Object[] {_ba,_xlbl,_text}));}
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=28114956;
 //BA.debugLineNum = 28114956;BA.debugLine="End Sub";
return "";
}
public static String  _addstubtoclvifneeded(anywheresoftware.b4a.BA _ba,b4a.example3.customlistview _customlistview1,int _color) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "addstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(null, "addstubtoclvifneeded", new Object[] {_ba,_customlistview1,_color}));}
b4a.example3.customlistview._clvitem _lastitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if (_customlistview1._getsize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = _customlistview1._getrawlistitem((int) (_customlistview1._getsize()-1));
RDebugUtils.currentLine=28049411;
 //BA.debugLineNum = 28049411;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem.Offset+_lastitem.Panel.getHeight()<_customlistview1._asview().getHeight()) { 
RDebugUtils.currentLine=28049413;
 //BA.debugLineNum = 28049413;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel((_ba.processBA == null ? _ba : _ba.processBA),"stub");
RDebugUtils.currentLine=28049414;
 //BA.debugLineNum = 28049414;BA.debugLine="p.Color = Color";
_p.setColor(_color);
RDebugUtils.currentLine=28049415;
 //BA.debugLineNum = 28049415;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) (_customlistview1._asview().getHeight()-_lastitem.Offset-_lastitem.Panel.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=28049416;
 //BA.debugLineNum = 28049416;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if (_xui.getIsB4J()) { 
_height = (int) (_height+5);};
RDebugUtils.currentLine=28049417;
 //BA.debugLineNum = 28049417;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_customlistview1._asview().getWidth(),_height);
RDebugUtils.currentLine=28049418;
 //BA.debugLineNum = 28049418;BA.debugLine="CustomListView1.Add(p, \"\")";
_customlistview1._add(_p,(Object)(""));
RDebugUtils.currentLine=28049419;
 //BA.debugLineNum = 28049419;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
_customlistview1._sv.setScrollViewContentHeight((int) (_customlistview1._sv.getScrollViewContentHeight()-_customlistview1._getdividersize()));
 };
RDebugUtils.currentLine=28049421;
 //BA.debugLineNum = 28049421;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapandfill(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _imageview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "setbitmapandfill", true))
	 {return ((String) Debug.delegate(null, "setbitmapandfill", new Object[] {_ba,_imageview,_bmp}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="ImageView.SetBitmap(Bmp)";
_imageview.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="Dim iiv As ImageView = ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iiv = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_imageview.getObject()));
RDebugUtils.currentLine=28180484;
 //BA.debugLineNum = 28180484;BA.debugLine="iiv.Gravity = Gravity.FILL";
_iiv.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=28180490;
 //BA.debugLineNum = 28180490;BA.debugLine="End Sub";
return "";
}
public static String  _setalpha(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _view,float _level) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "setalpha", true))
	 {return ((String) Debug.delegate(null, "setalpha", new Object[] {_ba,_view,_level}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
float _alpha = 0f;
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub SetAlpha (View As B4XView, Level As Flo";
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="Dim jo As JavaObject = View";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="Dim alpha As Float = Level";
_alpha = _level;
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="jo.RunMethod(\"setAlpha\", Array(alpha))";
_jo.RunMethod("setAlpha",new Object[]{(Object)(_alpha)});
RDebugUtils.currentLine=28377100;
 //BA.debugLineNum = 28377100;BA.debugLine="End Sub";
return "";
}
public static b4a.SpotifyLinker.b4ximageview  _createb4ximageview(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "createb4ximageview", true))
	 {return ((b4a.SpotifyLinker.b4ximageview) Debug.delegate(null, "createb4ximageview", new Object[] {_ba}));}
b4a.SpotifyLinker.b4ximageview _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Public Sub CreateB4XImageView As B4XImageView";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="Dim iv As B4XImageView";
_iv = new b4a.SpotifyLinker.b4ximageview();
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="iv.Initialize(Null, \"\")";
_iv._initialize /*String*/ (null,_ba,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="Dim base As B4XView = xui.CreatePanel(\"\")";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_base = _xui.CreatePanel((_ba.processBA == null ? _ba : _ba.processBA),"");
RDebugUtils.currentLine=28311556;
 //BA.debugLineNum = 28311556;BA.debugLine="base.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_base.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=28311557;
 //BA.debugLineNum = 28311557;BA.debugLine="iv.DesignerCreateView(base, Null, CreateMap(\"Roun";
_iv._designercreateview /*String*/ (null,(Object)(_base.getObject()),(anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Round"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("ResizeMode"),(Object)("FIT"),(Object)("BackgroundColor"),(Object)(0xffaaaaaa),(Object)("CornersRadius"),(Object)(0)}));
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="Return iv";
if (true) return _iv;
RDebugUtils.currentLine=28311559;
 //BA.debugLineNum = 28311559;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(null, "createlabel", new Object[] {_ba}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Public Sub CreateLabel As B4XView";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(_ba,"");
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=28246020;
 //BA.debugLineNum = 28246020;BA.debugLine="End Sub";
return null;
}
public static String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(null, "initialize", true))
	 {return ((String) Debug.delegate(null, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Private Sub Initialize";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="If UtilsInitialized Then Return";
if (_utilsinitialized) { 
if (true) return "";};
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="UtilsInitialized = True";
_utilsinitialized = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=27918345;
 //BA.debugLineNum = 27918345;BA.debugLine="End Sub";
return "";
}
}