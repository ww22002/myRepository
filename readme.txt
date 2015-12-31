���ϣ��springmvc�ĺ��������ļ�����Ĭ�ϵ�WEB-INFĿ¼�£����ҿ�����������,��ô������web.xml�����ó�ʼ������
<servlet>
    <servlet-name>spring</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <!-- ����springmvc�����ļ�����·�� -->
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>classpath:springmvc.xml</param-value>
    </init-param>
  </servlet>
  
  
 ��springmvc.xml�ļ����м���Ĭ�ϵ�ʵ�֣����ڹ滮�����url��ָ���������Լ�������ͼ
 <!-- ӳ����
		BeanNameUrlHandlerMapping��ʾ��bean��name��url������
		��ѡ,Ĭ��
	 -->
	<bean class="org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping"></bean>
	<!--������ 
		SimpleControllerHandlerAdapter��ʾ����Ѱ��ʵ����Contraoller��Action��
		��ѡ
	 -->
	<bean class="org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter"></bean>
	<!--��ͼ������ 
		InternalResourceViewResolver��ʾͨ��ModelAndView��װ��ͼ�ҵ�������ҳ��
		��ѡ
		
	 -->
	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver"></bean>