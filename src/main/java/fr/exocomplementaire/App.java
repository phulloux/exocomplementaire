package fr.exocomplementaire;
import java.lang.Math;

public class App {
    
    public static void main(String[] args) {
        
        //Suite 1
        int nbr = -4;

        for(int i=0;i<6 ;i++){
            System.out.print(nbr+", ");
            nbr = nbr + 18;
        }

        System.out.println(" ");

        //Suite 2
        int premierNbr = 0;
        int deuxiemmeNbr = 1;
        int calcule;

        System.out.print("0 1 ");;

        for(int i=0;i<20;i++){
            calcule = premierNbr + deuxiemmeNbr;

            System.out.print(calcule +" ");

            premierNbr = deuxiemmeNbr;
            deuxiemmeNbr = calcule;
        }

        System.out.println(" ");

        //Suite 3

        int puissance;

        for(int i = 1;i<=10;i++){
            puissance = i*i;
            System.out.print(puissance+" ");
        }

        System.out.println(" ");

        //Suite 4
        int carré = 2;
        double puissance2;

        for(int i = 1;i<=10;i++){
            puissance2 = Math.pow(i, carré);
            System.out.print(puissance2+" ");
        }

        System.out.println(" ");
        
        //

    }
    
}
