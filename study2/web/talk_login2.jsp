<%@page import="study2.Util, java.sql.*, study2.TalkRoomVO"
	pageEncoding="EUC-KR"%><%

String ctxPath = request.getContextPath();


//	문자열 숫자 변환시에 에러발생될 수 있으니 감안한 코드 : Util.parseInt     
int roomNo = Util.parseInt( request.getParameter("roomNo") );
String pwd = request.getParameter("pwd");

if( roomNo == -1 || pwd == null || "".equals(pwd) ) 
{
	response.sendRedirect( ctxPath + "/talk_login.jsp");
	
	//	sendRedirect 이후의 코드는 의미 없다.
	return;
}

Exception err = null;
TalkRoomVO vo = null;

try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection(
		"jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
	
	String sql = "select * from talk_room_t where room_no = ?";
	PreparedStatement stmt = conn.prepareStatement( sql );
	stmt.setInt( 1, roomNo );
	
	ResultSet rs = stmt.executeQuery();
	if( rs.next() ) 
	{
		vo = new TalkRoomVO();
		vo.setRoomNo( rs.getInt("room_no") );
		vo.setApple( rs.getString("apple") );
		vo.setBanana( rs.getString("banana") );
		vo.setOrange( rs.getString("orange") );
	}
	
	rs.close();
	stmt.close();

	conn.close();
}
catch( Exception e ){ err = e; }

if( err != null ) 
{
	response.sendRedirect( ctxPath + "/error.jsp");
	return;
}

if( vo == null ) 
{
	response.sendRedirect( ctxPath + "/talk_login.jsp");
}
else if( vo.getApple().equals( pwd ) ) 
{
	Cookie ck = new Cookie("level","apple");
	response.addCookie( ck );
	
	Cookie ck2 = new Cookie("roomNo", String.valueOf( roomNo ) );
	response.addCookie( ck2 );
	
	response.sendRedirect( ctxPath + "/talk_view_apple.jsp");
}
else if( vo.getBanana().equals( pwd ) ) 
{
	Cookie ck = new Cookie("level","banana");
	response.addCookie( ck );
	
	Cookie ck2 = new Cookie("roomNo", String.valueOf( roomNo ) );
	response.addCookie( ck2 );	
	
	response.sendRedirect( ctxPath + "/talk_view_banana.jsp");
}
else if( vo.getOrange().equals( pwd ) ) 
{
	Cookie ck = new Cookie("level","orange");
	response.addCookie( ck );
	
	Cookie ck2 = new Cookie("roomNo", String.valueOf( roomNo ) );
	response.addCookie( ck2 );
	
	response.sendRedirect( ctxPath + "/talk_view_orange.jsp");
}
else {
	response.sendRedirect( ctxPath + "/talk_login.jsp");
}


%><%-- talk_login2.jsp 
	see : study3.Util class  
	
--%>