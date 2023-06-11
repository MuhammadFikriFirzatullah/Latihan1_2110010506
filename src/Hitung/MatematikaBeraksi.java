package Hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Matematika fikri = new Matematika (0,6);
        
        System.out.println("Hasil Penjumlahan: "+fikri.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+fikri.setPengurangan());
        System.out.println("Hasil Perkalian: "+fikri.setPerkalian());
        System.out.println("Hasil Pembagian: "+fikri.setPembagian());
        
    }
    
}
