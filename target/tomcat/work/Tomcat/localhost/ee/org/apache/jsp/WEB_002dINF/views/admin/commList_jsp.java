/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-21 02:54:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class commList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>商品发布列表页</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/ee/dist/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/ee/dist/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/ee/css/base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/ee/css/index.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/ee/css/emit_o.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/ee/css/sku_style.css\">\r\n");
      out.write("    <link href=\"/ee/css/common.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/ee/css/layer.css\" id=\"layuicss-skinlayercss\">\r\n");
      out.write("    <link href=\"/ee/css/ueditor.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/ee/css//codemirror.css\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("        .sure{background: #0099ff;color:#fff;width: 150px;height: 50px;font-size:25px;}\r\n");
      out.write("        .nosure{background: #d8dee3;color:#fff;width: 150px;height: 50px;font-size:25px;}\r\n");
      out.write("        .cusSkuValInput{width: 100px;}\r\n");
      out.write("        .cusSkuTypeInput{width: 120px;}\r\n");
      out.write("        #foot ul li {\r\n");
      out.write("            float: none;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"\" id=\"CommPublish\">\r\n");
      out.write("\r\n");
      out.write("    <div id=\"commodityAdd\" class=\"main\" style=\"\">\r\n");
      out.write("        <form method=\"post\" id=\"dataForm\" action=\"/ee/commodity/addCommodity.do\">\r\n");
      out.write("            <div id=\"spv\"></div>\r\n");
      out.write("            <div class=\"section\" style=\"\">\r\n");
      out.write("               \r\n");
      out.write("                <div class=\"emit-shop\" style=\"\">\r\n");
      out.write("                    <div class=\"title\">\r\n");
      out.write("                        基本信息\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"emit-comtent\" style=\"\">\r\n");
      out.write("                        <dl class=\"dt-dd-left clearfix\" style=\"display: none;\">\r\n");
      out.write("                            <dt><label>已选单品</label></dt>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                                <div class=\"product-view\">\r\n");
      out.write("                                    <ul></ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                        <dl class=\"dt-dd-left clearfix product-title\">\r\n");
      out.write("                            <dt><label>商品标题</label></dt>\r\n");
      out.write("                            <dd><input type=\"text\" name=\"name\" required=\"required\" placeholder=\"请输入商品标题\"><br><span\r\n");
      out.write("                                    style=\"color: red;\"></span></dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <dl class=\"dt-dd-left clearfix product-selling\">\r\n");
      out.write("                            <dt><label>商品卖点</label></dt>\r\n");
      out.write("                            <dd><textarea name=\"salePoint\"></textarea> <br><span style=\"color: red;\"></span></dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <dl class=\"dt-dd-left clearfix product-selling\">\r\n");
      out.write("                            <dt><label>价格</label></dt>\r\n");
      out.write("                            <dd><input style=\"border: 1px solid #e1e1e1;\" type=\"text\" name=\"price\" required=\"required\" placeholder=\"请输入商品价格\"></dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        <dl class=\"dt-dd-left clearfix product-selling\">\r\n");
      out.write("                            <dt><label>库存</label></dt>\r\n");
      out.write("                            <dd><input style=\"border: 1px solid #e1e1e1;\" type=\"text\" name=\"store\" required=\"required\" placeholder=\"请输入商品库存\"> <br><span style=\"color: red;\"></span></dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                       ");
      out.write("\r\n");
      out.write("                        <dl class=\"dt-dd-left clearfix product-title\">\r\n");
      out.write("                            <dt><label>商品类别</label></dt>\r\n");
      out.write("                            <input type=\"hidden\" name=\"cid\" v-model=\"pid\"/>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                                <div class=\"dropup\">\r\n");
      out.write("                                    <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu2\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                        {{commInfo}}\r\n");
      out.write("                                        <span class=\"caret\"></span>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                    <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu2\">\r\n");
      out.write("\r\n");
      out.write("                                        <li  v-bind:class=\"{ 'dropdown-header': commCate.pid == 0 }\"  v-for=\"commCate in commCategorys\" v-if=\"\"><a href=\"#\" @click=\"categorySelect(commCate.id,commCate.name)\">{{commCate.name}}</a> </li>\r\n");
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("\r\n");
      out.write("                        <dl class=\"dt-dd-left clearfix\">\r\n");
      out.write("                            <dt><label>商品图片</label></dt>\r\n");
      out.write("                            <dd><p class=\"ts\"><span style=\"color: red;\">请上传等宽等高的图片</span>商品主图大小不能超过3MB；700*700以上图片上传后商品详情页自动提供放大镜功能。商品白底图可增加首页曝光机会\r\n");
      out.write("                            </p>\r\n");
      out.write("                                <div class=\"product-view\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"commImgOne\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"commImgTwo\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"commImgThree\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"commImgFour\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"commImgFive\">\r\n");
      out.write("\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li id=\"commImgOne\" flag=\"file\"\r\n");
      out.write("                                            file-data=\"{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}\"\r\n");
      out.write("                                            class=\"\"><span>商品主图</span></li>\r\n");
      out.write("                                        <li id=\"commImgTwo\" flag=\"file\"\r\n");
      out.write("                                            file-data=\"{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}\"\r\n");
      out.write("                                            class=\"\"></li>\r\n");
      out.write("                                        <li id=\"commImgThree\" flag=\"file\"\r\n");
      out.write("                                            file-data=\"{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}\"\r\n");
      out.write("                                            class=\"\"></li>\r\n");
      out.write("                                        <li id=\"commImgFour\" flag=\"file\"\r\n");
      out.write("                                            file-data=\"{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}\"\r\n");
      out.write("                                            class=\"\"></li>\r\n");
      out.write("                                        <li id=\"commImgFive\" flag=\"file\"\r\n");
      out.write("                                            file-data=\"{ext:'jpg|png|gif',onCompleteCallBack:'imgUploadEnd'}\"\r\n");
      out.write("                                            class=\"\"><span>商品底图</span></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                   </div>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span\r\n");
      out.write("                            id=\"imgRed\" style=\"color: red;\"></span>\r\n");
      out.write("                        <dl class=\"dt-dd-left clearfix\" style=\"\">\r\n");
      out.write("                            <dt><label>商品描述</label></dt>\r\n");
      out.write("                            <dd class=\"check\" style=\"width: 780px;\">\r\n");
      out.write("                                    <textarea id=\"commDetail\" style=\"width: 100%;height: 500px;\" name=\"detail\"></textarea>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"buton clearfix\"><input type=\"submit\"  value=\"发布\" class=\"sure\">\r\n");
      out.write("                        &nbsp; &nbsp;\r\n");
      out.write("                        <input type=\"reset\" value=\"重置\" class=\"sure\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/ee/js/jquery.min.js\"></script>\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/ee/js/ajaxupload.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 配置文件 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/ee/ueditor/ueditor.config.js\"></script>\r\n");
      out.write("<!-- 编辑器源码文件 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/ee/ueditor/ueditor.all.js\"></script>\r\n");
      out.write("<!-- 开发环境版本，包含了用帮助的命令行警告 -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/vue/dist/vue.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function imgUploadEnd(file,r,curObj) {\r\n");
      out.write("        var id = curObj.attr(\"id\");\r\n");
      out.write("        $(\"[name=\"+id+\"]\").val(r.url);\r\n");
      out.write("        curObj.html(\"<img src='\"+r.url+\"'>\")\r\n");
      out.write("    }\r\n");
      out.write("    var ue = UE.getEditor('commDetail');\r\n");
      out.write("\r\n");
      out.write("    // var ue = UE.getEditor('container', {\r\n");
      out.write("    //     toolbars: [\r\n");
      out.write("    //         ['fullscreen', 'source', 'undo', 'redo', 'bold']\r\n");
      out.write("    //     ],\r\n");
      out.write("    //     autoHeightEnabled: true,\r\n");
      out.write("    //     autoFloatEnabled: true\r\n");
      out.write("    // });\r\n");
      out.write("    var CommPublish = new Vue({\r\n");
      out.write("        el:\"#CommPublish\",\r\n");
      out.write("        data:{\r\n");
      out.write("            commCategorys:[],\r\n");
      out.write("            commInfo:\"请选择商品类别\",\r\n");
      out.write("            pid:0\r\n");
      out.write("        },\r\n");
      out.write("        created:function(){\r\n");
      out.write("            this.findCommCategorys();\r\n");
      out.write("        },\r\n");
      out.write("        methods:{\r\n");
      out.write("            findCommCategorys:function () {\r\n");
      out.write("                var _this = this;\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url:\"/ee/commodity/categorys.do\",\r\n");
      out.write("                    data:{pid:0},\r\n");
      out.write("                    dataType:\"json\",\r\n");
      out.write("                    type:\"post\",\r\n");
      out.write("                    success:function (d) {\r\n");
      out.write("                        $.each(d,function (i,e) {\r\n");
      out.write("                            _this.commCategorys.push(e);\r\n");
      out.write("                            $.each(e.categoryList,function (ii,ee) {\r\n");
      out.write("                                _this.commCategorys.push(ee);\r\n");
      out.write("                            })\r\n");
      out.write("                        })\r\n");
      out.write("                        console.info( _this.commCategorys);\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            },\r\n");
      out.write("            categorySelect:function (pid,cname) {\r\n");
      out.write("                this.commInfo = cname;\r\n");
      out.write("                this.pid = pid;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
