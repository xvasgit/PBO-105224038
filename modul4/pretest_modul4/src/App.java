public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa student1 = new Mahasiswa();
        student1.nama = "Erlangga Aditya";
        student1.umur = 19;
        student1.jurusanstudi = "Ilmu Komputer";
        System.out.println(student1.nama);
        System.out.println(student1.umur);
        System.out.println(student1.jurusanstudi);
    }
}

class Mahasiswa {
        String nama,jurusanstudi;
        int umur;

    }
