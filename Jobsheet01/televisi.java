public class televisi {
    private int ukuranLayar;
    private String jenisLayar;

    public void setUkuranLayar(int inci) {
        ukuranLayar = inci;
    }

    public void setJenisLayar(String layar) {
        jenisLayar = layar;
    }

    public void cetakInformasi() {
        System.out.println("--- Info Televisi ---");
        System.out.println("Ukuran Layar: " + ukuranLayar + " Inci");
        System.out.println("Jenis Layar: " + jenisLayar);
    }
}