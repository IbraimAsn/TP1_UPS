package Banque;

public class Compte {

    private float solde;

    public Compte(float solde)
    {
        this.solde = solde;
    }

    public void depot(float valeur)
    {
        solde += valeur;
    }

    public void retrait(float valeur)
    {
        solde = solde - valeur;
    }

    public float getSolde()
    {
        return solde;
    }

    public void afficherSolde()
    {
        System.out.printf("solde courant : %f\n",solde);
    }

    public void virer(float valeur, Compte destinataire)
    {
        destinataire.depot(valeur);
        retrait(valeur);
    }
}
