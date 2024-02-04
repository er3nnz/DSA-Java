public class BagliListe2 {

    Node head;

    public BagliListe2() {
        head = null;
    }

    public void arayaEkle(Node n) {
        if (head == null) {
            head = n;
        } else if (n.data < head.data) {
            n.next = head;
            head = n;
        } else {
            Node tmp = head;
            while (tmp.next != null && tmp.next.data < n.data) {
                tmp = tmp.next;
            }
            n.next = tmp.next;
            tmp.next = n;
        }
    }

    public void aradanSil(int d) {
        if (head == null) {
            System.out.println("Liste Bos...");
        } else if (head.data == d) {
            head = head.next;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                if (tmp.next.data == d) {
                    tmp.next = tmp.next.next;
                }
                tmp = tmp.next;
            }
        }
    }

    public void yazdir() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + ",");
            tmp = tmp.next;
        }

    }
}
