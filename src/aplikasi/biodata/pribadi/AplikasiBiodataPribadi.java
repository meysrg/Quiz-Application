/*
Nama  : Meyliza Veronica Siregar
NIM   : 11419058
Kelas : 42TRPL2
*/

package aplikasi.biodata.pribadi;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AplikasiBiodataPribadi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<LatihanSoal> Ujian = new LinkedList<LatihanSoal>();
        PesertaLatihan Peserta = new PesertaLatihan();
        
        int pil=0;
        Scanner scanstring = new Scanner(System.in);
        Scanner scannumber = new Scanner(System.in);
        
        String Nama, TanggalLahir, Alamat, jenisKelamin;
        System.out.print("Masukkan Nama                : ");
        Nama = scanstring.nextLine();
        System.out.print("Masukkan Tanggal Lahir       : ");
        TanggalLahir = scanstring.nextLine();
        System.out.print("Masukkan Jenis Kelamin (P/L) : ");
        jenisKelamin = scanstring.nextLine();
        System.out.print("Masukkan Alamat              : ");
        Alamat = scanstring.nextLine();

        
        Peserta.setNama(Nama);
        Peserta.setAlamat(Alamat);
        Peserta.setTanggalLahir(TanggalLahir);
        Peserta.setId(1);
        if(jenisKelamin.equalsIgnoreCase("P")){
            Peserta.setJenisKelamin(JenisKelamin.Perempuan);
        }
        else if(jenisKelamin.equalsIgnoreCase("L")){
            Peserta.setJenisKelamin(JenisKelamin.LakiLaki);
        }
        
        while(true){
            System.out.println();
            System.out.println(".......................................");
            System.out.println("Silahkan Pilih Menu di bawah ini: ");
            System.out.println("1. Tampilkan Biodata");
            System.out.println("2. Kerjakan Latihan Soal");
            System.out.println("3. Lihat History Nilai");
            System.out.println("4. Keluar");
            System.out.println(".......................................");
            System.out.println();
            System.out.print("Pilihan Anda : ");
  
            pil = scannumber.nextInt();
            if(pil==1){
                System.out.println();
                Peserta.Biodata();
            }
            else if(pil==2){
                LatihanSoal tmp1 = new LatihanSoal();
                tmp1.kerjakan();
                Ujian.add(tmp1);
            }
            else if(pil==3){
                System.out.println();
                for(LatihanSoal item : Ujian){
                    item.tampilkanHistory();
                }
            }
            else if(pil==4){
                System.out.println();
                System.out.println("Anda Keluar dari Program");
                break;
            }
        }
    }
}
