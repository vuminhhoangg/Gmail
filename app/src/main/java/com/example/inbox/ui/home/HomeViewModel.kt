package com.example.inbox.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _emails = MutableLiveData<List<Email>>().apply {
        value = listOf(
            Email("Trung tâm QL & ĐH GT TP. Hà Nội", "01:22 PM", "Trung tâm Quản lý và Điều hành giao thông Thành phố Hà Nội xin trân trọng thông báo thông tin quý khách hàng vừa gia hạn thẻ vé tháng thành công.", true),

            Email("Đỗ Thị I", "5:30 PM", "Mời tham gia khảo sát nhân sự", false),
            Email("Phan Văn J", "6:45 PM", "Thông tin về sự kiện sắp tới", true),
            Email("Công ty TNHH ABC", "8:30 AM", "Thông báo lịch họp tháng sau", false),
            Email("Trung tâm Anh ngữ XYZ", "9:45 AM", "Lịch khai giảng khóa học mới", true),
            Email("Ngân hàng Đông Á", "1:30 PM", "Thông tin ưu đãi mới nhất", false),
            Email("Bệnh viện Hữu Nghị Việt Đức", "11:20 AM", "Hướng dẫn khám sức khỏe định kỳ", true),
            Email("Công ty cổ phần DEF", "10:15 AM", "Mời tham gia hội thảo công nghệ", false),
            Email("Viện Đào tạo Quản lý ABC", "2:45 PM", "Mời tham gia khóa học ngắn hạn", true),
            Email("Trung tâm Tiếng Nhật Sakura", "4:15 PM", "Thư mời tham gia hội thảo ngôn ngữ", true),
            Email("Công ty Logistics 123", "3:00 PM", "Kế hoạch giao hàng tháng tới", false),
            Email("Tập đoàn EFG", "5:30 PM", "Thông báo cập nhật chính sách bảo mật", false),
            Email("Công ty TNHH Dịch vụ Môi trường Việt Nam", "6:45 PM", "Yêu cầu báo cáo tình hình vận hành", true),
        )
    }
    val emails: LiveData<List<Email>> = _emails
}