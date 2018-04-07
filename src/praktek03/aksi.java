package praktek03;
public class aksi {
    public static void main(String[] args) {
        kulkas t = new kulkas();
        t.merek="LG";
        t.harga=5000000;
        t.jumlah=1;
        
        t.setMerek("Samsung");
        t.setHarga(3000000);
        t.setJumlah(2);
                
        
        
        t.cetakInfo();
        
            System.out.print("merek \t: ");
            System.out.println(t.getMerek());
            System.out.print("harga \t: ");
            System.out.println(t.getHarga());
            System.out.print("jumlah \t: ");
            System.out.println(t.getJumlah());
            
    }
    
    
}
