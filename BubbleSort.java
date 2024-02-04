public class BubbleSort {

    public int[] array;

    public BubbleSort(int[] a) {
        array = a;
    }

    public void Sort() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
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
