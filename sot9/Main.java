package sot9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PhoneBook danhBa = new PhoneBook();

        // Thêm số điện thoại mới
        danhBa.themSoDienThoai("Alice", "123456789");
        danhBa.themSoDienThoai("Bob", "987654321");

        // Tìm kiếm số điện thoại theo tên
        PhoneNumber lienHe = danhBa.timKiemSoDienThoai("Alice");
        if (lienHe != null) {
            System.out.println("Số điện thoại của Alice: " + lienHe.laySoDienThoai());
        } else {
            System.out.println("Không tìm thấy liên hệ.");
        }

        // Cập nhật số điện thoại
        danhBa.capNhatSoDienThoai("Bob", "111222333");

        // Sắp xếp danh bạ theo tên
        danhBa.sapXep();
    }
}
