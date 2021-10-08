package Banque;

public class testCompte {
    public static void main(String[] args)
    {
        Compte compteCourant = new Compte(300);
        System.out.printf("solde : %f\n",compteCourant.getSolde());
        compteCourant.afficherSolde();
        compteCourant.depot((float)100);
        compteCourant.afficherSolde();
        compteCourant.retrait((float)100);
        compteCourant.afficherSolde();
        Compte compteEpargne = new Compte(1000);
        compteCourant.virer(100,compteEpargne);
        compteCourant.afficherSolde();
        compteEpargne.afficherSolde();
    }
}
