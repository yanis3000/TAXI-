package moyenTransport;

import administration.Centrale;

public class CompagnieTaxi {
    Voiture v1, v2, v3;
    Centrale centrale;

    double calculerTotalPlaces()
    {
        return v1.getNbPlaces() + v2.getNbPlaces() + v3.getNbPlaces();
    }

    void testAppels()
    {
        double total = calculerTotalPlaces();
        double cons = v1.calulerConsommationEssence();
        int nbRoues = Voiture.getNbRoues();

        centrale.communique(v1);
    }


}