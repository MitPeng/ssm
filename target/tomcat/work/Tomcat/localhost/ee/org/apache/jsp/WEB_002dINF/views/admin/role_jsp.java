/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-19 09:05:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class role_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>角色管理</title>\r\n");
      out.write("<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/ee/res/bootstrap-table.css\" >\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" id=\"roleId111\">\r\n");
      out.write("<table id=\"table\"></table>\r\n");
      out.write("<div id=\"toolbar\"><div class=\"btn-group\" role=\"group\" aria-label=\"...\">\r\n");
      out.write("  <button type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#roleAddModel\">新增</button>\r\n");
      out.write("  <button type=\"button\" class=\"btn btn-default\">编辑</button>\r\n");
      out.write("  <button type=\"button\" class=\"btn btn-default\">删除</button>\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"roleAddModel\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" >\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">新增角色</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("    <fieldset>\r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Text input-->\r\n");
      out.write("          <label class=\"control-label\" for=\"input01\">角色名：</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input type=\"text\"  id=\"roleName\" class=\"input-xlarge\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"control-group\">\r\n");
      out.write("\r\n");
      out.write("          <!-- Search input-->\r\n");
      out.write("          <label class=\"control-label\">  角色编码：</label>\r\n");
      out.write("          <div class=\"controls\">\r\n");
      out.write("            <input type=\"text\" id=\"roleCode\" class=\"input-xlarge search-query\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </fieldset>\r\n");
      out.write("\t\t\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("        <button type=\"button\" onclick=\"saveRole()\" class=\"btn btn-primary\">保存</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"roleAndUserModel\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" >\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\" id=\"myModalLabel\">选择(<span id=\"roleNameModel\"></span>)所绑定的用户</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\" id=\"roleAndUserModelBody\" style=\"padding-left:30px;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("        <button type=\"button\" onclick=\"saveRoleAndUser()\" class=\"btn btn-primary\">保存</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write(" <script src=\"https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\" ></script>\r\n");
      out.write("<script src=\"/ee/res/bootstrap-table.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function saveRole(){\r\n");
      out.write("\tvar roleName = $(\"#roleName\").val();\r\n");
      out.write("\tvar roleCode = $(\"#roleCode\").val();\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/ee/role/addRole.do\",\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tdata:{roleName:roleName,roleCode:roleCode},\r\n");
      out.write("\t\tsuccess:function(d){\r\n");
      out.write("\t\t\tif(d.code==200){\r\n");
      out.write("\t\t\t\t$('#roleAddModel').modal('hide');\r\n");
      out.write("\t\t\t\t$(\"#table\").bootstrapTable('refresh');\r\n");
      out.write("\t\t\t\t$(\"#roleName\").val(\"\");\r\n");
      out.write("\t\t\t\t$(\"#roleCode\").val(\"\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"新增失败！\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$table = $('#table').bootstrapTable({\r\n");
      out.write("    url: '/ee/role/findRolePage.do',                      //请求后台的URL（*）\r\n");
      out.write("    method: 'get',                      //请求方式（*）\r\n");
      out.write("    toolbar: '#toolbar',              //工具按钮用哪个容器\r\n");
      out.write("    striped: true,                      //是否显示行间隔色\r\n");
      out.write("    cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）\r\n");
      out.write("    pagination: true,                   //是否显示分页（*）\r\n");
      out.write("    sortable: true,                     //是否启用排序\r\n");
      out.write("    sortOrder: \"asc\",                   //排序方式\r\n");
      out.write("    sidePagination: \"server\",           //分页方式：client客户端分页，server服务端分页（*）\r\n");
      out.write("    pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录\r\n");
      out.write("    pageSize: 10,                     //每页的记录行数（*）\r\n");
      out.write("    pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）\r\n");
      out.write("    search: false,                      //是否显示表格搜索\r\n");
      out.write("    strictSearch: true,\r\n");
      out.write("    showColumns: true,                  //是否显示所有的列（选择显示的列）\r\n");
      out.write("    showRefresh: true,                  //是否显示刷新按钮\r\n");
      out.write("    minimumCountColumns: 2,             //最少允许的列数\r\n");
      out.write("    clickToSelect: true,                //是否启用点击选中行\r\n");
      out.write("    //height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度\r\n");
      out.write("    uniqueId: \"ID\",                     //每一行的唯一标识，一般为主键列\r\n");
      out.write("    showToggle: true,                   //是否显示详细视图和列表视图的切换按钮\r\n");
      out.write("    cardView: false,                    //是否显示详细视图\r\n");
      out.write("    detailView: false,                  //是否显示父子表\r\n");
      out.write("    //得到查询的参数\r\n");
      out.write("    queryParams : function (params) {\r\n");
      out.write("        //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的\r\n");
      out.write("        var temp = {   \r\n");
      out.write("            rows: params.limit,                         //页面大小\r\n");
      out.write("            page: (params.offset / params.limit) + 1,   //页码\r\n");
      out.write("            sort: params.sort,      //排序列名  \r\n");
      out.write("            sortOrder: params.order //排位命令（desc，asc） \r\n");
      out.write("        };\r\n");
      out.write("        return temp;\r\n");
      out.write("    },\r\n");
      out.write("    columns: [{\r\n");
      out.write("        checkbox: true,  \r\n");
      out.write("        visible: true                  //是否显示复选框  \r\n");
      out.write("    }, {\r\n");
      out.write("        field: 'roleName',\r\n");
      out.write("        title: '角色名'\r\n");
      out.write("    }, {\r\n");
      out.write("        field: 'roleCode',\r\n");
      out.write("        title: '角色码'\r\n");
      out.write("    }, {\r\n");
      out.write("        field:'id',\r\n");
      out.write("        title: '操作',\r\n");
      out.write("        width: 120,\r\n");
      out.write("        align: 'center',\r\n");
      out.write("        valign: 'middle',\r\n");
      out.write("        formatter: userFormatter\r\n");
      out.write("    } ],\r\n");
      out.write("    onLoadSuccess: function () {\r\n");
      out.write("    },\r\n");
      out.write("    onLoadError: function () {\r\n");
      out.write("        showTips(\"数据加载失败！\");\r\n");
      out.write("    },\r\n");
      out.write("    onDblClickRow: function (row, $element) {\r\n");
      out.write("        var id = row.ID;\r\n");
      out.write("        EditViewById(id, 'view');\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function userFormatter(value, row, index){\r\n");
      out.write("\t\r\n");
      out.write("\treturn \"<a href='javascript:;' class='btn btn-xs blue' onclick=\\\"roleAndUser('\" + value + \"','\" + row.roleName + \"')\\\" title='角色用户绑定'><span class='glyphicon glyphicon-pencil'></span></a>\";\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function roleAndUser(roleId,roleName){\r\n");
      out.write("\t$(\"#roleId111\").val(roleId);\r\n");
      out.write("\t$(\"#roleAndUserModelBody\").html(\"\");\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/ee/user/findAllUser.do\",\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tsuccess:function(d){\r\n");
      out.write("\t\t\t$.each(d,function(i,e){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:\"/ee/role/findUserAndRole.do\",\r\n");
      out.write("\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\t\tdata:{roleId:roleId,userId:e.id},\r\n");
      out.write("\t\t\t\t\tsuccess:function(d){\r\n");
      out.write("\t\t\t\t\t\tif(d.code==200){\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#roleAndUserModelBody\").append('<label class=\"checkbox\">'\r\n");
      out.write("\t\t\t\t\t\t              +'<input type=\"checkbox\" value=\"'+e.id+'\" name=\"userId\" checked=\"checked\">'+e.name \r\n");
      out.write("\t\t\t\t\t\t           +'</label>' );\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#roleAndUserModelBody\").append('<label class=\"checkbox\">'\r\n");
      out.write("\t\t\t\t\t\t              +'<input type=\"checkbox\" value=\"'+e.id+'\" name=\"userId\">'+e.name \r\n");
      out.write("\t\t\t\t\t\t           +'</label>' );\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t$(\"#roleNameModel\").html(roleName);\r\n");
      out.write("\t$(\"#roleAndUserModel\").modal(\"show\");\r\n");
      out.write("}\r\n");
      out.write("function saveRoleAndUser(){\r\n");
      out.write("\tvar roleId = $(\"#roleId111\").val();\r\n");
      out.write("\tvar userIds = \"\";\r\n");
      out.write("\t$('input[name=\"userId\"]:checked').each(function(){ \r\n");
      out.write("\t\tuserIds += $(this).val()+\",\";\r\n");
      out.write("\t}); \r\n");
      out.write("\tconsole.info(userIds);\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl:\"/ee/role/addUserAndRole.do\",\r\n");
      out.write("\t\ttype:\"post\",\r\n");
      out.write("\t\tdataType:\"json\",\r\n");
      out.write("\t\tdata:{roleId:roleId,userIds:userIds},\r\n");
      out.write("\t\tsuccess:function(d){\r\n");
      out.write("\t\t\tif(d.code==200){\r\n");
      out.write("\t\t\t\t$('#roleAndUserModel').modal('hide');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"新增失败！\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
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