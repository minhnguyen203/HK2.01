public class Main {
    public static void main(String[] args) {
        // Tạo hai đối tượng PhanSo
        PhanSo ps1 = new PhanSo(3, 4);
        PhanSo ps2 = new PhanSo(2, 5);

        // In phân số ban đầu
        System.out.print("Phân số 1: ");
        ps1.inPhanSo();

        System.out.print("Phân số 2: ");
        ps2.inPhanSo();

        // Rút gọn phân số
        System.out.println("Rút gọn phân số 1:");
        ps1.rutGonPhanSo();
        ps1.inPhanSo();

        // Nghịch đảo phân số
        System.out.println("Nghịch đảo phân số 2:");
        ps2.nghichDaoPhanSo();
        ps2.inPhanSo();

        // Thực hiện các phép toán
        System.out.println("Phép cộng:");
        PhanSo tong = ps1.add(ps2);
        tong.inPhanSo();

        System.out.println("Phép trừ:");
        PhanSo hieu = ps1.sub(ps2);
        hieu.inPhanSo();

        System.out.println("Phép nhân:");
        PhanSo tich = ps1.mul(ps2);
        tich.inPhanSo();

        System.out.println("Phép chia:");
        PhanSo thuong = ps1.div(ps2);
        thuong.inPhanSo();
    }
}
