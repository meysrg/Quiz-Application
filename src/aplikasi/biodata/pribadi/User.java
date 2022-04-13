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
public abstract class User {
    private String Nama, TanggalLahir, Alamat;
    private JenisKelamin jenisKelamin; 

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(String TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public abstract void Biodata();
    
}
