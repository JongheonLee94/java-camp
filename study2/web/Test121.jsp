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

	�����ڵ�� ���ϸ� ������� �ִ�.
	
	�����ڵ� : �鿩���� ������ �ȵȴ�. ����� �ڵ� ������ ������ ����.
	�����ڵ� : �鿩���� ��� ����. ���� �ڵ�ۿ��� ������. 

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






