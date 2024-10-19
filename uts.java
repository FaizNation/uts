import java.util.Scanner;
import java.util.ArrayList;

public class uts {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            ArrayList <String> paket = new ArrayList<>();
            ArrayList <Integer> harga = new ArrayList<>();

            paket.add("Paket Exclusive");
            paket.add("Paket Simple");
            paket.add("Paket Murah");

            harga.add(100000);
            harga.add(75000);
            harga.add(50000);

            for (int i = 0; i < paket.size(); i++) {
                System.out.println((i + 1) + ". " + paket.get(i) + "Rp. " + harga.get(i));
            }

            System.out.println("Masukan Pilihan Paket: ");
            int pilihanPaket = input.nextInt();

            switch (harga) {
                case 1:
                    
                    
                    break;
            
                default:
                    break;
            }

        }
    
}
