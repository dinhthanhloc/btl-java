<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <header>
        <div class="header-logo">
           <img src="" alt="">
        </div>
        <div onclick="toggleNavigation()" class="menu"><i class="fa fa-navicon" style="font-size:24px"></i></div>
        <nav class="header-menu-nav">
            <ul>
                <li><a href="#">Trang chủ</a></li>
                <li>
                    <a href="#">Quản lí đề tài</a>
                    <ul class="menu-sublist">
                        <li><a href="">Danh sách</a></li>
                        <li><a href="">Chấm điểm</a></li>
                        
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
                    <a href="#">Logout</a>
                </div>
            </div>
            <div onclick="toggleNavigation()" class="menu"><i class="fa fa-navicon" style="font-size:24px"></i></div>
         
        
    </header>