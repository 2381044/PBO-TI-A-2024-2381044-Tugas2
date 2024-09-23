package tugas2;

public class BangunDatar {

    // Method untuk menghitung luas dan keliling persegi
    public void hitungPersegi(double sisi) {
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi: " + keliling);
    }

    // Method untuk menghitung luas dan keliling persegi panjang
    public void hitungPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }

    // Method untuk menghitung luas dan keliling lingkaran
    public void hitungLingkaran(double jariJari) {
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}