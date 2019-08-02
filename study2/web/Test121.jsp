<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR" isELIgnored="false"
    import="study2.TalkRoomVO, java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jc"%><%
    
	List<String> rl = new ArrayList<String>();
	rl.add("one");
	rl.add("two");
	rl.add("three");
	rl.add("four");
	request.setAttribute( "rl", rl );
	
%><!DOCTYPE html>
<html><!--

	어제코드와 비교하면 장단점이 있다.
	
	어제코드 : 들여쓰기 정리가 안된다. 어려운 코드 구사할 여지가 많다.
	오늘코드 : 들여쓰기 깔끔 정리. 쓰는 코드밖에는 못쓴다. 

--><body>
	
	<table border="1" cellspacing="0">
		<jc:forEach var="vo" items="${rl}">
			<tr>
				<td>${vo}</td>
			</tr>
		</jc:forEach>
	</table>



	<jc:forEach var="i" begin="0" end="4">
		<jc:choose>
			<jc:when test="${(i%3)==0}">apple</jc:when>		
			<jc:when test="${(i%3)==1}">banana</jc:when>
			<jc:otherwise>orange</jc:otherwise>
		</jc:choose>		
	</jc:forEach>
	
</body>
</html><%--	Test121.jsp

--%>






