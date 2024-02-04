public class QuikSort {
    public int[] array;

    public QuikSort(int[] a) {
        array = a;
    }

    public void quikSort(int l, int r) {
        if (l < r) {
            int pi = partition(l, r);
            quikSort(l, pi - 1);
            quikSort(pi + 1, r);
        }
    }

    public int partition(int l, int r) {
        int pi = r;
        int i = l;
        int j = r - 1;
        do {
            while (array[i] < array[pi] && i < r) i++;
            while (array[j] > array[pi] && j > 0) j--;
            if (i < j) swap(i, j);
        } while (i < j);
        swap(i, pi);
        return i;
    }

    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public void yazdir() {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print("}");
    }

}
