public class ShellSort {

    public int[] array;

    public ShellSort(int[] a) {
        array = a;
    }

    public void ShellSort() {
        int temp = 0;
        int gap = 0;
        int i = 0;
        int j = 0;
        for (gap = array.length / 2; gap > 0; gap /= 2) {
            for (i = 0; i < array.length; i += gap) {
                temp = array[i];
                for (j = i; j > 0 && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
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
