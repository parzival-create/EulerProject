public class Raetsel6 {

    public static int getSquare(int number) {
        return number * number;
    }


    public static void main(String[] args) {

        int number = 0;
        int SumdQu = 0;
        int QudSum = 0;
        int Solution;


        for (int i = 1; i <= 100; i++) {
            number = i;

            SumdQu = SumdQu + getSquare(number);
            System.out.println("Summe der Quadrate: " + SumdQu + "      Quadrate: " + number + "*" + number);
        }


        for (int i = 1; i <= 100; i++) {
            number = i;

            QudSum = QudSum + number;
            System.out.println("Aktuelle Summe: " + QudSum);

            if (number == 100){
                number = QudSum;
                QudSum = getSquare(number);
                System.out.println("Quadrat der Summe: " + QudSum);

                Solution = QudSum - SumdQu;
                System.out.println("Solution: " + Solution);

            }
        }
    }

}
