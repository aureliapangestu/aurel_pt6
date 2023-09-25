public class Person {
    public static void main(String[] args) {
        Data aurel = new Data();
        aurel.setNama("Aurel");
        aurel.setPekerjaan("Mahasiswa");
        aurel.setUmur(19);
        aurel.setJeniskelamin("Perempuan");

        System.out.println("-Data Mahasiswa-");
        System.out.println("Nama: " + aurel.getNama());
        System.out.println("Pekerjaan: " + aurel.getPekerjaan());
        System.out.println("Umur: " + aurel.getUmur());
        System.out.println("JenisKelamin: " + aurel.getJeniskelamin());

    }
}
