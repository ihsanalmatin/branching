import java.util.Scanner;
public class KatalogToko {
    public static void main(String[] args) {
        // Membuka scanner
        Scanner scanner = new Scanner(System.in);
        
        // Bagian tampilan awal
        System.out.println("Katalog Toko by Ihsan");
        Garis();
        System.out.println("1 - Toko Adi");
        System.out.println("2 - Toko Budi");
        System.out.println("3 - Toko Pardi");
        Garis();
        
        // Pemilihan toko
        System.out.print("Pilih nomor toko yang ingin dikunjungi: ");
        var nomorToko = scanner.nextInt();
        
        // Pembacaan toko
        boolean valid = true;
        
        if (nomorToko == 1){
            tokoAdi();
        }
        else if (nomorToko == 2){
            tokoBudi();
        }
        else if (nomorToko == 3){
            tokoPardi();
        }
        else{
            Garis();
            System.out.println("Tidak ada toko dengan nomor tersebut");
            valid = false;
        }
    } 
    
    
    // Fungsi dan string garis favorit Ihsan
        public static void Garis(){
            String garis = ("------------------------------------------------------------------------");
            System.out.println(garis);
        }
        // Fungsi Toko Adi
        private static void tokoAdi(){
            
            // Scanner Toko Adi
            Scanner inputAdi = new Scanner(System.in);
            
            // Tampilan Toko Adi
            Garis();
            System.out.println("Selamat datang di Toko Adi!");
            Garis();
            System.out.println("List barang-barang yang dijual: ");
            System.out.println("1 - Indomie (@ Rp.3000)");
            System.out.println("2 - Telor itik (@ Rp.3500)");
            System.out.println("3 - Beras (Rp.16000/1L)");
            Garis();
            
            // Bagian input Toko Adi
            System.out.print("Nomor barang yang ingin dibeli: ");
            var nomorBarangAdi = inputAdi.nextInt();
            
            // Pembacaan barang Toko Adi
            String barangAdi = ("");
            int hargaBarangAdi = 0;
            boolean validAdi = true;
            
            if (nomorBarangAdi == 1){
                barangAdi = ("Indomie");
                hargaBarangAdi = 3000;
            }
            else if (nomorBarangAdi == 2){
                barangAdi = ("Telor itik");
                hargaBarangAdi = 3500;
            }
            else if (nomorBarangAdi == 3){
                barangAdi = ("Beras");
                hargaBarangAdi = 16000;
            }
            else {
                Garis();
                System.out.println("Tidak ada barang dengan nomor itu.");
                validAdi = false;
            }
            
            // Pembacaan jumlah barang
            if (validAdi = true){
                Garis();
                System.out.print("Berapa jumlah " + barangAdi + " yang ingin dibeli? ");
                var jumlahBarangAdi = inputAdi.nextInt();
                Garis();
                
            // Kalkulasi total harga beli
            int hargaBeliAdi = hargaBarangAdi * jumlahBarangAdi;
            
            // Tampilan akhir
            if (nomorBarangAdi == 3){
                System.out.println("Anda membeli " + barangAdi + " sebanyak " + jumlahBarangAdi + "L seharga " + hargaBeliAdi);
            }
            else{
                System.out.println("Anda membeli " + barangAdi + " sebanyak " + jumlahBarangAdi + " buah seharga Rp." + hargaBeliAdi);
            }
            inputAdi.close();
        }
    }
        
        // Fungsi Toko Budi
        private static void tokoBudi(){
            Garis();
            System.out.println("Toko Budi belum buka!");
        }
        
        // Fungsi Toko Pardi
        private static void tokoPardi(){
            
            // Scanner Toko Pardi
            Scanner inputPardi = new Scanner(System.in);
            
            // Tampilan Toko Pardi
            Garis();
            System.out.println("Selamat datang di Toko Pardi!");
            Garis();
            System.out.println("List barang-barang yang dijual:");
            System.out.println("1 - Coca Cola (@ Rp.4500)");
            System.out.println("2 - Sprite (@ Rp.5000)");
            System.out.println("3 - Air Mineral (@ Rp.3000)");
            Garis();
            
            // Bagian input Toko Pardi
            System.out.print("Nomor barang yang ingin dibeli: ");
            var nomorBarangPardi = inputPardi.nextInt();
            
            // Pembacaan barang Toko Pardi
            String barangPardi = ("");
            int hargaBarangPardi = 0;
            boolean validPardi = true;
            
            if (nomorBarangPardi == 1){
                barangPardi = ("Coca Cola");
                hargaBarangPardi = 4500;
            }
            else if (nomorBarangPardi == 2){
                barangPardi = ("Sprite");
                hargaBarangPardi = 5000;
            }
            else if (nomorBarangPardi == 3){
                barangPardi = ("Air Mineral");
                hargaBarangPardi = 3000;
            }
            else {
                Garis();
                System.out.println("Tidak ada barang dengan nomor itu");
                validPardi = false;
            }
            
            // Pembacaan jumlah barang
            if (validPardi = true){
                Garis();
                System.out.print("Berapa jumlah " + barangPardi + " yang ingin dibeli? ");
                var jumlahBarangPardi = inputPardi.nextInt();
                Garis();
                
            // Kalkulasi total harga beli
            int hargaBeliPardi = hargaBarangPardi * jumlahBarangPardi;
            
            // Tampilan Akhir
            System.out.println("Anda membeli " + barangPardi + " sebanyak " + jumlahBarangPardi + " dengan harga Rp." + hargaBeliPardi);
            inputPardi.close();
        }
    }
}
