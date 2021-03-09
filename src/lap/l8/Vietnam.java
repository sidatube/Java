package lap.l8;

public class Vietnam extends Khachhang{
    public String doiTuong;

    public Vietnam() {
    }

    public Vietnam(int code,String name, String nxhd,int soluong,String doiTuong) {
        this.code = code;
        this.name = name;
        this.soluong =soluong;
        this.ngayXuatHD=nxhd;
        this.doiTuong = doiTuong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    @Override
    public double thanhtien() {
        if (getSoluong()<50){
            return getSoluong()*1000;
        }else if (getSoluong()>=50 && getSoluong()<100){
            return (getSoluong()-50)*1200+50*1000;
        }else if (getSoluong()>=100 && getSoluong()<200){
            return (getSoluong()-100)*1500+50*1200+50*1000;
        }else {
            return (getSoluong()-200)*2000+100*1500+50*1200+50*1000;
        }
    }
}
