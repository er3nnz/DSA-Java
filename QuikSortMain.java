public class QuikSortMain {
    public static void main(String[] args) {
        int[] a = {1, 9, 2, 5, 4, 6, 3, 7, 0};
        QuikSort1 quikSort = new QuikSort1(a);
        quikSort.yazdir();
        quikSort.quikSort(0, a.length - 1);
        System.out.println("\nSiralanmis Hali...");
        quikSort.yazdir();
    }
}
