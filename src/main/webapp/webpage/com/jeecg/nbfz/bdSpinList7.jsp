<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,autocomplete"></t:base>
<style>
    .datagrid-cell{
        margin: 2px;
        padding: 2px;
        overflow: hidden;
        height: 30px;
        line-height: 13px;
        font-size: 12px;
        word-wrap: break-word;
        white-space: nowrap;
    }
</style>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="bdSpinrowList" checkbox="true"  pagination="true" fitColumns="false" height="500"
              title="" actionUrl="bdSpinController.do?datagrid" idField="id"  queryMode="group" sortName="id" sortOrder="desc">
    <t:dgCol title="id"  field="id"  hidden="true" ></t:dgCol>
   
   <t:dgCol title="报价日期" rowspan="2" query= "true" frozenColumn="true" field="spinaa" queryMode="group"   formatter="yyyy-MM-dd" extendParams="editor:'datebox'" width="90"></t:dgCol>
      <t:dgCol title="客户编号" rowspan="2" query= "true" frozenColumn="true" field="spinab"  extendParams="editor:'text'" width="60"></t:dgCol>
      <t:dgCol title="订单序号" rowspan="2" query= "true" frozenColumn="true" field="spinac"    extendParams="editor:'text'" width="60"></t:dgCol>
      <t:dgCol title="款号" rowspan="2" query= "true" frozenColumn="true" field="spinad"  extendParams="editor:'text'" width="50"></t:dgCol>
      <t:dgCol title="款式/名" rowspan="2" frozenColumn="true" field="spinae" queryMode="group"   extendParams="editor:'text'" width="60"></t:dgCol>
      <t:dgCol title="尺寸</br>单位" rowspan="2" frozenColumn="true" field="ccdw" queryMode="group"   dictionary="ccdw" extendParams="editor:'combobox'" width="50"></t:dgCol>
	  
	     <t:dgCol title="领口罗纹" colspan="4" ></t:dgCol>
      <t:dgCol title="下摆/腰罗纹" colspan="4" ></t:dgCol>
      <t:dgCol title="袖/脚口罗纹" colspan="4" ></t:dgCol>
	  <t:dgCol title="加误率" rowspan="2" field="spingr" queryMode="group" formatterjs="fix100"  extendParams="editor:'text'" width="50"></t:dgCol>
      <t:dgCol title="放版缩率%" colspan="3" ></t:dgCol>
	  <t:dgCol title="合计M2" rowspan="2" field="spingv" queryMode="group" formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
      <t:dgCol title="备注" newColumn="true" rowspan="2"  field="spingw" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	  
    <t:dgCol title="领宽"  field="spingf" queryMode="group" formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="领高"  field="spingg" queryMode="group" formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spingh" queryMode="group" formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spingi" queryMode="group" formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="12宽"  field="spingj" queryMode="group" formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="高"  field="spingk" queryMode="group"  formatterjs="fix1" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spingl" queryMode="group" formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spingm" queryMode="group" formatterjs="fix3"  extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="12宽"  field="spingn" queryMode="group" formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="高"  field="spingo" queryMode="group" formatterjs="fix1"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="数量"  field="spingp" queryMode="group" formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="M2"  field="spingq" queryMode="group"  formatterjs="fix3" extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="直"  field="spings" queryMode="group" formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="横"  field="spingt" queryMode="group"  formatterjs="fix" extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="合计"  field="spingu" queryMode="group" formatterjs="fix"  extendParams="editor:'text'" width="50"></t:dgCol>


      <t:dgToolBar  title="录入" icon="icon-add"  funname="addRow"></t:dgToolBar>
      <t:dgToolBar  title="编辑" icon="icon-edit"  funname="editRow"></t:dgToolBar>
      <t:dgToolBar  title="保存" icon="icon-save" url="bdSpinController.do?saveRows" funname="saveDatas" ></t:dgToolBar>
      <t:dgToolBar  title="取消编辑" icon="icon-undo" funname="reject"></t:dgToolBar>
      <t:dgToolBar title="批量删除"  icon="icon-remove" url="bdSpinController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
    //添加行
	function addRow(title,addurl,gname){
		$('#'+gname).datagrid('appendRow',{});
		var editIndex = $('#'+gname).datagrid('getRows').length-1;
		$('#'+gname).datagrid('selectRow', editIndex)
				.datagrid('beginEdit', editIndex);
	}
	//保存数据
	function saveData(title,addurl,gname){
		if(!endEdit(gname))
			return false;
		var rows=$('#'+gname).datagrid("getChanges","inserted");
		var uprows=$('#'+gname).datagrid("getChanges","updated");
		rows=rows.concat(uprows);
		if(rows.length<=0){
			tip("没有需要保存的数据！")
			return false;
		}
		var result={};
		for(var i=0;i<rows.length;i++){
			for(var d in rows[i]){
				result["bdSpinList["+i+"]."+d]=rows[i][d];
			}
		}
		$.ajax({
			url:"<%=basePath%>/"+addurl,
			type:"post",
			data:result,
			dataType:"json",
			success:function(data){
				tip(data.msg);
				if(data.success){
		$('#'+gname).datagrid('reload');
				}
			}
		})
	}
	//结束编辑
	function endEdit(gname){
		var  editIndex = $('#'+gname).datagrid('getRows').length-1;
		for(var i=0;i<=editIndex;i++){
			if($('#'+gname).datagrid('validateRow', i))
				$('#'+gname).datagrid('endEdit', i);
			else
				return false;
		}
		return true;
	}
	//编辑行
	function editRow(title,addurl,gname){
		var rows=$('#'+gname).datagrid("getChecked");
		if(rows.length==0){
			tip("请选择条目");
			return false;
		}
		for(var i=0;i<rows.length;i++){
			var index= $('#'+gname).datagrid('getRowIndex', rows[i]);
			$('#'+gname).datagrid('beginEdit', index);
		}
	}
	//取消编辑
	function reject(title,addurl,gname){
		$('#'+gname).datagrid('clearChecked');
		$('#'+gname).datagrid('rejectChanges');
	}
    function fix(x,row,index){
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        var f = Math.round(x);
        var s = f.toString();
        return s;
    }
    function fix1(x,row,index){
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        var f = Math.round(x*10)/10;
        var s = f.toString();
        var rs = s.indexOf('.');
        if (rs < 0) {
            rs = s.length;
            s += '.';
        }
        while (s.length <= rs + 1) {
            s += '0';
        }
        return s;
    }
    function fix2(x,row,index){
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        var f = Math.round(x*100)/100;
        var s = f.toString();
        var rs = s.indexOf('.');
        if (rs < 0) {
            rs = s.length;
            s += '.';
        }
        while (s.length <= rs + 2) {
            s += '0';
        }
        return s;
    }
    function fix3(x,row,index){
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        var f = Math.round(x*1000)/1000;
        var s = f.toString();
        var rs = s.indexOf('.');
        if (rs < 0) {
            rs = s.length;
            s += '.';
        }
        while (s.length <= rs + 3) {
            s += '0';
        }
        return s;
    }

    function fix100(x,row,index) {
        var f = parseFloat(x);
        if (isNaN(f)) {
            return "";
        }
        return f + "%";
    }
 </script>