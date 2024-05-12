<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giảng Viên</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/a610a0c4b9.js"></script>
<link href="<c:url value='/template/giangvien/header.css' />"
	rel="stylesheet" type="text/css" />
	<link href="<c:url value='/template/giangvien/footer.css' />"
	rel="stylesheet" type="text/css" />
	<link href="<c:url value='/template/giangvien/main.css' />"
	rel="stylesheet" type="text/css" />

</head>
<body id="page-top">

	<%@ include file="/common/giangvien/header.jsp"%>

	<dec:body />

	<%@ include file="/common/giangvien/footer.jsp"%>
	<%-- <script src="<c:url value='/template/giangvien/header.js' />"></script> --%>
</body>
</html>