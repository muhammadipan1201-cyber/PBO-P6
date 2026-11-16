package P6;

public class SOAL7 extends Thread {
    
      //Override
    @Override
    public void run() {
        System.out.println("Thread sedang berjalan.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Proses thread ke-" + i);
        }

        System.out.println("Thread selesai.");
    }

    public void jalankan() {
        System.out.println("=== Soal 7: Inheritance Thread ===");

        SOAL7 thread = new SOAL7();

        thread.start();
    }
}
