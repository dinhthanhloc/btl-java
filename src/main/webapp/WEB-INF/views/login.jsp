<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>


<body>
	
	<div id="slidel">
		<div class="title-login">
			<div class="login-logo">
				<img
					src="https://reviewedu.net/wp-content/uploads/2021/11/diem-chuan-dh-giao-thong-van-tai.png"
					alt="#">
			</div>
			<h1>Trường Đại Học Giao Thông Vận Tải</h1>
		</div>
		<div class="container form-signin mt-3 container-login">
			<p>${message}</p>
			<form:form method="GET" action="/btl-spring/save-login"
				modelAttribute="taikhoan" class="form-login">
				<div class="form-floating">
					<form:label for="email"   path="Username"></form:label>
					<form:input id="email" name="email" class="form-control form-input" placeholder="12456789"
						path="Username" />
				</div>
				<div>
					<form:label for="password" path="Password"></form:label>
					<form:input id="password" name="password" class="form-control form-input" path="Password" />
				</div>
				<div class="login-check">
					<form:radiobutton path="MaLoaiTaiKhoan" class="form-check" value="1"></form:radiobutton>
					Sinh Viên
					<form:radiobutton path="MaLoaiTaiKhoan" class="form-check" value="2"></form:radiobutton>
					Giảng Viên
				</div>
				<div>
					<input type="submit" value="Submit" />
				</div>
			</form:form>
		</div>
	</div>
</body>
