import java.util.Scanner;
public class Percobaan604 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();
        L = p * l;
        System.out.println("Luas Persegi panjang adalah " + L);
        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);
    }
}

// import java.util.Scanner;
// public class Percobaan604 {
//     static int hitungLuas(int panjang, int lebar){
//         int Luas = panjang*lebar;
//         return Luas;
//     }
//     static int hitungVolume(int tinggi,int a, int b){
//         int volume = hitungLuas(a, b)*tinggi;
//         return volume;
//     }
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int p, l, t, L, vol;

//         System.out.print("Masukkan panjang: ");
//         p = input.nextInt();
//         System.out.print("Masukkan lebar: ");
//         l = input.nextInt();
//         System.out.print("Masukkan tinggi: ");
//         t = input.nextInt();

//         L = hitungLuas(p, l);
//         System.out.println("Luas Persegi panjang adalah " + L);
//         vol = hitungVolume(t, p, l);
//         System.out.println("Volume balok adalah " + vol);
//     }
// }

