package sot9;

abstract class Phone {
    abstract void themSoDienThoai(String ten, String soDienThoai);
    abstract void xoaSoDienThoai(String ten);
    abstract void capNhatSoDienThoai(String ten, String soDienThoaiMoi);
    abstract PhoneNumber timKiemSoDienThoai(String ten);
    abstract void sapXep();
}
