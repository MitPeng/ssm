/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-06-13 12:59:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"zh\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>后台管理</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/ee/dist/bootstrap.min.css\">\n");
      out.write("<link href=\"http://www.jq22.com/jquery/font-awesome.4.6.0.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/ee/dist/sidebar-menu.css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".main-sidebar{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50px;\n");
      out.write("\tleft: 0;\n");
      out.write("\theight: 100%;\n");
      out.write("\tmin-height: 100%;\n");
      out.write("\twidth: 230px;\n");
      out.write("\tz-index: 810;\n");
      out.write("\tbackground-color: #222d32;\n");
      out.write(" }\n");
      out.write(" .navbar{\n");
      out.write(" \t\n");
      out.write(" \twidth: 100%;\n");
      out.write(" \theight: 50px;\n");
      out.write(" \tbackground-color: #3c8dbc;\n");
      out.write(" \t    border-radius: 0;\n");
      out.write(" }\n");
      out.write(" .navbarLeft{\n");
      out.write(" \tfloat: left;\n");
      out.write(" \tbackground-color: #367fa9;\n");
      out.write(" \twidth: 230px;\n");
      out.write(" \theight: 100%;\n");
      out.write(" }\n");
      out.write(" .navbarLeft .logo-lg{\n");
      out.write("\tdisplay: block;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("    line-height: 50px;\n");
      out.write("    text-align: center;\n");
      out.write("    font-weight: 300;\n");
      out.write("    font-family: Helvetica, 'Hiragino Sans GB', 'Microsoft Yahei', '微软雅黑', Arial, sans-serif;\n");
      out.write(" }\n");
      out.write("  .navbarLeft .logo-lg b{\n");
      out.write("\n");
      out.write("  \tfont-weight: 800;\n");
      out.write("  }\n");
      out.write("  .navbar .navbar-custom-menu{\n");
      out.write("  position: relative;\n");
      out.write("  \tfloat: right;\n");
      out.write("  }\n");
      out.write("  .navbarRight{\n");
      out.write("  \tmargin-left:230px;width:100%;\n");
      out.write("  } \n");
      out.write("  .navbar .navbar-custom-menu .navbar-nav .right{\n");
      out.write("  \tcolor: #fff;\t\n");
      out.write("  \t    padding-top: 15px;\n");
      out.write("    padding-bottom: 15px;\n");
      out.write("    line-height: 20px;\n");
      out.write("    display: block;\n");
      out.write("    list-style-type: disc;\n");
      out.write("    -webkit-margin-before: 1em;\n");
      out.write("    -webkit-margin-after: 1em;\n");
      out.write("    -webkit-margin-start: 0px;\n");
      out.write("    -webkit-margin-end: 0px;\n");
      out.write("    -webkit-padding-start: 40px;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar\">\n");
      out.write("\t<div class=\"navbarLeft\"><span class=\"logo-lg\">后台管理</span></div>\n");
      out.write("\t<iframe name=\"iframe\" src=\"\" width=\"1600px\" height=\"800px\" scrolling=\"no\" frameborder=\"0\" style=\"margin-top: 100px;margin-left: 50px\"> </iframe>\n");
      out.write("</nav>\n");
      out.write("<aside class=\"main-sidebar\">\n");
      out.write("<section id=\"div_menu\" class=\"sidebar\">\n");
      out.write("  </section>\n");
      out.write(" </aside>\n");
      out.write("\n");
      out.write("<script src=\"http://www.jq22.com/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"/ee/dist/sidebar-menu.js\"></script>\n");
      out.write("<script src=\"/ee/dist/haha.js\"></script>\n");
      out.write("</body>\n");
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