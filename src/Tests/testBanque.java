package Tests;

import Banque.Banque;
import Banque.Client;
import Banque.Date;
import Banque.Compte;

//import java.util.Random;

public class testBanque {

    //static Random rand = new Random();

    public static void manipClient(Client clientCourant)
    {
        clientCourant.ajouterCompte(new Compte(500));
    }

    public static void ajouterClients(Banque maBanque, Client arrClients[])
    {
        for(int i = 0; i < arrClients.length; i++)
        {
            maBanque.ajouterClient(arrClients[i]);
            manipClient(arrClients[i]);
        }
    }

    public static void main(String[] args)
    {
        Date dtnClient1 = new Date(1,1,1991);
        Date dtnClient2 = new Date(2,2,1992);
        Date dtnClient3 = new Date(3,3,1993);
        Client client1 = new Client("Jean",dtnClient1);
        Client client2 = new Client("Guy",dtnClient2);
        Client client3 = new Client("Dieudonne",dtnClient3);
        Client arrClients[] = {client1,client2,client3};
        Banque maBanque = new Banque();
        ajouterClients(maBanque,arrClients);
        maBanque.afficherBilan();
    }
}
