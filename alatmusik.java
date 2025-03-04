package polymorphims;

public class alatmusik {
    // Metode yang bisa diubah oleh subclass
    void mainkan() {
        System.out.println("Alat musik dimainkan...");
    }

    // Subclass Gitar (Inner Class)
    static class Gitar extends alatmusik {
        @Override
        void mainkan() {
            System.out.println("Gitar: Jreeeng... Jreeeng...");
        }
    }

    // Subclass Piano (Inner Class)
    static class Piano extends alatmusik {
        @Override
        void mainkan() {
            System.out.println("Piano: Tinnng... Tinnng...");
        }
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat array berisi objek alat musik
        alatmusik[] musikList = {new Gitar(), new Piano()};

        // Menjalankan metode mainkan() dari setiap objek
        for (alatmusik a : musikList) {
            a.mainkan();
        }
    }
}
