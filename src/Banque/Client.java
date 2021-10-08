package Banque;

public class Client {

    private String nom;
    private Date dateNaissance;
    private int nbrComptes;
    private Compte arrComptes[] = new Compte[100];

    public Client(String nom, Date dateNaissance) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        nbrComptes = 0;
    }

    public void afficherBilan() {
        for(int i = 0; i < nbrComptes; i++)
        {
            System.out.printf("Compte #%d, ",i);
            arrComptes[i].afficherSolde();
        }
    }

    public float soldeTotal()
    {
        float soldeTotal = 0;
        for(int i = 0; i < nbrComptes; i++)
        {
            soldeTotal += arrComptes[i].getSolde();
        }
        return soldeTotal;
    }

    public void afficherSolde() {
        System.out.printf("Solde total : %f\n",soldeTotal());
    }

    public int ajouterCompte(Compte compte)
    {
        arrComptes[nbrComptes] = compte;
        nbrComptes++;
        return nbrComptes;
    }

    public String getNom() {
        return nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public int getNbrComptes() {
        return nbrComptes;
    }

    public Compte getCompte(int numero) {
        return arrComptes[numero];
    }

}
