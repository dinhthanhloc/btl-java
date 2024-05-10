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
				<form action="">
					<div class="form-item">
						<label for="detai">Tên đề tài: </label> <input type="text"
							id="detai" name="detai" required>
					</div>

					<div class="form-item">
						<label for="giangvien">Giảng viên hướng dẫn </label> <input
							type="text" name="giangvien" id="giangvien"
							placeholder="Nhập tên gv" required>
					</div>
					<div class="form-item">
						<label for="khoa">Khoa xét duyệt đề tài:</label> <select
							name="khoa" id="khoa">
							<option value="">Chọn</option>
							<option value="">CNTT</option>
							<option value="">Cơ Khí</option>
							<option value="">Kinh Tế</option>
							<option value="">Ngôn Ngữ</option>
						</select>
					</div>

					<div class="form-item">
						<label for="giangvien"> Tên Nhóm </label> <input type="text"
							name="giangvien" id="giangvien" placeholder="Nhập tên nhóm"
							required>
					</div>

					<div class="form-button">
						<button type="submit">
							<i class="fa fa-paper-plane-o"></i> Lưu
						</button>
						<button type="reset">
							<i class="fa fa-times"></i> Hủy
						</button>

					</div>
				</form>
			</div>
		</div>
	</div>
</body>
