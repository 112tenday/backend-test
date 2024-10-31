//Sebagian bilangan dapat memiliki lebih dari satu generator. Contohnya:
//Bilangan 101 memiliki dua generator yaitu bilangan 91 dan 100. Buktinya:
//d(91) = 91 + 9 + 1 = 101
//d(100) = 100 + 1 + 0 + 0 = 101
//Bilangan 818 juga memiliki dua generator yaitu bilangan 796 dan 805. Buktinya:
//d(796) = 796 + 7 + 9 + 6 = 818
//d(805) = 805 + 8 + 0 + 5 = 818
//
//Kelompok bilangan yang memiliki lebih dari satu generator (seperti 101 dan 818) disebut dengan junction-numbers.
//
//Sedangkan bagi kelompok bilangan yang tidak memiliki generator sama sekali, maka inilah yang disebut dengan self-numbers.
//
//        Sebagai contoh, ada 13 bilangan dari rentang 1-100 yang termasuk kedalam kelompok self-numbers yaitu 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, dan 97.


import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static int generator(int n){
        int jumlah =n;
        while (n > 0){
            jumlah+= n % 10;
            n/= 10;
        }
        return jumlah;
    }


    public static void main(String[] args)

    {
        Scanner scanner =new Scanner(System.in);

        System.out.print( "Masukkan batas angka :");
        int batas =scanner.nextInt();
        scanner.close();

        HashSet<Integer> angkaDihasilkan =new HashSet<>();

        for (int i=1; i<=batas; i++) {
            int gen = generator(i);
            if(gen<=batas) {
                angkaDihasilkan.add(gen);
            }
        }

        int jumlahSelfNumber = 0;
        System.out.print( "SelfNumber dari 1 hingga" + batas + "= ");
        for( int i= 1; i<=batas; i++){
            if (!angkaDihasilkan.contains(i)) {
                System.out.print(i + " ");
                jumlahSelfNumber++;
            }
        }
        System.out.println( " \n Jumlah selfNumber dari 1 sampai " +batas + "= " + jumlahSelfNumber);
    }

}