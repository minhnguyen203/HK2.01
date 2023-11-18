public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1; // Tránh trường hợp chia cho 0
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            System.out.println("Mẫu số không thể bằng 0.");
        }
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            System.out.println("Mẫu số không thể bằng 0.");
        }
    }

    public void nhapPhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            System.out.println("Mẫu số không thể bằng 0.");
        }
    }

    public void inPhanSo() {
        System.out.println(tuSo + "/" + mauSo);
    }

    private int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }

    public void rutGonPhanSo() {
        int gcd = greatestCommonDivisor(tuSo, mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
    }

    public void nghichDaoPhanSo() {
        if (tuSo != 0) {
            int temp = tuSo;
            tuSo = mauSo;
            mauSo = temp;
        } else {
            System.out.println("Không thể nghịch đảo phân số với tử số bằng 0.");
        }
    }

    public PhanSo add(PhanSo ps) {
        int newTuSo = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
        int newMauSo = this.mauSo * ps.mauSo;
        return new PhanSo(newTuSo, newMauSo);
    }

    public PhanSo sub(PhanSo ps) {
        int newTuSo = this.tuSo * ps.mauSo - this.mauSo * ps.tuSo;
        int newMauSo = this.mauSo * ps.mauSo;
        return new PhanSo(newTuSo, newMauSo);
    }

    public PhanSo mul(PhanSo ps) {
        int newTuSo = this.tuSo * ps.tuSo;
        int newMauSo = this.mauSo * ps.mauSo;
        return new PhanSo(newTuSo, newMauSo);
    }

    public PhanSo div(PhanSo ps) {
        int newTuSo = this.tuSo * ps.mauSo;
        int newMauSo = this.mauSo * ps.tuSo;
        return new PhanSo(newTuSo, newMauSo);
    }
}
