package de.deanomus.lok_restapi;

import de.deanomus.lok_restapi.examples.LoginExample;

import java.util.Scanner;

public class LOK_RestApi {

    public static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        while (true) {
            choose();
        }
    }


    public static void choose() {
        System.out.println("1 = Login");

        int i = scan.nextInt();

        if (i == 1) {
            new LoginExample().run();
        }
    }

}
