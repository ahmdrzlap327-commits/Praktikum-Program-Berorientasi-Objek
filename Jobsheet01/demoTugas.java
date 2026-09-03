public class demoTugas {
    public static void main(String[] args) {
        carrier tasGunung = new carrier();
        tasSelempang slingBag = new tasSelempang();
        jamTangan jamSmartwatch = new jamTangan();
        televisi tvKamar = new televisi();

        tasGunung.setMerk("Eiger");
        tasGunung.setUkuran( "Tinggi 65cm");
        tasGunung.setKapasitas(50);
        tasGunung.setFrame("Internal Frame");
        tasGunung.cetakInformasi();
        System.out.println();

        slingBag.setMerk("Consina");
        slingBag.setUkuran("Panjang 25cm");
        slingBag.setJumlahKantong(4);
        slingBag.setBahanTali("Nylon Kuat");
        slingBag.cetakInformasi();
        System.out.println();

        jamSmartwatch.setTampilan("Layar Digital (Smartwatch)");
        jamSmartwatch.setStrap("Karet Silikon");
        jamSmartwatch.cetakInformasi();
        System.out.println();

        tvKamar.setUkuranLayar(32);
        tvKamar.setJenisLayar("LED Smart TV");
        tvKamar.cetakInformasi();
    }
}