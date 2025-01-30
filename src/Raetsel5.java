public class Raetsel5 {
    public static void main(String[] args) {
        System.out.println("Die kleinste Zahl, die durch alle Zahlen von 1 bis 20 teilbar ist: " + findeKGV(20));
    }


    public static long findeKGV(int n) {
        long kgV = 1;
        for (int i = 2; i <= n; i++) {
            kgV = berechneKGV(kgV, i);
            System.out.println("kgV bis " + i + " ist: " + kgV);
        }
        return kgV;
    }


    public static long berechneKGV(long a, long b) {
        return (a * b) / berechneGGT(a, b);
    }


    public static long berechneGGT(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
