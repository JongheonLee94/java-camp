<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"
    import="study2.Util, study2.TalkVO, java.util.*, java.sql.*"%><%
  
	String ctxPath = request.getContextPath();
	  
	Cookie[] cks = request.getCookies();
	if( cks == null ){
		response.sendRedirect( ctxPath + "talk_login.jsp" );
		return;
	}
	  
	int roomNo = -1;
	String level = null;
	  
	for( int i = 0 ; i < cks.length ; i++ ){
		if( cks[i].getName().equals("level") ) {
			level = cks[i].getValue();
		}
		else if( cks[i].getName().equals("roomNo") ) {
			roomNo = Util.parseInt( cks[i].getValue() );
		}  	
	} 
	  
	if( level == null || !level.equals("orange") ) {
		response.sendRedirect( ctxPath + "talk_login.jsp" );
		return;
	}
	  
	List<TalkVO> rl = new ArrayList<TalkVO>();
	Exception err = null;
	  
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
			
		String sql = "select * from talk_t where "+
			"room_no = ? order by talk_no desc";
		PreparedStatement stmt = conn.prepareStatement( sql );
		stmt.setInt( 1, roomNo );
		
		ResultSet rs = stmt.executeQuery();
		while( rs.next() ) {
			TalkVO vo = new TalkVO();
			vo.setTalkNo( rs.getInt("talk_no") );
			vo.setRoomNo( rs.getInt("room_no") );
			vo.setContent( rs.getString("content"));
			rl.add( vo );
		}
		rs.close();
		stmt.close();
		conn.close();
	}
	catch( Exception e ) { err = e; }
	  
	if( err != null ) {
		response.sendRedirect( ctxPath + "/error.jsp" );
		return;  
	}
	
%><!DOCTYPE html>
<html>
<body>
	talk_view_orange.jsp
	<br/>
	<br/>
	<table border="1" cellspacing="0" cellpadding="8">
	<tr>
		<td width="80" align="center">번호</td>
		<td width="500" align="center">내용</td>
	</tr>
	<%
	for( TalkVO vo : rl ) {
		%><tr>
			<td><%=vo.getTalkNo()%></td> 	
			<td><%=vo.getContent()%></td>
		</tr><%	
	}
	%>
	</table>
	
</body>
</html><%-- talk_view_orange.jsp --%>