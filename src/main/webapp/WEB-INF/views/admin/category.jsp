<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>商品类别</title>
<!-- ææ°çæ¬ç Bootstrap æ ¸å¿ CSS æä»¶ -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- å¯éç Bootstrap ä¸»é¢æä»¶ï¼ä¸è¬ä¸ç¨å¼å¥ï¼ -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<link rel="stylesheet" href="/ee/res/bootstrap-table.css" >

<style type="text/css">
</style>
</head>
<body>
	<button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">新增</button>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">新增</h4>
	      </div>
	      <div class="modal-body">
	        <span>请输入新增商品类别信息</span>
	        <br>
		    <label>
			<span>类别名称</span>
			<input type="text" id="catName">
			</label>
			<br>
			<label>
	    	<span>类别编码</span>
			<input type="text" id="catCode">
			</label>
			<br>
			<label>
	    	<span>父id</span>
			<input type="text" id="pid">
			</label>
			<label>
	    	<span>排序</span>
			<input type="text" id="sort">
			</label>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	        <button type="button" class="btn btn-primary" onclick="add()">确认</button>
	      </div>
	    </div>
	  </div>
	</div>
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">修改</h4>
	      </div>
	      <div class="modal-body">
	        <span>请输入修改的商品类别信息</span>
	        <br>
	        <label>
			<span>id</span>
			<input type="text" id="id1">
			</label>
			<br>
		    <label>
			<span>类别名称</span>
			<input type="text" id="catName1">
			</label>
			<br>
			<label>
	    	<span>类别编码</span>
			<input type="text" id="catCode1">
			</label>
			<br>
			<label>
	    	<span>排序</span>
			<input type="text" id="sort1">
			</label>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	        <button type="button" class="btn btn-primary" onclick="update()">确认</button>
	      </div>
	    </div>
	  </div>
	</div>
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">删除</h4>
	      </div>
	      <div class="modal-body">
	        <span>请输入要删除的类别信息</span>
	        <br>
	        <label>
			<span>id</span>
			<input type="text" id="id2">
			</label>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
	        <button type="button" class="btn btn-primary" onclick="del()">确认</button>
	      </div>
	    </div>
	  </div>
	</div>
	<table id="table"></table>
</body>
 <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- ææ°ç Bootstrap æ ¸å¿ JavaScript æä»¶ -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="/ee/res/bootstrap-table.js" ></script>
<script type="text/javascript">
function add(){
	$.ajax({
		url:"/ee/category/add.do",
		type:"post",
		data:{"catName":$("#catName").val(),"catCode":$("#catCode").val(),"pid":$("#pid").val(),"sort":$("#sort").val()},
		dataType:"json",
		success:
			alert("新增成功")
	})
}

function update(){
	$.ajax({
		url:"/ee/category/update.do",
		type:"post",
		data:{"id":$("#id1").val(),"catName":$("#catName1").val(),"catCode":$("#catCode1").val(),"pid":$("#pid1").val(),"sort":$("#sort1").val()},
		dataType:"json",
		success:
			alert("修改成功")
	})
}

function del(){
	$.ajax({
		url:"/ee/category/delete.do",
		type:"post",
		data:{"id":$("#id2").val()},
		dataType:"json",
		success:
			alert("删除成功")
	})
}
</script>
<script type="text/javascript">
//æä½æ çæ ¼å¼å
function actionFormatter(value, row, index) {
    var id = value;
    var result = "";
    result += "<button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#myModal1\">修改</button>&nbsp&nbsp&nbsp&nbsp";
    result += "<button type=\"button\" class=\"btn btn-default\"  data-toggle=\"modal\" data-target=\"#myModal2\">删除</button>";
    return result;
}

$table = $('#table').bootstrapTable({
    url: '/ee/category/findCategoryPage.do',                      //è¯·æ±åå°çURLï¼*ï¼
    method: 'get',                      //è¯·æ±æ¹å¼ï¼*ï¼
    //toolbar: '#toolbar',              //å·¥å·æé®ç¨åªä¸ªå®¹å¨
    striped: true,                      //æ¯å¦æ¾ç¤ºè¡é´éè²
    cache: false,                       //æ¯å¦ä½¿ç¨ç¼å­ï¼é»è®¤ä¸ºtrueï¼æä»¥ä¸è¬æåµä¸éè¦è®¾ç½®ä¸ä¸è¿ä¸ªå±æ§ï¼*ï¼
    pagination: true,                   //æ¯å¦æ¾ç¤ºåé¡µï¼*ï¼
    sortable: true,                     //æ¯å¦å¯ç¨æåº
    sortOrder: "asc",                   //æåºæ¹å¼
    sidePagination: "server",           //åé¡µæ¹å¼ï¼clientå®¢æ·ç«¯åé¡µï¼serveræå¡ç«¯åé¡µï¼*ï¼
    pageNumber: 1,                      //åå§åå è½½ç¬¬ä¸é¡µï¼é»è®¤ç¬¬ä¸é¡µ,å¹¶è®°å½
    pageSize: 3,                     //æ¯é¡µçè®°å½è¡æ°ï¼*ï¼
    pageList: [10, 25, 50, 100],        //å¯ä¾éæ©çæ¯é¡µçè¡æ°ï¼*ï¼
    search: false,                      //æ¯å¦æ¾ç¤ºè¡¨æ ¼æç´¢
    strictSearch: true,
    showColumns: true,                  //æ¯å¦æ¾ç¤ºææçåï¼éæ©æ¾ç¤ºçåï¼
    showRefresh: true,                  //æ¯å¦æ¾ç¤ºå·æ°æé®
    minimumCountColumns: 2,             //æå°åè®¸çåæ°
    clickToSelect: true,                //æ¯å¦å¯ç¨ç¹å»éä¸­è¡
    //height: 500,                      //è¡é«ï¼å¦ææ²¡æè®¾ç½®heightå±æ§ï¼è¡¨æ ¼èªå¨æ ¹æ®è®°å½æ¡æ°è§å¾è¡¨æ ¼é«åº¦
    uniqueId: "id",                     //æ¯ä¸è¡çå¯ä¸æ è¯ï¼ä¸è¬ä¸ºä¸»é®å
    showToggle: true,                   //æ¯å¦æ¾ç¤ºè¯¦ç»è§å¾ååè¡¨è§å¾çåæ¢æé®
    cardView: false,                    //æ¯å¦æ¾ç¤ºè¯¦ç»è§å¾
    detailView: false,                  //æ¯å¦æ¾ç¤ºç¶å­è¡¨
    //å¾å°æ¥è¯¢çåæ°
    queryParams : function (params) {
        //è¿éçé®çåå­åæ§å¶å¨çåéåå¿é¡»ä¸ç´ï¼è¿è¾¹æ¹å¨ï¼æ§å¶å¨ä¹éè¦æ¹æä¸æ ·ç
        var temp = {   
            rows: params.limit,                         //é¡µé¢å¤§å°
            page: (params.offset / params.limit) + 1,   //é¡µç 
            sort: params.sort,      //æåºåå  
            sortOrder: params.order //æä½å½ä»¤ï¼descï¼ascï¼ 
        };
        return temp;
    },
    columns: [{
        checkbox: true,  
        visible: true                  //æ¯å¦æ¾ç¤ºå¤éæ¡  
    }, {
        field: 'id',
        title: 'id'
    }, {
        field: 'catName',
        title: '类别名称'
    }, {
        field: 'catCode',
        title: '类别编码'
    }, {
        field: 'addDate',
        title: '新增日期'
    }, {
        field: 'updateDate',
        title: '修改日期'
    }, {
        field: 'sort',
        title: '排序'
    }, {
        field:'id',
        title: 'id',
        width: 300,
        align: 'center',
        valign: 'middle',
        formatter: actionFormatter
    }, ],
    onLoadSuccess: function () {
    },
    onLoadError: function () {
        showTips("数据加载失败！");
    },
    onDblClickRow: function (row, $element) {
        var id = row.ID;
        EditViewById(id, 'view');
    },
});
</script>
</html>