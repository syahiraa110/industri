public class KonvertSuhu {
    public static void main(String[] args) {
        System.out.println("Semangat Beajar Fisika");
        KonvertSuhu s = new KonvertSuhu();
        s.namaSiswa();
        System.out.println("Celcius ke Fahrenheit adalah: "+s.suhu(32));

    }
    public void namaSiswa(){
        String nama= "Putri";
        System.out.println("Nama Siswa: "+nama);
    
    
    }
    public double suhu(double celcius){
        double suhu = 9/5*celcius + 32;
        return suhu;
    }
}
