package sot9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneBook extends Phone {
    private ArrayList<PhoneNumber> danhBaDienThoai;

    public PhoneBook() {
        this.danhBaDienThoai = new ArrayList<>();
    }

    @Override
    void themSoDienThoai(String ten, String soDienThoai) {
        PhoneNumber lienHeDaTonTai = timKiemSoDienThoai(ten);
        if (lienHeDaTonTai == null) {
            List<String> soDienThoaiList = new ArrayList<>();
            soDienThoaiList.add(soDienThoai);
            danhBaDienThoai.add(new PhoneNumber(ten, soDienThoaiList));
        } else {
            lienHeDaTonTai.laySoDienThoai().add(soDienThoai);
        }
    }

    @Override
    void xoaSoDienThoai(String ten) {
        danhBaDienThoai.removeIf(lienHe -> lienHe.layTen().equals(ten));
    }

    @Override
    void capNhatSoDienThoai(String ten, String soDienThoaiMoi) {
        PhoneNumber lienHeDaTonTai = timKiemSoDienThoai(ten);
        if (lienHeDaTonTai != null) {
            List<String> soDienThoaiList = lienHeDaTonTai.laySoDienThoai();
            soDienThoaiList.clear();
            soDienThoaiList.add(soDienThoaiMoi);
        }
    }

    @Override
    PhoneNumber timKiemSoDienThoai(String ten) {
        for (PhoneNumber lienHe : danhBaDienThoai) {
            if (lienHe.layTen().equals(ten)) {
                return lienHe;
            }
        }
        return null;
    }

    @Override
    void sapXep() {
        Collections.sort(danhBaDienThoai, (lienHe1, lienHe2) ->
                lienHe1.layTen().compareToIgnoreCase(lienHe2.layTen()));
    }
}
