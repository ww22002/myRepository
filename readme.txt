多个请求到同一个Action,
例如:增、删、查、改操作
需要在springmvc.xml中设置

<!-- 注意使用id属性不是name属性 -->
	<bean id="myAction" class="com.svse.controller.MyAction"></bean>
	
	<!--注册映射器SimpleUrlHandlerMapping
		适合多个请求，映射到同一个action
	 -->
	<bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
		<property name="mappings">
			<props>
			<!-- key 表示请求路径 -->
				<prop key="/insert.action">myAction</prop>
				<prop key="/update.action">myAction</prop>
				<prop key="/delete.action">myAction</prop>
				<prop key="/find.action">myAction</prop>
			</props>
		</property>
	</bean>