<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/mystyle.css">
<script>
	function boardWrite(){
		location.href="board-write-page.bo"
	}
</script>
</head>
<body>
	<!-- header 영역 -->
	<jsp:include page="/WEB-INF/view/header.jsp"></jsp:include>
	<!-- main 영역-->
	<main>
		<h1>main content 영역</h1>
		<p class="page-tit view-size" >&gt; Forum 게시글</p>
		<div class="btn-write view-size">
			<input type="button" value="글쓰기" onclick="boardWrite()">
		</div>
		<div id="contents" class="view-size">
			
			<ul>
				<li>글번호</li>
				<li>제목</li>
				<li>조회수</li>
				<li>작성자</li>
				<li>작성일</li>
			</ul>
			<!-- 게시물데이터 표현 -->
			<c:forEach var="board" items="${list }">
			<ul>
				<li>${board.no }</li>
				<li><a href="<%=request.getContextPath() %>/board/board-detail.bo?no=${board.no }">${board.title }</a></td>
				<li>${board.count }</li>
				<li>${board.writer }</li>
				<li>${board.reg_date }</li>
			</ul>
			</c:forEach>
		</div>
	</main>
	<!-- footer 영역 -->
	<jsp:include page="/WEB-INF/view/footer.jsp"></jsp:include>
</body>
</html>