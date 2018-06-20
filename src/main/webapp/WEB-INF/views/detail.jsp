<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品详情页</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/Font-Awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/layui-v2.2.5/css/layui.css">
    <link rel="stylesheet" href="/css/base.css" />
    <link rel="stylesheet" type="text/css" href="/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="/css/buy.css">
</head>
<body>


<div class="mains">
    <div class="section">
        <div class="product clearfix">
            <div class="top clearfix">
                <!-- 宝贝轮播开始 -->
                <div class="preview left">
                    <div id="vertical" class="bigImg"> <img src="${comm.mainImg}" width="400" height="400" alt="" id="midimg" />
                        <div style="display:none;" id="winSelector"></div>
                    </div>
                    <!--bigImg end-->

                    <div class="smallImg">
                        <div id="imageMenu">
                            <ul>
                                <li id="onlickImg"><img src="${commImgOne}" width="68" height="68" alt="洋妞"/></li>
                                <li><img src="${commImgTwo}" width="68" height="68" alt="洋妞"/></li>
                                <li><img src="${commImgThree}" width="68" height="68" alt="洋妞"/></li>
                                <li><img src="${commImgFour}" width="68" height="68" alt="洋妞"/></li>
                                <li><img src="${commImgFive}" width="68" height="68" alt="洋妞"/></li>
                            </ul>
                        </div>
                    </div>
                    <!--smallImg end-->

                    <div id="bigView" style="display:none;"><img width="800" height="800" alt="" src="" /></div>
                </div>
                <!-- 宝贝轮播结束 -->
                <div class="synopsis left">
                    <h4>${comm.name}</h4>
                    <div class="news">${comm.salePoint}</div>
                    <div class="tag">
                        <dl class="tag-group tag-price clearfix">
                            <dt>售价：</dt>
                            <dd><span class="price-ico"></span><span class="price">${comm.price}</span></dd>

                        </dl>


                        <dl class="tag-group tag-number clearfix">
                            <dt>数量：</dt>
                            <dd>
                                <input class="left number" type="text" value="1">
                                <div class="left ad-sub">
                                    <span class="icon-angle-up"></span>
                                    <span class="icon-angle-down"></span>
                                </div>
                                <div class="surplus left">（库存${comm.store}件）</div>
                            </dd>
                        </dl>
                    </div>
                    <dl style="padding:10px 0;" class="cz">
                        <dt></dt>
                        <dd>
                            <span class="attention left">关注</span>
                            <!-- JiaThis Button BEGIN -->
                            <div class="jiathis_style left">
                                <span class="jiathis_txt" style="color:#666;">分享到：</span>
                                <a class="jiathis_button_tools_1"></a>
                                <a class="jiathis_button_tools_4"></a>
                                <a href="http://www.jiathis.com/share" class="jiathis jiathis_txt jiathis_separator jtico jtico_jiathis" target="_blank">分享</a>
                                <a class="jiathis_counter_style"></a>
                            </div>
                            <script type="text/javascript" src="http://v3.jiathis.com/code/jia.js" charset="utf-8"></script>
                            <!-- JiaThis Button END -->
                        </dd>
                    </dl>
                    <dl class="action">
                        <dt>
                            <a href="#">加工定制服务</a>
                            <a href="#">安装服务</a>
                            <a href="#">立即购买</a>
                            <a href="javascript:val(0)">加入购物车</a>
                        <dt>
                    </dl>
                </div><!--
	    				<div class="buness-wap left">

	    				</div> -->
            </div>
            <div class="bottom">
                <div class="content left">
                    <div class="tab">
                        <span class="hover">详情</span>
                        <span>评论详情</span>
                    </div>
                    <div class="conttent-info">
                        <div class="info-tag">
                            <table cellpadding="0" cellspacing="0">
                                <tr>
                                    <th>商品名称</th>
                                    <td>嗅色匠作JY2015</td>
                                    <th>商品编号</th>
                                    <td>JY2015</td>
                                    <th>成份</th>
                                    <td>100%棉</td>
                                    <th>颜色分类</th>
                                    <td>黑色</td>
                                </tr>
                                <tr>
                                    <th>商品重量</th>
                                    <td>120g/米</td>
                                    <th>商品尺寸</th>
                                    <td>宽幅140CM</td>
                                    <th>洗涤说明</th>
                                    <td>不可水洗</td>
                                    <th>使用范围</th>
                                    <td>窗帘/家具</td>
                                </tr>
                                <tr>
                                    <th>
                                        工艺
                                    </th>
                                    <td colspan="7">提花</td>
                                </tr>
                                <tr>
                                    <th>
                                        补充说明
                                    </th>
                                    <td colspan="7">EMP服饰提供电子发票，具体操作详见【售后说明】，如需要纸质发票需在备注中说明。</td>
                                </tr>
                            </table>
                        </div>

                        <div class="info-infos">
                           ${comm.detail}
                        </div>
                    </div>
                    <div class="content-comment">
                        <div class="comment-replay">
                            <div class="layui-form-item layui-form-text" style="margin-top:25px;">
                                <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
                                <!-- <div class="layui-input-block">
                                  <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
                                </div> -->
                            </div>
                            <div class="layui-form-item">
                                <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
                            </div>
                        </div>
                        <div class="comment-item">
                            <div class="comment-list">
                                <div class="user-clum left">
                                    <div class="user-info">
                                        <img src="img/toux2.jpg" alt="" />
                                        索德斯奈
                                    </div>
                                </div>
                                <div class="comment-cont">
                                    <div class="comment-star">
                                        <span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i></span>
                                    </div>
                                    <div class="comment-info">
                                        特别满意～买来送男友的圣诞礼物～本来打算买卡片式超薄的充电宝，但是容量都感觉不满意，总算是看到了这一款，整个充电宝非常小巧，只有一张公交卡大小，厚度也还行，重量的话还是有一点儿的，不过已经很轻巧啦，整体非常满意，男友也很喜欢！最后还是得吐槽一点，太容易沾指纹了！！
                                    </div>
                                    <div class="pic-list clearfix">
                                        <a href="#" class="left">
                                            <img src="img/1233.jpg" />
                                        </a>
                                        <a href="#" class="left">
                                            <img src="img/mid/03.jpg" />
                                        </a>
                                    </div>
                                    <div class="comment-message clearfix">
                                        <div class="order-info left">
                                            <span>原装LG电芯 男神款 深海蓝</span>
                                            <span>2017-12-25 16:53</span>
                                        </div>
                                        <div class="comment-op right">
                                            <a href="#">2</a>
                                            <a href="#">8</a>
                                        </div>
                                    </div>
                                    <div class="recomment-con">
                                        <dl class="rect">
                                            <dt>索德斯奈&nbsp;&nbsp;回复：</dt>
                                            <dd>能与小主相见乃是今生有幸，真真极好，便欲罢不能，总是心心念着，今儿个春光明媚，见着小主，心里真是极开心的哦，咱家宝贝小主就妥妥的用吧，有啥问题尽管找咱家的客服妹子哦，感谢您对爱国者的支持。</dd>
                                        </dl>
                                        <div class="time">2017.12.07</div>
                                    </div>
                                </div>
                            </div>
                            <div class="comment-list">
                                <div class="user-clum left">
                                    <div class="user-info">
                                        <img src="img/toux2.jpg" alt="" />
                                        索德斯奈
                                    </div>
                                </div>
                                <div class="comment-cont">
                                    <div class="comment-star">
                                        <span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i></span>
                                    </div>
                                    <div class="comment-info">
                                        特别满意～买来送男友的圣诞礼物～本来打算买卡片式超薄的充电宝，但是容量都感觉不满意，总算是看到了这一款，整个充电宝非常小巧，只有一张公交卡大小，厚度也还行，重量的话还是有一点儿的，不过已经很轻巧啦，整体非常满意，男友也很喜欢！最后还是得吐槽一点，太容易沾指纹了！！
                                    </div>
                                    <div class="pic-list clearfix">
                                        <a href="#" class="left">
                                            <img src="img/1233.jpg" />
                                        </a>
                                        <a href="#" class="left">
                                            <img src="img/mid/03.jpg" />
                                        </a>
                                    </div>
                                    <div class="comment-message clearfix">
                                        <div class="order-info left">
                                            <span>原装LG电芯 男神款 深海蓝</span>
                                            <span>2017-12-25 16:53</span>
                                        </div>
                                        <div class="comment-op right">
                                            <a href="#">2</a>
                                            <a href="#">8</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="bune-wap right">
                    <div class="buness">
                        <div class="tle">
                            <a href="#"><span></span><i>Cerulean美妆</i></a>
                        </div>
                        <div class="supplier-info clearfix">
                            <div class="supplier-logo">
                                <a href="#">
                                    <img src="img/img2.png" />
                                </a>
                            </div>
                            <ul>
                                <li>商品质量：<i>4.8</i></li>
                                <li>服务态度：<i>4.9</i></li>
                            </ul>

                            <a class="supplier-into" href="#">进店看看</a>
                        </div>
                    </div>
                    <div class="recoment">
                        <div class="title">
                            热门推荐
                        </div>
                        <dl class="list">
                            <dt>
                                <a href="#"><img src="img/recoment1.jpg" /></a>
                            </dt>
                            <dt>
                                <a href="#"><img src="img/recoment1.jpg" /></a>
                            </dt>
                        </dl>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<footer id="foot">
    <div class="container">
        <div class="foot-middle">
            <div>
                <img src="img/we.png" alt="" />
                <ul>
                    <li>帮助中心</li>
                    <li><a href="JavaScript:;">平台政策</a></li>
                    <li><a href="JavaScript:;">商家入驻</a></li>
                </ul>
            </div>
            <div>
                <img src="img/we.png" alt="" />
                <ul>
                    <li>关于我们</li>
                    <li><a href="JavaScript:;">了解嗅色</a></li>
                    <li><a href="JavaScript:;">加入嗅色</a></li>
                    <li><a href="JavaScript:;">联系我们</a></li>
                </ul>
            </div>
            <div>
                <img src="img/we.png" alt="" />
                <ul>
                    <li>配送与支付</li>
                    <li><a href="JavaScript:;">到体验厅支付</a></li>
                    <li><a href="JavaScript:;">支付方式说明</a></li>
                    <li><a href="JavaScript:;">配送费用查询</a></li>
                    <li><a href="JavaScript:;">配货发货时间</a></li>
                </ul>
            </div>
            <div>
                <img src="img/we.png" alt="" />
                <ul>
                    <li>服务保证</li>
                    <li><a href="JavaScript:;">售后服务条款</a></li>
                    <li><a href="JavaScript:;">产品质量保证</a></li>
                    <li><a href="JavaScript:;">发票制度说明</a></li>
                    <li><a href="JavaScript:;">关于假一赔万</a></li>
                </ul>
            </div>
            <div>
                <img src="img/we.png" alt="" />
                <ul>
                    <li>关于我的</li>
                    <li><a href="JavaScript:;">资金管理</a></li>
                    <li><a href="JavaScript:;">我的收藏</a></li>
                    <li><a href="JavaScript:;">我的订单</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="foot-bottom">
        <span>Copyright&nbsp;2017.XIUSE.COM</span>
        <span>北京又有科技有限公司</span>
        <span>京ICP备13088531号</span>
    </div>
</footer>
<script type="text/javascript" src="js/jquery.1.4.2-min.js"></script>
<!-- 宝贝轮播 开始-->
<script type="text/javascript" src="js/view.js"></script>
<!-- 宝贝轮播 结束-->
<script type="text/javascript" src="js/vue.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-paginator.js"></script>
<script src="/css/layui-v2.2.5/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function(data){
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });


    });
</script>

</body>
</html>

