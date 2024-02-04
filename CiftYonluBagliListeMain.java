public class CiftYonluBagliListeMain {
    public static void main(String[] args) {
        Node node = new Node(10);
        Node node1 = new Node(20);
        CiftYonluBagliListe ciftYonluBagliListe = new CiftYonluBagliListe();
        ciftYonluBagliListe.basaEkle(node);
        ciftYonluBagliListe.basaEkle(node1);
        ciftYonluBagliListe.sondanSil();
    }
}
