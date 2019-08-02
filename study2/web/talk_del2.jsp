<%@ page pageEncoding="EUC-KR"
	import="study2.Util, java.sql.*"%><%
	String ctxPath = request.getContextPath();

	int talkNo = Util.parseInt( request.getParameter("talkNo") );
	int roomNo = -1;
	String level = null;
	
	Cookie[] cks = request.getCookies();
	if( cks == null ) {
		response.sendRedirect( ctxPath + "/talk_login.jsp");
		return;
	}

	for( int i = 0 ; i < cks.length ; i++ ) {
		if( cks[i].getName().equals("level") ) {
			level = cks[i].getValue();
		}
		else if( cks[i].getName().equals("roomNo") ) {
			roomNo = Util.parseInt( cks[i].getValue() );
		}	
	}

	if( level == null || roomNo == -1 || !level.equals("apple") ) {
		response.sendRedirect( ctxPath + "/talk_login.jsp");
		return;
	}
	
	Exception err = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
			
		String sql = "delete from talk_t where room_no = ? and talk_no = ?";
		PreparedStatement stmt = conn.prepareStatement( sql );
		stmt.setInt( 1, roomNo );
		stmt.setInt( 2, talkNo );
		stmt.executeUpdate();
		stmt.close();
		
		conn.close();
	}
	catch( Exception e ){ err = e; }

	if( err != null ) {
		response.sendRedirect( ctxPath + "/error.jsp");
	} else {
		response.sendRedirect( ctxPath + "/talk_view_apple.jsp");
	}
%><%-- talk_del2.jsp --%>








