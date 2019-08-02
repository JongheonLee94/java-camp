<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
talk_login.jsp <br/>

<%--	POST:택배 , GET:엽서
		GET 방식일때는 주소 옆에 붙어간다. POST 는 내부에 숨겨서 간다.
		- /talk_login2.jsp?roomNo=0&pwd=abcd
		
		강사습관 : html 을 생성하지 않는 곳은 2 를 붙이더라 ...
--%>
<form method="GET" action="talk_login2.jsp">
	<input type="text" name="roomNo" size="4"/>
	<input type="password" name="pwd" size="8"/>
	<input type="submit"/>
</form>

</body>
</html>