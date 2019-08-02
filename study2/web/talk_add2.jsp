<%@ page pageEncoding="EUC-KR"
	import="study2.Util, java.sql.*"%><%
	
	String ctxPath = request.getContextPath();
	String content = Util.h( request.getParameter("content") );

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
	
	if( level == null || roomNo == -1 || level.equals("orange") ) {
		response.sendRedirect( ctxPath + "/talk_login.jsp");
		return;
	}

	Exception err = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@127.0.0.1:1521/XE","HR","HR");
		
		String sql = "insert into talk_t values ( seq_talk.nextval, ?, ? )";
		PreparedStatement stmt = conn.prepareStatement( sql );
		stmt.setInt( 1, roomNo );
		stmt.setString( 2, content );
		stmt.executeUpdate();
		
		stmt.close();
		conn.close();
	}
	catch( Exception e ){ err = e; }
	
	if( err != null ) {
		response.sendRedirect( ctxPath + "/error.jsp");
	} else if( level.equals("apple") ){
		response.sendRedirect( ctxPath + "/talk_view_apple.jsp");
	} else if( level.equals("banana") ) {
		response.sendRedirect( ctxPath + "/talk_view_banana.jsp");
	}
%><%-- talk_add2.jsp --%>







