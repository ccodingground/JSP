<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/mystyle.css">
</head>
<body>
	<jsp:include page="/WEB-INF/view/header.jsp"></jsp:include>
	<main>
		<h1>메인영역</h1>
		<section class="visual">
			<h1>비주얼영역</h1>
			<div class="main-img">
			
			</div>
		</section>
	</main>
	<jsp:include page="/WEB-INF/view/footer.jsp"></jsp:include>
</body>
</html>