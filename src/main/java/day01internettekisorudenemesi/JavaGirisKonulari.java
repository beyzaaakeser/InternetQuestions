package day01internettekisorudenemesi;

import java.util.Scanner;

public class JavaGirisKonulari {
    public static void main(String[] args) {

//        String hello = "Hello World";
//        System.out.println(hello);
//
//
//        double d1 = 1234.56;
//        byte b1 =  55;
//        System.out.println(d1+b1);
//        System.out.println(d1/b1);
//
//        System.out.println(-5+8*6);
//
//        Scanner sayi = new Scanner(System.in);
//        System.out.println("Iki sayi giriniz");
//        byte yas1 = sayi.nextByte();
//        byte yas2 = sayi.nextByte();
//        System.out.println(yas1*yas2);
//
//        Scanner ornek = new Scanner(System.in);
//        System.out.println("Iki farkli sayi giriniz");
//        double d2 = ornek.nextDouble();
//        double d3 = ornek.nextDouble();
//
//        System.out.println(d2+d3);
//        System.out.println(d2*d3);
//        System.out.println(d2-d3);
//        System.out.println(d2/d3);
//        System.out.println(d2%2);
//        System.out.println(d3%2);
//        System.out.println(d2%d3);
//
//        Scanner tablo = new Scanner(System.in);
//        System.out.println("Carpim tablosu olusturmak icin bir sayi giriniz");
//
//        byte b2 = tablo.nextByte();
//
//        System.out.println(b2*1);
//        System.out.println(b2*2);
//        System.out.println(b2*3);
//        System.out.println(b2*4);
//        System.out.println(b2*5);
//        System.out.println(b2*6);
//        System.out.println(b2*7);
//        System.out.println(b2*8);
//        System.out.println(b2*9);
//        System.out.println(b2*0);
//

//        Scanner input = new Scanner(System.in);
//        System.out.println("Dort farkli sayi giriniz");
//        double d4 = input.nextDouble();
//        double d5 = input.nextDouble();
//        double d6 = input.nextDouble();
//        double d7 = input.nextDouble();
//        double result = ((d4*d5)- (d5*d5))/ (d6-d7);
//        System.out.println(result);


//        Scanner alan = new Scanner(System.in);
//        System.out.println("Dikdortgenin kenar uzunluklarini giriniz");
//
//        double k1 = alan.nextDouble();
//        double k2 = alan.nextDouble();
//
//        System.out.println("dikdortgenin alani "+ k1*k2);
//
//        System.out.println("dikfortgenin cevresi "+ 2*(k1+k2));
//
//
//

        Scanner tamsayi = new Scanner(System.in);
        System.out.println("dort adet tam sayi giriniz");
    byte t1 = tamsayi.nextByte();
    byte t2 = tamsayi.nextByte();
    byte t3 = tamsayi.nextByte();
    byte t4 = tamsayi.nextByte();


     if (t1==t2 && t2==t3 && t3==t4 &&t4==t1 ){
        System.out.println("Hepsi birbirine esit");
    } else if(t1==t2 || t1==t3 || t1 ==t4 ){
        System.out.println("Bazi kenarlar birbirine esit");
    } else {
        System.out.println("Hicbiri esit degil");
    }






























    }
}
