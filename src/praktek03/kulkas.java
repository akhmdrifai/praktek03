package praktek03;
public class kulkas {
     private String merek;
     private double harga;
     private double jumlah;
    
     
     void cetakInfo(){
         System.out.println("merek \t:" + merek+"\n"+
                 "harga \t:"+harga+"\n"+
                 "jumlah \t:"+jumlah);
         
        
     }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
     
     
}
