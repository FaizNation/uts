import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Tugas2 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            //Judul Aplikasi.
            System.out.println("|=========================================|");
            System.out.println("|>>                                     <<|");
            System.out.println("|>       APLIKASI RESERVASI WISATA       <|");
            System.out.println("|>>                                     <<|");
            System.out.println("|=========================================|");
            System.out.println(" ");
            System.out.println("<<<=====================================>>> ");
            System.out.println(" ");
            
            //Pengguna Memasukan Nama (Menggunakan String).
            System.out.print("Masukan Nama Anda: " );
            String nama = input.nextLine();

            //Pengguna Memasukan Jumlah Orang yang Ikut Wisata (Menggunakan int).
            System.out.print("Masukan  Jumlah Orang: ");
            int jumlahOrang = input.nextInt();

            //Pilihan Paket Wisata Beserta Harga Per Orang.
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
            System.out.print("Masukan Pilihan WIsata: ");// Pengguna Memillih Paket Wisata.
            int pilihanWisata = input.nextInt();//Menggunakan int.

            //Variabel.
            String tujuanWisata;//variabel untuk tujuan wisata menggunakan string.
            double hargaPerOrang;//variabel untuk harga per orang menggunakan double.
            switch (pilihanWisata) {//switch case untuk memilih tujuan wisata.
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
                    return;// keluar dari program jika pilihan tidak valid.
            }

            //Menanyakan kepada pengguna apakah mebutuhkan pemandau wisata? jika iya true jika tidak false.
            System.out.print("Apakah Anda Memerlukan Pemandu Wisata? (true/false): ");
            boolean PemanduWisata = input.nextBoolean();//menggunakan boolean.
            double biayaPemandu = 100000;//biaya pemandu jika menggunakan pemandu (menggunakan double).

            System.out.println(" ");

            //Array untuk menambahkan pilihan failitas yang mungkin dibutuhkan pengguna.
            ArrayList<String> fasilitas = new ArrayList<>();
            ArrayList<Integer> harga = new ArrayList<>();

            //ArrayList String.
            fasilitas.add("Transportasi");
            fasilitas.add("Konsumsi");
            fasilitas.add("Tempat Penginapan");

            //ArrayList Integer.
            harga.add(50000);
            harga.add(75000);
            harga.add(120000);

            //Daftar fasilitas yang disediakan.
            System.out.println(" ");
            System.out.println("|>>>===================================<<<|");
            System.out.println(" ");
            System.out.println("|=========================================|");
            System.out.println("|>      Fasilitas yang disediakan:       <|");
            System.out.println("|=========================================|");

            //Menampilkan Daftar Fasilitas.
            for (int i = 0; i < fasilitas.size(); i++) {
                System.out.println((i + 1) + ". " + fasilitas.get(i) + ": Rp " + harga.get(i));
            }

            System.out.println("|=========================================|");

            //Menghitung biaya fasilita yang dipilih.
            int totalBiayaFasilitas = 0;
            List<String> fasilitasDipilih = new ArrayList<>();
            for (int i = 0; i < fasilitas.size(); i++){
                //Pengguna memilih fasilitas yang ingin dipilih.
                System.out.print("Apakah Anda Ingin Menggunakan Tambahan Fasilitas " + fasilitas.get(i) + "? (true/false): ");
                boolean pilihanFasilitas = input.nextBoolean();//Menggunakan booelan.
                if (pilihanFasilitas == true) {
                    fasilitasDipilih.add(fasilitas.get(i));
                    totalBiayaFasilitas += harga.get(i);
                }
            }

            //Menghitung total biaya keseluruhan.
            double totalBiaya = (hargaPerOrang * jumlahOrang) + totalBiayaFasilitas;//Menggunakan double.

            //Jika menggunakan pemandu wisata maka total biaya keseluruhan ditambah biaya pemandu.
            if (PemanduWisata) {
                totalBiaya += biayaPemandu;
            }

            //Menampilkan detail rician.
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