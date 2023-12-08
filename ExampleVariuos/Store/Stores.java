import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stores {
    private List<Marka> markalar;
    private List<Urun> cepTelefonlari;
    private List<Urun> notebooklar;

    public Stores() {
        markalar = new ArrayList<>();
        cepTelefonlari = new ArrayList<>();
        notebooklar = new ArrayList<>();
    }

    // Marka ekleme
    public void markaEkle(Marka marka) {
        markalar.add(marka);
        Collections.sort(markalar, Comparator.comparing(Marka::getName));
    }

    // Ürün ekleme
    public void urunEkle(Urun urun, String urunGrubu) {
        if (urunGrubu.equals("Cep Telefonu")) {
            cepTelefonlari.add(urun);
        } else if (urunGrubu.equals("Notebook")) {
            notebooklar.add(urun);
        }
    }

    // Ürün silme
    public void urunSil(int urunId, String urunGrubu) {
        if (urunGrubu.equals("Cep Telefonu")) {
            cepTelefonlari.removeIf(urun -> urun.getId() == urunId);
        } else if (urunGrubu.equals("Notebook")) {
            notebooklar.removeIf(urun -> urun.getId() == urunId);
        }
    }

    // Ürünleri listeleme
    public void urunleriListele(String urunGrubu) {
        System.out.println("Ürünler:");
        System.out.println("ID\tÜrün Adı\tMarka\tBirim Fiyatı\tİndirim Oranı\tStok Miktarı");

        List<Urun> urunListesi = urunGrubu.equals("Cep Telefonu") ? cepTelefonlari : notebooklar;

        for (Urun urun : urunListesi) {
            System.out.format("%d\t%s\t%s\t%.2f\t%.2f\t%d%n",
                    urun.getId(), urun.getUrunAdi(), urun.getMarka().getName(),
                    urun.getBirimFiyat(), urun.getIndirimOrani(), urun.getStokMiktari());
        }
    }

    // Markalara göre filtreleme
    public void markayaGoreFiltrele(String markaAdi, String urunGrubu) {
        List<Urun> urunListesi = urunGrubu.equals("Cep Telefonu") ? cepTelefonlari : notebooklar;

        System.out.println(markaAdi + " markasına ait ürünler:");
        System.out.println("ID\tÜrün Adı\tMarka\tBirim Fiyatı\tİndirim Oranı\tStok Miktarı");

        for (Urun urun : urunListesi) {
            if (urun.getMarka().getName().equals(markaAdi)) {
                System.out.format("%d\t%s\t%s\t%.2f\t%.2f\t%d%n",
                        urun.getId(), urun.getUrunAdi(), urun.getMarka().getName(),
                        urun.getBirimFiyat(), urun.getIndirimOrani(), urun.getStokMiktari());
            }
        }
    }
}
