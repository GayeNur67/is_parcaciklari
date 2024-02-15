package _19010310021_IsletımSistemi;

public class Proses {

    private String isim;
    private int numara;
    private String durum; // Bu alan yerine daha açıklayıcı bir alan kullanılabilir, örneğin: islemDurumu
    private int programSayaci;

    public Proses(String isim, int numara, String durum, int programSayaci) {
        this.isim = isim;
        this.numara = numara;
        this.durum = durum;
        this.programSayaci = programSayaci;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public int getProgramSayaci() {
        return programSayaci;
    }

    public void setProgramSayaci(int programSayaci) {
        this.programSayaci = programSayaci;
    }
}
