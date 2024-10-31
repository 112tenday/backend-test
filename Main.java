
//2.
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
        for( int i= 1; i<=batas; i++){
            if (!angkaDihasilkan.contains(i)) {

                jumlahSelfNumber += i;
            }
        }
        System.out.println( "Jumlah selfNumber dari 1 sampai " +batas + "= " + jumlahSelfNumber);
    }

}