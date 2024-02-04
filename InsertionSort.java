public class InsertionSort {

    public int[] array;

    public InsertionSort(int[] a) {
        array = a;
    }

    public void InsertionSort() {
        int i = 0;
        int j = 0;
        int temp = 0;
        for (i = 0; i < array.length; i++) {
            temp = array[i];
            for (j = i; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
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
