package Banque;

public class Date {

    private int jour;
    private int mois;
    private int an;
    private int heure;
    private int minute;
    private int seconde;

    public Date(int jour, int mois, int an)
    {
        this.jour = jour;
        this.mois = mois;
        this.an = an;
        heure = minute = seconde = 0;
    }

    public String toString()
    {
        return heure+":"+minute+":"+seconde+" "+jour+"/"+mois+"/"+an;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAn() {
        return an;
    }

    public int getHeure() {
        return heure;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconde() {
        return seconde;
    }
}
