<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"
    import="java.util.List, study2.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="l"%><%

//	1. ��������
	List<BangMyungVO> rl = null;
	Exception err = null; 
    
//	2. DB ����
	BangMyungDAO dao = new BangMyungDAO_OracleImpl();
	try{
		rl = dao.findAll();
	}
	catch( Exception e ){ err = e; }
	
//	3. �帧 ����� 
	if( rl == null || err != null ) {
		response.sendRedirect("/study3/error.jsp");
	}	
	else {
	
	request.setAttribute( "rl" , rl );
%><!DOCTYPE html>
<html><body>
	<%--
		vs.count �� for( int i = 1 ; .. ; i++ ) �� i ���� ���ٰ� ���� �ȴ�.
		
		������ ������ EL�� ������ ���������� �����Ѱ� ���Ѵ�.
		
		java �� class �� static �Լ��� EL ���� ����� �� �ִ�.
		- �� ������ �̿��ϸ� ������ �ڵ带 EL ���� �̿��� �� �ִ���....
	--%>
	<table border="1" cellspacing="0" cellpadding="8">
		<l:forEach varStatus="vs" var="vo" items="${rl}">
			<tr bgColor="${(vs.count % 2 != 0)?'#aabbcc':'#ccddee'}">
				<td>${vs.count}</td>
				<td>${vo.no}</td>
				<td>${vo.gul}</td>
				<td>${vo.theTime}</td>
			</tr>
		</l:forEach>
	</table>
	
	<form method="POST" action="bangmyung_add2.jsp">
		<input type="text" size="50" name="gul"/>
		<input type="submit"/>
	</form>

</body></html><%-- bangmyung_list_jstl.jsp --%><%
}
%>









