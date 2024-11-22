import java.util.Scanner; 
 
public class kubus04 { 
    private double sisi; 
 
    public kubus04(double sisi) { 
        this.sisi = sisi; 
    } 
    public double hitungVolume() { 
        return sisi * sisi * sisi; 
    } 
 
    public double hitungLuasPermukaan() { 
        return 6 * sisi * sisi; 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Masukkan panjang sisi kubus: "); 
        double sisi = scanner.nextDouble(); 
 
        kubus04 kubus = new kubus04(sisi); 
        
        System.out.println("Volume Kubus: " + kubus.hitungVolume()); 
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan()); 
 
        scanner.close();  
    } 
} 
