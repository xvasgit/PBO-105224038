import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        // soal 3
        ArrayList<PerangkatPintar> perangkat = new ArrayList<PerangkatPintar>();

        //inisiasi dulu objek yang mau dimasukin ke array (belum upcasting)
        LampuPintar objek1 = new LampuPintar();
        AcPintar objek2 = new AcPintar();

        //masukin objek nya ke array list
        perangkat.add(objek1);
        perangkat.add(objek2);

        for(int i=0;i<2;i++){
            PerangkatPintar perangkatpintar = perangkat.get(i); //upcasting tiap objek dalam arraylist pakai referensi superclass
            System.out.print("(No 3) ");
            perangkatpintar.aktifkan();

            //soal 4 (modifikasi perulangan)
            if(perangkatpintar instanceof AcPintar){
                AcPintar ac = (AcPintar)perangkatpintar;//downcasting untuk nomor 4
                System.out.print("(No 4) ");
                ac.aturSuhu(20);
            }
        }
        //Tugas analisis : Mengapa pesan yang tercetak bisa berbeda padahal referensi variabel
        //memanggilnya sama-sama bertipe PerangkatPintar? Jelaskan!

        //Jawab : 
        // Karena method yang dipanggil yaitu "aktifkan()" sudah di override di subclass.
        // objek1 dan objek2 adalah objek yang sebenarnya subclass (LampuPintar dan AcPintar), maka
        // ketika walaupun sudah di upcasting ke superclass, method yang dipanggil tetap method dari sublass (karena sudah di Override)



        // soal 5
        PerangkatPintar alat1 = new LampuPintar();
        // alat1.aturKecerahan(75,"Putih"); //hasilnya eror

        //Tugas Analisis : Berdasarkan pemahaman Anda engenai resolusi metode pada Polymorphism,
        //jelaskan mengapa error ini terjadi! Bagaimana cara memperbaiki baris kode tersebut.
        
        //Jawab : Karena objek "alat1" dilihat sebagai tipe PerangkatPintar oleh compiler. Walaupun objeknya
        // sebenarnya adalah LampuPintar, compiler hanya melihat objek tersebut sebagai PerangkatPintar sehingga
        // tidak mengenal method yang tidak ada di dalam PerangkatPintar. Cara memperbaiki nya adalah dengan
        // melakukan downcasting untuk objek tersebut, dengan mengecek apakah instanceof terlebih dahulu, yaitu :
        if(alat1 instanceof LampuPintar){
            LampuPintar lampu = (LampuPintar)alat1;
            System.out.print("(No 5) ");
            lampu.aturKecerahan(75,"Putih");
        }
    
    }
}
