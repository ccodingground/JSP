<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<header>
	<h1>헤더영역</h1>
	<div id="header-wrap" class="view-size">
		<section class="logo-area height-center-align">
			<h1>로고영역</h1>
			<P><a href="<%=request.getContextPath() %>/">NAVER<span>Developers</span></a></P>
		</section>
		<nav class="lnb height-center-align">
			<h1>로컬메뉴</h1>
			<ul>
				<li>Products</li>
				<li>Documents</li>
				<li>Application</li>
				<li>Naver D2</li>
				<li>Support</li>
				<li><a href="<%=request.getContextPath() %>/board/board-list.bo">Forum</a></li>
			</ul>
		</nav>
		<section class="right-area ">
			<h1>우측영역</h1>
			<div class="item-wrap height-center-align">
				<div class="item">
					<p>API상태</p>
					<input type="search" />
					<input type="button" value="로그인">
				</div>
			</div>
		</section>
	</div>
</header>