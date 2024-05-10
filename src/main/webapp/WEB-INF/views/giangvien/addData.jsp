<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<body>
	<div class="container-fluid" style="border: 3px dashed #0066FF">
		<br />
		<h2 style="text-align: center">Upload Sinh Viên</h2>
		<br />
		<br />
		<form method="post" action="<c:url value='/quan-tri/addData' />" enctype="multipart/form-data">
			<div class="container">
				<div class="form-group" style="text-align: center">
					<label for="csvfile" style="text-align: center">Chọn File
						CSV Cần Import:</label> <input type="file" name="csvfile"
						class="form-control-file" id="csvfile" />
				</div>
				<div class="d-flex justify-content-center">
					<button type="submit" class="btn btn-primary"
						style="margin-right: 44px" >Tải lên</button>
				</div>

			</div>
		</form>
		<br /> <br />

	</div>
</body>
