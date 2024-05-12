<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<head>
<link href="<c:url value='/template/sinhvien/createNhom.css' />"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="slide">
		<div class="container">
			<div class="header">
				<h3>Đăng Ký Nhóm</h3>
			</div>
			<form action="/btl-spring/save-nhom" method="GET">
				<div class="group">
					<label for="tenDeTai">Tên Nhóm:</label> <input type="text"
						id="tenNhom" name="tenNhom" placeholder="Nhập tên Nhóm" required>
					<hr>
				</div>
				<div id="members-container">
					<div class="thanhvien">
						<label for="maSV">Mã sinh viên:</label> <input type="text" id="maSV"
							name="maSV" placeholder="Nhập mã" required> <label
							for="name">Tên thành viên:</label> <input type="text" id="name"
							name="name" placeholder="Nhập tên" required>
					</div>
				</div>
				<button type="button" onclick="addMemberInput()">Thêm Thành
					Viên</button>
				<button class="mt-2" type="submit">Thêm Nhóm</button>
				<br>

			</form>
		</div>

	</div>
	<script>
		function addMemberInput() {
			var membersContainer = document.getElementById('members-container');
			var newMemberForm = document.createElement('div');
			newMemberForm.classList.add('thanhvien');
			newMemberForm.innerHTML = '<label for="id">Mã thành viên:</label><input type="text" name="id" placeholder="Nhập mã" required>'
					+ '<label for="name">Tên thành viên:</label><input type="text" name="name" placeholder="Nhập tên" required>';
			membersContainer.appendChild(newMemberForm);
		}
	</script>
</body>
