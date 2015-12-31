默认情况下:
1、核心控制器会在WEB-INF下找web.xml中的<servlet-name>表中的的名字-servlet.xml文件
2spring-mvc.xml
web.xml、如果不使用注解,控制层代码要继承Controller接口，重写handleRequest方法返回ModelAndView

ublic ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return null;	
			}
3、通过在 spring-mvc.xml中设置bean来确定访问路径
<bean name="/hello.action" class="com.svse.controller.HelloAction"></bean>