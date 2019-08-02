<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR" 
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
	${100+100}
	${50 > 100}
	${50 gt 100}
	
	${50 >= 50}
	${50 <= 50}
	${50 < 50}
	${50 lt 50}
	
	${true && true}
	${(true)&&(false)}
	${!(true)}
	${not (true)}
	${(30>50)?'apple':'banana'}
	${(30>50)?'apple':((50<40)?'banana':'kiwi')}
</body>
</html><%--
	gt : greater then
	lt : less then 
	
	${100+100} 은 서버에서 동작했고 
	200 이라는 결과를 만들어 내어서 응답에 포함시켰다고 봐야 한다.
	
	최근의 JSP 는 간단한 연산을 ${...} 을 이용하여 할 수 있는 기술을
	포함했는데 이것을 EL 이라고 한다. ( Expression Language )

	isELIgnored="true" 가 설정되면 ${100+100} 은 EL 이 아닌
		단순문자열로 인식한다. ( 무시한다 )
--%>







