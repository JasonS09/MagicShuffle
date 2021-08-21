package b4a.SpotifyLinker;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbytesbuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.SpotifyLinker.b4xbytesbuilder");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SpotifyLinker.b4xbytesbuilder.class).invoke(this, new Object[] {null});
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
public byte[] _mbuffer = null;
public int _mlength = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.SpotifyLinker.main _main = null;
public b4a.SpotifyLinker.starter _starter = null;
public b4a.SpotifyLinker.config _config = null;
public b4a.SpotifyLinker.common _common = null;
public b4a.SpotifyLinker.httputils2service _httputils2service = null;
public b4a.SpotifyLinker.xuiviewsutils _xuiviewsutils = null;
public b4a.SpotifyLinker.b4xcollections _b4xcollections = null;
public b4a.SpotifyLinker.b4xbytesbuilder  _append(b4a.SpotifyLinker.b4xbytesbuilder __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4a.SpotifyLinker.b4xbytesbuilder) Debug.delegate(ba, "append", new Object[] {_data}));}
int _oldlength = 0;
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Public Sub Append(Data() As Byte) As B4XBytesBuild";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Dat";
_oldlength = __ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_data.length));
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, OldLength, Data.L";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_oldlength,_data.length);
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="Return Me";
if (true) return (b4a.SpotifyLinker.b4xbytesbuilder)(this);
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="End Sub";
return null;
}
public int  _changelength(b4a.SpotifyLinker.b4xbytesbuilder __ref,int _newlength) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "changelength", true))
	 {return ((Integer) Debug.delegate(ba, "changelength", new Object[] {_newlength}));}
int _oldlength = 0;
byte[] _b = null;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Private Sub ChangeLength (NewLength As Int) As Int";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Dim OldLength As Int = mLength";
_oldlength = __ref._mlength /*int*/ ;
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="mLength = NewLength";
__ref._mlength /*int*/  = _newlength;
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="If mBuffer.Length < mLength Then";
if (__ref._mbuffer /*byte[]*/ .length<__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="Dim b(Max(mBuffer.Length * 2, NewLength)) As Byt";
_b = new byte[(int) (__c.Max(__ref._mbuffer /*byte[]*/ .length*2,_newlength))];
;
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="Bit.ArrayCopy(mBuffer, 0, b, 0, mBuffer.Length)";
__c.Bit.ArrayCopy((Object)(__ref._mbuffer /*byte[]*/ ),(int) (0),(Object)(_b),(int) (0),__ref._mbuffer /*byte[]*/ .length);
RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="mBuffer = b";
__ref._mbuffer /*byte[]*/  = _b;
 };
RDebugUtils.currentLine=28966920;
 //BA.debugLineNum = 28966920;BA.debugLine="Return OldLength";
if (true) return _oldlength;
RDebugUtils.currentLine=28966921;
 //BA.debugLineNum = 28966921;BA.debugLine="End Sub";
return 0;
}
public b4a.SpotifyLinker.b4xbytesbuilder  _append2(b4a.SpotifyLinker.b4xbytesbuilder __ref,byte[] _data,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "append2", true))
	 {return ((b4a.SpotifyLinker.b4xbytesbuilder) Debug.delegate(ba, "append2", new Object[] {_data,_startindex,_length}));}
int _oldlength = 0;
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Public Sub Append2(Data() As Byte, StartIndex As I";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Dim OldLength As Int = ChangeLength(mLength + Len";
_oldlength = __ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_length));
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="Bit.ArrayCopy(Data, StartIndex, mBuffer, OldLengt";
__c.Bit.ArrayCopy((Object)(_data),_startindex,(Object)(__ref._mbuffer /*byte[]*/ ),_oldlength,_length);
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="Return Me";
if (true) return (b4a.SpotifyLinker.b4xbytesbuilder)(this);
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.SpotifyLinker.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="Private mBuffer() As Byte";
_mbuffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="Private mLength As Int";
_mlength = 0;
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.SpotifyLinker.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="ChangeLength(0)";
__ref._changelength /*int*/ (null,(int) (0));
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="End Sub";
return "";
}
public byte[]  _getinternalbuffer(b4a.SpotifyLinker.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getinternalbuffer", true))
	 {return ((byte[]) Debug.delegate(ba, "getinternalbuffer", null));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Public Sub getInternalBuffer As Byte()";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="Return mBuffer";
if (true) return __ref._mbuffer /*byte[]*/ ;
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="End Sub";
return null;
}
public int  _getlength(b4a.SpotifyLinker.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "getlength", true))
	 {return ((Integer) Debug.delegate(ba, "getlength", null));}
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Public Sub getLength As Int";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Return mLength";
if (true) return __ref._mlength /*int*/ ;
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="End Sub";
return 0;
}
public int  _indexof(b4a.SpotifyLinker.b4xbytesbuilder __ref,byte[] _searchfor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "indexof", true))
	 {return ((Integer) Debug.delegate(ba, "indexof", new Object[] {_searchfor}));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Public Sub IndexOf(SearchFor() As Byte) As Int";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Return IndexOf2(SearchFor, 0)";
if (true) return __ref._indexof2 /*int*/ (null,_searchfor,(int) (0));
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="End Sub";
return 0;
}
public int  _indexof2(b4a.SpotifyLinker.b4xbytesbuilder __ref,byte[] _searchfor,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "indexof2", true))
	 {return ((Integer) Debug.delegate(ba, "indexof2", new Object[] {_searchfor,_index}));}
int _i1 = 0;
int _i2 = 0;
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub IndexOf2(SearchFor() As Byte, Index As";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="For i1 = Index To mLength - SearchFor.Length";
{
final int step1 = 1;
final int limit1 = (int) (__ref._mlength /*int*/ -_searchfor.length);
_i1 = _index ;
for (;_i1 <= limit1 ;_i1 = _i1 + step1 ) {
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="For i2 = 0 To SearchFor.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_searchfor.length-1);
_i2 = (int) (0) ;
for (;_i2 <= limit2 ;_i2 = _i2 + step2 ) {
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="If SearchFor(i2) <> mBuffer(i1 + i2) Then";
if (_searchfor[_i2]!=__ref._mbuffer /*byte[]*/ [(int) (_i1+_i2)]) { 
RDebugUtils.currentLine=29818884;
 //BA.debugLineNum = 29818884;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=29818887;
 //BA.debugLineNum = 29818887;BA.debugLine="If i2 = SearchFor.Length Then";
if (_i2==_searchfor.length) { 
RDebugUtils.currentLine=29818888;
 //BA.debugLineNum = 29818888;BA.debugLine="Return i1";
if (true) return _i1;
 };
 }
};
RDebugUtils.currentLine=29818891;
 //BA.debugLineNum = 29818891;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=29818892;
 //BA.debugLineNum = 29818892;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.SpotifyLinker.b4xbytesbuilder __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Dim mBuffer(100) As Byte";
_mbuffer = new byte[(int) (100)];
;
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="mLength = 0";
__ref._mlength /*int*/  = (int) (0);
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="End Sub";
return "";
}
public String  _insert(b4a.SpotifyLinker.b4xbytesbuilder __ref,int _index,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "insert", true))
	 {return ((String) Debug.delegate(ba, "insert", new Object[] {_index,_data}));}
byte[] _afterindex = null;
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Public Sub Insert(Index As Int, Data() As Byte)";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref._mlength /*int*/ ) { 
__c.LogImpl("929229058","Index too large",0);};
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="Append(Data)";
__ref._append /*b4a.SpotifyLinker.b4xbytesbuilder*/ (null,_data);
 }else {
RDebugUtils.currentLine=29229061;
 //BA.debugLineNum = 29229061;BA.debugLine="Dim AfterIndex() As Byte = SubArray(Index)";
_afterindex = __ref._subarray /*byte[]*/ (null,_index);
RDebugUtils.currentLine=29229062;
 //BA.debugLineNum = 29229062;BA.debugLine="ChangeLength(mLength + Data.Length)";
__ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ +_data.length));
RDebugUtils.currentLine=29229063;
 //BA.debugLineNum = 29229063;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_index,_data.length);
RDebugUtils.currentLine=29229064;
 //BA.debugLineNum = 29229064;BA.debugLine="Bit.ArrayCopy(AfterIndex, 0, mBuffer, Index + Da";
__c.Bit.ArrayCopy((Object)(_afterindex),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),(int) (_index+_data.length),_afterindex.length);
 };
RDebugUtils.currentLine=29229066;
 //BA.debugLineNum = 29229066;BA.debugLine="End Sub";
return "";
}
public byte[]  _subarray(b4a.SpotifyLinker.b4xbytesbuilder __ref,int _beginindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "subarray", true))
	 {return ((byte[]) Debug.delegate(ba, "subarray", new Object[] {_beginindex}));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Public Sub SubArray(BeginIndex As Int) As Byte()";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Return SubArray2(BeginIndex, mLength)";
if (true) return __ref._subarray2 /*byte[]*/ (null,_beginindex,__ref._mlength /*int*/ );
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="End Sub";
return null;
}
public byte[]  _remove(b4a.SpotifyLinker.b4xbytesbuilder __ref,int _beginindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((byte[]) Debug.delegate(ba, "remove", new Object[] {_beginindex,_endindex}));}
byte[] _res = null;
byte[] _afterendindex = null;
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Public Sub Remove(BeginIndex As Int, EndIndex As I";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="Dim res() As Byte = SubArray2(BeginIndex, EndInde";
_res = __ref._subarray2 /*byte[]*/ (null,_beginindex,_endindex);
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="If EndIndex <= mLength Then";
if (_endindex<=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="Dim AfterEndIndex() As Byte = SubArray(EndIndex)";
_afterendindex = __ref._subarray /*byte[]*/ (null,_endindex);
RDebugUtils.currentLine=29360132;
 //BA.debugLineNum = 29360132;BA.debugLine="Bit.ArrayCopy(AfterEndIndex, 0, mBuffer, BeginIn";
__c.Bit.ArrayCopy((Object)(_afterendindex),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_beginindex,_afterendindex.length);
 };
RDebugUtils.currentLine=29360134;
 //BA.debugLineNum = 29360134;BA.debugLine="ChangeLength(mLength - (EndIndex - BeginIndex))";
__ref._changelength /*int*/ (null,(int) (__ref._mlength /*int*/ -(_endindex-_beginindex)));
RDebugUtils.currentLine=29360135;
 //BA.debugLineNum = 29360135;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=29360136;
 //BA.debugLineNum = 29360136;BA.debugLine="End Sub";
return null;
}
public byte[]  _subarray2(b4a.SpotifyLinker.b4xbytesbuilder __ref,int _beginindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "subarray2", true))
	 {return ((byte[]) Debug.delegate(ba, "subarray2", new Object[] {_beginindex,_endindex}));}
byte[] _b = null;
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Public Sub SubArray2(BeginIndex As Int, EndIndex A";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="Dim b(EndIndex - BeginIndex) As Byte";
_b = new byte[(int) (_endindex-_beginindex)];
;
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="Bit.ArrayCopy(mBuffer, BeginIndex, b, 0, b.Length";
__c.Bit.ArrayCopy((Object)(__ref._mbuffer /*byte[]*/ ),_beginindex,(Object)(_b),(int) (0),_b.length);
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="End Sub";
return null;
}
public String  _set(b4a.SpotifyLinker.b4xbytesbuilder __ref,int _index,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_data}));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Public Sub Set(Index As Int, Data() As Byte)";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="If Index >= mLength Then";
if (_index>=__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="If Index > mLength Then Log(\"Index too large\")";
if (_index>__ref._mlength /*int*/ ) { 
__c.LogImpl("929294594","Index too large",0);};
RDebugUtils.currentLine=29294595;
 //BA.debugLineNum = 29294595;BA.debugLine="Append(Data)";
__ref._append /*b4a.SpotifyLinker.b4xbytesbuilder*/ (null,_data);
 }else {
RDebugUtils.currentLine=29294597;
 //BA.debugLineNum = 29294597;BA.debugLine="If Data.Length + Index > mLength Then";
if (_data.length+_index>__ref._mlength /*int*/ ) { 
RDebugUtils.currentLine=29294598;
 //BA.debugLineNum = 29294598;BA.debugLine="ChangeLength(Data.Length + Index)";
__ref._changelength /*int*/ (null,(int) (_data.length+_index));
 };
RDebugUtils.currentLine=29294600;
 //BA.debugLineNum = 29294600;BA.debugLine="Bit.ArrayCopy(Data, 0, mBuffer, Index, Data.Leng";
__c.Bit.ArrayCopy((Object)(_data),(int) (0),(Object)(__ref._mbuffer /*byte[]*/ ),_index,_data.length);
 };
RDebugUtils.currentLine=29294602;
 //BA.debugLineNum = 29294602;BA.debugLine="End Sub";
return "";
}
public byte[]  _toarray(b4a.SpotifyLinker.b4xbytesbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbytesbuilder";
if (Debug.shouldDelegate(ba, "toarray", true))
	 {return ((byte[]) Debug.delegate(ba, "toarray", null));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Public Sub ToArray() As Byte()";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="Return SubArray(0)";
if (true) return __ref._subarray /*byte[]*/ (null,(int) (0));
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="End Sub";
return null;
}
}