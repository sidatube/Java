package lap.l8;

public class Ngoaiquoc extends Khachhang{
    String quoctich;

    public Ngoaiquoc() {
    }

    public Ngoaiquoc(int code,String name, String nxhd,int soluong,String quoctich) {
        this.quoctich = quoctich;
        this.code = code;
        this.name = name;
        this.soluong =soluong;
        this.ngayXuatHD=nxhd;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    @Override
    public double thanhtien() {
        return getSoluong()*2000;
    }
}
