package IfInternetSorulari;

import java.util.Scanner;

public class C01_IfInternetSorulari {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Lutfen bir sayi giriniz");
//
//        double sayi = input.nextDouble();
//
//        if(sayi<0){
//            System.out.println("Negatif Sayi");
//        }else if(sayi>0){
//            System.out.println("Pozitif Sayi");
//        }else {
//            System.out.println("Gecerli bir sayi giriniz");
//        }
//
//         kullanicidan uc sayi alin ve en buyuk sayiyi yazdirin

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen 3 sayi giriniz");
//        double sayi1 = input.nextDouble();
//        double sayi2 = input.nextDouble();
//        double sayi3 = input.nextDouble();
//
//        if(sayi1> sayi2 && sayi1> sayi3){
//            System.out.println(" 1. sayi en buyuk sayi");
//        }else if (sayi2> sayi1 && sayi2>sayi3){
//            System.out.println("2. sayi en buyuk sayi");
//        } else if (sayi3>sayi1 && sayi3>sayi2) {
//            System.out.println("3. sayi en buyuk sayi");
//        } else {
//            System.out.println("buyukluk kucuklukten baska bir durum var");
//        }


//            Scanner input = new Scanner(System.in);
//            System.out.println("lutfen ay ismi giriniz");
//
//            String ayIsmi = input.next();
//
//            if(ayIsmi.equalsIgnoreCase("ocak")|| ayIsmi.equalsIgnoreCase("mart")||ayIsmi.equalsIgnoreCase("mayis")
//                || ayIsmi.equalsIgnoreCase("temmuz")||ayIsmi.equalsIgnoreCase( "agustus")
//                || ayIsmi.equalsIgnoreCase("ekim")|| ayIsmi.equalsIgnoreCase("aralik" )) {
//                System.out.println("30 gun vardir");
//            } else if (ayIsmi.equalsIgnoreCase("nisan")||ayIsmi.equalsIgnoreCase("haziran") ||ayIsmi.equalsIgnoreCase("eylul")
//                || ayIsmi.equalsIgnoreCase("kasim")) {
//                System.out.println("31 gun vardir");
//            } else if (ayIsmi.equalsIgnoreCase("subat")) {
//                System.out.println("28 veya 29 gun vardir ");
//            } else {
//                System.out.println("Gecerli bir ay isimi giriniz.");
//            }


//            Scanner input = new Scanner(System.in);
//            System.out.println("lutfen alfabeden bir harf giriniz");
//
//            char harf = input.next().charAt(0);
//
//            if ((harf== 'a'|| harf=='A') || (harf=='e'|| harf == 'E') || (harf=='u'|| harf=='U')
//               ||(harf=='o'||harf== 'O')|| (harf =='i')){
//                System.out.println("sesli harf");
//            } else if ((harf == 'b'|| harf == 'B')|| (harf=='c'|| harf == 'C') || (harf == 'd'|| harf== 'D')
//                || (harf == 'f'|| harf =='F') || (harf == 'g'|| harf == 'g') || (harf=='h' || harf=='h')
//                || (harf=='j'|| harf =='J') || (harf=='k'||harf== 'K')||( harf=='l' || harf=='L')
//                || (harf=='m'|| harf=='M')|| (harf=='n'|| harf=='N')|| (harf=='p' || harf=='P')
//                || (harf=='r'|| harf=='R')||(harf=='s'|| harf== 'S') || (harf=='t'|| (harf=='T')
//                || (harf=='v'|| harf=='V')|| (harf=='y'|| (harf=='Y')|| (harf=='z'|| (harf== 'Z'))))
//                || (harf=='q'|| harf=='Q') || (harf=='x'||harf=='X')){
//                System.out.println("sessiz harf");
//            }else{
//                System.out.println("Gecerli bir harf giriniz");
//            }
//
//
//
            Scanner input = new Scanner(System.in);
            System.out.println("Yil giriniz");

            int yil = input.nextInt();

            if (yil%100==0 && yil%400==0){
                System.out.println("100e ve 400e bolunen artik yil");
            } else if (yil%100!=0 && yil%4==0) {
                System.out.println("100e bolunmeyen ama 4e bolunen artik yil");
            }else {
                System.out.println("Artik yil degil");
            }








    }
}
