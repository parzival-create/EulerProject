public class Raetsel3 {
    public static void main(String[] args) {
        long number = 600851475143L;
        long factor = 2;

        while (number > 1) {
            if (number % factor == 0) {
                number /= factor;
                System.out.println(number);
            } else {
                factor++;
            }
        }

        System.out.println("Der größte Primfaktor ist: " + factor);
    }
}
