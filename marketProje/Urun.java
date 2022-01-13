package marketProje;

public class Urun {
    private int no;
    private String urunAdi;
    private double fiyat;

    public Urun(int no, String urunAdi, double fiyat) {
        this.no = no;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public int getNo() {
        return no;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setNo(int no) {
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
