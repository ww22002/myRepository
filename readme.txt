�������ͬһ��Action,
����:����ɾ���顢�Ĳ���
��Ҫ��springmvc.xml������

<!-- ע��ʹ��id���Բ���name���� -->
	<bean id="myAction" class="com.svse.controller.MyAction"></bean>
	
	<!--ע��ӳ����SimpleUrlHandlerMapping
		�ʺ϶������ӳ�䵽ͬһ��action
	 -->
	<bean class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
		<property name="mappings">
			<props>
			<!-- key ��ʾ����·�� -->
				<prop key="/insert.action">myAction</prop>
				<prop key="/update.action">myAction</prop>
				<prop key="/delete.action">myAction</prop>
				<prop key="/find.action">myAction</prop>
			</props>
		</property>
	</bean>