import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // Test için 1'den 10'a kadar sayıları listeye ekle
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println("Karıştırmadan önce: " + list);
        shuffle(list);
        System.out.println("Karıştırdıktan sonra: " + list);
    }

    /**
     * ArrayList içindeki tamsayıları rastgele karıştırır.
     */
    public static void shuffle(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            // 0 ile list.size() - 1 arasında rastgele bir indeks seç
            int randomIndex = (int) (Math.random() * list.size());

            // Mevcut eleman ile rastgele seçilen elemanın yerini değiştir (swap)
            Object temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }
}