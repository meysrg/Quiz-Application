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
public class PesertaLatihan extends User {
    private int id;
    public void Biodata(){
        System.out.println("***************************************");
        System.out.println("Nama          : " + this.getNama());
        System.out.println("Tanggal lahir : " + this.getTanggalLahir()); 
        if(this.getJenisKelamin() == JenisKelamin.LakiLaki){
            System.out.println("Jenis Kelamin : Laki-Laki");
        }
        else if(this.getJenisKelamin() == JenisKelamin.Perempuan){
            System.out.println("Jenis Kelamin : Perempuan");
        }
        System.out.println("Alamat        : " + this.getAlamat());
        System.out.println("***************************************");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
