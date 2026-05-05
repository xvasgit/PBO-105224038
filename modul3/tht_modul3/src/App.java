import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int stokVIP = 5, stokFestival = 25, stokTribune = 35, pilihan = 0, jumlah, tiketBerhasil =0,usia;
        int hargaVIP = 1500000, hargaFestival = 800000, hargaTribune = 500000;
        boolean batalDarurat = false;
        Scanner input = new Scanner(System.in);
        do{
            tiketBerhasil = 0;
            batalDarurat = false;
            System.out.println("1. VIP      - Harga: Rp 1.500.000 | Stok: " + stokVIP      + " | Syarat Usia: Minimal 18 tahun");
            System.out.println("2. Festival - Harga: Rp 800.000   | Stok: " + stokFestival + " | Syarat Usia: Minimal 15 tahun");
            System.out.println("3. Tribune  - Harga: Rp 500.000   | Stok: " + stokTribune  + " | Syarat Usia: Tidak ada batasan");
            System.out.print("Pilihan menu : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 :
                    System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
                    jumlah = input.nextInt();
                    if(stokVIP - jumlah < 0){
                        System.out.println("Stok tidak mencukupi");
                        break;
                    }else{
                        for(int i=0;i < jumlah;i++){
                            if(batalDarurat) break;
                            while(true){
                                System.out.print("Masukkan usia (Tiket " + (i+1) + "): ");
                                usia = input.nextInt();
                                if (usia == -1){
                                    System.out.println("Batal darurat, stok dikembalikan");
                                    batalDarurat = true;
                                    break;
                                }
                                
                                if (usia <= 0 || usia >= 150) {
                                System.out.println("Usia tidak logis");
                                continue; //usia ga logis = lanjut input usia saat ini
                                }

                                if(usia < 18){
                                    System.out.println("Usia tidak mencukupi"); //usia ga cukup = skip, ke iterasi selanjutnya
                                }else{
                                    stokVIP--;//usia cukup sama juga
                                    tiketBerhasil++;
                                    System.out.println("Usia berhasil diverifikasi");
                                }
                                break;
                            }
                        }
                    }
                        if (!batalDarurat) {
                            System.out.println("Kategori     : VIP");
                            System.out.println("Tiket dicoba : " + jumlah);
                            System.out.println("Tiket berhasil: " + tiketBerhasil);
                            System.out.println("Total tagihan : Rp" +  hargaVIP * tiketBerhasil);
                        }else{
                            stokVIP = stokVIP + tiketBerhasil; //kembaliin yang udah dipesan jika batal darurat
                        }
                    break;
                case 2 :
                    System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
                    jumlah = input.nextInt();
                    if(stokFestival - jumlah < 0){
                        System.out.println("Stok tidak mencukupi");
                        break;
                    }else{
                        for(int i=0;i < jumlah;i++){
                            if(batalDarurat) break;
                            while(true){
                                System.out.print("Masukkan usia : ");
                                usia = input.nextInt();
                                if (usia == -1) {
                                    System.out.println("Batal darurat, stok dikembalikan");
                                    batalDarurat = true;
                                    break;
                                }
                                
                                if (usia <= 0 || usia >= 150) {
                                System.out.println("Usia tidak logis");
                                continue;
                                }

                                if(usia < 15){
                                    System.out.println("Usia tidak mencukupi");
                                }else{
                                    stokFestival--;
                                    tiketBerhasil++;
                                    System.out.println("Usia berhasil diverifikasi");
                                }
                                break;
                            }
                        }
                    }
                        if (!batalDarurat) {
                            System.out.println("Kategori     : Festival");
                            System.out.println("Tiket dicoba : " + jumlah);
                            System.out.println("Tiket berhasil: " + tiketBerhasil);
                            System.out.println("Total tagihan : Rp" +  hargaFestival * tiketBerhasil);
                        }else{
                            stokFestival = stokFestival + tiketBerhasil;
                        }
                    break;
                case 3 : 
                    System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
                    jumlah = input.nextInt();
                    if(stokTribune - jumlah < 0){
                        System.out.println("Stok tidak mencukupi");
                        break;
                    }else{
                        for(int i=0;i < jumlah;i++){
                            if(batalDarurat) break;
                            while(true){
                                System.out.print("Masukkan usia : ");
                                usia = input.nextInt();
                                if (usia == -1) {
                                    System.out.println("Batal darurat, stok dikembalikan");
                                    batalDarurat = true;
                                    break;
                                }
                                
                                if (usia <= 0 || usia >= 150) {
                                System.out.println("Usia tidak logis");
                                continue; 
                                }

                                stokTribune--;
                                tiketBerhasil++;
                                System.out.println("Usia berhasil diverifikasi");
                                break;

                            }
                        }
                    }
                        if (!batalDarurat) {
                            System.out.println("Kategori     : Tribune");
                            System.out.println("Tiket dicoba : " + jumlah);
                            System.out.println("Tiket berhasil: " + tiketBerhasil);
                            System.out.println("Total tagihan : Rp" +  hargaTribune * tiketBerhasil);
                        }else{
                            stokTribune = stokTribune + tiketBerhasil;
                        }
                    break;
                default : 

            }
        }while(pilihan!=4);
        input.close();
    }

}
