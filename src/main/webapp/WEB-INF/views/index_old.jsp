<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://cdn.jsdelivr.net/npm/vue"></script>
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
<div id="app">
	<p>欢迎用户:{{message}}</p>
</div>
<a href="/ee/user/category.do"><button>商品类别</button></a>
<a href="/ee/user/exit.do"><button onclick="exit()">退出</button></a>
</body>
<script type="text/javascript">
	var app = new Vue({
		el:"#app",
		data:{
			message:getUser()
		}
	})
	function getUser() {
		var user;
		$.ajax({
			url:"/ee/user/getUser.do",
			async:false,
			dataType:"json",
			success:function(data){
				user=data.nickName;
			}
		})
		return user;
	}
</script>
</html>
