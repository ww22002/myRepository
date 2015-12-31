如果需要通过类似于struts2在配置文件中配置逻辑名来访问和返回路径，那么可以设置
	<!-- 配置视图解析器，来设置视图的逻辑名称 -->
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<!-- 配置路径前缀 -->
		<property name="prefix" value="/WEB-INF/sp/"/>
		<!-- 配置路径后缀 -->
		<property name="suffix" value=".jsp"/>
		<!-- 前缀+视图逻辑名+后缀=真实路径 -->
	</bean>