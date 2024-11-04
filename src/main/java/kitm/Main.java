package kitm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputN = new Scanner(System.in);
        System.out.println("Kiek yra sveciu sarase?: ");

        int sveciuKiekis = inputN.nextInt();

        String[] sveciuVardai = new String[sveciuKiekis];
        inputN.nextLine();

        System.out.println("Koks svecio vardas?: " );

        for(int i = 0; i < sveciuKiekis; i++){

            sveciuVardai[i] = inputN.nextLine();

        }

        System.out.println("Kiek vardu juodame sarase?");

        int sarasoKiekis = inputN.nextInt();

        String[] blackList = new String[sarasoKiekis];
        inputN.nextLine();

        System.out.println("Kokie juodojo saraso vardai?: " );

        for(int i = 0; i < sarasoKiekis; i++){

            blackList[i] = inputN.nextLine();

        }

        for(int i = 0; i < sveciuKiekis; i++){

            for(int j = 0; j < blackList.length; j++){

                if (blackList[j].equals(sveciuVardai[i])){
                    sveciuVardai[i] += " Yra Juodame Sarase";
                }


            }
            System.out.println(i+1 + ". " + sveciuVardai[i]);

        }
    }
}