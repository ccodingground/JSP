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
	<!-- header 영역 -->
	<jsp:include page="/WEB-INF/view/header.jsp"></jsp:include>
	<!-- main 영역-->
	<main>
		<h1>main content 영역</h1>
		<p class="page-tit view-size" >&gt; Forum 글쓰기</p>
		<div id="contents" class="view-size board-write">
			<form  action="board-write.bo" method="post">
				<ul>
					<li>작성자</li>
					<li><input type="text" name="write"> </li>
				</ul>
				<ul>
					<li>제목</li>
					<li><input type="text" name="title"> </li>
				</ul>
				<ul>
					<li>글내용</li>
					<li><textarea name="content" rows="5" cols="80"></textarea> </li>
				</ul>
				<ul>
					<li>
						<input type="submit" value="글쓰기">
					</li>
		
				</ul>
			</form>
		</div>
	</main>
		<!-- footer 영역 -->
	<jsp:include page="/WEB-INF/view/footer.jsp"></jsp:include>
</body>
</html>