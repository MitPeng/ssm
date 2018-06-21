
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品发布列表页</title>
    <link rel="stylesheet" type="text/css" href="/ee/dist/bootstrap.min.css">
    <link rel="stylesheet" href="/ee/dist/font-awesome.min.css">
    <link rel="stylesheet" href="/ee/css/base.css">
    <link rel="stylesheet" type="text/css" href="/ee/css/index.css">
    <link rel="stylesheet" type="text/css" href="/ee/css/emit_o.css">
    <link rel="stylesheet" type="text/css" href="/ee/css/sku_style.css">
    <link href="/ee/css/common.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="/ee/css/layer.css" id="layuicss-skinlayercss">
    <link href="/ee/css/ueditor.css" type="text/css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/ee/css//codemirror.css">

<style type="text/css">
        .sure{background: #0099ff;color:#fff;width: 150px;height: 50px;font-size:25px;}
        .nosure{background: #d8dee3;color:#fff;width: 150px;height: 50px;font-size:25px;}
        .cusSkuValInput{width: 100px;}
        .cusSkuTypeInput{width: 120px;}
        #foot ul li {
            float: none;
        }
    </style>
</head>
<body>
<div style="" id="CommPublish">

    <div id="commodityAdd" class="main" style="">
        <form method="post" id="dataForm" action="/ee/commodity/addCommodity.do">
            <div id="spv"></div>
            <div class="section" style="">
               
                <div class="emit-shop" style="">
                    <div class="title">
                        基本信息
                    </div>
                    <div class="emit-comtent" style="">
                        <dl class="dt-dd-left clearfix" style="display: none;">
                            <dt><label>已选单品</label></dt>
                            <dd>
                                <div class="product-view">
                                    <ul></ul>
                                </div>
                            </dd>
                        </dl>
                        <br>

                        <dl class="dt-dd-left clearfix product-title">
                            <dt><label>商品标题</label></dt>
                            <dd><input type="text" name="name" required="required" placeholder="请输入商品标题"><br><span
                                    style="color: red;"></span></dd>
                        </dl>
                        <dl class="dt-dd-left clearfix product-selling">
                            <dt><label>商品卖点</label></dt>
                            <dd><textarea name="salePoint"></textarea> <br><span style="color: red;"></span></dd>
                        </dl>
                        <dl class="dt-dd-left clearfix product-selling">
                            <dt><label>价格</label></dt>
                            <dd><input style="border: 1px solid #e1e1e1;" type="text" name="price" required="required" placeholder="请输入商品价格"></dd>
                        </dl>
                        <dl class="dt-dd-left clearfix product-selling">
                            <dt><label>库存</label></dt>
                            <dd><input style="border: 1px solid #e1e1e1;" type="text" name="store" required="required" placeholder="请输入商品库存"> <br><span style="color: red;"></span></dd>
                        </dl>
                       <%-- <dl class="dt-dd-left clearfix">
                            <dt><label>商品属性</label></dt>
                            <dd><p class="ts">错误填写商品属性，可能会引起商品下架或搜索流量减少，影响您的正常销售，请认准填写！</p>
                                <div class="product-attribute clearfix">
                                    <ul>
                                        <li class="clearfix"><label>品牌</label> <!----> <input name="propertys_show"
                                                                                              propertykey="品牌"
                                                                                              placeholder="请输入品牌"
                                                                                              type="text"> <input
                                                name="propertys" id="propertys_1" type="hidden"></li>
                                        <li class="clearfix"><label>名称</label> <!----> <input name="propertys_show"
                                                                                              propertykey="名称"
                                                                                              placeholder="请输入名称"
                                                                                              type="text"> <input
                                                name="propertys" id="propertys_2" type="hidden"></li>
                                        <li class="clearfix"><label>货期</label> <!----> <input name="propertys_show"
                                                                                              propertykey="货期"
                                                                                              placeholder="请输入货期"
                                                                                              type="text"> <input
                                                name="propertys" id="propertys_3" type="hidden"></li>
                                        <li class="clearfix"><label>产地</label> <!----> <input name="propertys_show"
                                                                                              propertykey="产地"
                                                                                              placeholder="请输入产地"
                                                                                              type="text"> <input
                                                name="propertys" id="propertys_4" type="hidden"></li>
                                        <li class="clearfix"><label>编号</label> <!----> <input name="propertys_show"
                                                                                              propertykey="编号"
                                                                                              placeholder="请输入编号"
                                                                                              type="text"> <input
                                                name="propertys" id="propertys_5" type="hidden"></li>
                                        <li class="clearfix"><label>色号</label> <!----> <input name="propertys_show"
                                                                                              propertykey="色号"
                                                                                              placeholder="请输入色号"
                                                                                              type="text"> <input
                                                name="propertys" id="propertys_6" type="hidden"></li>
                                        <li class="clearfix"><label>重量KG/㎡ </label> <!----> <input name="propertys_show"
                                                                                                   propertykey="重量KG/㎡ "
                                                                                                   placeholder="请输入重量KG/㎡ "
                                                                                                   type="text"> <input
                                                name="propertys" id="propertys_7" type="hidden"></li>
                                        <li class="clearfix"><label>风格</label> <select name="propertys"
                                                                                       propertykey="风格">
                                            <option value=""></option>
                                            <option value="风格_中式">中式</option>
                                            <option value="风格_现代">现代</option>
                                            <option value="风格_美式">美式</option>
                                            <option value="风格_欧式">欧式</option>
                                            <option value="风格_北欧">北欧</option>
                                            <option value="风格_工业风">工业风</option>
                                            <option value="风格_通用">通用</option>
                                            <option value="风格_其它">其它</option>
                                        </select> <!----> <!----></li>
                                        <li class="clearfix"><label>材质</label> <!----> <input name="propertys_show"
                                                                                              propertykey="材质"
                                                                                              placeholder="请输入材质"
                                                                                              type="text"> <input
                                                name="propertys" id="propertys_11" type="hidden"></li>
                                        <a href="javascript:void(0);" onclick="addProper(this)" id="addProp"
                                           style="display: block; width: 80px; font-size: 16px;"><span
                                                class="glyphicon glyphicon-plus"
                                                style="color: rgb(5, 70, 103);">新属性</span></a> <span id="propertysRed"
                                                                                                     style="color: red;"></span>
                                    </ul>
                                </div>
                            </dd>
                        </dl>--%>
                        <dl class="dt-dd-left clearfix product-title">
                            <dt><label>商品类别</label></dt>
                            <input type="hidden" name="cid" v-model="pid"/>
                            <dd>
                                <div class="dropup">
                                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        {{commInfo}}
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu2">

                                        <li  v-bind:class="{ 'dropdown-header': commCate.pid == 0 }"  v-for="commCate in commCategorys" v-if=""><a href="#" @click="categorySelect(commCate.id,commCate.name)">{{commCate.name}}</a> </li>

                                    </ul>
                                </div>
                            </dd>
                        </dl>

                        <dl class="dt-dd-left clearfix">
                            <dt><label>商品图片</label></dt>
                            <dd><p class="ts"><span style="color: red;">请上传等宽等高的图片</span>商品主图大小不能超过3MB；700*700以上图片上传后商品详情页自动提供放大镜功能。商品白底图可增加首页曝光机会
                            </p>
                                <div class="product-view">
                                    <input type="hidden" name="commImgOne">
                                    <input type="hidden" name="commImgTwo">
                                    <input type="hidden" name="commImgThree">
                                    <input type="hidden" name="commImgFour">
                                    <input type="hidden" name="commImgFive">

                                    <ul>
                                        <li id="commImgOne" flag="file"
                                            file-data="{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}"
                                            class=""><span>商品主图</span></li>
                                        <li id="commImgTwo" flag="file"
                                            file-data="{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}"
                                            class=""></li>
                                        <li id="commImgThree" flag="file"
                                            file-data="{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}"
                                            class=""></li>
                                        <li id="commImgFour" flag="file"
                                            file-data="{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}"
                                            class=""></li>
                                        <li id="commImgFive" flag="file"
                                            file-data="{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}"
                                            class=""><span>商品底图</span></li>
                                    </ul>
                                   </div>
                            </dd>
                        </dl>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span
                            id="imgRed" style="color: red;"></span>
                        <dl class="dt-dd-left clearfix" style="">
                            <dt><label>商品描述</label></dt>
                            <dd class="check" style="width: 780px;">
                                    <textarea id="commDetail" style="width: 100%;height: 500px;" name="detail"></textarea>
                            </dd>
                        </dl>
                    </div>



                    <div class="buton clearfix"><input type="submit"  value="发布" class="sure">
                        &nbsp; &nbsp;
                        <input type="reset" value="重置" class="sure"></div>
                </div>
            </div>
        </form>
    </div>
</div>
<script type="text/javascript" src="/ee/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript" src="/ee/js/ajaxupload.js"></script>

<!-- 配置文件 -->
<script type="text/javascript" src="/ee/ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="/ee/ueditor/ueditor.all.js"></script>
<!-- 开发环境版本，包含了用帮助的命令行警告 -->
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>

<script>
    function imgUploadEnd(file,r,curObj) {
        var id = curObj.attr("id");
        $("[name="+id+"]").val(r.url);
        curObj.html("<img src='"+r.url+"'>")
    }
    var ue = UE.getEditor('commDetail');

    // var ue = UE.getEditor('container', {
    //     toolbars: [
    //         ['fullscreen', 'source', 'undo', 'redo', 'bold']
    //     ],
    //     autoHeightEnabled: true,
    //     autoFloatEnabled: true
    // });
    var CommPublish = new Vue({
        el:"#CommPublish",
        data:{
            commCategorys:[],
            commInfo:"请选择商品类别",
            pid:0
        },
        created:function(){
            this.findCommCategorys();
        },
        methods:{
            findCommCategorys:function () {
                var _this = this;
                $.ajax({
                    url:"/ee/commodity/categorys.do",
                    data:{pid:0},
                    dataType:"json",
                    type:"post",
                    success:function (d) {
                        $.each(d,function (i,e) {
                            _this.commCategorys.push(e);
                            $.each(e.categoryList,function (ii,ee) {
                                _this.commCategorys.push(ee);
                            })
                        })
                        console.info( _this.commCategorys);
                    }
                })
            },
            categorySelect:function (pid,cname) {
                this.commInfo = cname;
                this.pid = pid;
            }
        }
    })
</script>
</body>
</html>
