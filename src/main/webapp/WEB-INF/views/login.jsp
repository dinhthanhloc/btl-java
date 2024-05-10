<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>


<body>
	<div class="title-login">
		<div class="login-logo">
			<img
				src="https://reviewedu.net/wp-content/uploads/2021/11/diem-chuan-dh-giao-thong-van-tai.png"
				alt="#">
		</div>
		<h1>Trường Đại Học Giao Thông Vận Tải</h1>
	</div>
	<div class="container form-signin mt-3 ">
		<span>${message}</span>
		<form:form method="POST" action="/btl-spring/save-login"
			modelAttribute="taikhoan">
			<div class="form-floating">
				<form:label for="floatingInput"   path="Username">Name</form:label>
				<form:input  class="form-control" placeholder="12456789" path="Username" />
			</div>
			<div>
				<form:label path="Password">Id</form:label>
				<form:input path="Password" />
			</div>
			<div>
				<form:radiobutton path="MaLoaiTaiKhoan" value="1"></form:radiobutton>
				Sinh Viên
				<form:radiobutton path="MaLoaiTaiKhoan" value="2"></form:radiobutton>
				Giảng Viên
			</div>
			<div>
				<input type="submit" value="Submit" />
			</div>
		</form:form>
	</div>

</body>
