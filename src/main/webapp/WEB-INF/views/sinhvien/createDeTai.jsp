<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<head>
<body>
	<div id="slide">

		<div id="container-dangki">
			<div class="title-dangki">
				<h1>
					Đăng kí đề tài sinh viên
					</h1>
			</div>
			<div class="dangki-form">
				<form:form method="POST" action="/btl-spring/save-login" modelAttribute="deai">
					<div class="form-item">
						<form:label for="detai" path="TenDeTai">Tên đề tài: </form:label> <form:input type="text"
							id="detai" path="TenDeTai" required/>
					</div>

					<div class="form-item">
						<form:label for="giangvien" path="TenDeTai">Giảng viên hướng dẫn </form:label> <form:input
							type="text" id="giangvien" path="TenDeTai"
							placeholder="Nhập tên gv" required/>
					</div>

					<div class="form-item">
						<form:label for="giangvien" path="TenDeTai"> Tên Nhóm </form:label> <form:input type="text"
							path="TenDeTai" id="giangvien" placeholder="Nhập tên nhóm"
							required/>
					</div>

					<div class="form-button">
						<button type="submit">
							<i class="fa fa-paper-plane-o"></i> Lưu
						</button>
						<button type="reset">
							<i class="fa fa-times"></i> Hủy
						</button>

					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
