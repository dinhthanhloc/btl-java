function toggleNavigation() {
    const navigation = document.querySelector('.header-menu-nav');
    const slide = document.querySelector('#slide');
    
    
    if (navigation.style.display === 'block' || navigation.style.display === '') {
        navigation.style.display = 'none'; 
        slide.classList.remove('active');
    } else {
        navigation.style.display = 'block'; 
        slide.classList.add('active'); 
    }
}

document.querySelectorAll('.header-menu-nav li').forEach(li => {
    li.addEventListener('click', function() {
        
        document.querySelectorAll('.header-menu-nav li').forEach(item => {
            item.classList.remove('show-sublist');
        });
        
        this.classList.add('show-sublist');
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
}ss