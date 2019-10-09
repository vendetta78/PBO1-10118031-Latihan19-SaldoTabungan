
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menghitung saldo tabungan
 */
public class SaldoTabungan {
    
    public static void main(String[] args) {
        double saldoAwal = 2500000, bunga = 0.15, saldoSekarang = saldoAwal + (saldoAwal * bunga);
        int lamaBulan = 6;
        DecimalFormat Idr = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols RP = new DecimalFormatSymbols();
        RP.setCurrencySymbol("Rp. ");
        RP.setMonetaryDecimalSeparator(',');
        RP.setGroupingSeparator('.');
        Idr.setDecimalFormatSymbols(RP);
        for (int i = 1; i <= lamaBulan; i++, saldoSekarang += (saldoSekarang * bunga)) {
            System.out.printf("Saldo di bulan ke-%d %s\n", i, Idr.format((int) saldoSekarang).replaceAll(",00", ""));
        }
    }
}
