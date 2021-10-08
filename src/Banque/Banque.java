package Banque;

public class Banque {

    private int nbrClients;
    private Client arrClients[] = new Client[100];

    public Banque()
    {
        super();
    }

    public void afficherBilan() {
        for(int i = 0; i < nbrClients; i++) {
            System.out.printf("Pour le client %s :\n",arrClients[i].getNom());
            arrClients[i].afficherBilan();
        }
    }

    public int ajouterClient(Client client) {
        arrClients[nbrClients] = client;
        nbrClients++;
        return nbrClients;
    }

    public int getNbrClients() {
        return nbrClients;
    }

    public Client[] getTblClients() {
        return arrClients;
    }

}
