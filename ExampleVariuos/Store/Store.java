public class Store {
    public static void main(String[] args) {
        Stores magaza = new Stores();

        // Markaları oluşturma
        magaza.markaEkle(new Marka(1, "Samsung"));
        magaza.markaEkle(new Marka(2, "Lenovo"));
        magaza.markaEkle(new Marka(3, "Apple"));
        magaza.markaEkle(new Marka(4, "Huawei"));
        magaza.markaEkle(new Marka(5, "Casper"));
        magaza.markaEkle(new Marka(6, "Asus"));
        magaza.markaEkle(new Marka(7, "HP"));
        magaza.markaEkle(new Marka(8, "Xiaomi"));
        magaza.markaEkle(new Marka(9, "Monster"));

        // Ürünleri listeleme
        magaza.urunleriListele("Cep Telefonu");
        magaza.urunleriListele("Notebook");

        // Markaya göre filtreleme
        magaza.markayaGoreFiltrele("Samsung", "Cep Telefonu");
        magaza.markayaGoreFiltrele("Apple", "Notebook");

        // Ürün silme
        magaza.urunSil(1, "Cep Telefonu");
        magaza.urunleriListele("Cep Telefonu");
    }
}
