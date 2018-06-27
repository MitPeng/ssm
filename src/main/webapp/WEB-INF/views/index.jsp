
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title>必要  - 买大牌制造商产品，上必要</title>
    <link href="http://static.biyao.com/pc/favicon.ico" rel="shortcut icon" type="image/x-icon">
    <link href="/ee/css/common.css" rel="stylesheet" type="text/css">
    <link href="/ee/css/new.main.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="/ee/css/new.index.css">
</head>
<body id="pagebody">
<div id="mainComm">

<!-- 顶部栏 -->
<div class="header header-index">
    <div class="clearfix">
        <ul class="header-nav">
            <li><a href="#">首页</a><b></b></li>
            <li><a href="#">平台政策</a><b></b></li>
            <li><a href="#">商家入驻</a></li>
            <!-- <li><a href="#" id="supCenter">商家入驻</a></li> -->
        </ul>
        <ul class="header-user">
            <li class="user-out" style="display: inline-block;"> <a href="#" id="loginBtn" class="user-login">登录</a> <a href="#" id="registBtn">注册</a> <b></b> </li>
            <li class="user-center"> <a href="#" id="userName"><span></span></a>
                <div> <i></i>
                    <ul>
                        <li><a href="#">我的订单</a></li>
                        <li><a href="#">个人中心</a></li>
                        <li><a href="#">退出登录</a></li>
                    </ul>
                </div>
                <b></b> </li>
            <li class="user-app"> <a href="#">下载必要APP</a>
                <div> <i></i>
                    <dl>
                        <dt></dt>
                        <dd> <span>买大牌制造商产品</span>
                            <h6 style="font-weight:normal">上必要</h6>
                            <p></p>
                        </dd>
                    </dl>
                </div>
                <b></b> </li>
            <li class="user-msg"> <a href="#" class="msg-center"> <i id="hasMsg"></i> <span class="msg-title">消息中心</span> <i id="unread">0</i> </a>
                <div class="msg-center-box"> <i class="msg-center-i" style="left:40px"></i>
                    <div id="msg-ul" style="left: -180px;">
                        <div id="msg-scroll"></div>
                        <div id="scrollOut" class="scrollOut off none"> <span id="scrollIn" class="scrollIn inline"></span> </div>
                    </div>
                </div>
            </li>
            <li class="user-shopCar"> <a href="#">购物车<i id="shopCar">0</i></a> </li>
        </ul>
    </div>
</div>

<!-- 导航栏 -->
<div class="nav nav-index">
    <div class="clearfix"> <a href="#" class="nav-logo"></a>
        <div class="nav-category">
            <p><span>全部分类</span><i></i></p>
            <div>
                <ul class="nav-list">
                    <li class="nav-main">
                        <p> <a href="#"> 男装 </a> <span>/</span> <a href="#"> 女装 </a> </p>
                        <ul>
                            <li class="nav-sub clearfix"> <a href="#"> 男士上装 </a> <i>&gt;</i>
                                <ul>
                                    <li class="nav-item"> <a href="#"> 衬衫 </a> </li>
                                    <li class="nav-item"> <a href="#"> POLO衫 </a> </li>
                                    <li class="nav-item"> <a href="#"> T恤 </a> </li>
                                    <li class="nav-item"> <a href="#"> 西服/套装 </a> </li>
                                    <li class="nav-item"> <a href="#"> 针织衫 </a> </li>
                                    <li class="nav-item"> <a href="#"> 羊绒/毛衫 </a> </li>
                                    <li class="nav-item"> <a href="#"> 卫衣 </a> </li>
                                    <li class="nav-item"> <a href="#"> 马甲 </a> </li>
                                </ul>
                            </li>
                            <li class="nav-sub clearfix"> <a href="#"> 男士外套 </a> <i>&gt;</i>
                                <ul>
                                    <li class="nav-item"> <a href="#"> 风衣/大衣 </a> </li>
                                    <li class="nav-item"> <a href="#"> 皮衣/夹克 </a> </li>
                                    <li class="nav-item"> <a href="#"> 羽绒/棉服 </a> </li>
                                </ul>
                            </li>
                            <li class="nav-sub clearfix"> <a href="#"> 男士下装 </a> <i>&gt;</i>
                                <ul>
                                    <li class="nav-item"> <a href="#"> 牛仔裤 </a> </li>
                                    <li class="nav-item"> <a href="#"> 休闲裤 </a> </li>
                                    <li class="nav-item"> <a href="#"> 西裤 </a> </li>
                                </ul>
                            </li>
                            <li class="nav-sub clearfix"> <a href="#"> 女士上装 </a> <i>&gt;</i>
                                <ul>
                                    <li class="nav-item"> <a href="#"> 衬衫/雪纺 </a> </li>
                                    <li class="nav-item"> <a href="#"> T恤/polo </a> </li>
                                    <li class="nav-item"> <a href="#"> 卫衣 </a> </li>
                                    <li class="nav-item"> <a href="#"> 针织/羊绒/羊毛衫 </a> </li>
                                    <li class="nav-item"> <a href="#"> 大衣/外套 </a> </li>
                                    <li class="nav-item"> <a href="#"> 羽绒服/棉衣 </a> </li>
                                </ul>
                            </li>
                            <li class="nav-sub clearfix"> <a href="#"> 女裙 </a> <i>&gt;</i>
                                <ul>
                                    <li class="nav-item"> <a href="#"> 连衣裙 </a> </li>
                                    <li class="nav-item"> <a href="#"> 半身裙 </a> </li>
                                </ul>
                            </li>
                            <li class="nav-sub clearfix nav-lastSub"> <a href="#"> 女士下装 </a> <i>&gt;</i>
                                <ul>
                                    <li class="nav-item"> <a href="#"> 休闲裤 </a> </li>
                                    <li class="nav-item"> <a href="#"> 牛仔裤 </a> </li>
                                    <li class="nav-item"> <a href="#"> 短裤 </a> </li>
                                </ul>
                            </li>
                        </ul>
                    </li>

                </ul>
            </div>
        </div>
        <div class="nav-search">
            <p>
                <input type="text" id="searchInput" placeholder="请输入要搜索的商品">
                <span id="searchBtn"></span></p>
            <ul>
                <li>面膜</li>
                <li>衬衣</li>
                <li>运动</li>
                <li>家电</li>
                <li>出行</li>
                <li>四件套</li>
                <li>美妆</li>
                <li>清洁</li>
                <li>收纳</li>
                <li>数码配件</li>
            </ul>
        </div>
        <div class="nav-tab"> <span><i></i>全部分类</span>
            <ul>
                <li><a href="#">精选专题</a></li>
                <li class="nav-tab-last"><a href="#">每日上新</a></li>
            </ul>
        </div>
    </div>
</div>

<!-- 右边栏 -->
<ul class="rightBar" style="margin-left: 550px; display: block;">
    <li class="rightBar-serve"><a href="#"></a></li>
    <li class="rightBar-phone"></li>
    <li class="rightBar-share"></li>
    <li class="rightBar-code">
        <div> <span></span>
            <dl class="code-public">
                <dt></dt>
                <dd>扫码关注必要公众号</dd>
            </dl>
            <dl>
                <dt></dt>
                <dd>扫码下载必要APP</dd>
            </dl>
        </div>
    </li>
    <li class="rightBar-top"></li>
</ul>
<!-- 分享弹框 -->
<div class="shareCon">
    <div>
        <p>分享<b></b></p>
        <div class="share-main">
            <dl>
                <dt><img class="share-code" src="/ee/images/ewm.jpg"></dt>
                <dd>扫一扫，分享给好友！</dd>
            </dl>
            <ul>
                <li class="share-qq"><a href="#"></a><span>QQ空间</span></li>
                <li class="share-sina"><a href="#"></a><span>新浪微博</span></li>
                <li class="share-facebook"><a href="#"></a><span>Facebook</span></li>
                <li class="share-twitter"><a href="#"></a><span>Twitter</span></li>
            </ul>
        </div>
    </div>
</div>

<!-- 轮播图及下方图文说明部分 -->
<div class="banner">
    <div class="banner-slider">
        <ul>
            <li style="display: none;"><a href="#"><img src="/ee/images/rBACYVqhBE6Ac0sqAADjnZisrqc752.jpg" alt=""></a></li>
            <li style="display: none;"><a href="#"><img src="/ee/images/rBACYVqhBmCAUvuyAAEVGRKbryg494.jpg" alt=""></a></li>
            <li style="display:none;"><a href="#"><img src="/ee/images/rBACW1qhBXiAbZ-BAADhvPmxOaI215.jpg" alt=""></a></li>
            <li style="display:none;"><a href="#"><img src="/ee/images/rBACW1qhBM2AcwUxAAECT7yNiJU296.jpg" alt=""></a></li>
            <li><a href="#"><img src="/ee/images/rBACW1qhD2mAOi99AADjhfQ3pQs144.jpg" alt=""></a></li>
            <li><a href="#"><img src="/ee/images/rBACW1qhBJWALU8-AAEMSIzwt6E173.jpg" alt=""></a></li>
        </ul>
        <span class="slider-left"></span> <span class="slider-right"></span> </div>
    <ul class="nav-list">
        <li class="nav-main" v-for="ca in categorys">
            <p> <a href="#"> {{ca.name}} </a> </p>
            <ul>
                <li class="nav-sub clearfix"> <a href="#"> {{ca.name}}</a> <i>&gt;</i>
                    <ul>
                        <li class="nav-item" v-for="cate in ca.categoryList"> <a href="#"> {{cate.name}}</a> </li>

                    </ul>
                </li>

            </ul>
        </li>

    </ul>
</div>
<!-- 专题文章部分 -->

<div class="article"> <a href="#"> <img src="/ee/images/rBACW1owSW6ABrNqAAAWQIF__tQ201.png" alt=""> <span>以花置家，从简治美 | 一周好设计</span> <i>2018-03-08</i> <i>老必</i> </a> </div>

<!-- 模块部分 -->
<div class="category">
    <div class="category-recommend-2">
        <ul class="clearfix">
            <li> <a href="#"> <img src="/ee/images/rBACW1qhC36AMb4GAABi46ahWj0242.jpg" alt=""> </a> </li>
            <li> <a href="#"> <img src="/ee/images/rBACW1qhCZOAOXEzAABXO4E3qe0511.jpg" alt=""> </a> </li>
            <li> <a href="#"> <img src="/ee/images/rBACW1qhCeWAPmcRAABXHhB2vZg748.jpg" alt=""> </a> </li>
        </ul>
    </div>
    <div class="category-recommend-1">
        <div class="category-title">
            <p>精选</p>
        </div>
        <ul>
            <li style="left: 0px;"> <a href="#"> <i></i> <img src="/ee/images/rBACW1qhDBGACMecAADa6XLdYYM545.jpg" alt=""> </a> </li>
            <li class="press" style="padding-left: 10px; left: 620px;"> <a href="#"> <i></i> <img src="/ee/images/rBACW1qhDYeAFGqWAABwv24WRXc926.jpg" alt=""> </a> </li>
            <li class="press" style="padding-left: 10px; left: 712px;"> <a href="#"> <i></i> <img src="/ee/images/rBACYVqhDViAJFlsAABxH9aLtJ8293.jpg" alt=""> </a> </li>
            <li class="press" style="padding-left: 10px; left: 804px;"> <a href="#"> <i></i> <img src="/ee/images/rBACW1qBb6OANBWRAAE4oNU4gxM506.jpg" alt=""> </a> </li>
            <li class="press" style="padding-left: 10px; left: 896px;"> <a href="#"> <i></i> <img src="/ee/images/rBACVFqhDHqAdOV6AAChhUm7rlI888.jpg" alt=""> </a> </li>
            <li class="press" style="padding-left: 10px; left: 988px;"> <a href="#"> <i></i> <img src="/ee/images/rBACYVqhDEiAYdmZAACTOmitXSY895.jpg" alt=""> </a> </li>
        </ul>
    </div>

    <div class="category-recommend-3" v-for="cc in commByCateLimitTen">
        <div class="category-title">
            <p>{{cc.catName}}</p>
            <a :href="'/ee/commodity/CommList.do?catId='+cc.catId" target="_blank">查看全部 &gt;</a> </div>
        <ul class="category-list clearfix">
            <li v-for="comm in cc.comms"> <a :href="'/ee/commodity/detail.do?id='+comm.id" target="_blank"> <i><img :src="comm.mainImg" alt=""></i>
                <dl>
                    <dt>{{comm.name}}</dt>
                    <dd>¥{{comm.price}}</dd>
                </dl>
            </a> </li>

        </ul>
    </div>
    
    <span id="moreModule">下拉加载更多</span> </div>

<!-- 底部栏 -->
<footer id="foot">
    <div class="foot_a">
        <div class="container">
            <div class="bottom_imgslogan">
                <img src="/ee/img/bottom_imgslogan.jpg" />
            </div>
        </div>
    </div>
    <div class="foot_b">
        <div class="container">
            <div class="foot-middle">
                <div>
                    <img src="/ee/img/we.png" alt="">
                    <ul>
                        <li>帮助中心</li>
                        <li><a href="JavaScript:;">平台政策</a></li>
                        <li><a href="JavaScript:;">商家入驻</a></li>
                    </ul>
                </div>
                <div>
                    <img src="/ee/img/we.png" alt="">
                    <ul>
                        <li>配送与支付</li>
                        <li><a href="JavaScript:;">到体验厅支付</a></li>
                        <li><a href="JavaScript:;">支付方式说明</a></li>
                        <li><a href="JavaScript:;">配送费用查询</a></li>
                        <li><a href="JavaScript:;">配货发货时间</a></li>
                    </ul>
                </div>
                <div>
                    <img src="/ee/img/we.png" alt="">
                    <ul>
                        <li>服务保证</li>
                        <li><a href="JavaScript:;">售后服务条款</a></li>
                        <li><a href="JavaScript:;">产品质量保证</a></li>
                        <li><a href="JavaScript:;">发票制度说明</a></li>
                        <li><a href="JavaScript:;">关于假一赔万</a></li>
                    </ul>
                </div>
                <div>
                    <img src="/ee/img/we.png" alt="">
                    <ul>
                        <li>关于我的</li>
                        <li><a href="JavaScript:;">资金管理</a></li>
                        <li><a href="JavaScript:;">我的收藏</a></li>
                        <li><a href="JavaScript:;">我的订单</a></li>
                    </ul>
                </div>
                <div class="ewm_bottom">
                    <img src="/ee/img/ewm_bottom.jpg" />
                </div>
            </div>
        </div>
    </div>
    <div class="foot-bottom">
        <span>Copyright&nbsp;2017.XIUSE.COM</span>
        <span>北京又有科技有限公司</span>
        <span>京ICP备13088531号</span>
    </div>
</footer>
</div>
<script type="text/javascript" src="/ee/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/ee/js/jquery.cookie.js"></script>
<script type="text/javascript" src="/ee/js/md5.js"></script>
<script type="text/javascript" src="/ee/js/masterCommon.js"></script>
<script type="text/javascript" src="/ee/js/jquery.extention.js"></script>
<script type="text/javascript" src="/ee/js/common.js"></script>
<script type="text/javascript" src="/ee/js/index.js"></script>
<script type="text/javascript" src="/ee/js/bytrack.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script>
    var myVue = new Vue({
        el:"#mainComm",
        data:{
            categorys:[],
            commByCateLimitTen:[]
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
                        _this.categorys = d;

                    }
                })


                $.ajax({
                    url:"/ee/commodity/queryCommByCateLimitTen.do",
                    dataType:"json",
                    type:"post",
                    success:function (d) {
                        _this.commByCateLimitTen = d;
                    }
                })
            }
        }
    })
</script>
</body>
</html>