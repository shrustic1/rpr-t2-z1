package ba.unsa.etf.rpr.t2;

public class Math {
    public final static double PI = 3.14159265359;

    public static double sin(double input){
        double sum=0;
        for (int i=0; i<=5; i++){
            sum += power(-1,i)*(power(input, 2*i+1)/factoriel(2*i+1));
        }
        return sum;
    }

    public static int factoriel(int input) {
        int fact = 1;
        for (int i=2; i<=input; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static double power(double broj, int eksponent){
        double rez = 1;
        for (int i=0; i<eksponent; i++){
            rez *= broj;
        }
        return rez;
    }
}

