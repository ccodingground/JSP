<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/mystyle.css">
<script src="<%=request.getContextPath() %>/js/jquery-3.4.1.min.js"></script>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>-->
<script>
	$(function(){
		//목록보기 버튼 클릭시 처리 이벤트
		$("#btn-list").click(listAction);
		//삭제하기 버튼 클릭시 처리 이벤트
		$("#btn-delete").click(deleteAction);
	});
	function deleteAction(){
		location.href="board-delete.bo?no="+$("#no").val();
		// http://localhost:8080/JSP-MVC-06/board/board-delete.bo?no=319
	}
	function listAction(){
		location.href="board-list.bo";
		/* 
		url주소를 변경시킨다 이동할 페이지 주소를 명시하는게 아니고
		url패턴에 의해 이동하면 된다.
		*/
	}
</script>
</head>
<body>
	<!-- header 영역 -->
	<jsp:include page="/WEB-INF/view/header.jsp"></jsp:include>
	<!-- main 영역-->
	<main>
		<h1>main content 영역</h1>
		<p class="page-tit view-size" >&gt; Forum 상세페이지</p>
		<div id="contents" class="view-size">
			<input  id ="no" type="hidden" name="no" value="${detail.no }">
			<table>
				<tr>
					<td>글번호</td>
					<td>${detail.no }</td>
				</tr>
				<tr>
					<td>작성자</td>
					<td>${detail.writer }, ${detail.reg_date }</td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="titile" value="${detail.title }"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea rows="5" cols="80">${detail.content }</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input id="btn-list" type="button" value="목록보기">
						<input id="btn-edit" type="button" value="수정하기">
						<input id="btn-delete" type="button" value="삭제하기">
					</td>
				</tr>
			</table>
		</div>
	</main>
	<jsp:include page="/WEB-INF/view/footer.jsp"></jsp:include>
</body>
</html>