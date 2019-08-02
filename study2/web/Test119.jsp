<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR" 
    isELIgnored="false"
    import="study2.TalkRoomVO"%><%
    
    request.setAttribute("apple", 100 );
    request.setAttribute("ab", new int[]{1,2,3,4} );
    
    TalkRoomVO vo = new TalkRoomVO();
    vo.setRoomNo( 10101 );
    vo.setApple("û�ۻ��");
    vo.setBanana("���ֹٳ���");
    
    request.setAttribute("t", vo );
    
%><!DOCTYPE html>
<html>
<body>
	${t.roomNo} ${t.apple} ${t.banana}
	
	${apple}
	${(apple>10)}
	${ab[0]} ${ab[1]} ${ab[2]} ${ab[3]}
</body>
</html><%--
	������ html ���� ������ �ڵ庸�� �ܼ��� �ڵ尡 �ξ� ����.
	�׷� ��� �۾��� EL�� ó�� �����ϸ� ������ �ӵ��� �ξ� ���� ���̴�.
	
	request.setAttribute �Ǵ� session.setAttribute �� ���ؼ� ����� ����
	Ű���� �̿��ؼ� EL ���� ����� �����ϴ�.
	
	����. session , request, application 3�� ��ü�� ���
		void setAttribute(String,Object) ,
		Object getAttribute(String)
		void removeAttribute(String) �� �����Ѵ�. 
		
	EL �� ������ ���Ƽ� ���� Ȯ���� ����� jstl �� �����ϰ� �Ǿ���.	
	jstl : �±׷� ���� ��� - <if></if> �� ���� ...
	
	SGML ���� �±׸� ó�� ���� 
	- �� ���漺�� ������ ����ȭ �� �� �ִ� �� �����ߴ�.
	- MathML , MusicML , postscript �� �Ļ��� ������� ��û ����.	
	- postscript �� �����ؼ� pdf �� ���� 
	- �Ļ��� �͵� �� ���� ������ ���� XML , html �̴�. 
	
	�±��� Ư¡ 
	1. �� �ܰ��� �±״� �� �ϳ��� �����ؾ� �Ѵ�. ( html �±״� �ι� �ȿ´� )
	2. �±״� ��ø�ؼ� �������� �ʴ´�.
		<banana><apple></apple></banana> : OK
		<banana><apple></banana></apple> : NO
	3. �Ӽ��� �����±׿� �����Ѵ�. ( bgColor="red" �̰� �Ӽ� )
		<body bgColor="red"></body>
	4. �Ӽ��� key="value" �Ǵ� key='value' �� ����Ǿ�� �Ѵ�.
		�� '' �ȿ� '' ���´� ( key='va'l'ue' �� �ȵǰ� key="va'l'ue" �� �� )
	5. �ϳ��� �±׿��� �Ӽ��� �ι� �������� �ʴ´�.
		<body bgColor="red" bgColor="green"></body>
	6. �����±װ� ������ �ݵ�� �� �±װ� �ִ�.
		<apple></apple> �� ���� ������� ��� <apple/> �� ����.
		
		: <br/> <input type="text"/> : �̰��� �´� �����̴�.
--%>