package marketProje;

public class Urun {
    private String no;
    private String urunAdi;
    private double fiyat;

    public Urun(String no, String urunAdi, double fiyat) {
        this.no = no;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public String getNo() {
        return no;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return
                "no=" + no +
                ", urunAdi='" + urunAdi + '\'' +
                ", fiyat=" + fiyat;
    }
}
