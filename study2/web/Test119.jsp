<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR" 
    isELIgnored="false"
    import="study2.TalkRoomVO"%><%
    
    request.setAttribute("apple", 100 );
    request.setAttribute("ab", new int[]{1,2,3,4} );
    
    TalkRoomVO vo = new TalkRoomVO();
    vo.setRoomNo( 10101 );
    vo.setApple("청송사과");
    vo.setBanana("제주바나나");
    
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
	실제로 html 안은 복잡한 코드보다 단순한 코드가 훨씬 많다.
	그런 모든 작업을 EL로 처리 가능하면 디자인 속도가 훨씬 빠를 것이다.
	
	request.setAttribute 또는 session.setAttribute 를 통해서 저장된 값은
	키값을 이용해서 EL 에서 사용이 가능하다.
	
	정리. session , request, application 3개 객체는 모두
		void setAttribute(String,Object) ,
		Object getAttribute(String)
		void removeAttribute(String) 을 지원한다. 
		
	EL 이 반응이 좋아서 보다 확장한 기능인 jstl 을 지원하게 되었다.	
	jstl : 태그로 만든 언어 - <if></if> 와 유사 ...
	
	SGML 에서 태그를 처음 도입 
	- 미 국방성에 문서를 전산화 할 수 있는 언어를 개발했다.
	- MathML , MusicML , postscript 등 파생된 서브셋이 엄청 많다.	
	- postscript 이 발전해서 pdf 로 발전 
	- 파생된 것들 중 가장 성공한 것이 XML , html 이다. 
	
	태그의 특징 
	1. 최 외곽의 태그는 단 하나만 존재해야 한다. ( html 태그는 두번 안온다 )
	2. 태그는 중첩해서 선언하지 않는다.
		<banana><apple></apple></banana> : OK
		<banana><apple></banana></apple> : NO
	3. 속성은 시작태그에 선언한다. ( bgColor="red" 이게 속성 )
		<body bgColor="red"></body>
	4. 속성은 key="value" 또는 key='value' 로 선언되어야 한다.
		단 '' 안에 '' 못온다 ( key='va'l'ue' 는 안되고 key="va'l'ue" 은 됨 )
	5. 하나의 태그에서 속성은 두번 선언하지 않는다.
		<body bgColor="red" bgColor="green"></body>
	6. 시작태그가 있으면 반드시 끝 태그가 있다.
		<apple></apple> 과 같이 내용없는 경우 <apple/> 로 쓴다.
		
		: <br/> <input type="text"/> : 이것이 맞는 문법이다.
--%>