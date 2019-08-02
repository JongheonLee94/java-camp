<%@ page import="study2.*"%><%

	Exception err = null;
	String gul = request.getParameter("gul");
		
	BangMyungVO pvo = new BangMyungVO();
	pvo.setGul( gul );
		
	BangMyungDAO dao = new BangMyungDAO_OracleImpl();
	try {
		dao.add( pvo );
	} 
	catch (Exception e) {
		err = e;
	}
	
	if( err != null )
		response.sendRedirect("/study3/error.jsp");
	else
		response.sendRedirect("/study3/bangmyung_list.jsp");
%>