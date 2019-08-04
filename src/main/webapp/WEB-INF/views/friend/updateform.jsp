<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update.do" method="post">
   <input type="hidden" name="num" value="${dto.num }"/>
   번호 <input type="text" value="${dto.num }" disabled/> <!-- 보여주기용 dp용 -->
   <br/>
   이름 <input type="text" name="name" value="${dto.name }"/>
   <br/>
   주소 <input type="text" name="addr" value="${dto.addr }"/>
   <br/>
   <button type="submit">수정확인</button>
</form>
</body>
</html>