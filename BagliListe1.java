public class BagliListe1 {

    Node head;
    int es;

    public BagliListe1() {
        head = null;
        es = 0;
    }

    public void ekle(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
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
            System.out.print("Liste Bos...");
        } else if (head.data == d) {
            head = head.next;
        } else {
            Node t = head;
            while (t.next != null) {
                if (t.next.data == d) {
                    t.next = t.next.next;
                }
                t = t.next;
            }
        }
    }
/*
    public void basaEkle(Node n) {
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void arayaEke(Node n) {
        Node t = head;
        while (t.next != null && t.next.data < n.data) {
            t = t.next;
        }
        n.next = t.next;
        t.next = n;
    }

    public void sonaEkle(Node n) {
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    public void bastanSil() {
        if (head != null) {
            head = head.next;
        }
    }

    public void ortadanSil() {

    }

    public void sondanSil() {
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = null;
    }*/

    public void yazdir() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + ",");
            t = t.next;
        }
    }


}
