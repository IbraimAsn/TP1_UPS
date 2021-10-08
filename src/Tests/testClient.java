package Tests;

import Banque.Client;
import Banque.Compte;
import Banque.Date;

import java.util.Random;

public class testClient {

    static Random rand = new Random();

    public static void initialiseComptes(Client moiClient, int nbrComptes)
    {
        for(int i = 0; i < nbrComptes; i++)
        {
            if(moiClient.getCompte(i) == null)
            {
                moiClient.ajouterCompte(new Compte((float)rand.nextInt(300)+50));
            }
            else
            {
                moiClient.getCompte(i).depot((float)rand.nextInt(300)+50);
            }
        }
    }

    public static void afficheInfosComptes(Client moiClient)
    {
        moiClient.afficherBilan();
        moiClient.afficherSolde();
    }

    public static void ajouteEtInitaliseCompte(Client moiClient)
    {
        int numeroCompte = moiClient.ajouterCompte(new Compte(400));
    }

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        Date maDateNaissance = new Date(1,1,1990);
        int nbrComptes = 6;
        String monNom = "Jean-Guy";
        Client moiClient = new Client(monNom,maDateNaissance);
        //System.out.printf("nom : %s\n",monNom);
        //System.out.printf("nbrComptes : %d\n",nbrComptes);
        initialiseComptes(moiClient,nbrComptes);
        afficheInfosComptes(moiClient);
        ajouteEtInitaliseCompte(moiClient);
        System.out.println();
        afficheInfosComptes(moiClient);
    }
}
