public class App {
    public static void main(String[] args) throws Exception {
        //nomor 4
        Karyawan user1 = new Karyawan("1","Aditya");//inisiasi
        user1.setDepartemen("AcademyUP");//tes setter departemen
        user1.setGaji(-100000.0);//tes gaji minus
        user1.setGaji(100000.0);//tes gaji benar
        System.out.println("\n");
        user1.tampilkanDataKaryawan();//tampilkan profil
    }
}
