public class KuyrukVeriYapisiMain {
    public static void main(String[] args) {
        KuyrukVeriYapisi kuyrukVeriYapisi = new KuyrukVeriYapisi(5);
        kuyrukVeriYapisi.push(5);
        kuyrukVeriYapisi.push(4);
        kuyrukVeriYapisi.push(3);
        kuyrukVeriYapisi.pop();
        kuyrukVeriYapisi.pop();
        kuyrukVeriYapisi.yazdir();
    }
}
