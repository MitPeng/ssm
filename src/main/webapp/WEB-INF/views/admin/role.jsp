<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>角色管理</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<link rel="stylesheet" href="/ee/res/bootstrap-table.css" >

</head>
<body>

<input type="hidden" id="roleId111">
<table id="table"></table>
<div id="toolbar"><div class="btn-group" role="group" aria-label="...">
  <button type="button" class="btn btn-default" data-toggle="modal" data-target="#roleAddModel">新增</button>
  <button type="button" class="btn btn-default" data-toggle="modal" data-target="#roleUpdateModel" onclick="updateRole1()">编辑</button>
  <button type="button" class="btn btn-default" onclick="deleteRole()">删除</button>
</div></div>



<!-- Modal -->
<div class="modal fade" id="roleAddModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">新增角色</h4>
      </div>
      <div class="modal-body">
		
    <fieldset>
    <div class="control-group">

          <!-- Text input-->
          <label class="control-label" for="input01">角色名：</label>
          <div class="controls">
            <input type="text"  id="roleName" class="input-xlarge">
          </div>
        </div>

    <div class="control-group">

          <!-- Search input-->
          <label class="control-label">  角色编码：</label>
          <div class="controls">
            <input type="text" id="roleCode" class="input-xlarge search-query">
          </div>

        </div>

    </fieldset>
		
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" onclick="saveRole()" class="btn btn-primary">保存</button>
      </div>
    </div>
  </div>
</div>

<!-- Modal -->
<div class="modal fade" id="roleUpdateModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">修改角色</h4>
      </div>
      <div class="modal-body">
		
    <fieldset>
    <div class="control-group">

          <!-- Text input-->
          <label class="control-label" for="input01">编号：</label>
          <div class="controls">
            <input type="text"  id="id1" class="input-xlarge" readonly="readonly">
          </div>
        </div>
    <div class="control-group">

          <!-- Text input-->
          <label class="control-label" for="input01">角色名：</label>
          <div class="controls">
            <input type="text"  id="roleName1" class="input-xlarge">
          </div>
        </div>

    <div class="control-group">

          <!-- Search input-->
          <label class="control-label">  角色编码：</label>
          <div class="controls">
            <input type="text" id="roleCode1" class="input-xlarge search-query">
          </div>

        </div>

    </fieldset>
		
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" onclick="updateRole2()" class="btn btn-primary">保存</button>
      </div>
    </div>
  </div>
</div>

<!-- Modal -->
<div class="modal fade" id="roleAndUserModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">选择(<span id="roleNameModel"></span>)所绑定的用户</h4>
      </div>
      <div class="modal-body" id="roleAndUserModelBody" style="padding-left:30px;"></div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" onclick="saveRoleAndUser()" class="btn btn-primary">保存</button>
      </div>
    </div>
  </div>
</div>



</body>
 <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
<script src="/ee/res/bootstrap-table.js" ></script>
<script type="text/javascript">
function saveRole(){
	var roleName = $("#roleName").val();
	var roleCode = $("#roleCode").val();
	$.ajax({
		url:"/ee/role/addRole.do",
		type:"post",
		dataType:"json",
		data:{roleName:roleName,roleCode:roleCode},
		success:function(d){
			if(d.code==200){
				$('#roleAddModel').modal('hide');
				$("#table").bootstrapTable('refresh');
				$("#roleName").val("");
				$("#roleCode").val("");
			}else{
				alert("新增失败！");
			}
		}
	})
}



$table = $('#table').bootstrapTable({
    url: '/ee/role/findRolePage.do',                      //请求后台的URL（*）
    method: 'get',                      //请求方式（*）
    toolbar: '#toolbar',              //工具按钮用哪个容器
    striped: true,                      //是否显示行间隔色
    cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
    pagination: true,                   //是否显示分页（*）
    sortable: true,                     //是否启用排序
    sortOrder: "asc",                   //排序方式
    sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
    pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
    pageSize: 10,                     //每页的记录行数（*）
    pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
    search: false,                      //是否显示表格搜索
    strictSearch: true,
    showColumns: true,                  //是否显示所有的列（选择显示的列）
    showRefresh: true,                  //是否显示刷新按钮
    minimumCountColumns: 2,             //最少允许的列数
    clickToSelect: true,                //是否启用点击选中行
    //height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
    uniqueId: "id",                     //每一行的唯一标识，一般为主键列
    showToggle: true,                   //是否显示详细视图和列表视图的切换按钮
    cardView: false,                    //是否显示详细视图
    detailView: false,                  //是否显示父子表
    //得到查询的参数
    queryParams : function (params) {
        //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        var temp = {   
            rows: params.limit,                         //页面大小
            page: (params.offset / params.limit) + 1,   //页码
            sort: params.sort,      //排序列名  
            sortOrder: params.order //排位命令（desc，asc） 
        };
        return temp;
    },
    columns: [{
        checkbox: true,  
        visible: true                  //是否显示复选框  
    }, {
        field: 'roleName',
        title: '角色名'
    }, {
        field: 'roleCode',
        title: '角色码'
    }, {
        field:'id',
        title: '操作',
        width: 120,
        align: 'center',
        valign: 'middle',
        formatter: userFormatter
    } ],
    onLoadSuccess: function () {
    },
    onLoadError: function () {
        showTips("数据加载失败！");
    },
    onDblClickRow: function (row, $element) {
        var id = row.ID;
        EditViewById(id, 'view');
    }
    
});


function updateRole1() {
	$("#id1").val("");
	$("#roleName1").val("");
	$("#roleCode1").val("");
	var getSelectRows = $("#table").bootstrapTable('getSelections', function (row) {
	    return row;
	});
	if(getSelectRows.length==0){
		return alert("请选择要修改的角色！");
	}else if(getSelectRows.length!=1){
		return alert("请勿多选！");
	}
	var id = getSelectRows[0].id;
	var roleName = getSelectRows[0].roleName;
	var roleCode = getSelectRows[0].roleCode;
	$("#id1").val(id);
	$("#roleName1").val(roleName);
	$("#roleCode1").val(roleCode);
	
}

function updateRole2(){
	var id = $("#id1").val();
	var roleName = $("#roleName1").val();
	var roleCode = $("#roleCode1").val();
	$.ajax({
		url:"/ee/role/updateRole.do",
		type:"post",
		dataType:"json",
		data:{id:id,roleName:roleName,roleCode:roleCode},
		success:function(d){
			if(d.code==200){
				$('#roleUpdateModel').modal('hide');
				$("#table").bootstrapTable('refresh');
				$("#id1").val("");
				$("#roleName1").val("");
				$("#roleCode1").val("");
			}else{
				alert("修改失败！");
			}
		}
	})
}


function deleteRole(){
	var getSelectRows = $("#table").bootstrapTable('getSelections', function (row) {
	    return row;
	});
	if(getSelectRows.length==0){
		return alert("请选择要删除的角色！");
	}
	var selects = new Array();
	for(var i=0;i<getSelectRows.length;i++){
		selects[i] = getSelectRows[i].id;
		var rid = selects[i];
		$.ajax({
			url:"/ee/role/deleteRole.do",
			type:"post",
			dataType:"json",
			data:{rid:rid},
			success:function(d){
				if(d.code==200){
					$("#table").bootstrapTable('refresh');
				}else{
					alert("删除失败！");
				}
			}
		})
	}
	
}

function userFormatter(value, row, index){
	
	return "<a href='javascript:;' class='btn btn-xs blue' onclick=\"roleAndUser('" + value + "','" + row.roleName + "')\" title='角色用户绑定'><span class='glyphicon glyphicon-pencil'></span></a>";
	
}

function roleAndUser(roleId,roleName){
	$("#roleId111").val(roleId);
	$("#roleAndUserModelBody").html("");
	$.ajax({
		url:"/ee/user/findAllUser.do",
		type:"post",
		dataType:"json",
		success:function(d){
			$.each(d,function(i,e){
				$.ajax({
					url:"/ee/role/findUserAndRole.do",
					type:"post",
					dataType:"json",
					data:{roleId:roleId,userId:e.id},
					success:function(d){
						if(d.code==200){
							$("#roleAndUserModelBody").append('<label class="checkbox">'
						              +'<input type="checkbox" value="'+e.id+'" name="userId" checked="checked">'+e.nickName 
						           +'</label>' );
						}else{
							$("#roleAndUserModelBody").append('<label class="checkbox">'
						              +'<input type="checkbox" value="'+e.id+'" name="userId">'+e.nickName 
						           +'</label>' );
						}
					}
				})
				
			})
		}
	})
	$("#roleNameModel").html(roleName);
	$("#roleAndUserModel").modal("show");
}
function saveRoleAndUser(){
	var roleId = $("#roleId111").val();
	var userIds = "";
	$('input[name="userId"]:checked').each(function(){ 
		userIds += $(this).val()+",";
	}); 
	console.info(userIds);
	$.ajax({
		url:"/ee/role/addUserAndRole.do",
		type:"post",
		dataType:"json",
		data:{roleId:roleId,userIds:userIds},
		success:function(d){
			if(d.code==200){
				$('#roleAndUserModel').modal('hide');
			}else{
				alert("新增失败！");
			}
		}
	})
}
</script>
</html>