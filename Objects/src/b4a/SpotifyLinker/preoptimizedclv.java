package b4a.SpotifyLinker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class preoptimizedclv extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.SpotifyLinker.preoptimizedclv");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SpotifyLinker.preoptimizedclv.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _mclv = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.List _panelscache = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _stubpanel = null;
public boolean _horizontal = false;
public b4a.SpotifyLinker.b4xset[] _assigneditems = null;
public int _assigneditemsasindex = 0;
public anywheresoftware.b4j.object.JavaObject _jclv = null;
public int _extraitems = 0;
public anywheresoftware.b4a.objects.collections.List _listofitemsthatshouldbeupdated = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public boolean _showscrollbar = false;
public b4a.SpotifyLinker.b4xseekbar _b4xseekbar1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnloverlay = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblhint = null;
public int _lastuserchangeindex = 0;
public int _numberofsteps = 0;
public int _delaybeforehidingoverlay = 0;
public Object _mcallback = null;
public String _meventname = "";
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.main _main = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.config _config = null;
public b4a.SpotifyLinker.common _common = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public String  _additem(b4a.SpotifyLinker.preoptimizedclv __ref,int _size,int _clr,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_size,_clr,_value}));}
b4a.example3.customlistview._clvitem _newitem = null;
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Public Sub AddItem (Size As Int, Clr As Int, Value";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Dim NewItem As CLVItem";
_newitem = new b4a.example3.customlistview._clvitem();
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="NewItem.Color = Clr";
_newitem.Color = _clr;
RDebugUtils.currentLine=31784963;
 //BA.debugLineNum = 31784963;BA.debugLine="NewItem.Panel = StubPanel";
_newitem.Panel = __ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="NewItem.Value = Value";
_newitem.Value = _value;
RDebugUtils.currentLine=31784965;
 //BA.debugLineNum = 31784965;BA.debugLine="NewItem.Size = Size";
_newitem.Size = _size;
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="items.Add(NewItem)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newitem));
RDebugUtils.currentLine=31784967;
 //BA.debugLineNum = 31784967;BA.debugLine="End Sub";
return "";
}
public void  _b4xseekbar1_touchstatechanged(b4a.SpotifyLinker.preoptimizedclv __ref,boolean _pressed) throws Exception{
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "b4xseekbar1_touchstatechanged", true))
	 {Debug.delegate(ba, "b4xseekbar1_touchstatechanged", new Object[] {_pressed}); return;}
ResumableSub_B4XSeekBar1_TouchStateChanged rsub = new ResumableSub_B4XSeekBar1_TouchStateChanged(this,__ref,_pressed);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XSeekBar1_TouchStateChanged extends BA.ResumableSub {
public ResumableSub_B4XSeekBar1_TouchStateChanged(b4a.SpotifyLinker.preoptimizedclv parent,b4a.SpotifyLinker.preoptimizedclv __ref,boolean _pressed) {
this.parent = parent;
this.__ref = __ref;
this._pressed = _pressed;
this.__ref = parent;
}
b4a.SpotifyLinker.preoptimizedclv __ref;
b4a.SpotifyLinker.preoptimizedclv parent;
boolean _pressed;
anywheresoftware.b4j.object.JavaObject _jo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preoptimizedclv";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="If Pressed = False Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_pressed==parent.__c.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="mCLV.JumpToItem(LastUserChangeIndex)";
__ref._mclv /*b4a.example3.customlistview*/ ._jumptoitem(__ref._lastuserchangeindex /*int*/ );
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="Sleep(DelayBeforeHidingOverlay)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preoptimizedclv", "b4xseekbar1_touchstatechanged"),__ref._delaybeforehidingoverlay /*int*/ );
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=32374788;
 //BA.debugLineNum = 32374788;BA.debugLine="pnlOverlay.Visible = False";
__ref._pnloverlay /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=32374790;
 //BA.debugLineNum = 32374790;BA.debugLine="pnlOverlay.Visible = True";
__ref._pnloverlay /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=32374792;
 //BA.debugLineNum = 32374792;BA.debugLine="Dim jo As JavaObject = mCLV.sv";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mclv /*b4a.example3.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=32374793;
 //BA.debugLineNum = 32374793;BA.debugLine="jo.RunMethod(\"fling\", Array(0))";
_jo.RunMethod("fling",new Object[]{(Object)(0)});
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=32374796;
 //BA.debugLineNum = 32374796;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xseekbar1_valuechanged(b4a.SpotifyLinker.preoptimizedclv __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "b4xseekbar1_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "b4xseekbar1_valuechanged", new Object[] {_value}));}
Object _t = null;
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Sub B4XSeekBar1_ValueChanged (Value As Int)";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="LastUserChangeIndex = Max(0, items.Size - 1 - Val";
__ref._lastuserchangeindex /*int*/  = (int) (__c.Max(0,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1-_value));
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="If LastUserChangeIndex < B4XSeekBar1.Interval The";
if (__ref._lastuserchangeindex /*int*/ <__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._interval /*int*/ ) { 
__ref._lastuserchangeindex /*int*/  = (int) (0);};
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="lblHint.Text = \"\"";
__ref._lblhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="If xui.SubExists(mCallback, mEventName & \"_HintRe";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_HintRequested",(int) (1))) { 
RDebugUtils.currentLine=32440325;
 //BA.debugLineNum = 32440325;BA.debugLine="Dim t As Object = CallSub2(mCallback, mEventName";
_t = __c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_HintRequested",(Object)(__ref._lastuserchangeindex /*int*/ ));
RDebugUtils.currentLine=32440326;
 //BA.debugLineNum = 32440326;BA.debugLine="If t <> Null Then";
if (_t!= null) { 
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="InternalSetTextOrCSBuilderToLabel(lblHint, t)";
__ref._internalsettextorcsbuildertolabel /*String*/ (null,__ref._lblhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_t);
 };
 };
RDebugUtils.currentLine=32440330;
 //BA.debugLineNum = 32440330;BA.debugLine="End Sub";
return "";
}
public String  _internalsettextorcsbuildertolabel(b4a.SpotifyLinker.preoptimizedclv __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "internalsettextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "internalsettextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Private Sub InternalSetTextOrCSBuilderToLabel(xlbl";
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=32505868;
 //BA.debugLineNum = 32505868;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.SpotifyLinker.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="Private mCLV As CustomListView";
_mclv = new b4a.example3.customlistview();
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="Private PanelsCache As List";
_panelscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="Private StubPanel As B4XView";
_stubpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31653893;
 //BA.debugLineNum = 31653893;BA.debugLine="Private horizontal As Boolean";
_horizontal = false;
RDebugUtils.currentLine=31653894;
 //BA.debugLineNum = 31653894;BA.debugLine="Private AssignedItems() As B4XSet";
_assigneditems = new b4a.SpotifyLinker.b4xset[(int) (0)];
{
int d0 = _assigneditems.length;
for (int i0 = 0;i0 < d0;i0++) {
_assigneditems[i0] = new b4a.SpotifyLinker.b4xset();
}
}
;
RDebugUtils.currentLine=31653895;
 //BA.debugLineNum = 31653895;BA.debugLine="Private AssignedItemsAsIndex As Int";
_assigneditemsasindex = 0;
RDebugUtils.currentLine=31653899;
 //BA.debugLineNum = 31653899;BA.debugLine="Private jclv As JavaObject";
_jclv = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=31653901;
 //BA.debugLineNum = 31653901;BA.debugLine="Public ExtraItems As Int = 3";
_extraitems = (int) (3);
RDebugUtils.currentLine=31653902;
 //BA.debugLineNum = 31653902;BA.debugLine="Private ListOfItemsThatShouldBeUpdated As List";
_listofitemsthatshouldbeupdated = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31653903;
 //BA.debugLineNum = 31653903;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=31653904;
 //BA.debugLineNum = 31653904;BA.debugLine="Public ShowScrollBar As Boolean = True";
_showscrollbar = __c.True;
RDebugUtils.currentLine=31653905;
 //BA.debugLineNum = 31653905;BA.debugLine="Public B4XSeekBar1 As B4XSeekBar";
_b4xseekbar1 = new b4a.SpotifyLinker.b4xseekbar();
RDebugUtils.currentLine=31653906;
 //BA.debugLineNum = 31653906;BA.debugLine="Public pnlOverlay As B4XView";
_pnloverlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31653907;
 //BA.debugLineNum = 31653907;BA.debugLine="Public lblHint As B4XView";
_lblhint = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31653908;
 //BA.debugLineNum = 31653908;BA.debugLine="Private LastUserChangeIndex As Int";
_lastuserchangeindex = 0;
RDebugUtils.currentLine=31653909;
 //BA.debugLineNum = 31653909;BA.debugLine="Public NumberOfSteps As Int = 20";
_numberofsteps = (int) (20);
RDebugUtils.currentLine=31653910;
 //BA.debugLineNum = 31653910;BA.debugLine="Public DelayBeforeHidingOverlay As Int = 50";
_delaybeforehidingoverlay = (int) (50);
RDebugUtils.currentLine=31653911;
 //BA.debugLineNum = 31653911;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=31653912;
 //BA.debugLineNum = 31653912;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=31653913;
 //BA.debugLineNum = 31653913;BA.debugLine="End Sub";
return "";
}
public String  _clearassigneditems(b4a.SpotifyLinker.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "clearassigneditems", true))
	 {return ((String) Debug.delegate(ba, "clearassigneditems", null));}
b4a.SpotifyLinker.b4xset _s = null;
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Private Sub ClearAssignedItems";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="For Each s As B4XSet In AssignedItems";
{
final b4a.SpotifyLinker.b4xset[] group1 = __ref._assigneditems /*b4a.SpotifyLinker.b4xset[]*/ ;
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = group1[index1];
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="s.Clear";
_s._clear /*String*/ (null);
 }
};
RDebugUtils.currentLine=32243716;
 //BA.debugLineNum = 32243716;BA.debugLine="End Sub";
return "";
}
public String  _commit(b4a.SpotifyLinker.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "commit", true))
	 {return ((String) Debug.delegate(ba, "commit", null));}
int _dividersize = 0;
int _totalsize = 0;
int _i = 0;
b4a.example3.customlistview._clvitem _it = null;
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Public Sub Commit";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="ClearAssignedItems";
__ref._clearassigneditems /*String*/ (null);
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="Dim DividerSize As Int = mCLV.DividerSize";
_dividersize = (int) (__ref._mclv /*b4a.example3.customlistview*/ ._getdividersize());
RDebugUtils.currentLine=31850499;
 //BA.debugLineNum = 31850499;BA.debugLine="Dim TotalSize As Int = DividerSize";
_totalsize = _dividersize;
RDebugUtils.currentLine=31850500;
 //BA.debugLineNum = 31850500;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=31850501;
 //BA.debugLineNum = 31850501;BA.debugLine="Dim it As CLVItem = items.Get(i)";
_it = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=31850502;
 //BA.debugLineNum = 31850502;BA.debugLine="it.Offset = TotalSize";
_it.Offset = _totalsize;
RDebugUtils.currentLine=31850503;
 //BA.debugLineNum = 31850503;BA.debugLine="TotalSize = TotalSize + it.Size + DividerSize";
_totalsize = (int) (_totalsize+_it.Size+_dividersize);
 }
};
RDebugUtils.currentLine=31850505;
 //BA.debugLineNum = 31850505;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=31850506;
 //BA.debugLineNum = 31850506;BA.debugLine="mCLV.sv.ScrollViewContentWidth = TotalSize";
__ref._mclv /*b4a.example3.customlistview*/ ._sv.setScrollViewContentWidth(_totalsize);
 }else {
RDebugUtils.currentLine=31850508;
 //BA.debugLineNum = 31850508;BA.debugLine="mCLV.sv.ScrollViewContentHeight = TotalSize";
__ref._mclv /*b4a.example3.customlistview*/ ._sv.setScrollViewContentHeight(_totalsize);
 };
RDebugUtils.currentLine=31850510;
 //BA.debugLineNum = 31850510;BA.debugLine="B4XSeekBar1.mBase.Visible = ShowScrollBar";
__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._showscrollbar /*boolean*/ );
RDebugUtils.currentLine=31850511;
 //BA.debugLineNum = 31850511;BA.debugLine="If ShowScrollBar Then";
if (__ref._showscrollbar /*boolean*/ ) { 
RDebugUtils.currentLine=31850512;
 //BA.debugLineNum = 31850512;BA.debugLine="B4XSeekBar1.MaxValue = items.Size";
__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._maxvalue /*int*/  = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=31850513;
 //BA.debugLineNum = 31850513;BA.debugLine="B4XSeekBar1.Interval = items.Size / NumberOfStep";
__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._interval /*int*/  = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()/(double)__ref._numberofsteps /*int*/ );
 };
RDebugUtils.currentLine=31850515;
 //BA.debugLineNum = 31850515;BA.debugLine="RaiseVisibleRangeEvent";
__ref._raisevisiblerangeevent /*String*/ (null);
RDebugUtils.currentLine=31850517;
 //BA.debugLineNum = 31850517;BA.debugLine="End Sub";
return "";
}
public String  _raisevisiblerangeevent(b4a.SpotifyLinker.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "raisevisiblerangeevent", true))
	 {return ((String) Debug.delegate(ba, "raisevisiblerangeevent", null));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Private Sub RaiseVisibleRangeEvent";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="jclv.RunMethod(\"_resetvisibles\", Null)";
__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("_resetvisibles",(Object[])(__c.Null));
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="jclv.RunMethod(\"_updatevisiblerange\", Null)";
__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("_updatevisiblerange",(Object[])(__c.Null));
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createpanel(b4a.SpotifyLinker.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "createpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createpanel", null));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Private Sub CreatePanel As B4XView";
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="Return jclv.RunMethodJO(\"_createpanel\", Array(\"Pa";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("_createpanel",new Object[]{(Object)("Panel")}).RunMethod("getObject",(Object[])(__c.Null))));
RDebugUtils.currentLine=31981574;
 //BA.debugLineNum = 31981574;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.SpotifyLinker.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Private Sub GetPanel As B4XView";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="If PanelsCache.Size = 0 Then Return CreatePanel";
if (__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);};
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="Dim p As B4XView = PanelsCache.Get(PanelsCache.Si";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=32178179;
 //BA.debugLineNum = 32178179;BA.debugLine="PanelsCache.RemoveAt(PanelsCache.Size - 1)";
__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=32178180;
 //BA.debugLineNum = 32178180;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=32178181;
 //BA.debugLineNum = 32178181;BA.debugLine="End Sub";
return null;
}
public String  _handlescrollbar(b4a.SpotifyLinker.preoptimizedclv __ref,int _firstvisible) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "handlescrollbar", true))
	 {return ((String) Debug.delegate(ba, "handlescrollbar", new Object[] {_firstvisible}));}
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Private Sub HandleScrollBar (FirstVisible As Int)";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="If ShowScrollBar = False Then Return";
if (__ref._showscrollbar /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="B4XSeekBar1.Value = items.Size - FirstVisible";
__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._setvalue /*int*/ (null,(int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-_firstvisible));
RDebugUtils.currentLine=32112643;
 //BA.debugLineNum = 32112643;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.SpotifyLinker.preoptimizedclv __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,b4a.example3.customlistview _clv) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_clv}));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="mCLV = CLV";
__ref._mclv /*b4a.example3.customlistview*/  = _clv;
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="jclv = mCLV 'ignore";
__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mclv /*b4a.example3.customlistview*/ ));
RDebugUtils.currentLine=31719430;
 //BA.debugLineNum = 31719430;BA.debugLine="items = jclv.GetFieldJO(\"_items\").RunMethod(\"getO";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .GetFieldJO("_items").RunMethod("getObject",(Object[])(__c.Null))));
RDebugUtils.currentLine=31719432;
 //BA.debugLineNum = 31719432;BA.debugLine="horizontal = jclv.GetField(\"_horizontal\")";
__ref._horizontal /*boolean*/  = BA.ObjectToBoolean(__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .GetField("_horizontal"));
RDebugUtils.currentLine=31719433;
 //BA.debugLineNum = 31719433;BA.debugLine="PanelsCache.Initialize";
__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=31719434;
 //BA.debugLineNum = 31719434;BA.debugLine="StubPanel = CreatePanel";
__ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=31719435;
 //BA.debugLineNum = 31719435;BA.debugLine="StubPanel.AddView(xui.CreatePanel(\"\"), 0, 0, 10di";
__ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=31719436;
 //BA.debugLineNum = 31719436;BA.debugLine="AssignedItems = Array As B4XSet(B4XCollections.Cr";
__ref._assigneditems /*b4a.SpotifyLinker.b4xset[]*/  = new b4a.SpotifyLinker.b4xset[]{_b4xcollections._createset /*b4a.SpotifyLinker.b4xset*/ (ba),_b4xcollections._createset /*b4a.SpotifyLinker.b4xset*/ (ba)};
RDebugUtils.currentLine=31719437;
 //BA.debugLineNum = 31719437;BA.debugLine="ListOfItemsThatShouldBeUpdated.Initialize";
__ref._listofitemsthatshouldbeupdated /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=31719438;
 //BA.debugLineNum = 31719438;BA.debugLine="mCLV.AsView.LoadLayout(\"PCLVSeekBar\")";
__ref._mclv /*b4a.example3.customlistview*/ ._asview().LoadLayout("PCLVSeekBar",ba);
RDebugUtils.currentLine=31719439;
 //BA.debugLineNum = 31719439;BA.debugLine="B4XSeekBar1.Size1 = 1dip";
__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._size1 /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=31719440;
 //BA.debugLineNum = 31719440;BA.debugLine="B4XSeekBar1.Size2 = 1dip";
__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._size2 /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=31719441;
 //BA.debugLineNum = 31719441;BA.debugLine="B4XSeekBar1.Radius1 = 8dip";
__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._radius1 /*int*/  = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=31719442;
 //BA.debugLineNum = 31719442;BA.debugLine="B4XSeekBar1.Update";
__ref._b4xseekbar1 /*b4a.SpotifyLinker.b4xseekbar*/ ._update /*String*/ (null);
RDebugUtils.currentLine=31719443;
 //BA.debugLineNum = 31719443;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=31719444;
 //BA.debugLineNum = 31719444;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=31719445;
 //BA.debugLineNum = 31719445;BA.debugLine="End Sub";
return "";
}
public void  _listchangedexternally(b4a.SpotifyLinker.preoptimizedclv __ref) throws Exception{
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "listchangedexternally", true))
	 {Debug.delegate(ba, "listchangedexternally", null); return;}
ResumableSub_ListChangedExternally rsub = new ResumableSub_ListChangedExternally(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ListChangedExternally extends BA.ResumableSub {
public ResumableSub_ListChangedExternally(b4a.SpotifyLinker.preoptimizedclv parent,b4a.SpotifyLinker.preoptimizedclv __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.SpotifyLinker.preoptimizedclv __ref;
b4a.SpotifyLinker.preoptimizedclv parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preoptimizedclv";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="ClearAssignedItems";
__ref._clearassigneditems /*String*/ (null);
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preoptimizedclv", "listchangedexternally"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="RaiseVisibleRangeEvent";
__ref._raisevisiblerangeevent /*String*/ (null);
RDebugUtils.currentLine=32309252;
 //BA.debugLineNum = 32309252;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.List  _visiblerangechanged(b4a.SpotifyLinker.preoptimizedclv __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "visiblerangechanged", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _fromindex = 0;
int _toindex = 0;
b4a.SpotifyLinker.b4xset _prevset = null;
b4a.SpotifyLinker.b4xset _nextset = null;
int _i = 0;
b4a.example3.customlistview._clvitem _it = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Public Sub VisibleRangeChanged (FirstIndex As Int,";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="Dim FromIndex As Int = Max(0, FirstIndex - ExtraI";
_fromindex = (int) (__c.Max(0,_firstindex-__ref._extraitems /*int*/ ));
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="Dim ToIndex As Int = Min(mCLV.Size - 1, LastIndex";
_toindex = (int) (__c.Min(__ref._mclv /*b4a.example3.customlistview*/ ._getsize()-1,_lastindex+__ref._extraitems /*int*/ ));
RDebugUtils.currentLine=32047107;
 //BA.debugLineNum = 32047107;BA.debugLine="Dim PrevSet As B4XSet = AssignedItems(AssignedIte";
_prevset = __ref._assigneditems /*b4a.SpotifyLinker.b4xset[]*/ [__ref._assigneditemsasindex /*int*/ ];
RDebugUtils.currentLine=32047108;
 //BA.debugLineNum = 32047108;BA.debugLine="AssignedItemsAsIndex = (AssignedItemsAsIndex + 1)";
__ref._assigneditemsasindex /*int*/  = (int) ((__ref._assigneditemsasindex /*int*/ +1)%2);
RDebugUtils.currentLine=32047109;
 //BA.debugLineNum = 32047109;BA.debugLine="Dim NextSet As B4XSet = AssignedItems(AssignedIte";
_nextset = __ref._assigneditems /*b4a.SpotifyLinker.b4xset[]*/ [__ref._assigneditemsasindex /*int*/ ];
RDebugUtils.currentLine=32047110;
 //BA.debugLineNum = 32047110;BA.debugLine="NextSet.Clear";
_nextset._clear /*String*/ (null);
RDebugUtils.currentLine=32047111;
 //BA.debugLineNum = 32047111;BA.debugLine="ListOfItemsThatShouldBeUpdated.Initialize";
__ref._listofitemsthatshouldbeupdated /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=32047112;
 //BA.debugLineNum = 32047112;BA.debugLine="For i = FromIndex To ToIndex";
{
final int step8 = 1;
final int limit8 = _toindex;
_i = _fromindex ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=32047113;
 //BA.debugLineNum = 32047113;BA.debugLine="Dim it As CLVItem = items.Get(i)";
_it = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=32047114;
 //BA.debugLineNum = 32047114;BA.debugLine="If it.Panel = StubPanel Then";
if ((_it.Panel).equals(__ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ )) { 
RDebugUtils.currentLine=32047115;
 //BA.debugLineNum = 32047115;BA.debugLine="it.Panel = GetPanel";
_it.Panel = __ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=32047116;
 //BA.debugLineNum = 32047116;BA.debugLine="it.Panel.Tag = i";
_it.Panel.setTag((Object)(_i));
RDebugUtils.currentLine=32047117;
 //BA.debugLineNum = 32047117;BA.debugLine="it.Panel.Color = it.Color";
_it.Panel.setColor(_it.Color);
RDebugUtils.currentLine=32047118;
 //BA.debugLineNum = 32047118;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=32047119;
 //BA.debugLineNum = 32047119;BA.debugLine="mCLV.sv.ScrollViewInnerPanel.AddView(it.Panel,";
__ref._mclv /*b4a.example3.customlistview*/ ._sv.getScrollViewInnerPanel().AddView((android.view.View)(_it.Panel.getObject()),_it.Offset,(int) (0),_it.Size,__ref._mclv /*b4a.example3.customlistview*/ ._sv.getHeight());
 }else {
RDebugUtils.currentLine=32047121;
 //BA.debugLineNum = 32047121;BA.debugLine="mCLV.sv.ScrollViewInnerPanel.AddView(it.Panel,";
__ref._mclv /*b4a.example3.customlistview*/ ._sv.getScrollViewInnerPanel().AddView((android.view.View)(_it.Panel.getObject()),(int) (0),_it.Offset,__ref._mclv /*b4a.example3.customlistview*/ ._sv.getWidth(),_it.Size);
 };
RDebugUtils.currentLine=32047123;
 //BA.debugLineNum = 32047123;BA.debugLine="NextSet.Add(it.Panel)";
_nextset._add /*String*/ (null,(Object)(_it.Panel.getObject()));
RDebugUtils.currentLine=32047124;
 //BA.debugLineNum = 32047124;BA.debugLine="ListOfItemsThatShouldBeUpdated.Add(i)";
__ref._listofitemsthatshouldbeupdated /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i));
 }else 
{RDebugUtils.currentLine=32047125;
 //BA.debugLineNum = 32047125;BA.debugLine="Else if PrevSet.Contains(it.Panel) Then";
if (_prevset._contains /*boolean*/ (null,(Object)(_it.Panel.getObject()))) { 
RDebugUtils.currentLine=32047126;
 //BA.debugLineNum = 32047126;BA.debugLine="NextSet.Add(it.Panel)";
_nextset._add /*String*/ (null,(Object)(_it.Panel.getObject()));
 }}
;
 }
};
RDebugUtils.currentLine=32047129;
 //BA.debugLineNum = 32047129;BA.debugLine="For Each pnl As B4XView In PrevSet.AsList";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group25 = _prevset._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group25.Get(index25)));
RDebugUtils.currentLine=32047130;
 //BA.debugLineNum = 32047130;BA.debugLine="If NextSet.Contains(pnl) = False Then";
if (_nextset._contains /*boolean*/ (null,(Object)(_pnl.getObject()))==__c.False) { 
RDebugUtils.currentLine=32047131;
 //BA.debugLineNum = 32047131;BA.debugLine="If pnl.Parent.IsInitialized Then";
if (_pnl.getParent().IsInitialized()) { 
RDebugUtils.currentLine=32047132;
 //BA.debugLineNum = 32047132;BA.debugLine="pnl.RemoveViewFromParent";
_pnl.RemoveViewFromParent();
RDebugUtils.currentLine=32047133;
 //BA.debugLineNum = 32047133;BA.debugLine="pnl.GetView(0).RemoveAllViews";
_pnl.GetView((int) (0)).RemoveAllViews();
RDebugUtils.currentLine=32047134;
 //BA.debugLineNum = 32047134;BA.debugLine="pnl.RemoveAllViews";
_pnl.RemoveAllViews();
RDebugUtils.currentLine=32047135;
 //BA.debugLineNum = 32047135;BA.debugLine="PanelsCache.Add(pnl)";
__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pnl.getObject()));
RDebugUtils.currentLine=32047136;
 //BA.debugLineNum = 32047136;BA.debugLine="Dim it As CLVItem = items.Get(pnl.Tag)";
_it = (b4a.example3.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get((int)(BA.ObjectToNumber(_pnl.getTag()))));
RDebugUtils.currentLine=32047137;
 //BA.debugLineNum = 32047137;BA.debugLine="it.Panel = StubPanel";
_it.Panel = __ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 };
 };
 }
};
RDebugUtils.currentLine=32047141;
 //BA.debugLineNum = 32047141;BA.debugLine="HandleScrollBar (FirstIndex)";
__ref._handlescrollbar /*String*/ (null,_firstindex);
RDebugUtils.currentLine=32047142;
 //BA.debugLineNum = 32047142;BA.debugLine="Return ListOfItemsThatShouldBeUpdated";
if (true) return __ref._listofitemsthatshouldbeupdated /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=32047143;
 //BA.debugLineNum = 32047143;BA.debugLine="End Sub";
return null;
}
}