package de.deanomus.lok_restapi;

import java.util.Scanner;

public class LOK_RestApi {

    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        while (true) {
            System.out.println("Out: " + scan.next());
        }
    }

}
