package moyenTransport;

public class Voiture {
    Moteur m;
    int nbPlaces;
    double prix;


    int getNbPlaces()
    {
        return nbPlaces;
    }

    double calculerConsommationEssence()
    {
        return 24;
    }
    static int getNbRoues()
    {
        return 4;
    }
}
