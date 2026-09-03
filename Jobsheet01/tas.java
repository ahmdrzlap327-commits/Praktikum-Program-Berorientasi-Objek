public class tas {
    private String merk;
    private String ukuran;

    public void setMerk(String merkTas) {
        merk = merkTas;
    }

    public void setUkuran(String ukuranTas) {
        ukuran = ukuranTas;
    }

    public void cetakInformasi() {
        System.out.println("Merk Tas: " + merk);
        System.out.println("Ukuran: " + ukuran);
    }
}