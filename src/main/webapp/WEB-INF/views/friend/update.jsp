<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>friend/update.jsp</title>
</head>
<body>
<script>
	alert("친구 정보가 수정되었습니다.");
	//javascript를 이용해서 redirect 이동 시키기 //controller에서 redirect해주지 않아도 자바스크립트 통해 가능 (알림창띄우고이동하고시플때)
	location.href="list.do"; //요청경로 입력해주기 :상대경로
	//location.href="${pageContext.request.contextPath}/friend/list.do"; //절대경로
</script>
</body>
</html>