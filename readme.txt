Ĭ�������:
1�����Ŀ���������WEB-INF����web.xml�е�<servlet-name>���еĵ�����-servlet.xml�ļ�
2spring-mvc.xml
web.xml�������ʹ��ע��,���Ʋ����Ҫ�̳�Controller�ӿڣ���дhandleRequest��������ModelAndView

ublic ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return null;	
			}
3��ͨ���� spring-mvc.xml������bean��ȷ������·��
<bean name="/hello.action" class="com.svse.controller.HelloAction"></bean>