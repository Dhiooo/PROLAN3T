public class Main {
    public static void main(String[] args) {
        // Menggunakan live template "totalPrice"
        double totalPrice = 0.0;

        // Menggunakan live template "priceCalc"
        totalPrice += calculatePrice(15000, 1);
        totalPrice += calculatePrice(20000, 1);
        totalPrice += calculatePrice(10000, 1);

        System.out.println("Total Biaya: Rp" + totalPrice);
    }

    // Menggunakan live template "priceCalc"
    public static double calculatePrice(double price, int quantity) {
        return price * quantity;
    }
}
