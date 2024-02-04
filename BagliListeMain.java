public class BagliListeMain {
    public static void main(String[] args) {
        BagliListe1 bagliListe1 = new BagliListe1();
        Node node = new Node(5);
        Node node1 = new Node(9);
        Node node2 = new Node(4);
        bagliListe1.arayaEkle(node);
        bagliListe1.arayaEkle(node1);
        bagliListe1.arayaEkle(node2);
        bagliListe1.aradanSil(4);
        bagliListe1.yazdir();
    }
}
