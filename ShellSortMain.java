public class ShellSortMain {
    public static void main(String[] args) {
        int[] a = {1, 9, 7, 4, 3, 6};
        ShellSort shellSort = new ShellSort(a);
        shellSort.ShellSort();
        shellSort.yazdir();
    }
}
