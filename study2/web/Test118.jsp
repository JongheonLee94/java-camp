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
	
	${100+100} �� �������� �����߰� 
	200 �̶�� ����� ����� ��� ���信 ���Խ��״ٰ� ���� �Ѵ�.
	
	�ֱ��� JSP �� ������ ������ ${...} �� �̿��Ͽ� �� �� �ִ� �����
	�����ߴµ� �̰��� EL �̶�� �Ѵ�. ( Expression Language )

	isELIgnored="true" �� �����Ǹ� ${100+100} �� EL �� �ƴ�
		�ܼ����ڿ��� �ν��Ѵ�. ( �����Ѵ� )
--%>







