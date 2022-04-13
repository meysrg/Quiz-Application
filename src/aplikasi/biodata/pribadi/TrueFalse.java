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
public class TrueFalse implements Soal{
    private String Soal;
    private boolean Key;
    
    public double getPOIN(){
        return this.POIN;
    }
    
    @Override
    public void showSoal(){
        System.out.println();
        System.out.println(Soal);
        System.out.println("True");
        System.out.println("False");
        System.out.println();
    }
    
    @Override
    public boolean checkSoal(String Key){
        if(Key.equalsIgnoreCase("True")){
            if(this.isKey()){
                return true;
            }
        }
        else if(Key.equalsIgnoreCase("False")){
            if(!this.isKey()){
                return true;
            }
        }
        return false;
    }

    public String getSoal() {
        return Soal;
    }

    public void setSoal(String Soal) {
        this.Soal = Soal;
    }

    public boolean isKey() {
        return Key;
    }

    public void setKey(boolean Key) {
        this.Key = Key;
    }
}
