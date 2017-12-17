<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,autocomplete"></t:base>
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
	  
	  
	  <t:dgCol title="唛标" colspan="2" ></t:dgCol>
      <t:dgCol title="线带" colspan="3" ></t:dgCol>
      <t:dgCol title="拉链" colspan="3" ></t:dgCol>
	  <t:dgCol title="橡筋" colspan="2" ></t:dgCol>
      <t:dgCol title="钮扣" colspan="3" ></t:dgCol>
	  <t:dgCol title="附件" colspan="3" ></t:dgCol>
	  
      <t:dgCol title="辅料合计" rowspan="2" field="spinhv" queryMode="group"   extendParams="editor:'text'" width="60"></t:dgCol>
	  
      <t:dgCol title="包装" colspan="8" ></t:dgCol>
	  
      <t:dgCol title="包装合计" rowspan="2" field="spinhae" queryMode="group"   extendParams="editor:'text'" width="70"></t:dgCol>
      <t:dgCol title="备注" newColumn="true" rowspan="2"  field="spinhaf" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	  
	  
	  
    <t:dgCol title="三标"  field="spinhf" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="装饰"  field="spinhg" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="缝线"  field="spinhh" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="绳带"  field="spinhi" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="贴条"  field="spinhj" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="金属"  field="spinhk" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="树脂"  field="spinhl" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="尼龙"  field="spinhm" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="平"  field="spinhn" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="圆"  field="spinho" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="金属"  field="spinhp" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="树脂"  field="spinhq" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="控制"  field="spinhr" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="气眼"  field="spinhs" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="粘衬"  field="spinht" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="其它"  field="spinhu" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgCol title="吊牌"  field="spinhw" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="贴纸"  field="spinhx" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="拷贝纸"  field="spinhy" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="防伪标"  field="spinhz" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="衣架"  field="spinhaa" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="胶袋"  field="spinhab" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="纸箱"  field="spinhac" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
    <t:dgCol title="其它"  field="spinhad" queryMode="group"   extendParams="editor:'text'" width="50"></t:dgCol>
	
    <t:dgToolBar operationCode="add" title="录入" icon="icon-add"  funname="addRow"></t:dgToolBar>
    <t:dgToolBar operationCode="edit" title="编辑" icon="icon-edit"  funname="editRow"></t:dgToolBar>
    <t:dgToolBar operationCode="save" title="保存" icon="icon-save" url="bdSpinController.do?saveRows" funname="saveData"></t:dgToolBar>
    <t:dgToolBar operationCode="undo" title="取消编辑" icon="icon-undo" funname="reject"></t:dgToolBar>
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
 </script>