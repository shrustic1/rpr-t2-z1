package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.t2.Math;
public class App 
{
    public static void main( String[] args )
    {
        if (args.length!=2)
            System.err.println("Nedovoljan broj argumenata java -jar rpr-t2-z1!");
        else if (!args[0].equals("sinus") && !args[0].equals("factoriel"))
            System.err.println("Nevalidna funkcija, funkcije sinus i factoriel su podržane!");
        else{
            try{
                String funkcija = args[0];
                double input = Double.parseDouble(args[1]);
                switch(funkcija) {
                    case "sinus":
                        System.out.println("sinus (" + input + ") = "+Math.sin(input));
                        break;
                    case "factoriel":
                        if (input != (int) input)
                            System.err.println("Argument kod funkcije factoriel mora biti prirodan broj!");
                        else System.out.println("factoriel (" + input + ") = "+Math.factoriel((int)input));
                        break;
                }
            }catch(Exception e){
                System.err.println("Nevalidan drugi argument, mora biti broj!");
            }
        }
    }
}
