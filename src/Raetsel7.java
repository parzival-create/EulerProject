public class Raetsel7 {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int AktuelleZahl = 0;

        for (int i = 1; i <= 10001;) {
            AktuelleZahl ++;

            if (isPrime(AktuelleZahl)) {
                System.out.println(AktuelleZahl + " ist eine Primzahl: " + isPrime(AktuelleZahl));
                i++;

                System.out.println("10001. Primzahl ist: " + AktuelleZahl);

            }


        }
    }
}
