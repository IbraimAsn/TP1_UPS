package Banque;

public class Banque {

    private int nbrClients;
    private Client arrClients[] = new Client[100];

    public int getNbrClients() {
        return nbrClients;
    }

    public Client[] getTblClients() {
        return arrClients;
    }

    public void afficherBilan() {
        for(int i = 0; i < nbrClients; i++) {
            System.out.printf("Pour le client %s :\n",arrClients[i].getNom());
            arrClients[i].afficherBilan();
        }
    }

    public int ajoutClient()
    {
        nbrClients++;
        return nbrClients;
    }
}
