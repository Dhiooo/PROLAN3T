/**
 * Kelas Rata digunakan untuk menghitung nilai rata-rata dari beberapa mata pelajaran.
 * <p>
 * Program ini menginisialisasi nilai untuk beberapa mata pelajaran dan menghitung
 * rata-rata menggunakan metode khusus. Ini adalah contoh sederhana tentang cara
 * menghitung dan menampilkan rata-rata dari beberapa nilai.
 * </p>
 *
 * @author [Nama Anda]
 * @version 1.0
 */
public class Rata {

    /**
     * Metode utama tempat eksekusi program dimulai.
     * <p>
     * Metode ini menginisialisasi nilai untuk beberapa mata pelajaran, menghitung
     * nilai rata-rata menggunakan metode {@link #calculateAverage(double...)} dan
     * menampilkan hasilnya.
     * </p>
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        // Inisialisasi nilai untuk setiap mata pelajaran
        double mathScore = 10;
        double physicsScore = 20;
        double chemistryScore = 30;
        double biologyScore = 40;
        double englishScore = 50;

        // Menggunakan metode calculateAverage
        double averageScore = calculateAverage(mathScore, physicsScore, chemistryScore, biologyScore, englishScore);

        // Menampilkan hasil
        System.out.println("Nilai rata-rata: " + averageScore);
    }

    /**
     * Menghitung rata-rata dari nilai yang diberikan.
     * <p>
     * Metode ini menerima sejumlah nilai double yang bervariasi dan menghitung
     * rata-rata dengan membagi jumlah semua nilai dengan jumlah nilai yang diberikan.
     * </p>
     *
     * @param scores sejumlah nilai double yang mewakili skor
     * @return rata-rata dari skor yang diberikan
     */
    public static double calculateAverage(double... scores) {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }
}
