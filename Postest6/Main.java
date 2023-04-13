import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    static ArrayList<Layer> dataLyr = new ArrayList<>();
    static ArrayList<Acara> dataAcr = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        int pilih = 0;
        boolean ulang = true;
        while (ulang) {
            while (true){
                try{
                    Clearscreen();
                    System.out.println("|=======================|");
                    System.out.println("|Pendataan Box Pizza Hut|");
                    System.out.println("|=======================|");
                    System.out.println("|1. Tambah Data BOX     |");
                    System.out.println("|2. Lihat Data BOX      |");
                    System.out.println("|3. Ubah Data BOX       |");
                    System.out.println("|4. Hapus Data BOX      |");
                    System.out.println("|5. Keluar              |");
                    System.out.println("|=======================|");
                    System.out.print("Masukan inputan: ");
                    pilih = Integer.parseInt(br.readLine());
                    break;
                }catch (Exception e) {
                    Clearscreen();
                    System.out.println("INPUTAN SALAH, ULANGI LAGI!!!");
                }
            }           
            switch (pilih) {
                case 1:
                    Clearscreen();
                    create();
                    break;
                case 2:
                    Clearscreen();
                    read();
                    break;
                case 3:
                    Clearscreen();
                    update();
                    break;
                case 4:
                    Clearscreen();
                    delete();
                    break;
                case 5:
                    Clearscreen();
                    ulang = false;
                    break;
        }

        }
    }

    public static void create() throws NumberFormatException, IOException{
        System.out.println("==========================================================");
        System.out.println("|                       MENU CREATE                      |");
        System.out.println("==========================================================");
        System.out.println(" 1.Create Data Layer ");
        System.out.println(" 2.Create Data Acara ");
        System.out.println("==========================================================");
        System.out.print("Pilih: ");
        int menu = Integer.parseInt(br.readLine());
        System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
        Clearscreen();
        switch(menu){
            case 1:
                System.out.println("==========================================================");
                System.out.println("|                       MENU LAYER                       |");
                System.out.println("==========================================================");
                System.out.print("Masukkan Nama BOX: ");
                String nmaL = br.readLine();
                System.out.print("Masukkan Ukuran BOX: ");
                String ukuL = br.readLine();
                System.out.print("Masukkan Jumlah BOX : ");
                int jmlL = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Total Layer BOX : ");
                int lyr = Integer.parseInt(br.readLine());
                Layer newLayer = new Layer(nmaL, ukuL, jmlL, lyr);
                dataLyr.add(newLayer);
                System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
                break;

            case 2:
                System.out.println("==========================================================");
                System.out.println("|                       MENU ACARA                       |");
                System.out.println("==========================================================");
                System.out.print("Masukkan Nama BOX: ");
                String nmaA = br.readLine();
                System.out.print("Masukkan Ukuran BOX: ");
                String ukuA = br.readLine();
                System.out.print("Masukkan Jumlah BOX : ");
                int jmlA = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Event Box : ");
                String acr = br.readLine();
                Acara newAcr = new Acara(nmaA, ukuA, jmlA, acr);
                System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
                dataAcr.add(newAcr);
                break;
            default:
                break;  
        }
    }

    public static void read() throws IOException{
        System.out.println("==========================================================");
        System.out.println("|                       MENU READ                        |");
        System.out.println("==========================================================");
        System.out.println("1. Lihat Data BOX & LAYER");
        System.out.println("2. Lihat Data BOX & ACARA");
        System.out.println("==========================================================");     
        System.out.print("Masukkan Pilihan: ");
        int menuLihat = Integer.parseInt(br.readLine());
        switch(menuLihat){
            case 1:
                Clearscreen();
                System.out.println("==========================================================");
                System.out.println("Data BOX & LAYER");
                for (int i = 0; i < dataLyr.size(); i ++){
                    dataLyr.get(i).isDisplay(false);
                }
                System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
                break;
            case 2:
                System.out.println("==========================================================");
                System.out.println("Data BOX & EVENT");
                for (int i = 0; i < dataAcr.size(); i ++){
                    dataAcr.get(i).isDisplay(false);
                }
                System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
                break;
            default:
                System.out.println("Data yang dipilih tidak tersedia");
            break;
        }
    }

    public static void update() throws NumberFormatException, IOException{
        System.out.println("==========================================================");
        System.out.println("|                       MENU UPDATE                      |");
        System.out.println("==========================================================");
        System.out.println("1. Edit Data BOX & LAYER");
        System.out.println("2. Edit Data BOX & ACARA");
        System.out.println("==========================================================");     
        System.out.print("Masukkan data yang ingin diedit : ");
        int menuEdit = Integer.parseInt(br.readLine());
        System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
        Clearscreen();
        switch(menuEdit){
            case 1:
                System.out.println("==========================================================");
                System.out.print("Masukan Nama BOX: "); String findLyr = br.readLine();
                for(Layer lyr : dataLyr){
                    if(lyr.getNama().equals(findLyr)){
                        System.out.println("==========================================================");
                        System.out.print("Nama BOX     : "); lyr.setNama(br.readLine());
                        System.out.print("Ukuran BOX   : "); lyr.setUkuran(br.readLine());
                        System.out.print("Jumlah BOX   : "); lyr.setJumlah(Integer.parseInt(br.readLine()));
                        System.out.print("Total Layer  : "); lyr.setTotal(Integer.parseInt(br.readLine()));
                        System.out.println("==========================================================");
                    }
                }
                System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 

                break;
            case 2:
                System.out.println("==========================================================");
                System.out.print("Masukan Nama BOX: "); String findAcr = br.readLine();
                for(Acara acr : dataAcr){
                    if(acr.getNama().equals(findAcr)){
                        System.out.println("==========================================================");
                        System.out.print("Nama BOX     : "); acr.setNama(br.readLine());
                        System.out.print("Ukuran BOX   : "); acr.setUkuran(br.readLine());
                        System.out.print("Jumlah BOX   : "); acr.setJumlah(Integer.parseInt(br.readLine()));
                        System.out.print("Event BOX    : "); acr.setEvent(br.readLine());
                        System.out.println("==========================================================");
                    }
                }
                System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
                break;
            default:
                System.out.println("Data yang dipilih tidak tersedia");
                break;
        }
    }

    public static void delete() throws IOException{
        System.out.println("==========================================================");
        System.out.println("|                       MENU DELETE                      |");
        System.out.println("==========================================================");
        System.out.println("1. Hapus Data BOX & LAYER");
        System.out.println("2. Hapus Data BOX & EVENT");
        System.out.println("==========================================================");     
        System.out.print("Masukkan data yang ingin dihapus : ");
        int menuHapus = Integer.parseInt(br.readLine());
        switch(menuHapus){
            case 1:
                System.out.print("Masukan Nama BOX: "); String findLyr1 = br.readLine();

                for(int i = 0; i < dataLyr.size(); i++){
                    if(dataLyr.get(i).getNama().equals(findLyr1)){
                        dataLyr.remove(i);
                        System.out.println(" Data Terhapus!\n");
                    }
                }
                System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
                break;
            case 2:
                System.out.print("Masukan Nama BOX: "); String findAcr1 = br.readLine();

                for(int i = 0; i < dataAcr.size(); i++){
                    if(dataAcr.get(i).getNama().equals(findAcr1)){
                        dataAcr.remove(i);
                        System.out.println(" Data Terhapus!\n");
                    }
                }
                System.out.println("Tekan enter untuk melanjutkan"); br.readLine(); 
                break;
            default:
            System.out.println("Data yang dipilih tidak tersedia");
            break;
    }
}

    public static void Clearscreen(){
        try{
            if(System.getProperty("os.name").contains("windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch(Exception ex){
            System.err.println("Gagal Membersihkan");
        }
    }
}
