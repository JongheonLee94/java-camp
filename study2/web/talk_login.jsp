<%@page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<body>
talk_login.jsp <br/>

<%--	POST:�ù� , GET:����
		GET ����϶��� �ּ� ���� �پ��. POST �� ���ο� ���ܼ� ����.
		- /talk_login2.jsp?roomNo=0&pwd=abcd
		
		������� : html �� �������� �ʴ� ���� 2 �� ���̴��� ...
--%>
<form method="GET" action="talk_login2.jsp">
	<input type="text" name="roomNo" size="4"/>
	<input type="password" name="pwd" size="8"/>
	<input type="submit"/>
</form>

</body>
</html>