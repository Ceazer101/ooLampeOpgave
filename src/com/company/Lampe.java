package com.company;

import java.util.Scanner;

public class Lampe {

    private boolean lampState;

    public Lampe (){
        this.lampState = false;
    }

    public Lampe ( boolean parameterState ){
        this.lampState = parameterState;
    }

    public boolean getLampState() {
        return lampState;
    }

    public void setLampState(boolean lampState) {
        this.lampState = lampState;
    }

    public String toString() {
        if (lampState == true) {
            return "tændt";
        } else {
            return "slukket";
        }
    }

    public void lampSwitch(){

        if( lampState == true) {
            lampState = false;
        } else {
            lampState = true;
        }

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv on eller off");
        String ui = scanner.nextLine();
        if ("on".equals(ui)){
            System.out.println("Lampen er tændt");
        } else if ("off".equals(ui)){
            System.out.println("Lampen er slukket");
        }
        return true;*/
    }


}
