// public class kafe04 {

//     public static void menu() {
//         System.out.println("==== MENU RESTO KAFE ====");
//         System.out.println("1. Kopi Hitam - Rp 15,000");
//         System.out.println("2. Cappuccino - Rp 20,000");
//         System.out.println("3. Latte - Rp 22,000");
//         System.out.println("4. Teh Tarik - Rp 12,000");
//         System.out.println("5. Roti Bakar - Rp 10,000");
//         System.out.println("6. Mie Goreng - Rp 18,000");
//         System.out.println("===========================");
//         System.out.println("Silahkan pilih menu yang Anda inginkan.");
//     }
//     public static void main(String[] args) {
//         menu();
//     }
// }

// public class kafe04 {

//     public static void menu(String namaPelanggan, boolean isMember) {
//         System.out.println("Selamat datang, " + namaPelanggan + "! ");

//         if (isMember) {
//             System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembeli! ");
//         }

//         System.out.println("==== MENU RESTO KAFE ====");
//         System.out.println("1. Kopi Hitam - Rp 15,000");
//         System.out.println("2. Cappuccino - Rp 20,000");
//         System.out.println("3. Latte - Rp 22,000");
//         System.out.println("4. Teh Tarik - Rp 12,000");
//         System.out.println("5. Roti Bakar - Rp 10,000");
//         System.out.println("6. Mie Goreng - Rp 18,000");
//         System.out.println("===========================");
//         System.out.println("Silahkan pilih menu yang Anda inginkan.");
//     }
//     public static void main(String[] args) {
//         menu("Arifah", false);
//     }
// }    
// import java.util.Scanner;

// public class modifikasikafe04 {

//     public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
//        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

//        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

//        if (kodePromo.equalsIgnoreCase("DISKON50%")) {
//         hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
//     } else if (kodePromo.equalsIgnoreCase("DISKON30%")) {
//         hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
//     } else if (kodePromo.isEmpty()) {
//         System.out.println("Kode promo \"" + kodePromo + "\" tidak valid. Tidak ada diskon yang diterapkan.");
//     }

//        return hargaTotal;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//        System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
//        int pilihanMenu = sc.nextInt();
//        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
//        int banyakItem = sc.nextInt();

//        System.out.println("Masukkan kode promo (jika ada) : ");
//             String kodePromo = sc.nextLine();
            
//             int totalHarga = hitungTotalHarga (pilihanMenu, banyakItem, kodePromo) ;
//             System.out.println("Total Harga untuk pesanan Anda: Rp " + totalHarga);
        
//     }
// }

// public class modifikasikafe04 {

//     public static void main(String[] args) {
//         System.out.println("==== MENU RESTO KAFE ====");
//         System.out.println("1. Kopi Hitam - Rp 15,000");
//         System.out.println("2. Cappuccino - Rp 20,000");
//         System.out.println("3. Latte - Rp 22,000");
//         System.out.println("4. Teh Tarik - Rp 12,000");
//         System.out.println("5. Roti Bakar - Rp 10,000");
//         System.out.println("6. Mie Goreng - Rp 18,000");
//         System.out.println("===========================");
//         System.out.println("Silahkan pilih menu yang Anda inginkan.");
//     }
    
// }

// public class Modifikasi1Perocbaan04 {
//     public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
//         System.out.println("Selamat Datang, "+namaPelanggan+" !");
//         if (isMember) {
//             System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap Pembelian!");
//         }
//         System.out.println("==== MENU RESTO KAFE ====");
//         System.out.println("1. Kopi Hitam - RP 15,000");
//         System.out.println("2. Cappucino - RP 20,000");
//         System.out.println("3. Latte - RP 22,000");
//         System.out.println("4. Teh Tarik - RP 12,000");
//         System.out.println("5. Roti Bakae - RP 10,000");
//         System.out.println("6. Mie Goreng - RP 18,000");
//         System.out.println("=========================");

//         if (kodePromo.equals("DISKON50%")) {
//             System.out.println("Selamat! Anda mendapatkan diskon 50% untuk setiap pembelian.");
//         } else if (kodePromo.equals("DISKON30%")) {
//             System.out.println("Selamat! Anda mendapatkan diskon 30% untuk setiap pembelian.");
//         }else  {
//             System.out.println("Kode Promo Tidak Valid");
//         }

//         System.out.println("Silahkan Pilih Menu yang anda inginkan.");
//     }
//     public static void main(String[] args) {
//         menu("Arifah",  true, "DISKON30%");
//     }
// }

