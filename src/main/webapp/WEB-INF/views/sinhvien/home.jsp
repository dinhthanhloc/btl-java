<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
<div id="slide">
  <div class="img-container">
    <div class="content-img ">
      <img src="/web/accset/img/tải xuống (2).jpg" alt="Mô tả về hình ảnh của bạn">
    </div>
    <div class="content-img">
      <img src="/web/accset/img/tải xuống (1).jpg" alt="Mô tả về hình ảnh của bạn">
    </div>
    <div class="content-img">
      <img src="/web/accset/img/tải xuống (2).jpg" alt="Mô tả về hình ảnh của bạn">
    </div>
    <div class="content-img">
      <img src="/web/accset/img/tải xuống (1).jpg" alt="Mô tả về hình ảnh của bạn">
    </div>
  </div>
  <div class="info-container">
  
    <div class="info-item">
      <h3><i class="	fa fa-mortar-board"></i> Phương Pháp học tập khoa học </i></h3>
      <i>Tạo thẻ ghi chú cho thông tin cần nhớ, bạn có thể sử dụng thẻ ghi chú cho hầu hết chủ đề, và đây là công cụ tuyệt vời dành cho việc tự kiểm tra kiến thức. Hãy sử dụng thẻ ghi chú để học từ vựng, công thức toán, sự kiện và nhân vật lịch sử, tiến trình và dữ kiện khoa học, v.v.</i>
    </div>
    <div class="info-item">
      <h3><i class="	fa fa-handshake-o"></i> Cam kết sinh viên ra trường có việc làm </h3>
      <i>Nhà trường không ngừng đẩy mạnh mối quan hệ chặt chế giữa nhà trường và doanh nghiệp, triển khai ký kết hợp tác đào tạo gắn liền với cung ứng nguồn nhân lực sau đào tạo với các Tập đoàn kinh tế lớn</i>
    </div>
    <div class="info-item">
      <h3><i class="	fa fa-handshake-o"></i> Môi trường học tập năng động </h3>
      <i>Nhà trường không ngừng đẩy mạnh mối quan hệ chặt chế giữa nhà trường và doanh nghiệp, triển khai ký kết hợp tác đào tạo gắn liền với cung ứng nguồn nhân lực sau đào tạo với các Tập đoàn kinh tế lớn</i>
    </div>
  </div>
  <div class="new-container">
    <div class="new-title">
      <h2>Thông báo mới nhất</h2>
    </div>
    <div class="new-list">
    <div class="new-item">
      <div class="new-img">
        <img src="/web/accset/img/tải xuống (1).jpg" alt="">
      </div>
      <p>Trường ĐH Giao thông Vận tải - 62 năm đồng hành cùng sự phát triển đất nước</p>
      <p> Là một trong những cơ sở đào tạo bậc cao đầu tiên được thành lập tại Đông Dương, trải qua nhiều thời kỳ phát triển, trường ĐH GTVT luôn đồng hành cùng đất nước trong đào tạo nhân lực chất lượng cao trong lĩnh vực giao thông vận tải.</p>
    </div>
    <div class="new-item">
      <div class="new-img">
        <img src="/web/accset/img/tải xuống (1).jpg" alt="">
      </div>
      <p>  Khẳng định vị thế dẫn đầu trong nghiên cứu, đào tạo lĩnh vực giao thông vận tải</p>
      <p>Trường có nhiệm vụ đào tạo nguồn nhân lực cho lĩnh vực giao thông vận tải như hàng hải, hàng không, đường bộ, đường sông, đường sắt...

        Với bề dày truyền thống hơn 35 năm và giá trị cốt lõi “Đoàn kết-Nhân văn-Chất lượng-Sáng tạo-Hội nhập”, thời gian qua, trường đã đạt được những thành tích nổi bật trong công tác đào tạo, nghiên cứu khoa học, hợp tác quốc tế, xây dựng cơ sở vật chất...</p>
    </div>
    <div class="new-item">
      <div class="new-img">
        <img src="/web/accset/img/tải xuống (1).jpg" alt="">
      </div>
      <p>Trường Đại học Giao thông Vận tải kỷ niệm 62 năm thành lập</p>
      <p> Sáng 20/3, tại Hà Nội, Trường Đại học Giao thông Vận tải tổ chức Lễ kỷ niệm 62 năm thành lập Trường (24.3.1962 – 24.3.2024). Chủ nhiệm Ủy ban Văn hóa, Giáo dục Nguyễn Đắc Vinh tham dự Lễ kỷ niệm.</p>
    </div>
  </div>
  </div>
  </div>
  <script>
    var slideIndex = 0;

    function showSlides() {
      var i;
      var slides = document.getElementsByClassName("content-img");
      for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";  
      }
      slideIndex++;
      if (slideIndex > slides.length) {slideIndex = 1}    
      slides[slideIndex-1].style.display = "block";  
      setTimeout(showSlides, 3000); 
    }
    showSlides();
  </script>
</body>

