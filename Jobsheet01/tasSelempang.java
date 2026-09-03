public class tasSelempang extends tas {
    private int jumlahKantong;
    private String bahanTali;

    public void setJumlahKantong(int kantong) {
        jumlahKantong = kantong;
    }

    public void setBahanTali(String tali) {
        bahanTali = tali;
    }

    @Override
    public void cetakInformasi() {
        System.out.println("--- Info Tas Selempang ---");
        super.cetakInformasi();
        System.out.println("Jumlah Kantong: " + jumlahKantong);
        System.out.println("Bahan Tali: " + bahanTali);
    }
}