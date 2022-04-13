/*
Nama  : Meyliza Veronica Siregar
NIM   : 11419058
Kelas : 42TRPL2
*/

package aplikasi.biodata.pribadi;

/**
 *
 * @author User
 */
public class MultipleChoice implements Soal {
    private String Soal, OptionA, OptionB, OptionC, OptionD, OptionE, Key;
    public double getPOIN(){
        return this.POIN;
    }
    @Override
    public void showSoal(){
        System.out.println();
        System.out.println(Soal);
        System.out.println("A. " + OptionA);
        System.out.println("B. " + OptionB);
        System.out.println("C. " + OptionC);
        System.out.println("D. " + OptionD);
        System.out.println("E. " + OptionE);
        System.out.println(); 
    } 
    
    @Override
    public boolean checkSoal(String Key){
        if(this.Key.equalsIgnoreCase(Key)){
            return true;
        }
        return false;
    }

    public String getSoal() {
        return Soal;
    }

    public void setSoal(String Soal) {
        this.Soal = Soal;
    }

    public String getOptionA() {
        return OptionA;
    }

    public void setOptionA(String OptionA) {
        this.OptionA = OptionA;
    }

    public String getOptionB() {
        return OptionB;
    }

    public void setOptionB(String OptionB) {
        this.OptionB = OptionB;
    }

    public String getOptionC() {
        return OptionC;
    }

    public void setOptionC(String OptionC) {
        this.OptionC = OptionC;
    }

    public String getOptionD() {
        return OptionD;
    }

    public void setOptionD(String OptionD) {
        this.OptionD = OptionD;
    }

    public String getOptionE() {
        return OptionE;
    }

    public void setOptionE(String OptionE) {
        this.OptionE = OptionE;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String Key) {
        this.Key = Key;
    }  
}
