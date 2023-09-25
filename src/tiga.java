abstract class bentuk {
    public abstract double hitungluas();

    public void tampilkanInfo () {
            System.out.println("ini adalah sebuah bentuk");
        }
}

class lingkaran extends bentuk {
    public double jarijari;

    public lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double hitungluas() {
        return Math.PI * jarijari * jarijari;
    }
}

class persegi extends bentuk {
        private double sisi;

        public persegi(double sisi) {
            this.sisi = sisi;

        }

        @Override
        public double hitungluas() {
            return sisi * sisi;
        }
}

    public class tiga {
        public static void main(String[] args) {
            lingkaran Lingkaran = new lingkaran(5.0);
            persegi Persegi = new persegi(12.2);

            Lingkaran.tampilkanInfo();

            System.out.println("luas lingkaran : " + Lingkaran.hitungluas());

            Persegi.tampilkanInfo();

            System.out.println("Luas Persegi : " + Persegi.hitungluas());
        }
    }