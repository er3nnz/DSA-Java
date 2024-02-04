public class BağlıListe {

    Node head;
    int es;

    public BağlıListe(int es) {
        es = 0;
    }

    public void basaEkle(Node n) {

        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void SonaEkle(Node n) {
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    public void arayaEkle(Node n) {
        Node t = head;
        while (t.next != null && t.next.data < n.data) {
            t = t.next;
        }
        n.next = t.next;
        t.next = n;
    }

    public void bastanCikar(Node n) {

        if (head != null) {
            head = head.next;
        }
    }

    public void arama(Node n) {

    }

    public void yazdir() {
        System.out.print("{");

    }
}
