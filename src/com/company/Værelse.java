package com.company;

import java.util.Scanner;

public class Værelse {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String ui = scanner.nextLine();
        Lampe skrivebordsLampe = new Lampe(true);

        System.out.println("lampen er: " + skrivebordsLampe);

        skrivebordsLampe.lampSwitch();
        System.out.println("lampen er: " + skrivebordsLampe);

        skrivebordsLampe.lampSwitch();
        System.out.println("lampen er: " + skrivebordsLampe);

        Lampe sengeLampe = new Lampe();

        System.out.println("Sengelampen er: " + sengeLampe);

        sengeLampe.lampSwitch();
        System.out.println("Sengelampen er: " + sengeLampe);
    }
}
