public class BubbleSortMain {
    public static void main(String[] args) {
        int[] array = {1, 9, 10, 12, 5, 3, 8, 4};
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.Sort();
        bubbleSort.yazdir();
    }
}
