public class Main {

    public static void main(String[] args) {

        String mesaj = sehirVer();
        System.out.println(mesaj);
        int sayi = topla(15, 7);
        System.out.println(sayi);

        System.out.println(topla2(1, 1, 1));

    }


    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla2(int... sayilar) {

        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}
