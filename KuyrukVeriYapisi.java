public class KuyrukVeriYapisi {

    public int[] array;
    public int es;

    public KuyrukVeriYapisi(int es) {
        array = new int[es];
        es = 0;
    }

    public void push(int a) {
        if (es == array.length) {
            System.out.println("Liste Dolu...");
        } else {
            array[es++] = a;
        }
    }

    public int pop() {
        int q = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--es] = 0;
        return q;

    }

    public void yazdir() {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print("}");
    }
}

