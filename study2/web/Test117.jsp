<%@ page contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%><%!
String getColor() {
	char[] chs = "0123456789abcdef".toCharArray();
	StringBuffer sb = new StringBuffer();
	for( int i = 0 ; i < 6 ; i++ ) {
		int idx = (int)( Math.random() * 16 );
		sb.append( chs[idx] ); 
	}	
	return sb.toString();
}    
%>
<!DOCTYPE html>
<html>
<body>
	<table border="1" cellspacing="0" cellpadding="8"><%
		for( int i = 1 ; i < 10 ; i++ ) {
			%><tr><%
			for( int j = 1 ; j < 10 ; j++ ) {
				%><td bgColor="#<%=getColor()%>"> 
					<%=j%> * <%=i%> = <%=i*j%> 
				</td><%
			}
			%></tr><%
		}
	%></table>
</body>
</html><%-- Test117.jsp --%>








