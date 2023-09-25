public class test {
    public static int devide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("tidak dapat melakukan pembagian");
        }
        return num1 / num2;
    }


    public static void main(String[] args) {
        try {
            int hasilPembagian = devide(10, 2);
            System.out.println("hasil pembagian: " + hasilPembagian);
        } catch (ArithmeticException e) {
            System.out.println("terjadi kesalahan aritmatika: " + e.getMessage());
        } finally {
            System.out.println("selesai");
        }

    }

}