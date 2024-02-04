public class SimpleHeap {

    public static void main(String[] args) {
        int[] arr = {12, 5, 23, 9, 30, 2, 50};

        System.out.println("Original array:");
        printArray(arr);

        buildMinHeap(arr);

        System.out.println("\nMin Heap:");
        printArray(arr);

        int minElement = extractMin(arr);

        System.out.println("\nMin Element Extracted: " + minElement);
        System.out.println("Heap after extracting min element:");
        printArray(arr);

        insertElement(arr, 7);

        System.out.println("\nHeap after inserting element 7:");
        printArray(arr);
    }

    static void buildMinHeap(int[] arr) {
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(arr, i, smallest);
            heapify(arr, n, smallest);
        }
    }

    static int extractMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalStateException("Heap is empty");
        }

        int minElement = arr[0];
        arr[0] = arr[arr.length - 1];
        heapify(arr, arr.length - 1, 0);
        return minElement;
    }

    static void insertElement(int[] arr, int key) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        System.arraycopy(arr, 0, newArr, 0, n);
        newArr[n] = key;

        int i = n;
        while (i > 0 && newArr[(i - 1) / 2] > newArr[i]) {
            swap(newArr, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }

        System.arraycopy(newArr, 0, arr, 0, n + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
