<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<body>
	<%
	String message = (String) request.getAttribute("message");
	if (message == null)
		message = "";
	%>
	<div id="container-dangki">
		<div>
			<h1>Đăng kí đề tài sinh viên</h1>
		</div>
		<p><%=message%></p>
		<div class="dangki-detai">
			<form action="/btl-spring/save-detai" method="GET">
				<div class="group">
					<label for="tenDeTai">Tên Đề tài:</label> <input type="text"
						id="tenDeTai" name="tenDeTai" placeholder="Nhập tên đè tài"
						required>
					<hr>
				</div>
				<div class="group">
					<label for="tenGV">Tên Giảng viên:</label> <input type="text"
						id="tenGV" name="tenGV" placeholder="Nhập tên giảng viên" required>
					<hr>
				</div>
				<div class="group">
					<label for="tenNhom">Tên Nhóm:</label> <input type="text"
						id="tenNhom" name="tenNhom" placeholder="Nhập tên nhóm" required>
					<hr>
				</div>

				<button class="mt-2" type="submit">Thêm</button>
				<br>

			</form>
		</div>
	</div>
</body>
