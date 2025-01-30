public class Raetsel2 {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1, b = 2;

        while (b < 4000000) {
            if (b % 2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;

        }

        System.out.println("Summe: " + sum);
    }
}
