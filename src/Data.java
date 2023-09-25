public class Data {
    private String nama;
    private String pekerjaan;
    private String jeniskelamin;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }
}

