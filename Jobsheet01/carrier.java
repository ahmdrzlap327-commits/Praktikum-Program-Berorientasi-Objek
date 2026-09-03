public class carrier extends tas {
    private int kapasitas;
    private String jenisFrame;

    public void setKapasitas(int kapasitasTas) {
        kapasitas = kapasitasTas;
    }

    public void setFrame(String frameTas) {
        jenisFrame = frameTas;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- Info Tas Carrier ---");
        super.cetakInformasi();
        System.out.println("Kapasitas: " + kapasitas + " Liter");
        System.out.println("Jenis Frame: " + jenisFrame);
    }
}