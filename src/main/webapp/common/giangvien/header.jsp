<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
   
    <body >
        <header>
            <div class="header-logo">
               <img src="/web/accset/img/tải xuống (1).jpg" alt="">
            </div>
            <nav class="header-menu-nav">
                <ul>
                    <li><a href="#">Trang chủ</a></li>
                    <li>
                        <a href="#">Quản lí đề tài</a>
                        <ul class="menu-sublist">
                            <li><a href="<c:url value='/quan-tri/listDeTai' />">Danh sách</a></li>
                            <li><a href="<c:url value='/quan-tri/chamDeTai' />">Chấm điểm</a></li>
                            
                        </ul>
                    </li>
                    <li>
                        <a href="#">Quan lí nhóm</a>
                        <ul class="menu-sublist">
                            <li><a href="">Danh sách nhóm</a></li>
                            <li><a href="">quản lí báo cáo</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#">Trợ giúp</a>
                        <ul class="menu-sublist">
                            <li><a href="">Đăng nhập</a></li>
                            <li><a href="">Quên Mật khẩu</a></li>
                            <li><a href="">Liên hệ</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
            
               
                <div class="search-container">
                    <form action="/search" method="get">
                        <input type="text" placeholder="Search..." name="search">
                        <button type="submit"><i class="fa fa-search"></i></button>
                    </form>
                </div>
                <div class="account-menu">
                    <a href="#"><i class="fa fa-user"> </i> Account</a>
                    <div class="account-submenu">
                        <a href="#">Profile</a>
                        <a href="#">Settings</a>
                        <a href="<c:url value='/logout' />">Logout</a>
                    </div>
                </div>
             
            
        </header>
        
    <script >
   
document.querySelectorAll('.header-menu-nav li').forEach(li => {
  li.addEventListener('click', function() {
    const hasSubMenu = this.querySelector('.menu-sublist');

    
    if (!this.classList.contains('show-sublist') && hasSubMenu) {
      hasSubMenu.style.display = 'block';
      this.classList.add('show-sublist');
    } else {
      hasSubMenu.style.display = 'none';
      this.classList.remove('show-sublist'); 
    }
  });
});

document.querySelector('.account-menu').addEventListener('mouseenter', function() {
    this.querySelector('.account-submenu').style.display = 'block';
});

document.querySelector('.account-menu').addEventListener('mouseleave', function() {
    this.querySelector('.account-submenu').style.display = 'none';
});
const isLoggedIn = true; 
const userData = {
    username: "nguoidung1",
    fullName: "Nguyễn Văn A",
    email: "nguoidung1@gmail.com"
};

function ShowAccountMenu() {
    const accountSubmenu = document.getElementById('accountSubmenu');
    
    if (isLoggedIn) {
      
        accountSubmenu.innerHTML = `
            <p>Xin chào, ${userData.fullName} (${userData.username})</p>
            <p>Email: ${userData.email}</p>
            <a href="#">Hồ sơ</a>
            <a href="#">Cài đặt</a>
            <a href="#">Đăng xuất</a>
        `;
    } else {
       
        accountSubmenu.innerHTML = `
            <a href="#">Đăng nhập</a>
            <a href="#">Đăng ký</a>
        `;
    }
}
    </script>
</body>