package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);

        String[] guestList= {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Inserisci qui il tuo nome");
        String guestName = keyInput.nextLine();

        boolean found = false;
        for (int i = 0; i < guestList.length && !found; i++) {
            if (guestName.equals(guestList[i])) {
                found = true;
            }

        }
        if (found){
            System.out.println("Prego si accomodi e si goda la festa");
        } else {
            System.out.println("Tornatene da dove sei venuto pezzente");
        }


        keyInput.close();

    }
}
