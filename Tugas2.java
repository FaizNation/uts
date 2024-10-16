import java.util.Scanner;
import java.util.ArrayList;

public class Tugas2 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            //Judul Aplikasi.
            System.out.println("|=========================================|");
            System.out.println("|>>                                     <<|");
            System.out.println("|>          HEALING RESERVATION          <|");
            System.out.println("|>>         << PT Faiz Nation >>        <<|");
            System.out.println("|=========================================|");
            System.out.println(" ");
            System.out.println("<<<=====================================>>> ");
            System.out.println(" ");
            
            //Pengguna Memasukan Nama (Menggunakan String).
            System.out.print("Masukan Nama Anda   : " );
            String nama = input.nextLine();

            //Pengguna Memasukan Jumlah Orang yang Ikut Wisata (Menggunakan int).
            System.out.print("Masukan Jumlah Orang: ");
            int jumlahOrang = input.nextInt();

            //Pilihan Paket Wisata Beserta Harga Per Orang.
            System.out.println(" ");
            System.out.println("|=========================================|");
            System.out.println("|>         Pilihan Paket Wisata:         <|");
            System.out.println("|=========================================|");
            System.out.println("| NO |  Paket Wisata  |  Harga Per Orang  |");
            System.out.println("|-----------------------------------------|");
            System.out.println("| 1. | Paket Exclusive|      100000       |");
            System.out.println("| 2. | Paket Simple   |       70000       |");
            System.out.println("| 3. | Paket Murah    |       50000       |");
            System.out.println("|=========================================|");
            System.out.print("Masukan Paket WIsata: ");// Pengguna Memillih Paket Wisata.
            int pilihanWisata = input.nextInt();//Menggunakan int.

            //Variabel.
            String tujuanWisata;//variabel untuk tujuan wisata menggunakan string.
            double hargaPerOrang;//variabel untuk harga per orang menggunakan double.
            switch (pilihanWisata) {//switch case untuk memilih tujuan wisata.
                case 1:
                    tujuanWisata = "Paket Exclusive";
                    hargaPerOrang = 100000;
                    break;
                case 2:
                    tujuanWisata = "Paket Simple";
                    hargaPerOrang = 70000;
                    break;
                case 3:
                    tujuanWisata = "Paket Murah";
                    hargaPerOrang = 50000;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
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
            fasilitas.add("Gunung");
            fasilitas.add("Pantai");
            fasilitas.add("Kota");

            //ArrayList Integer.
            harga.add(50000);
            harga.add(35000);
            harga.add(25000);

            //Daftar fasilitas yang disediakan.
            System.out.println(" ");
            System.out.println("|>>>===================================<<<|");
            System.out.println(" ");
            System.out.println("|=========================================|");
            System.out.println("|> Daftar Destinasi dan Harga Per Orang: <|");
            System.out.println("|=========================================|");

            //Menampilkan Daftar Fasilitas.
            for (int i = 0; i < fasilitas.size(); i++) {
                System.out.println((i + 1) + ". " + fasilitas.get(i) + ": Rp " + harga.get(i));
            }

            System.out.println("|=========================================|");
            System.out.print("Masukan tujuan destinasi wisata: ");
            int destinasiPilihan = input.nextInt();

            String tujuanDestinasi;
            double hargaDestinasi;
            switch (destinasiPilihan) {
                case 1:
                    tujuanDestinasi = "Gunung";
                    hargaDestinasi = 50000;
                    break;
                case 2:
                    tujuanDestinasi = "Pantai";
                    hargaDestinasi = 35000;
                    break;
                case 3:
                    tujuanDestinasi = "Kota";
                    hargaDestinasi = 25000;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    return;
            }
            
            

            //Menghitung biaya fasilita yang dipilih.
            
            
            double totalPaketSemuaOrang = hargaPerOrang * jumlahOrang;
            double totalHargaDestinasi = hargaDestinasi * jumlahOrang;
            //Menghitung total biaya keseluruhan.
            double totalBiaya = (hargaPerOrang * jumlahOrang) + (hargaDestinasi * jumlahOrang);//Menggunakan double.

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
            System.out.println("|Nama                     : " + nama);
            System.out.println("|Paket Wisata             : " + tujuanWisata);
            System.out.println("|Jumlah Orang             : " + jumlahOrang);
            System.out.println("|Total Harga Paket        : " + totalPaketSemuaOrang);
            System.out.println("|Biaya Paket Per Orang    : " + hargaPerOrang);
            System.out.println("|Pemandu Wisata           : " + (PemanduWisata ? "Ya" : "Tidak"));
            System.out.println("|Tujuan Destinasi         : " + tujuanDestinasi);
            System.out.println("|Biaya Destinasi per Orang: " + hargaDestinasi);
            System.out.println("|Total Harga Destinasi    : " + totalHargaDestinasi);
            System.out.println("|=========================================|");
            System.out.println("|Biaya Keseluruhan    : " + totalBiaya);
            System.out.println("|=========================================|");
            System.out.println("|             BY FAIZ NATION              |");
            System.out.println("|=========================================|");

        }


    }
}