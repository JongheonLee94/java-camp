<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR" isELIgnored="false"
    import="study2.TalkRoomVO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jc"%><%
    
%><!DOCTYPE html>
<html><!--
	jstl 은 태그를 이용하여 만들어진 언어인데 EL과 연동된다.
	태그에 익숙해진 디자이너에게는 이 쪽이 인기를 끌었다.
--><body>
	<jc:forEach var="i" begin="0" end="4">
		<jc:out value="${i}"/>
	</jc:forEach>
</body>
</html><%--	Test120.jsp

	실습자료 폴더에 
	javax.servlet.jsp.jstl-1.2.1.jar
	javax.servlet.jsp.jstl-api-1.2.1.jar
	
	/WEB-INF/lib 폴더에 넣어주세요.
	
	( jstl 은 XML 관련기술이었는데 EL 에서 도입 )
--%>






