<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR" isELIgnored="false"
    import="study2.TalkRoomVO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jc"%><%
    
%><!DOCTYPE html>
<html><!--
	jstl �� �±׸� �̿��Ͽ� ������� ����ε� EL�� �����ȴ�.
	�±׿� �ͼ����� �����̳ʿ��Դ� �� ���� �α⸦ ������.
--><body>
	<jc:forEach var="i" begin="0" end="4">
		<jc:out value="${i}"/>
	</jc:forEach>
</body>
</html><%--	Test120.jsp

	�ǽ��ڷ� ������ 
	javax.servlet.jsp.jstl-1.2.1.jar
	javax.servlet.jsp.jstl-api-1.2.1.jar
	
	/WEB-INF/lib ������ �־��ּ���.
	
	( jstl �� XML ���ñ���̾��µ� EL ���� ���� )
--%>






