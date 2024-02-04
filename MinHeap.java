public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int key) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert.");
            return;
        }

        size++;
        int i = size - 1;
        heap[i] = key;

        while (i != 0 && heap[parent(i)] > heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public int extractMin() {
        if (size <= 0) {
            System.out.println("Heap is empty.");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            size--;
            return heap[0];
        }

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);

        return root;
    }

    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(7);
        minHeap.insert(8);
        minHeap.insert(4);
        minHeap.insert(10);
        minHeap.insert(16);
        minHeap.insert(12);

        System.out.print("Heap: ");
        minHeap.printHeap();

        System.out.println("Extract Min: " + minHeap.extractMin());

        System.out.print("Heap after extraction: ");
        minHeap.printHeap();
    }
}
