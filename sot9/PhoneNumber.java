package sot9;

import java.util.List;

public class PhoneNumber {
    private String ten;
    private List<String> soDienThoai;

    public PhoneNumber(String ten, List<String> soDienThoai) {
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public String layTen() {
        return ten;
    }

    public void datTen(String ten) {
        this.ten = ten;
    }

    public List<String> laySoDienThoai() {
        return soDienThoai;
    }

    public void datSoDienThoai(List<String> soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
