package b4a.SpotifyLinker;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class preoptimizedclv_subs_0 {


public static RemoteObject  _additem(RemoteObject __ref,RemoteObject _size,RemoteObject _clr,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddItem (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("additem")) { return __ref.runUserSub(false, "preoptimizedclv","additem", __ref, _size, _clr, _value);}
RemoteObject _newitem = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
Debug.locals.put("Size", _size);
Debug.locals.put("Clr", _clr);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 53;BA.debugLine="Public Sub AddItem (Size As Int, Clr As Int, Value";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Dim NewItem As CLVItem";
Debug.JustUpdateDeviceLine();
_newitem = RemoteObject.createNew ("b4a.example3.customlistview._clvitem");Debug.locals.put("NewItem", _newitem);
 BA.debugLineNum = 55;BA.debugLine="NewItem.Color = Clr";
Debug.JustUpdateDeviceLine();
_newitem.setField ("Color",_clr);
 BA.debugLineNum = 56;BA.debugLine="NewItem.Panel = StubPanel";
Debug.JustUpdateDeviceLine();
_newitem.setField ("Panel",__ref.getField(false,"_stubpanel" /*RemoteObject*/ ));
 BA.debugLineNum = 57;BA.debugLine="NewItem.Value = Value";
Debug.JustUpdateDeviceLine();
_newitem.setField ("Value",_value);
 BA.debugLineNum = 58;BA.debugLine="NewItem.Size = Size";
Debug.JustUpdateDeviceLine();
_newitem.setField ("Size",_size);
 BA.debugLineNum = 59;BA.debugLine="items.Add(NewItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_newitem)));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _b4xseekbar1_touchstatechanged(RemoteObject __ref,RemoteObject _pressed) throws Exception{
try {
		Debug.PushSubsStack("B4XSeekBar1_TouchStateChanged (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("b4xseekbar1_touchstatechanged")) { __ref.runUserSub(false, "preoptimizedclv","b4xseekbar1_touchstatechanged", __ref, _pressed); return;}
ResumableSub_B4XSeekBar1_TouchStateChanged rsub = new ResumableSub_B4XSeekBar1_TouchStateChanged(null,__ref,_pressed);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XSeekBar1_TouchStateChanged extends BA.ResumableSub {
public ResumableSub_B4XSeekBar1_TouchStateChanged(b4a.SpotifyLinker.preoptimizedclv parent,RemoteObject __ref,RemoteObject _pressed) {
this.parent = parent;
this.__ref = __ref;
this._pressed = _pressed;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.SpotifyLinker.preoptimizedclv parent;
RemoteObject _pressed;
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XSeekBar1_TouchStateChanged (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,163);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Pressed", _pressed);
 BA.debugLineNum = 164;BA.debugLine="If Pressed = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_pressed,parent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 165;BA.debugLine="mCLV.JumpToItem(LastUserChangeIndex)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(__ref.getField(true,"_lastuserchangeindex" /*RemoteObject*/ )));
 BA.debugLineNum = 166;BA.debugLine="Sleep(DelayBeforeHidingOverlay)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "preoptimizedclv", "b4xseekbar1_touchstatechanged"),__ref.getField(true,"_delaybeforehidingoverlay" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 167;BA.debugLine="pnlOverlay.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnloverlay" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 169;BA.debugLine="pnlOverlay.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnloverlay" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 171;BA.debugLine="Dim jo As JavaObject = mCLV.sv";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 172;BA.debugLine="jo.RunMethod(\"fling\", Array(0))";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("fling")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0))})));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _b4xseekbar1_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("B4XSeekBar1_ValueChanged (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("b4xseekbar1_valuechanged")) { return __ref.runUserSub(false, "preoptimizedclv","b4xseekbar1_valuechanged", __ref, _value);}
RemoteObject _t = RemoteObject.declareNull("Object");
Debug.locals.put("Value", _value);
 BA.debugLineNum = 177;BA.debugLine="Sub B4XSeekBar1_ValueChanged (Value As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 178;BA.debugLine="LastUserChangeIndex = Max(0, items.Size - 1 - Val";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastuserchangeindex" /*RemoteObject*/ ,BA.numberCast(int.class, preoptimizedclv.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1),_value}, "--",2, 1))))));
 BA.debugLineNum = 179;BA.debugLine="If LastUserChangeIndex < B4XSeekBar1.Interval The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_lastuserchangeindex" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).getField(true,"_interval" /*RemoteObject*/ )))) { 
__ref.setField ("_lastuserchangeindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));};
 BA.debugLineNum = 180;BA.debugLine="lblHint.Text = \"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblhint" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 181;BA.debugLine="If xui.SubExists(mCallback, mEventName & \"_HintRe";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_HintRequested"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 182;BA.debugLine="Dim t As Object = CallSub2(mCallback, mEventName";
Debug.JustUpdateDeviceLine();
_t = preoptimizedclv.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_HintRequested"))),(Object)((__ref.getField(true,"_lastuserchangeindex" /*RemoteObject*/ ))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 183;BA.debugLine="If t <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_t)) { 
 BA.debugLineNum = 184;BA.debugLine="InternalSetTextOrCSBuilderToLabel(lblHint, t)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_internalsettextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lblhint" /*RemoteObject*/ )),(Object)(_t));
 };
 };
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mCLV As CustomListView";
preoptimizedclv._mclv = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_mclv",preoptimizedclv._mclv);
 //BA.debugLineNum = 5;BA.debugLine="Private items As List";
preoptimizedclv._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_items",preoptimizedclv._items);
 //BA.debugLineNum = 6;BA.debugLine="Private PanelsCache As List";
preoptimizedclv._panelscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_panelscache",preoptimizedclv._panelscache);
 //BA.debugLineNum = 7;BA.debugLine="Private StubPanel As B4XView";
preoptimizedclv._stubpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_stubpanel",preoptimizedclv._stubpanel);
 //BA.debugLineNum = 8;BA.debugLine="Private horizontal As Boolean";
preoptimizedclv._horizontal = RemoteObject.createImmutable(false);__ref.setField("_horizontal",preoptimizedclv._horizontal);
 //BA.debugLineNum = 9;BA.debugLine="Private AssignedItems() As B4XSet";
preoptimizedclv._assigneditems = RemoteObject.createNewArray ("b4a.SpotifyLinker.b4xset", new int[] {0}, new Object[]{});__ref.setField("_assigneditems",preoptimizedclv._assigneditems);
 //BA.debugLineNum = 10;BA.debugLine="Private AssignedItemsAsIndex As Int";
preoptimizedclv._assigneditemsasindex = RemoteObject.createImmutable(0);__ref.setField("_assigneditemsasindex",preoptimizedclv._assigneditemsasindex);
 //BA.debugLineNum = 14;BA.debugLine="Private jclv As JavaObject";
preoptimizedclv._jclv = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jclv",preoptimizedclv._jclv);
 //BA.debugLineNum = 16;BA.debugLine="Public ExtraItems As Int = 3";
preoptimizedclv._extraitems = BA.numberCast(int.class, 3);__ref.setField("_extraitems",preoptimizedclv._extraitems);
 //BA.debugLineNum = 17;BA.debugLine="Private ListOfItemsThatShouldBeUpdated As List";
preoptimizedclv._listofitemsthatshouldbeupdated = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listofitemsthatshouldbeupdated",preoptimizedclv._listofitemsthatshouldbeupdated);
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
preoptimizedclv._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",preoptimizedclv._xui);
 //BA.debugLineNum = 19;BA.debugLine="Public ShowScrollBar As Boolean = True";
preoptimizedclv._showscrollbar = preoptimizedclv.__c.getField(true,"True");__ref.setField("_showscrollbar",preoptimizedclv._showscrollbar);
 //BA.debugLineNum = 20;BA.debugLine="Public B4XSeekBar1 As B4XSeekBar";
preoptimizedclv._b4xseekbar1 = RemoteObject.createNew ("b4a.SpotifyLinker.b4xseekbar");__ref.setField("_b4xseekbar1",preoptimizedclv._b4xseekbar1);
 //BA.debugLineNum = 21;BA.debugLine="Public pnlOverlay As B4XView";
preoptimizedclv._pnloverlay = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnloverlay",preoptimizedclv._pnloverlay);
 //BA.debugLineNum = 22;BA.debugLine="Public lblHint As B4XView";
preoptimizedclv._lblhint = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblhint",preoptimizedclv._lblhint);
 //BA.debugLineNum = 23;BA.debugLine="Private LastUserChangeIndex As Int";
preoptimizedclv._lastuserchangeindex = RemoteObject.createImmutable(0);__ref.setField("_lastuserchangeindex",preoptimizedclv._lastuserchangeindex);
 //BA.debugLineNum = 24;BA.debugLine="Public NumberOfSteps As Int = 20";
preoptimizedclv._numberofsteps = BA.numberCast(int.class, 20);__ref.setField("_numberofsteps",preoptimizedclv._numberofsteps);
 //BA.debugLineNum = 25;BA.debugLine="Public DelayBeforeHidingOverlay As Int = 50";
preoptimizedclv._delaybeforehidingoverlay = BA.numberCast(int.class, 50);__ref.setField("_delaybeforehidingoverlay",preoptimizedclv._delaybeforehidingoverlay);
 //BA.debugLineNum = 26;BA.debugLine="Private mCallback As Object";
preoptimizedclv._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",preoptimizedclv._mcallback);
 //BA.debugLineNum = 27;BA.debugLine="Private mEventName As String";
preoptimizedclv._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",preoptimizedclv._meventname);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearassigneditems(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearAssignedItems (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("clearassigneditems")) { return __ref.runUserSub(false, "preoptimizedclv","clearassigneditems", __ref);}
RemoteObject _s = RemoteObject.declareNull("b4a.SpotifyLinker.b4xset");
 BA.debugLineNum = 151;BA.debugLine="Private Sub ClearAssignedItems";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="For Each s As B4XSet In AssignedItems";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_assigneditems" /*RemoteObject*/ );
final int groupLen1 = group1.getField(true,"length").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = group1.getArrayElement(false, /*RemoteObject*/ RemoteObject.createImmutable(index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 153;BA.debugLine="s.Clear";
Debug.JustUpdateDeviceLine();
_s.runClassMethod (b4a.SpotifyLinker.b4xset.class, "_clear" /*RemoteObject*/ );
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _commit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Commit (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("commit")) { return __ref.runUserSub(false, "preoptimizedclv","commit", __ref);}
RemoteObject _dividersize = RemoteObject.createImmutable(0);
RemoteObject _totalsize = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _it = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
 BA.debugLineNum = 62;BA.debugLine="Public Sub Commit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="ClearAssignedItems";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_clearassigneditems" /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="Dim DividerSize As Int = mCLV.DividerSize";
Debug.JustUpdateDeviceLine();
_dividersize = BA.numberCast(int.class, __ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getdividersize"));Debug.locals.put("DividerSize", _dividersize);Debug.locals.put("DividerSize", _dividersize);
 BA.debugLineNum = 65;BA.debugLine="Dim TotalSize As Int = DividerSize";
Debug.JustUpdateDeviceLine();
_totalsize = _dividersize;Debug.locals.put("TotalSize", _totalsize);Debug.locals.put("TotalSize", _totalsize);
 BA.debugLineNum = 66;BA.debugLine="For i = 0 To items.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="Dim it As CLVItem = items.Get(i)";
Debug.JustUpdateDeviceLine();
_it = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("it", _it);Debug.locals.put("it", _it);
 BA.debugLineNum = 68;BA.debugLine="it.Offset = TotalSize";
Debug.JustUpdateDeviceLine();
_it.setField ("Offset",_totalsize);
 BA.debugLineNum = 69;BA.debugLine="TotalSize = TotalSize + it.Size + DividerSize";
Debug.JustUpdateDeviceLine();
_totalsize = RemoteObject.solve(new RemoteObject[] {_totalsize,_it.getField(true,"Size"),_dividersize}, "++",2, 1);Debug.locals.put("TotalSize", _totalsize);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 71;BA.debugLine="If horizontal Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="mCLV.sv.ScrollViewContentWidth = TotalSize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setScrollViewContentWidth",_totalsize);
 }else {
 BA.debugLineNum = 74;BA.debugLine="mCLV.sv.ScrollViewContentHeight = TotalSize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setScrollViewContentHeight",_totalsize);
 };
 BA.debugLineNum = 76;BA.debugLine="B4XSeekBar1.mBase.Visible = ShowScrollBar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",__ref.getField(true,"_showscrollbar" /*RemoteObject*/ ));
 BA.debugLineNum = 77;BA.debugLine="If ShowScrollBar Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_showscrollbar" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 78;BA.debugLine="B4XSeekBar1.MaxValue = items.Size";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).setField ("_maxvalue" /*RemoteObject*/ ,__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"));
 BA.debugLineNum = 79;BA.debugLine="B4XSeekBar1.Interval = items.Size / NumberOfStep";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).setField ("_interval" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),__ref.getField(true,"_numberofsteps" /*RemoteObject*/ )}, "/",0, 0)));
 };
 BA.debugLineNum = 81;BA.debugLine="RaiseVisibleRangeEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_raisevisiblerangeevent" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreatePanel (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("createpanel")) { return __ref.runUserSub(false, "preoptimizedclv","createpanel", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Private Sub CreatePanel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Return jclv.RunMethodJO(\"_createpanel\", Array(\"Pa";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_jclv" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("_createpanel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Panel"))}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getObject")),(Object)((preoptimizedclv.__c.getField(false,"Null")))));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "preoptimizedclv","getpanel", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 144;BA.debugLine="Private Sub GetPanel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="If PanelsCache.Size = 0 Then Return CreatePanel";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_panelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return __ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_createpanel" /*RemoteObject*/ );};
 BA.debugLineNum = 146;BA.debugLine="Dim p As B4XView = PanelsCache.Get(PanelsCache.Si";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_panelscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_panelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("p", _p);
 BA.debugLineNum = 147;BA.debugLine="PanelsCache.RemoveAt(PanelsCache.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_panelscache" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_panelscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 148;BA.debugLine="Return p";
Debug.JustUpdateDeviceLine();
if (true) return _p;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handlescrollbar(RemoteObject __ref,RemoteObject _firstvisible) throws Exception{
try {
		Debug.PushSubsStack("HandleScrollBar (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("handlescrollbar")) { return __ref.runUserSub(false, "preoptimizedclv","handlescrollbar", __ref, _firstvisible);}
Debug.locals.put("FirstVisible", _firstvisible);
 BA.debugLineNum = 139;BA.debugLine="Private Sub HandleScrollBar (FirstVisible As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="If ShowScrollBar = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_showscrollbar" /*RemoteObject*/ ),preoptimizedclv.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 141;BA.debugLine="B4XSeekBar1.Value = items.Size - FirstVisible";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).runClassMethod (b4a.SpotifyLinker.b4xseekbar.class, "_setvalue" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),_firstvisible}, "-",1, 1));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _clv) throws Exception{
try {
		Debug.PushSubsStack("Initialize (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "preoptimizedclv","initialize", __ref, _ba, _callback, _eventname, _clv);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("CLV", _clv);
 BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="mCLV = CLV";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mclv" /*RemoteObject*/ ,_clv);
 BA.debugLineNum = 32;BA.debugLine="jclv = mCLV 'ignore";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jclv" /*RemoteObject*/ ).setObject (__ref.getField(false,"_mclv" /*RemoteObject*/ ));
 BA.debugLineNum = 36;BA.debugLine="items = jclv.GetFieldJO(\"_items\").RunMethod(\"getO";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).setObject (__ref.getField(false,"_jclv" /*RemoteObject*/ ).runMethod(false,"GetFieldJO",(Object)(RemoteObject.createImmutable("_items"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getObject")),(Object)((preoptimizedclv.__c.getField(false,"Null")))));
 BA.debugLineNum = 38;BA.debugLine="horizontal = jclv.GetField(\"_horizontal\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_horizontal" /*RemoteObject*/ ,BA.ObjectToBoolean(__ref.getField(false,"_jclv" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("_horizontal")))));
 BA.debugLineNum = 39;BA.debugLine="PanelsCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_panelscache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="StubPanel = CreatePanel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_stubpanel" /*RemoteObject*/ ,__ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_createpanel" /*RemoteObject*/ ));
 BA.debugLineNum = 41;BA.debugLine="StubPanel.AddView(xui.CreatePanel(\"\"), 0, 0, 10di";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stubpanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(preoptimizedclv.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(preoptimizedclv.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 42;BA.debugLine="AssignedItems = Array As B4XSet(B4XCollections.Cr";
Debug.JustUpdateDeviceLine();
__ref.setField ("_assigneditems" /*RemoteObject*/ ,RemoteObject.createNewArray("b4a.SpotifyLinker.b4xset",new int[] {2},new Object[] {preoptimizedclv._b4xcollections.runMethod(false,"_createset" /*RemoteObject*/ ,__ref.getField(false, "ba")),preoptimizedclv._b4xcollections.runMethod(false,"_createset" /*RemoteObject*/ ,__ref.getField(false, "ba"))}));
 BA.debugLineNum = 43;BA.debugLine="ListOfItemsThatShouldBeUpdated.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listofitemsthatshouldbeupdated" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="mCLV.AsView.LoadLayout(\"PCLVSeekBar\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PCLVSeekBar")),__ref.getField(false, "ba"));
 BA.debugLineNum = 45;BA.debugLine="B4XSeekBar1.Size1 = 1dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).setField ("_size1" /*RemoteObject*/ ,preoptimizedclv.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 46;BA.debugLine="B4XSeekBar1.Size2 = 1dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).setField ("_size2" /*RemoteObject*/ ,preoptimizedclv.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 47;BA.debugLine="B4XSeekBar1.Radius1 = 8dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).setField ("_radius1" /*RemoteObject*/ ,preoptimizedclv.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))));
 BA.debugLineNum = 48;BA.debugLine="B4XSeekBar1.Update";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_b4xseekbar1" /*RemoteObject*/ ).runClassMethod (b4a.SpotifyLinker.b4xseekbar.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="mCallback = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 50;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _internalsettextorcsbuildertolabel(RemoteObject __ref,RemoteObject _xlbl,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("InternalSetTextOrCSBuilderToLabel (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("internalsettextorcsbuildertolabel")) { return __ref.runUserSub(false, "preoptimizedclv","internalsettextorcsbuildertolabel", __ref, _xlbl, _text);}
Debug.locals.put("xlbl", _xlbl);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 189;BA.debugLine="Private Sub InternalSetTextOrCSBuilderToLabel(xlbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="xlbl.Text = Text";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listchangedexternally(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListChangedExternally (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("listchangedexternally")) { __ref.runUserSub(false, "preoptimizedclv","listchangedexternally", __ref); return;}
ResumableSub_ListChangedExternally rsub = new ResumableSub_ListChangedExternally(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListChangedExternally extends BA.ResumableSub {
public ResumableSub_ListChangedExternally(b4a.SpotifyLinker.preoptimizedclv parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.SpotifyLinker.preoptimizedclv parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListChangedExternally (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,157);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 158;BA.debugLine="ClearAssignedItems";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_clearassigneditems" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "preoptimizedclv", "listchangedexternally"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 160;BA.debugLine="RaiseVisibleRangeEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_raisevisiblerangeevent" /*RemoteObject*/ );
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _raisevisiblerangeevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseVisibleRangeEvent (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("raisevisiblerangeevent")) { return __ref.runUserSub(false, "preoptimizedclv","raisevisiblerangeevent", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Private Sub RaiseVisibleRangeEvent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="jclv.RunMethod(\"_resetvisibles\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jclv" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("_resetvisibles")),(Object)((preoptimizedclv.__c.getField(false,"Null"))));
 BA.debugLineNum = 87;BA.debugLine="jclv.RunMethod(\"_updatevisiblerange\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jclv" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("_updatevisiblerange")),(Object)((preoptimizedclv.__c.getField(false,"Null"))));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visiblerangechanged(RemoteObject __ref,RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("VisibleRangeChanged (preoptimizedclv) ","preoptimizedclv",38,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("visiblerangechanged")) { return __ref.runUserSub(false, "preoptimizedclv","visiblerangechanged", __ref, _firstindex, _lastindex);}
RemoteObject _fromindex = RemoteObject.createImmutable(0);
RemoteObject _toindex = RemoteObject.createImmutable(0);
RemoteObject _prevset = RemoteObject.declareNull("b4a.SpotifyLinker.b4xset");
RemoteObject _nextset = RemoteObject.declareNull("b4a.SpotifyLinker.b4xset");
int _i = 0;
RemoteObject _it = RemoteObject.declareNull("b4a.example3.customlistview._clvitem");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 98;BA.debugLine="Public Sub VisibleRangeChanged (FirstIndex As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Dim FromIndex As Int = Max(0, FirstIndex - ExtraI";
Debug.JustUpdateDeviceLine();
_fromindex = BA.numberCast(int.class, preoptimizedclv.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,__ref.getField(true,"_extraitems" /*RemoteObject*/ )}, "-",1, 1)))));Debug.locals.put("FromIndex", _fromindex);Debug.locals.put("FromIndex", _fromindex);
 BA.debugLineNum = 100;BA.debugLine="Dim ToIndex As Int = Min(mCLV.Size - 1, LastIndex";
Debug.JustUpdateDeviceLine();
_toindex = BA.numberCast(int.class, preoptimizedclv.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,__ref.getField(true,"_extraitems" /*RemoteObject*/ )}, "+",1, 1)))));Debug.locals.put("ToIndex", _toindex);Debug.locals.put("ToIndex", _toindex);
 BA.debugLineNum = 101;BA.debugLine="Dim PrevSet As B4XSet = AssignedItems(AssignedIte";
Debug.JustUpdateDeviceLine();
_prevset = __ref.getField(false,"_assigneditems" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ __ref.getField(true,"_assigneditemsasindex" /*RemoteObject*/ ));Debug.locals.put("PrevSet", _prevset);Debug.locals.put("PrevSet", _prevset);
 BA.debugLineNum = 102;BA.debugLine="AssignedItemsAsIndex = (AssignedItemsAsIndex + 1)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_assigneditemsasindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_assigneditemsasindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(2)}, "%",0, 1));
 BA.debugLineNum = 103;BA.debugLine="Dim NextSet As B4XSet = AssignedItems(AssignedIte";
Debug.JustUpdateDeviceLine();
_nextset = __ref.getField(false,"_assigneditems" /*RemoteObject*/ ).getArrayElement(false, /*RemoteObject*/ __ref.getField(true,"_assigneditemsasindex" /*RemoteObject*/ ));Debug.locals.put("NextSet", _nextset);Debug.locals.put("NextSet", _nextset);
 BA.debugLineNum = 104;BA.debugLine="NextSet.Clear";
Debug.JustUpdateDeviceLine();
_nextset.runClassMethod (b4a.SpotifyLinker.b4xset.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="ListOfItemsThatShouldBeUpdated.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listofitemsthatshouldbeupdated" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 106;BA.debugLine="For i = FromIndex To ToIndex";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = _toindex.<Integer>get().intValue();
_i = _fromindex.<Integer>get().intValue() ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 107;BA.debugLine="Dim it As CLVItem = items.Get(i)";
Debug.JustUpdateDeviceLine();
_it = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("it", _it);Debug.locals.put("it", _it);
 BA.debugLineNum = 108;BA.debugLine="If it.Panel = StubPanel Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_it.getField(false,"Panel"),__ref.getField(false,"_stubpanel" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 109;BA.debugLine="it.Panel = GetPanel";
Debug.JustUpdateDeviceLine();
_it.setField ("Panel",__ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_getpanel" /*RemoteObject*/ ));
 BA.debugLineNum = 110;BA.debugLine="it.Panel.Tag = i";
Debug.JustUpdateDeviceLine();
_it.getField(false,"Panel").runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 111;BA.debugLine="it.Panel.Color = it.Color";
Debug.JustUpdateDeviceLine();
_it.getField(false,"Panel").runMethod(true,"setColor",_it.getField(true,"Color"));
 BA.debugLineNum = 112;BA.debugLine="If horizontal Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="mCLV.sv.ScrollViewInnerPanel.AddView(it.Panel,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_it.getField(false,"Panel").getObject())),(Object)(_it.getField(true,"Offset")),(Object)(BA.numberCast(int.class, 0)),(Object)(_it.getField(true,"Size")),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getHeight")));
 }else {
 BA.debugLineNum = 115;BA.debugLine="mCLV.sv.ScrollViewInnerPanel.AddView(it.Panel,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runVoidMethod ("AddView",(Object)((_it.getField(false,"Panel").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_it.getField(true,"Offset")),(Object)(__ref.getField(false,"_mclv" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getWidth")),(Object)(_it.getField(true,"Size")));
 };
 BA.debugLineNum = 117;BA.debugLine="NextSet.Add(it.Panel)";
Debug.JustUpdateDeviceLine();
_nextset.runClassMethod (b4a.SpotifyLinker.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_it.getField(false,"Panel").getObject())));
 BA.debugLineNum = 118;BA.debugLine="ListOfItemsThatShouldBeUpdated.Add(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listofitemsthatshouldbeupdated" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((_i))));
 }else 
{ BA.debugLineNum = 119;BA.debugLine="Else if PrevSet.Contains(it.Panel) Then";
Debug.JustUpdateDeviceLine();
if (_prevset.runClassMethod (b4a.SpotifyLinker.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_it.getField(false,"Panel").getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="NextSet.Add(it.Panel)";
Debug.JustUpdateDeviceLine();
_nextset.runClassMethod (b4a.SpotifyLinker.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_it.getField(false,"Panel").getObject())));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 123;BA.debugLine="For Each pnl As B4XView In PrevSet.AsList";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group25 = _prevset.runClassMethod (b4a.SpotifyLinker.b4xset.class, "_aslist" /*RemoteObject*/ );
final int groupLen25 = group25.runMethod(true,"getSize").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group25.runMethod(false,"Get",index25));
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 124;BA.debugLine="If NextSet.Contains(pnl) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_nextset.runClassMethod (b4a.SpotifyLinker.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_pnl.getObject()))),preoptimizedclv.__c.getField(true,"False"))) { 
 BA.debugLineNum = 125;BA.debugLine="If pnl.Parent.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_pnl.runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 126;BA.debugLine="pnl.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 127;BA.debugLine="pnl.GetView(0).RemoveAllViews";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 128;BA.debugLine="pnl.RemoveAllViews";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 129;BA.debugLine="PanelsCache.Add(pnl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_panelscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_pnl.getObject())));
 BA.debugLineNum = 130;BA.debugLine="Dim it As CLVItem = items.Get(pnl.Tag)";
Debug.JustUpdateDeviceLine();
_it = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _pnl.runMethod(false,"getTag")))));Debug.locals.put("it", _it);Debug.locals.put("it", _it);
 BA.debugLineNum = 131;BA.debugLine="it.Panel = StubPanel";
Debug.JustUpdateDeviceLine();
_it.setField ("Panel",__ref.getField(false,"_stubpanel" /*RemoteObject*/ ));
 };
 };
 }
}Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 135;BA.debugLine="HandleScrollBar (FirstIndex)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.SpotifyLinker.preoptimizedclv.class, "_handlescrollbar" /*RemoteObject*/ ,(Object)(_firstindex));
 BA.debugLineNum = 136;BA.debugLine="Return ListOfItemsThatShouldBeUpdated";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_listofitemsthatshouldbeupdated" /*RemoteObject*/ );
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}