<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"
    import="java.util.List, study2.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="l"%><%

//	1. 변수선언
	List<BangMyungVO> rl = null;
	Exception err = null; 
    
//	2. DB 연동
	BangMyungDAO dao = new BangMyungDAO_OracleImpl();
	try{
		rl = dao.findAll();
	}
	catch( Exception e ){ err = e; }
	
//	3. 흐름 만들기 
	if( rl == null || err != null ) {
		response.sendRedirect("/study3/error.jsp");
	}	
	else {
	
	request.setAttribute( "rl" , rl );
%><!DOCTYPE html>
<html><body>
	<%--
		vs.count 는 for( int i = 1 ; .. ; i++ ) 의 i 값과 같다고 보면 된다.
		
		간단한 로직은 EL로 구현이 가능하지만 복잡한건 못한다.
		
		java 의 class 의 static 함수를 EL 에서 사용할 수 있다.
		- 이 개념을 이용하면 복잡한 코드를 EL 에서 이용할 수 있더라....
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









