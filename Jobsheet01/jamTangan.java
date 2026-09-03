public class jamTangan {
    private String jenisTampilan;
    private String bahanStrap;

    public void setTampilan(String tampilan) {
        jenisTampilan = tampilan;
    }

    public void setStrap(String strap) {
        bahanStrap = strap;
    }

    public void cetakInformasi() {
        System.out.println("--- Info Jam Tangan ---");
        System.out.println("Jenis Tampilan: " + jenisTampilan);
        System.out.println("Bahan Strap: " + bahanStrap);
    }
}