public class YigitVeriYapisi {

    public int[] array;
    public int es;

    public YigitVeriYapisi(int es) {
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
        int s = array[es - 1];
        array[--es] = 0;
        return s;
    }

    public void yazdir() {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print("}");
    }
}
