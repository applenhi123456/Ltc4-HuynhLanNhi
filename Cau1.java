public class HoaQua {
    protected String ten;
    protected float giaBan;
    protected String nguonGocXuatXu;
    protected int soLuongTonKho;

    public HoaQua(String ten, float giaBan, String nguonGocXuatXu, int soLuongTonKho) {
        this.ten = ten;
        this.giaBan = giaBan;
        this.nguonGocXuatXu = nguonGocXuatXu;
        this.soLuongTonKho = soLuongTonKho;
    }

    public float tinhGiaBan() {
        return giaBan;
    }
}

public class QuaCam extends HoaQua {
    protected int soLuong;
    protected String ngayNhap;

    public QuaCam(String ten, float giaBan, String nguonGocXuatXu, int soLuongTonKho, int soLuong, String ngayNhap) {
        super(ten, giaBan, nguonGocXuatXu, soLuongTonKho);
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }

    public float tinhGiaBan() {
        return giaBan * soLuong;
    }
}

public class QuaTao extends HoaQua {
    protected String ngayNhap;
    protected String dinhDuong;

    public QuaTao(String ten, float giaBan, String nguonGocXuatXu, int soLuongTonKho, String ngayNhap, String dinhDuong) {
        super(ten, giaBan, nguonGocXuatXu, soLuongTonKho);
        this.ngayNhap = ngayNhap;
        this.dinhDuong = dinhDuong;
    }
}

public class CamCaoPhong extends QuaCam {
    protected String viCam;
    protected String muiCam;

    public CamCaoPhong(String ten, float giaBan, String nguonGocXuatXu, int soLuongTonKho, int soLuong, String ngayNhap, String viCam, String muiCam) {
        super(ten, giaBan, nguonGocXuatXu, soLuongTonKho, soLuong, ngayNhap);
        this.viCam = viCam;
        this.muiCam = muiCam;
    }
}

public class CamSanh extends QuaCam {
    protected String voCam;
    protected String huongVi;

    public CamSanh(String ten, float giaBan, String nguonGocXuatXu, int soLuongTonKho, int soLuong, String ngayNhap, String voCam, String huongVi) {
        super(ten, giaBan, nguonGocXuatXu, soLuongTonKho, soLuong, ngayNhap);
        this.voCam = voCam;
        this.huongVi = huongVi;
    }
}
public class Main {
    public static void main(String[] args) {
        HoaQua hoaQua = new HoaQua();
        QuaCam quaCam = new QuaCam();
        QuaTao quaTao = new QuaTao();
        CamCaoPhong camCaoPhong = new CamCaoPhong();
        CamSanh camSanh = new CamSanh();
    }
}