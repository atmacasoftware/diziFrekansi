//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int count = 0;
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20, 1, 1, 1};
        int siralama;

        // Dizideki elemanları küçükten büyüğe sırala
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[i]) {
                    siralama = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = siralama;
                }
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            count = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    count++;

                }
            }

            if (i == 0 && dizi[i + 1] == dizi[i]) {
                System.out.println(String.format("%d sayısı %d kere tekrar edildi.", dizi[i], count));
            }

            if (i == 0 && dizi[i + 1] != dizi[i]) {
                System.out.println(String.format("%d sayısı %d kere tekrar edildi.", dizi[i], count));
            }


            if (i != 0 && dizi[i - 1] != dizi[i]) {
                System.out.println(String.format("%d sayısı %d kere tekrar edildi.", dizi[i], count));
            }
        }

    }
}