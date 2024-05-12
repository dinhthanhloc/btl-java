
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<header>
		<div class="header-logo">
			<img src="/web/accset/img/tải xuống (1).jpg" alt="">
		</div>
		<nav class="header-menu-nav">
			<ul>
				<li><a href="<c:url value='/trang-chu' />">Trang chủ</a></li>
				<li><a href="<c:url value='/them-detai' />">Quản lí đề tài</a></li>
				<li><a href="<c:url value='/save-detai' />">Quan lí nhóm</a></li>
				<li><a href="#">Trợ giúp</a></li>
			</ul>
		</nav>


		<div class="search-container">
			<form action="/search" method="get">
				<input type="text" placeholder="Search..." name="search">
				<button type="submit">
					<i class="fa fa-search"></i>
				</button>
			</form>
		</div>
		<div class="account-menu">
			<a href="#"><i class="fa fa-user"> </i> Account</a>
			<div class="account-submenu">
				<a href="#">Profile</a> <a href="#">Settings</a> <a href="#">Logout</a>
			</div>
		</div>


	</header>


   

</body>