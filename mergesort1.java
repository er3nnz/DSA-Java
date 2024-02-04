public class mergesort1 {

    public int[] array;

    public mergesort1(int[] a) {
        array = a;
    }

    public void mergeSort(int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(l, m);
            mergeSort(m + 1, r);
            merge(l, m, r);
        }
    }

    public void merge(int l, int m, int r) {
        int i = l;
        int j = m + 1;
        int k = 0;
        int[] t = new int[r - l + 1];
        while (i <= m && j <= r) {
            if (array[i] < array[j]) {
                t[k] = array[i];
                i++;
            } else {
                t[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            t[k] = array[i];
            i++;
            k++;
        }
        while (j <= r) {
            t[k] = array[j];
            j++;
            k++;
        }
        for (i = 0; i < t.length; i++) {
            array[l++] = t[i];
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
