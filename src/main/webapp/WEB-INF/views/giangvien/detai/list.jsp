<%@page import="dinhthanhloc.model.DetaiEntity"%>
<%@page import="dinhthanhloc.dao.imp.DeTaiDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@page import="dinhthanhloc.dao.imp.GiangVienDAO"%>
<%@page import="dinhthanhloc.model.DetaiEntity"%>
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
			<div class="list-used">
				<button style="font: size 12px">
					<i class="fa fa-plus-square-o"></i>Thêm Mới
				</button>
				<button style="font: size 12px">
					<i class="	fa fa-check-square-o"></i>Duyệt
				</button>
				<a style="font: size 12px" class="btn btn-primary"
					href="<c:url value='/quan-tri/chamDeTai' />"> <i
					class="fa fa-pencil"></i>Chấm Điểm
				</a>
				<button style="font: size 12px">
					<i class="	fa fa-star-o"></i>Nhập Giải
				</button>
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
								<c:choose>
									<c:when test="${item.getMaTrangThai() == 3}">
										<td><a class="btn btn-primary"
											href="<c:url value='/quan-tri/chamdiem&id=${item.getMaDeTai()}' />">Chấm
												Điểm</a></td>
									</c:when>
									<c:when test="${item.getMaTrangThai() == 2}">
										<td><a class="btn btn-danger" href="#">Đánh Giá</a></td>
									</c:when>
									<c:otherwise>
										<td><a class="btn btn-success" href="#">Xem Thêm</a></td>
									</c:otherwise>
								</c:choose>
							</tr>

						</c:forEach>
					</tbody>
				</table>

			</div>


		</div>


	</div>
</body>
