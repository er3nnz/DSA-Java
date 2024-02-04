public class SelectionSortMain {
    public static void main(String[] args) {
        int[] array = {1, 9, 10, 12, 5, 3, 8, 5, 13};
        SelectionSort selectionSort = new SelectionSort(array);
        selectionSort.SelectionSort();
        selectionSort.yazdir();

    }


}
