public class Urun {
    private int id;
    private String urunAdi;
    private double birimFiyat;
    private double indirimOrani;
    private int stokMiktari;
    private Marka marka;

    public Urun(int id, String urunAdi, double birimFiyat, double indirimOrani, int stokMiktari, Marka marka) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.birimFiyat = birimFiyat;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.marka = marka;
    }

    public int getId() {
        return id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public Marka getMarka() {
        return marka;
    }
}
