package b4a.SpotifyLinker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xradiobutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.SpotifyLinker.b4xradiobutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SpotifyLinker.b4xradiobutton.class).invoke(this, new Object[] {null});
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
public int _oncolor = 0;
public int _offcolor = 0;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public boolean _mvalue = false;
public b4a.example.bcpath._bcbrush _transparent = null;
public int _loopindex = 0;
public Object _tag = null;
public b4a.example.bcpath._bcbrush _onbrush = null;
public b4a.example.bcpath._bcbrush _offbrush = null;
public boolean _menabled = false;
public boolean _mhaptic = false;
public int _size = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlabel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public float _scale = 0f;
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.main _main = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.config _config = null;
public b4a.SpotifyLinker.common _common = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public String  _base_resize(b4a.SpotifyLinker.b4xradiobutton __ref,double _width1,double _height1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width1,_height1}));}
int _newsize = 0;
int _gap = 0;
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Dim NewSize As Int = Max(5dip, Height1)";
_newsize = (int) (__c.Max(__c.DipToCurrent((int) (5)),_height1));
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="If NewSize = Size Then Return";
if (_newsize==__ref._size /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="Size = NewSize";
__ref._size /*int*/  = _newsize;
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="Dim gap As Int = 3dip";
_gap = __c.DipToCurrent((int) (3));
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="bc.Initialize(NewSize - 2 * gap, NewSize - 2 * ga";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_newsize-2*_gap),(int) (_newsize-2*_gap));
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="Scale = xui.Scale";
__ref._scale /*float*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale();
RDebugUtils.currentLine=21037068;
 //BA.debugLineNum = 21037068;BA.debugLine="iv.SetLayoutAnimated(0, gap, gap, Size - 2 * gap,";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_gap,_gap,(int) (__ref._size /*int*/ -2*_gap),(int) (__ref._size /*int*/ -2*_gap));
RDebugUtils.currentLine=21037069;
 //BA.debugLineNum = 21037069;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width1, Height1)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width1),(int) (_height1));
RDebugUtils.currentLine=21037070;
 //BA.debugLineNum = 21037070;BA.debugLine="mLabel.SetLayoutAnimated(0, Size + gap, 0, Width1";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._size /*int*/ +_gap),(int) (0),(int) (_width1-__ref._size /*int*/ -_gap),(int) (_height1));
RDebugUtils.currentLine=21037071;
 //BA.debugLineNum = 21037071;BA.debugLine="OnBrush = bc.CreateBrushFromColor(OnColor)";
__ref._onbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._oncolor /*int*/ );
RDebugUtils.currentLine=21037072;
 //BA.debugLineNum = 21037072;BA.debugLine="OffBrush = bc.CreateBrushFromColor(OffColor)";
__ref._offbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._offcolor /*int*/ );
RDebugUtils.currentLine=21037073;
 //BA.debugLineNum = 21037073;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
__ref._transparent /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=21037074;
 //BA.debugLineNum = 21037074;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=21037075;
 //BA.debugLineNum = 21037075;BA.debugLine="End Sub";
return "";
}
public void  _setvalueimpl(b4a.SpotifyLinker.b4xradiobutton __ref,boolean _b,boolean _immediate) throws Exception{
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setvalueimpl", true))
	 {Debug.delegate(ba, "setvalueimpl", new Object[] {_b,_immediate}); return;}
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,__ref,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4a.SpotifyLinker.b4xradiobutton parent,b4a.SpotifyLinker.b4xradiobutton __ref,boolean _b,boolean _immediate) {
this.parent = parent;
this.__ref = __ref;
this._b = _b;
this._immediate = _immediate;
this.__ref = parent;
}
b4a.SpotifyLinker.b4xradiobutton __ref;
b4a.SpotifyLinker.b4xradiobutton parent;
boolean _b;
boolean _immediate;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4a.SpotifyLinker.b4xradiobutton _rb = null;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xradiobutton";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="mValue = b";
__ref._mvalue /*boolean*/  = _b;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="If b = True Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_b==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="For i = 0 To mBase.Parent.NumberOfViews - 1";
if (true) break;

case 4:
//for
this.state = 11;
step3 = 1;
limit3 = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getNumberOfViews()-1);
_i = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 11;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 6;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="Dim v As B4XView = mBase.Parent.GetView(i)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetView(_i);
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="If v <> mBase And v.Tag Is B4XRadioButton Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_v).equals(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false && _v.getTag() instanceof b4a.SpotifyLinker.b4xradiobutton) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="Dim rb As B4XRadioButton = v.Tag";
_rb = (b4a.SpotifyLinker.b4xradiobutton)(_v.getTag());
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="rb.Checked = False";
_rb._setchecked /*boolean*/ (null,parent.__c.False);
 if (true) break;

case 10:
//C
this.state = 60;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=21168139;
 //BA.debugLineNum = 21168139;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=21168140;
 //BA.debugLineNum = 21168140;BA.debugLine="If Immediate Then";
if (true) break;

case 13:
//if
this.state = 53;
if (_immediate) { 
this.state = 15;
}else {
this.state = 25;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=21168141;
 //BA.debugLineNum = 21168141;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 16:
//if
this.state = 23;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 18;
;}
else {
this.state = 20;
;}if (true) break;

case 18:
//C
this.state = 23;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 20:
//C
this.state = 23;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 23:
//C
this.state = 53;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=21168143;
 //BA.debugLineNum = 21168143;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=21168144;
 //BA.debugLineNum = 21168144;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=21168145;
 //BA.debugLineNum = 21168145;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
RDebugUtils.currentLine=21168146;
 //BA.debugLineNum = 21168146;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 26:
//do while
this.state = 41;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=21168147;
 //BA.debugLineNum = 21168147;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
RDebugUtils.currentLine=21168148;
 //BA.debugLineNum = 21168148;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 29:
//if
this.state = 34;
if (__ref._mvalue /*boolean*/ ==parent.__c.False) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_state1 = (float) (1-_state1);
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=21168149;
 //BA.debugLineNum = 21168149;BA.debugLine="Draw(state1)";
__ref._draw /*String*/ (null,_state1);
RDebugUtils.currentLine=21168150;
 //BA.debugLineNum = 21168150;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xradiobutton", "setvalueimpl"),(int) (16));
this.state = 61;
return;
case 61:
//C
this.state = 35;
;
RDebugUtils.currentLine=21168151;
 //BA.debugLineNum = 21168151;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 35:
//if
this.state = 40;
if (_myindex!=__ref._loopindex /*int*/ ) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
this.state = 41;
if (true) break;
if (true) break;

case 40:
//C
this.state = 26;
;
 if (true) break;
;
RDebugUtils.currentLine=21168153;
 //BA.debugLineNum = 21168153;BA.debugLine="If MyIndex = LoopIndex Then";

case 41:
//if
this.state = 52;
if (_myindex==__ref._loopindex /*int*/ ) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=21168154;
 //BA.debugLineNum = 21168154;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 44:
//if
this.state = 51;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 46;
;}
else {
this.state = 48;
;}if (true) break;

case 46:
//C
this.state = 51;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 48:
//C
this.state = 51;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
RDebugUtils.currentLine=21168157;
 //BA.debugLineNum = 21168157;BA.debugLine="If mEnabled Then";

case 53:
//if
this.state = 58;
if (__ref._menabled /*boolean*/ ) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
RDebugUtils.currentLine=21168158;
 //BA.debugLineNum = 21168158;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 1)";
parent._xuiviewsutils._setalpha /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (1));
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=21168160;
 //BA.debugLineNum = 21168160;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 0.4)";
parent._xuiviewsutils._setalpha /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (0.4));
 if (true) break;

case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=21168163;
 //BA.debugLineNum = 21168163;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.SpotifyLinker.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="Public OnColor, OffColor As Int";
_oncolor = 0;
_offcolor = 0;
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=20840455;
 //BA.debugLineNum = 20840455;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20840456;
 //BA.debugLineNum = 20840456;BA.debugLine="Private mValue As Boolean";
_mvalue = false;
RDebugUtils.currentLine=20840457;
 //BA.debugLineNum = 20840457;BA.debugLine="Private transparent As BCBrush";
_transparent = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=20840458;
 //BA.debugLineNum = 20840458;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=20840459;
 //BA.debugLineNum = 20840459;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=20840460;
 //BA.debugLineNum = 20840460;BA.debugLine="Private OnBrush, OffBrush As BCBrush";
_onbrush = new b4a.example.bcpath._bcbrush();
_offbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=20840461;
 //BA.debugLineNum = 20840461;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=20840462;
 //BA.debugLineNum = 20840462;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=20840463;
 //BA.debugLineNum = 20840463;BA.debugLine="Private Size As Int";
_size = 0;
RDebugUtils.currentLine=20840464;
 //BA.debugLineNum = 20840464;BA.debugLine="Public mLabel As B4XView";
_mlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20840465;
 //BA.debugLineNum = 20840465;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20840466;
 //BA.debugLineNum = 20840466;BA.debugLine="Private Scale As Float 'ignore";
_scale = 0f;
RDebugUtils.currentLine=20840467;
 //BA.debugLineNum = 20840467;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.SpotifyLinker.b4xradiobutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="pnl.Color = xui.Color_Transparent";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="mBase.AddView(iv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=20971530;
 //BA.debugLineNum = 20971530;BA.debugLine="mLabel = Lbl";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=20971531;
 //BA.debugLineNum = 20971531;BA.debugLine="mLabel.SetTextAlignment(\"CENTER\", \"LEFT\")";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=20971532;
 //BA.debugLineNum = 20971532;BA.debugLine="mBase.AddView(mLabel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=20971533;
 //BA.debugLineNum = 20971533;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=20971535;
 //BA.debugLineNum = 20971535;BA.debugLine="OnColor = xui.PaintOrColorToColor(Props.Get(\"OnCo";
__ref._oncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OnColor")));
RDebugUtils.currentLine=20971536;
 //BA.debugLineNum = 20971536;BA.debugLine="OffColor = xui.PaintOrColorToColor(Props.Get(\"Off";
__ref._offcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OffColor")));
RDebugUtils.currentLine=20971537;
 //BA.debugLineNum = 20971537;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=20971539;
 //BA.debugLineNum = 20971539;BA.debugLine="mEnabled = mBase.Enabled";
__ref._menabled /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=20971540;
 //BA.debugLineNum = 20971540;BA.debugLine="mBase.Enabled = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=20971541;
 //BA.debugLineNum = 20971541;BA.debugLine="mValue = Props.Get(\"Value\")";
__ref._mvalue /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Value")));
RDebugUtils.currentLine=20971542;
 //BA.debugLineNum = 20971542;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=20971543;
 //BA.debugLineNum = 20971543;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.SpotifyLinker.b4xradiobutton __ref,float _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", new Object[] {_state}));}
float _r = 0f;
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Private Sub Draw (State As Float)";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparent /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="Dim r As Float = Floor(bc.mHeight / 2)";
_r = (float) (__c.Floor(__ref._bc /*b4a.example.bitmapcreator*/ ._mheight/(double)2));
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="If State < 1 Then bc.DrawCircle2(r, r, r, OffBrus";
if (_state<1) { 
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2(_r,_r,_r,__ref._offbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));};
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="If State > 0 Then bc.DrawCircle2(r, r, r * State,";
if (_state>0) { 
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2(_r,_r,(float) (_r*_state),__ref._onbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));};
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="End Sub";
return "";
}
public boolean  _getchecked(b4a.SpotifyLinker.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "getchecked", true))
	 {return ((Boolean) Debug.delegate(ba, "getchecked", null));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub getChecked As Boolean";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*boolean*/ ;
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="End Sub";
return false;
}
public boolean  _getenabled(b4a.SpotifyLinker.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="End Sub";
return false;
}
public Object  _gettext(b4a.SpotifyLinker.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((Object) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub getText As Object";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Return mLabel.Text";
if (true) return (Object)(__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.SpotifyLinker.b4xradiobutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="End Sub";
return "";
}
public String  _pnl_click(b4a.SpotifyLinker.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "pnl_click", true))
	 {return ((String) Debug.delegate(ba, "pnl_click", null));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Private Sub pnl_Click";
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="If mValue Then Return";
if (__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="If mEnabled Then";
if (__ref._menabled /*boolean*/ ) { 
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="SetValueImpl(Not(mValue), False)";
__ref._setvalueimpl /*void*/ (null,__c.Not(__ref._mvalue /*boolean*/ ),__c.False);
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="If mValue And xui.SubExists(mCallBack, mEventNam";
if (__ref._mvalue /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Checked",(int) (0))) { 
RDebugUtils.currentLine=21102599;
 //BA.debugLineNum = 21102599;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Checked");
 };
 };
RDebugUtils.currentLine=21102602;
 //BA.debugLineNum = 21102602;BA.debugLine="End Sub";
return "";
}
public String  _setchecked(b4a.SpotifyLinker.b4xradiobutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setchecked", true))
	 {return ((String) Debug.delegate(ba, "setchecked", new Object[] {_b}));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub setChecked(b As Boolean)";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="If b = mValue Then Return";
if (_b==__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="SetValueImpl(b, False)";
__ref._setvalueimpl /*void*/ (null,_b,__c.False);
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.SpotifyLinker.b4xradiobutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub setEnabled (b As Boolean)";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="mEnabled = b";
__ref._menabled /*boolean*/  = _b;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.SpotifyLinker.b4xradiobutton __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub setText (t As Object)";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(mLabel, t";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (ba,__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_t);
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="End Sub";
return "";
}
}