package internet_sorulari_arrays_soru_cozumleri;

import java.util.Scanner;

public class Soru4AXXASorusuFarkliCozumu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int str = input.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz");
        int stn = input.nextInt();




        for (int i = 1 ; i <=str ; i++){

            String s ="";
            if (i == 1 || i ==str){
                for(int k=1 ; k<=stn ; k++  ){
                    s = s+ "A ";
                }
                System.out.println(s);
            } else {
                s = s+ "A ";
               for (int m = 2 ; m<stn ; m++){
                   s = s+ "X ";
               }
               s = s+"A ";
                System.out.println(s);
            }



        }
        System.out.println("**** BEYZA KESER *****");
        System.out.println();
        System.out.println("**** BEYZA KESER *****");
        System.out.println("**** BEYZA KESER *****");









































    }
}
