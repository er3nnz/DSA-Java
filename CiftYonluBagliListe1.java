

public class CiftYonluBagliListe1 {
    Node head;
    Node tail;

    public CiftYonluBagliListe1() {
        head = null;
        tail = null;
    }

    public void basaEkle(Node n) {
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void sonaEkel(Node n) {
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void bastanSil() {
        if (head == null) {
            System.out.println("Silinecek Eleman Yok..");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void sondanSil() {
        if (head == null) {
            System.out.println("Listede Silinecek Eleman Yok...");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
}
