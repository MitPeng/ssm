<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>后台管理</title>

<link rel="stylesheet" href="/ee/dist/bootstrap.min.css">
<link href="http://www.jq22.com/jquery/font-awesome.4.6.0.css" rel="stylesheet" media="screen">
<link rel="stylesheet" href="/ee/dist/sidebar-menu.css">
<style type="text/css">
.main-sidebar{
	position: absolute;
	top: 50px;
	left: 0;
	height: 100%;
	min-height: 100%;
	width: 230px;
	z-index: 810;
	background-color: #222d32;
 }
 .navbar{
 	
 	width: 100%;
 	height: 50px;
 	background-color: #3c8dbc;
 	    border-radius: 0;
 }
 .navbarLeft{
 	float: left;
 	background-color: #367fa9;
 	width: 230px;
 	height: 100%;
 }
 .navbarLeft .logo-lg{
	display: block;
	color: #fff;
	font-size: 20px;
    line-height: 50px;
    text-align: center;
    font-weight: 300;
    font-family: Helvetica, 'Hiragino Sans GB', 'Microsoft Yahei', '微软雅黑', Arial, sans-serif;
 }
  .navbarLeft .logo-lg b{

  	font-weight: 800;
  }
  .navbar .navbar-custom-menu{
  position: relative;
  	float: right;
  }
  .navbarRight{
  	margin-left:230px;width:100%;
  } 
  .navbar .navbar-custom-menu .navbar-nav .right{
  	color: #fff;	
  	    padding-top: 15px;
    padding-bottom: 15px;
    line-height: 20px;
    display: block;
    list-style-type: disc;
    -webkit-margin-before: 1em;
    -webkit-margin-after: 1em;
    -webkit-margin-start: 0px;
    -webkit-margin-end: 0px;
    -webkit-padding-start: 40px;

  }
</style>

</head>
<body>
<nav class="navbar">
	<div class="navbarLeft"><span class="logo-lg">后台管理</span></div>
	<iframe name="iframe" src="" width="1600px" height="800px" scrolling="no" frameborder="0" style="margin-top: 100px;margin-left: 50px"> </iframe>
</nav>
<aside class="main-sidebar">
<section id="div_menu" class="sidebar">
  </section>
 </aside>

<script src="http://www.jq22.com/jquery/1.11.1/jquery.min.js"></script>
<script src="/ee/dist/sidebar-menu.js"></script>
<script src="/ee/dist/haha.js"></script>
</body>
</html>