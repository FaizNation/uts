import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Tugas2 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("|=========================================|");
            System.out.println("|>>                                     <<|");
            System.out.println("|>       APLIKASI RESERVASI WISATA       <|");
            System.out.println("|>>                                     <<|");
            System.out.println("|=========================================|");
            System.out.println(" ");
            System.out.println("<<<=====================================>>> ");
            System.out.println(" ");
            
            System.out.print("Masukan Nama Anda: " );
            String nama = input.nextLine();

            System.out.print("Masukan  Jumlah Orang: ");
            int jumlahOrang = input.nextInt();
            System.out.println(" ");
            
            System.out.println("|=========================================|");
            System.out.println("|>         Pilihan Paket Wisata:         <|");
            System.out.println("|=========================================|");
            System.out.println("| NO |  Paket Wisata  |  Harga Per Orang  |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| 1. |     Gunung     |       50000       |");
            System.out.println("| 2. |     Pantai     |       30000       |");
            System.out.println("| 3. |      Kota      |       40000       |");
            System.out.println("|=========================================|");
            System.out.print("Masukan Pilihan WIsata: ");
            int pilihanWisata = input.nextInt();

            String tujuanWisata;
            double hargaPerOrang;
            switch (pilihanWisata) {
                case 1:
                    tujuanWisata = "Gunung";
                    hargaPerOrang = 50000;
                    break;
                case 2:
                    tujuanWisata = "Pantai";
                    hargaPerOrang = 30000;
                    break;
                case 3:
                    tujuanWisata = "Kota";
                    hargaPerOrang = 40000;
                    break;
                default:
                    System.out.println("Piliham Tidak Valid");
                    return;
            }
            System.out.print("Apakah Anda Memerlukan Pemandu Wisata? (true/false): ");
            boolean PemanduWisata = input.nextBoolean();
            double biayaPemandu = 100000;
            System.out.println(" ");
            ArrayList<String> fasilitas = new ArrayList<>();
            ArrayList<Integer> harga = new ArrayList<>();

            fasilitas.add("Transportasi");
            fasilitas.add("Konsumsi");
            fasilitas.add("Tempat Penginapan");

            harga.add(50000);
            harga.add(75000);
            harga.add(120000);
            System.out.println(" ");
            System.out.println("|>>>===================================<<<|");
            System.out.println(" ");
            System.out.println("|=========================================|");
            System.out.println("|>      Fasilitas yang disediakan:       <|");
            System.out.println("|=========================================|");
            for (int i = 0; i < fasilitas.size(); i++) {
                System.out.println((i + 1) + ". " + fasilitas.get(i) + ": Rp " + harga.get(i));
            }
            System.out.println("|=========================================|");
            int totalBiayaFasilitas = 0;
            List<String> fasilitasDipilih = new ArrayList<>();
            for (int i = 0; i < fasilitas.size(); i++){
                System.out.print("Apakah Anda Ingin Menggunakan Tambahan Fasilitas " + fasilitas.get(i) + "? (true/false): ");
                boolean pilihanFasilitas = input.nextBoolean();
                if (pilihanFasilitas == true) {
                    fasilitasDipilih.add(fasilitas.get(i));
                    totalBiayaFasilitas += harga.get(i);
                }
            }

            double totalBiaya = (hargaPerOrang * jumlahOrang) + totalBiayaFasilitas;
            if (PemanduWisata) {
                totalBiaya += biayaPemandu;
            }
            System.out.println(" ");
            System.out.println("|>>>===================================<<<|");
            System.out.println(" ");
            System.out.println("|=========================================|");
            System.out.println("|>             Detail Rincian            <|");
            System.out.println("|=========================================|");
            System.out.println("Nama: " + nama);
            System.out.println("Tujuan Wisata: " + tujuanWisata);
            System.out.println("Jumlah Orang: " + jumlahOrang);
            System.out.println("Biaya Per Orang: " + hargaPerOrang);
            System.out.println("Pemandu Wisata: " + (PemanduWisata ? "Ya" : "Tidak"));
            System.out.println("Fasilitas yang Dipilih: " + fasilitasDipilih);
            System.out.println("Total Biaya Fasilitas: " + totalBiayaFasilitas);
            System.out.println("|=========================================|");
            System.out.println("Total Biaya Keseluruhan: " + totalBiaya);
            System.out.println("|=========================================|");
            System.out.println("|             BY FAIZ NATION              |");
            System.out.println("|=========================================|");

        }


    }
}