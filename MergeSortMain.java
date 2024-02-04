public class MergeSortMain {
    public static void main(String[] args) {
        int[] a = {9, 7, 6, 1, 3, 2, 5};
       /* MergeSort mergeSort = new MergeSort(a);
        mergeSort.yazdir();
        mergeSort.MergeSort(0, a.length - 1);
        System.out.println("\nSiralanmis Dizi :");
        mergeSort.yazdir();*/
        mergesort1 mergesort1 = new mergesort1(a);
        mergesort1.mergeSort(0, a.length-1);
        mergesort1.yazdir();
    }
}
