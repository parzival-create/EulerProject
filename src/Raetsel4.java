public class Raetsel4 {
    public static void main(String[] args) {
        int inputNumber, sum, lastDigit;
        int largestPalindrome = 0;
        int factor1 = 0, factor2 = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                inputNumber = i * j;
                sum = 0;
                int a = inputNumber;

                while (a > 0) {
                    lastDigit = a % 10;
                    sum = (sum * 10) + lastDigit;
                    a = a / 10;
                }

                if (sum == inputNumber) {
                    if (inputNumber > largestPalindrome) {
                        largestPalindrome = inputNumber;
                        factor1 = i;
                        factor2 = j;
                    }
                }
            }
        }

        System.out.println("Das größte Palindrom ist: " + largestPalindrome);
        System.out.println(+ factor1 + " * " + factor2);
    }
}
