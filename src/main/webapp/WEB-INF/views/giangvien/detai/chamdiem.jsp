<%@page import="dinhthanhloc.model.DetaiEntity"%>
<%@page import="dinhthanhloc.dao.imp.DeTaiDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>

<body>
	<div id="slide">
		<div id="container-home">
			<div class="list-select">
				<select name="khoa" id="select-khoa">
					<option value="">Chọn khóa</option>
					<option value="">K64</option>
					<option value="">K63</option>
					<option value="">K62</option>
					<option value="">K61</option>
				</select> <select name="nam" id="select-nam">
					<option value="">Năm Học</option>
					<option value="">2023-2024</option>
					<option value="">2022-2023</option>
					<option value="">2021-2022</option>
					<option value="">2020-2021</option>
				</select> <select name="de-tai" id="select-de-tai">
					<option value="">Tất Cả Đề Tài</option>
					<option value="">Làm Web</option>
					<option value="">Làm App</option>
					<option value="">Làm Game</option>
				</select>
			</div>
			<br>
			<div class="table-home">
				<table>
					<thead>
						<tr>
							<th>Thứ tự</th>
							<th>Tên Đề Tài</th>
							<th>Nhóm thực hiện</th>
							<th>Giảng viên hướng dẫn</th>
							<th>Trạng thái</th>
							<th>Chức năng</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${model.listResult}">

							<tr>
								<td>${item.getMaDeTai()}</td>
								<td>${item.getTenDeTai()}</td>
								<td>${item.getMaNhom()}</td>
								<td>${item.getMaGiangVien()}</td>
								<td>${item.getMaTrangThai()}</td>
								<td><a class="btn btn-primary"
									href="<c:url value='/quan-tri/chamdiem&id=${item.getMaDeTai()}' />">Chấm
										Điểm</a></td>

							</tr>

						</c:forEach>
					</tbody>
				</table>

			</div>


		</div>


	</div>
</body>
