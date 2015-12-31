如果希望springmvc的核心配置文件不在默认的WEB-INF目录下，并且可以随意起名,那么可以在web.xml中设置初始化参数
<servlet>
    <servlet-name>spring</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <!-- 设置springmvc配置文件访问路径 -->
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>classpath:springmvc.xml</param-value>
    </init-param>
  </servlet>
  
  
 在springmvc.xml文件中有几个默认的实现，用于规划请求的url，指定控制器以及返回视图
 <!-- 映射器
		BeanNameUrlHandlerMapping表示将bean的name当url的请求
		可选,默认
	 -->
	<bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"></bean>
	<!--适配器 
		SimpleControllerHandlerAdapter表示用于寻找实现了Contraoller的Action类
		可选
	 -->
	<bean class="org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter"></bean>
	<!--视图解析器 
		InternalResourceViewResolver表示通过ModelAndView封装视图找到真正的页面
		可选
		
	 -->
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver"></bean>