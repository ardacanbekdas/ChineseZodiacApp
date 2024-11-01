package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class ChineseZodiacApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear;


        System.out.print("Please enter your birth year: ");
        birthYear = input.nextInt();

        if (birthYear >= 0) {
            if (birthYear % 12 == 0){
                System.out.print("Monkey");
            } else if (birthYear % 12 == 1) {
                System.out.print("Cockerel");
            } else if (birthYear % 12 == 2) {
                System.out.print("Dog");
            } else if (birthYear % 12 == 3) {
                System.out.print("Pig");
            } else if (birthYear % 12 == 4) {
                System.out.print("Mouse");
            } else if (birthYear % 12 == 5) {
                System.out.print("Ox");
            } else if (birthYear % 12 == 6) {
                System.out.print("Tiger");
            } else if (birthYear % 12 == 7) {
                System.out.print("Rabbit");
            } else if (birthYear % 12 == 8) {
                System.out.print("Dragon");
            }else if (birthYear % 12 == 9) {
                System.out.print("Snake");
            } else if (birthYear % 12 == 10) {
                System.out.print("Horse");
            } else {
                System.out.print("Goat");
            }
        } else {
            System.out.println("You entered an invalid number");
        }

    }
}


/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir?

        4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
*/
