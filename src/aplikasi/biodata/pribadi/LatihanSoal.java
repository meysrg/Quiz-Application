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
public class LatihanSoal {
    private PesertaLatihan Peserta;
    private double Nilai;
    private LinkedList<MultipleChoice> PilihanBerganda = new LinkedList<MultipleChoice>();
    private LinkedList<TrueFalse> TrueFalse = new LinkedList<TrueFalse>();
    
    public LatihanSoal(){
        MultipleChoice tmp1= new MultipleChoice();
        tmp1.setSoal("1. Manakah code di bawah ini yang yang befungsi untuk mencetak hasil yang ada dalam ();");
        tmp1.setOptionA("System.out.print");
        tmp1.setOptionB("System.out.println()");
        tmp1.setOptionC("System.out.println{};");
        tmp1.setOptionD("System.out.println();");
        tmp1.setOptionE("System.out.println[]");
        tmp1.setKey("D");
        PilihanBerganda.add(tmp1);
        
        MultipleChoice tmp2= new MultipleChoice();
        tmp2.setSoal("2. Pada akhir setiap potongan statement code kita harus menambahkan...agar tidak terjadi error.");
        tmp2.setOptionA("tanda titik");
        tmp2.setOptionB("titik dua");
        tmp2.setOptionC("titik koma");
        tmp2.setOptionD("tanda seru");
        tmp2.setOptionE("tanda koma");
        tmp2.setKey("C");  
        PilihanBerganda.add(tmp2);
        
        MultipleChoice tmp3= new MultipleChoice();
        tmp3.setSoal("3. Di bawah ini yang merupakan komentar pada java adalah...");
        tmp3.setOptionA("// dan /**/");
        tmp3.setOptionB("// dan *");
        tmp3.setOptionC("// dan /*");
        tmp3.setOptionD("** dan /* */");
        tmp3.setOptionE("Semua Salah");
        tmp3.setKey("A");   
        PilihanBerganda.add(tmp3);
                
        MultipleChoice tmp4= new MultipleChoice();
        tmp4.setSoal("4. Di bawah ini yang merupakan potongan code yang menghasilkan output string \"5 + 3\" adalah..");
        tmp4.setOptionA("System.out.println(\"5 + 3\");");
        tmp4.setOptionB("System.out.println(‘5 + 3’)");
        tmp4.setOptionC("System.out.println(5 + 3);");
        tmp4.setOptionD("System.out.println(5 + 3)");
        tmp4.setOptionE("Semua Benar");
        tmp4.setKey("A");   
        PilihanBerganda.add(tmp4);
                         
        MultipleChoice tmp5= new MultipleChoice();
        tmp5.setSoal("5. Untuk mengambil input dan menampikan output pada java dapat digunakan dengan fungsi...");
        tmp5.setOptionA("export “java.util.Scanner”");
        tmp5.setOptionB("import java.util.Scanner;");
        tmp5.setOptionC("export “java.Scanner”");
        tmp5.setOptionD("import java.Scanner;");
        tmp5.setOptionE("Tidak ada jawaban yang benar");
        tmp5.setKey("B");   
        PilihanBerganda.add(tmp5);
        
        TrueFalse tmp6 = new TrueFalse();
        tmp6.setSoal("6. Pemrograman procedural bergantung pada prosedur yang beroperasi atas data yang dapat diakses dan dimodifikasi dari berbagai kode.");
        tmp6.setKey(true);
        this.TrueFalse.add(tmp6);
        
        TrueFalse tmp7 = new TrueFalse();
        tmp7.setSoal("7. Pemrograman dengan Object Oriented dilakukan dengan memberikan serangkaian instruksi berurutan yaitu langkah per langkah.");
        tmp7.setKey(false);
        this.TrueFalse.add(tmp7);
        
        TrueFalse tmp8 = new TrueFalse();
        tmp8.setSoal("8. Tanda + yang digunakan untuk penjumlahan juga dapat digunakan untuk menggabungkan string pada java.");
        tmp8.setKey(true);
        this.TrueFalse.add(tmp8);
        
        TrueFalse tmp9 = new TrueFalse();
        tmp9.setSoal("9. Comparison_Operator digunakan untuk menghasilkan nilai boolean true atau false dari 2 kondisi atau lebih.");
        tmp9.setKey(false);
        this.TrueFalse.add(tmp9);
        
        TrueFalse tmp10 = new TrueFalse();
        tmp10.setSoal("10. Agar method void dapat berjalan, kita perlu memanggilnya pada method main, dan harus membuat objek dari class yang kita gunakan terlebih dahulu, lalu panggil pada method main.");
        tmp10.setKey(true);
        this.TrueFalse.add(tmp10);
        
    }
    
    public void kerjakan(){
        String Key;
        double total=0;
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("************************");
        System.out.println("Bagian Pilihan Berganda");
        System.out.println("************************");
        for(MultipleChoice item : PilihanBerganda){
            item.showSoal();
            System.out.print("Jawaban Anda (A, B, C, D, E) : ");
            Key = scan.next();
            if(item.checkSoal(Key)){
                total += item.getPOIN();
            }
        }
        System.out.println();
        System.out.println("******************");
        System.out.println("Bagian True False");
        System.out.println("******************");
        for(TrueFalse item : this.TrueFalse){
            item.showSoal();
            System.out.print("Jawaban Anda (True, False) : ");
            Key = scan.next();
            if(item.checkSoal(Key)){
                total += item.getPOIN();
            }
        }
        
        int jumlahsoal = this.TrueFalse.size()+PilihanBerganda.size();
        double hasilAkhir = total/(jumlahsoal*1.0)*100;
        
        System.out.println();
        System.out.println("------------------");
        System.out.println("Nilai Anda = " + hasilAkhir);
        System.out.println("------------------");
        this.Nilai = hasilAkhir;
    }
    
    public void tampilkanHistory(){
        System.out.println("--------------------------");
        System.out.println("History Nilai Anda = " + this.Nilai);
        System.out.println("--------------------------");
    }
}
