package P6;

public class SOAL2 {
     public void jalankan() {
        System.out.println("=== Soal 2: Mengubah Nilai Array ===");

        String[] mobil = {
            "Tesla", "Suzuki", "Civic", "Mazda", "BMW"
        };

        mobil[1] = "Toyota";

        System.out.println("Nilai indeks yang diubah: " + mobil[1]);
    }
}
