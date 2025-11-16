# 🧩 E-Commerce Product & Service Website - TODO List

---

## I. USER MANAGEMENT
- [ ] Đăng ký tài khoản (Register)
- [ ] Đăng nhập (Login) + JWT Authentication
- [ ] Quên mật khẩu / Đặt lại mật khẩu
- [ ] Cập nhật hồ sơ người dùng (Profile Update)
- [ ] Phân quyền (User / Admin / Seller)
- [ ] Xem lịch sử mua hàng

---

## II. PRODUCT MANAGEMENT
- [ ] CRUD sản phẩm (Create / Read / Update / Delete)
- [ ] Quản lý danh mục sản phẩm (Category)
- [ ] Quản lý tồn kho (Stock)
- [ ] Upload hình ảnh sản phẩm
- [ ] Bộ lọc sản phẩm (giá, danh mục, rating)
- [ ] Tìm kiếm sản phẩm (keyword search)
- [ ] Gợi ý sản phẩm tương tự

---

## III. CART (GIỎ HÀNG)
- [ ] Thêm sản phẩm vào giỏ
- [ ] Cập nhật số lượng
- [ ] Xóa sản phẩm khỏi giỏ
- [ ] Tính tổng tiền tạm thời
- [ ] Lưu giỏ hàng theo user (DB hoặc session)

---

## IV. ORDER & CHECKOUT
- [ ] Tạo đơn hàng mới
- [ ] Chọn địa chỉ giao hàng
- [ ] Chọn phương thức thanh toán (COD / VNPay / Momo)
- [ ] Gửi email xác nhận đơn hàng
- [ ] Cập nhật trạng thái đơn hàng (Pending / Shipping / Done / Cancelled)
- [ ] Xem lịch sử đơn hàng

---

## V. SERVICE MANAGEMENT (TÙY CHỌN)
- [ ] CRUD dịch vụ
- [ ] Đặt lịch dịch vụ (Booking)
- [ ] Quản lý lịch hẹn
- [ ] Gửi thông báo xác nhận lịch hẹn

---

## VI. REVIEW & FEEDBACK
- [ ] Thêm đánh giá sản phẩm
- [ ] Hiển thị đánh giá (rating trung bình, số sao)
- [ ] Admin duyệt / ẩn / xóa bình luận

---

## VII. ADMIN DASHBOARD
- [ ] Trang tổng quan (Dashboard)
- [ ] Quản lý người dùng
- [ ] Quản lý sản phẩm
- [ ] Quản lý đơn hàng
- [ ] Thống kê doanh thu / top sản phẩm
- [ ] Báo cáo doanh số theo ngày / tháng

---

## VIII. BACKEND STRUCTURE
- [ ] Xây project Spring Boot (layers: Controller, Service, Repository)
- [ ] Thiết kế Entity (User, Product, Order, Cart, Review, Category)
- [ ] Cấu hình JPA / Hibernate
- [ ] Viết REST API endpoints
- [ ] Kiểm thử API bằng Postman
- [ ] Cấu hình Security (Spring Security + JWT)
- [ ] Thêm CORS cho frontend

---

## IX. DATABASE & STORAGE
- [ ] Thiết kế sơ đồ database (ERD)
- [ ] Tạo bảng trong PostgreSQL / MySQL
- [ ] Tích hợp file storage (Cloudinary / Local)
- [ ] Seed dữ liệu mẫu (products, users)

---

## X. FRONTEND (UI/UX)
- [ ] Trang chủ (Home Page)
- [ ] Trang danh sách sản phẩm
- [ ] Trang chi tiết sản phẩm
- [ ] Giỏ hàng
- [ ] Thanh toán (Checkout)
- [ ] Hồ sơ người dùng
- [ ] Trang quản trị (Admin Dashboard)
- [ ] Responsive design (Mobile / Tablet)

---

## XI. INFRASTRUCTURE & DEPLOYMENT
- [ ] Dockerize ứng dụng (backend + frontend)
- [ ] Cấu hình môi trường `.env`
- [ ] CI/CD (GitHub Actions / Jenkins)
- [ ] Deploy backend lên Render / Railway / AWS EC2
- [ ] Cấu hình domain + SSL

---

## XII. EXTRA / ADVANCED
- [ ] Tích hợp Redis cache
- [ ] ElasticSearch cho tìm kiếm nâng cao
- [ ] Realtime Notification (WebSocket / Firebase)
- [ ] Hệ thống voucher / mã giảm giá
- [ ] Recommender system (gợi ý sản phẩm)
- [ ] Chatbot / live chat hỗ trợ khách hàng
- [ ] Logging & Monitoring (ELK / Grafana)

---
