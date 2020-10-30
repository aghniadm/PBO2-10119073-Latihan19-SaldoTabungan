package pbo2.pkg10119073.latihan19.saldotabungan;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung saldo
 * tabungan per bulan dari bulan ke-1 s/d ke-6
 *
 */
public class PBO210119073Latihan19SaldoTabungan {

    public static void main(String[] args) {
        int saldo = 2500000;
        int bunga = 15;
        int lamabulan = 6;
        int jumlahbunga;
        
        for (int i = 1; i <= lamabulan; i++){
            jumlahbunga = (saldo * bunga) / 100;
            saldo += jumlahbunga;
            
            String matauang = String.format("Rp.%,3d", saldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + i + " %s%n",matauang);
        }
    }
    
}