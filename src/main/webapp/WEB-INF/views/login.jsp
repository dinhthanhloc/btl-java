<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>


<body>
    <div class="title-login">
        <div class="login-logo">
            <img src="/web/accset/img/tải xuống.png" alt="#">
        </div>
        <h1>Trường Đại Học Giao Thông Vận Tải</h1>
    </div>
	<div class="container form-signin mt-3 ">
        <span>${message}</span>
        <form:form method="POST" 
          action="/btl-spring/save-login" modelAttribute="taikhoan">
             <table>
                <tr>
                    <td><form:label path="Username">Name</form:label></td>
                    <td><form:input path="Username"/></td>
                </tr>
                <tr>
                    <td><form:label path="Password">Id</form:label></td>
                    <td><form:input path="Password"/></td>
                </tr>
                <tr>
                    <td><form:radiobutton path="MaLoaiTaiKhoan" value="1"></form:radiobutton>Sinh Viên</td>
                    <td><form:radiobutton path="MaLoaiTaiKhoan" value="2"></form:radiobutton>Giảng Viên</td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
	</div>

</body>