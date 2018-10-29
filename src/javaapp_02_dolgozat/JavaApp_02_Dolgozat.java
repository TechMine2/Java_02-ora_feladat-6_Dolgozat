package javaapp_02_dolgozat;

import java.util.Scanner;

public class JavaApp_02_Dolgozat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a dolgozatban elért pontot:");
        int pontszam = sc.nextInt();
        
        if (pontszam >= 88) {
            System.out.println("5");
        }else if (pontszam >= 73) {
            System.out.println("4");
        }else if (pontszam >= 58) {
            System.out.println("3");
        }else if (pontszam >= 43) {
            System.out.println("2");
        }else{
            System.out.println("1");
        }
    }
    
}
