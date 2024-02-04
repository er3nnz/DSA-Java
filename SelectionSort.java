public class SelectionSort {

    public int[] array;

    public SelectionSort(int[] a) {
        array = a;
    }

    public void SelectionSort() {
        int temp = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[min]) {
                    temp = array[j];
                    array[j] = array[min];
                    array[min] = temp;
                }
            }
        }
    }

    public void yazdir() {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print("}");
    }
}
