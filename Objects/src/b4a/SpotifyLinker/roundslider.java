package b4a.SpotifyLinker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class roundslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.SpotifyLinker.roundslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SpotifyLinker.roundslider.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _mvalue = 0;
public int _mmin = 0;
public int _mmax = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _thumb = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _circlerect = null;
public int _valuecolor = 0;
public int _stroke = 0;
public int _thumbsize = 0;
public Object _tag = null;
public int _mthumbbordercolor = 0;
public int _mthumbinnercolor = 0;
public int _mcirclefillcolor = 0;
public int _mcirclenonvaluecolor = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.main _main = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.config _config = null;
public b4a.SpotifyLinker.common _common = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public String  _base_resize(b4a.SpotifyLinker.roundslider __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
__ref._createthumb /*String*/ (null);};
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (_width-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ),(float) (_height-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ));
RDebugUtils.currentLine=26083333;
 //BA.debugLineNum = 26083333;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=26083335;
 //BA.debugLineNum = 26083335;BA.debugLine="End Sub";
return "";
}
public String  _createthumb(b4a.SpotifyLinker.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "createthumb", true))
	 {return ((String) Debug.delegate(ba, "createthumb", null));}
b4a.example.bcpath _p = null;
int _r = 0;
int _g = 0;
int _l = 0;
b4a.example.bitmapcreator _bc = null;
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Private Sub CreateThumb";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="Dim p As BCPath";
_p = new b4a.example.bcpath();
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="Dim r As Int = 80dip";
_r = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="Dim g As Int = 8dip";
_g = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="Dim l As Int = 28dip";
_l = __c.DipToCurrent((int) (28));
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
_bc._initialize(ba,(int) (2*_r+_g+__c.DipToCurrent((int) (3))),(int) (2*_r+_l+_g));
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
_p._initialize(ba,(float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=26017800;
 //BA.debugLineNum = 26017800;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r+_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=26017801;
 //BA.debugLineNum = 26017801;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
_p._lineto((float) (_r+_g),(float) (2*_r+_l+_g));
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=26017803;
 //BA.debugLineNum = 26017803;BA.debugLine="bc.DrawPath(p, mThumbBorderColor, True, 0)";
_bc._drawpath(_p,__ref._mthumbbordercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=26017804;
 //BA.debugLineNum = 26017804;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbInnerColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbinnercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=26017805;
 //BA.debugLineNum = 26017805;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbBorderColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbbordercolor /*int*/ ,__c.False,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=26017806;
 //BA.debugLineNum = 26017806;BA.debugLine="thumb = bc.Bitmap";
__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bc._getbitmap();
RDebugUtils.currentLine=26017807;
 //BA.debugLineNum = 26017807;BA.debugLine="ThumbSize = thumb.Height / 4";
__ref._thumbsize /*int*/  = (int) (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=26017808;
 //BA.debugLineNum = 26017808;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=26017809;
 //BA.debugLineNum = 26017809;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.SpotifyLinker.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
int _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _b4jstrokeoffset = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
int _r = 0;
int _cx = 0;
int _cy = 0;
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Public Sub Draw";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2);
RDebugUtils.currentLine=26148867;
 //BA.debugLineNum = 26148867;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._mcirclenonvaluecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=26148869;
 //BA.debugLineNum = 26148869;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((__ref._mvalue /*int*/ -__ref._mmin /*int*/ )/(double)(__ref._mmax /*int*/ -__ref._mmin /*int*/ )*360);
RDebugUtils.currentLine=26148870;
 //BA.debugLineNum = 26148870;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
RDebugUtils.currentLine=26148871;
 //BA.debugLineNum = 26148871;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_b4jstrokeoffset = (int) (__ref._stroke /*int*/ /(double)2);};
RDebugUtils.currentLine=26148872;
 //BA.debugLineNum = 26148872;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.Ce";
_p.InitializeArc(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius+_b4jstrokeoffset),(float) (-90),(float) (_angle));
RDebugUtils.currentLine=26148873;
 //BA.debugLineNum = 26148873;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
RDebugUtils.currentLine=26148874;
 //BA.debugLineNum = 26148874;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius-_b4jstrokeoffset),__ref._mcirclefillcolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=26148875;
 //BA.debugLineNum = 26148875;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=26148876;
 //BA.debugLineNum = 26148876;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+__ref._thumbsize /*int*/ /(double)2+__ref._stroke /*int*/ /(double)2);
RDebugUtils.currentLine=26148877;
 //BA.debugLineNum = 26148877;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX()+_r*__c.CosD(_angle-90));
RDebugUtils.currentLine=26148878;
 //BA.debugLineNum = 26148878;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY()+_r*__c.SinD(_angle-90));
RDebugUtils.currentLine=26148879;
 //BA.debugLineNum = 26148879;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
_dest.Initialize((float) (_cx-__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy-__ref._thumbsize /*int*/ /(double)2),(float) (_cx+__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy+__ref._thumbsize /*int*/ /(double)2));
RDebugUtils.currentLine=26148880;
 //BA.debugLineNum = 26148880;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawBitmapRotated((android.graphics.Bitmap)(__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),_dest,(float) (_angle));
RDebugUtils.currentLine=26148881;
 //BA.debugLineNum = 26148881;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=26148882;
 //BA.debugLineNum = 26148882;BA.debugLine="xlbl.Text = mValue";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._mvalue /*int*/ ));
RDebugUtils.currentLine=26148883;
 //BA.debugLineNum = 26148883;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.SpotifyLinker.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25690116;
 //BA.debugLineNum = 25690116;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=25690117;
 //BA.debugLineNum = 25690117;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="Private mValue As Int = 75";
_mvalue = (int) (75);
RDebugUtils.currentLine=25690119;
 //BA.debugLineNum = 25690119;BA.debugLine="Private mMin, mMax As Int";
_mmin = 0;
_mmax = 0;
RDebugUtils.currentLine=25690120;
 //BA.debugLineNum = 25690120;BA.debugLine="Private thumb As B4XBitmap";
_thumb = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=25690121;
 //BA.debugLineNum = 25690121;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25690122;
 //BA.debugLineNum = 25690122;BA.debugLine="Private xlbl As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25690123;
 //BA.debugLineNum = 25690123;BA.debugLine="Private CircleRect As B4XRect";
_circlerect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=25690124;
 //BA.debugLineNum = 25690124;BA.debugLine="Private ValueColor As Int";
_valuecolor = 0;
RDebugUtils.currentLine=25690125;
 //BA.debugLineNum = 25690125;BA.debugLine="Private stroke As Int";
_stroke = 0;
RDebugUtils.currentLine=25690126;
 //BA.debugLineNum = 25690126;BA.debugLine="Private ThumbSize As Int";
_thumbsize = 0;
RDebugUtils.currentLine=25690127;
 //BA.debugLineNum = 25690127;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=25690128;
 //BA.debugLineNum = 25690128;BA.debugLine="Private mThumbBorderColor As Int = 0xFF5B5B5B";
_mthumbbordercolor = (int) (0xff5b5b5b);
RDebugUtils.currentLine=25690129;
 //BA.debugLineNum = 25690129;BA.debugLine="Private mThumbInnerColor As Int = xui.Color_White";
_mthumbinnercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=25690130;
 //BA.debugLineNum = 25690130;BA.debugLine="Private mCircleFillColor As Int = xui.Color_White";
_mcirclefillcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=25690131;
 //BA.debugLineNum = 25690131;BA.debugLine="Private mCircleNonValueColor As Int = 0xFFB6B6B6";
_mcirclenonvaluecolor = (int) (0xffb6b6b6);
RDebugUtils.currentLine=25690132;
 //BA.debugLineNum = 25690132;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.SpotifyLinker.roundslider __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="mMin = Props.Get(\"Min\")";
__ref._mmin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="mMax = Props.Get(\"Max\")";
__ref._mmax /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=25821190;
 //BA.debugLineNum = 25821190;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=25821191;
 //BA.debugLineNum = 25821191;BA.debugLine="xlbl = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=25821192;
 //BA.debugLineNum = 25821192;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=25821193;
 //BA.debugLineNum = 25821193;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=25821194;
 //BA.debugLineNum = 25821194;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
__ref._valuecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ValueColor")));
RDebugUtils.currentLine=25821195;
 //BA.debugLineNum = 25821195;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=25821196;
 //BA.debugLineNum = 25821196;BA.debugLine="stroke = 8dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (8));
 }else 
{RDebugUtils.currentLine=25821197;
 //BA.debugLineNum = 25821197;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=25821198;
 //BA.debugLineNum = 25821198;BA.debugLine="stroke = 6dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (6));
 }}
;
RDebugUtils.currentLine=25821200;
 //BA.debugLineNum = 25821200;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=25821201;
 //BA.debugLineNum = 25821201;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4a.SpotifyLinker.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.SpotifyLinker.roundslider __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="End Sub";
return "";
}
public String  _pnl_touch(b4a.SpotifyLinker.roundslider __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_touch", true))
	 {return ((String) Debug.delegate(ba, "pnl_touch", new Object[] {_action,_x,_y}));}
int _dx = 0;
int _dy = 0;
float _dist = 0f;
int _angle = 0;
int _newvalue = 0;
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX());
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY());
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (__c.Sqrt(__c.Power(_dx,2)+__c.Power(_dy,2)));
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2) { 
RDebugUtils.currentLine=26214406;
 //BA.debugLineNum = 26214406;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (__c.Round(__c.ATan2D(_dy,_dx)));
RDebugUtils.currentLine=26214407;
 //BA.debugLineNum = 26214407;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
RDebugUtils.currentLine=26214408;
 //BA.debugLineNum = 26214408;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
RDebugUtils.currentLine=26214409;
 //BA.debugLineNum = 26214409;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (__ref._mmin /*int*/ +_angle/(double)360*(__ref._mmax /*int*/ -__ref._mmin /*int*/ ));
RDebugUtils.currentLine=26214410;
 //BA.debugLineNum = 26214410;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_newvalue)));
RDebugUtils.currentLine=26214411;
 //BA.debugLineNum = 26214411;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=26214412;
 //BA.debugLineNum = 26214412;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=26214413;
 //BA.debugLineNum = 26214413;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Valu";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=26214414;
 //BA.debugLineNum = 26214414;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChange";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=26214417;
 //BA.debugLineNum = 26214417;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
RDebugUtils.currentLine=26214419;
 //BA.debugLineNum = 26214419;BA.debugLine="End Sub";
return "";
}
public String  _setcirclecolor(b4a.SpotifyLinker.roundslider __ref,int _nonvaluecolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setcirclecolor", true))
	 {return ((String) Debug.delegate(ba, "setcirclecolor", new Object[] {_nonvaluecolor,_innercolor}));}
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub SetCircleColor (NonValueColor As Int, I";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="mCircleNonValueColor = NonValueColor";
__ref._mcirclenonvaluecolor /*int*/  = _nonvaluecolor;
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="mCircleFillColor = InnerColor";
__ref._mcirclefillcolor /*int*/  = _innercolor;
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="End Sub";
return "";
}
public String  _setthumbcolor(b4a.SpotifyLinker.roundslider __ref,int _bordercolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setthumbcolor", true))
	 {return ((String) Debug.delegate(ba, "setthumbcolor", new Object[] {_bordercolor,_innercolor}));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub SetThumbColor(BorderColor As Int, Inner";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="mThumbBorderColor = BorderColor";
__ref._mthumbbordercolor /*int*/  = _bordercolor;
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="mThumbInnerColor = InnerColor";
__ref._mthumbinnercolor /*int*/  = _innercolor;
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="CreateThumb";
__ref._createthumb /*String*/ (null);
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=25886725;
 //BA.debugLineNum = 25886725;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.SpotifyLinker.roundslider __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_v)));
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="End Sub";
return "";
}
}