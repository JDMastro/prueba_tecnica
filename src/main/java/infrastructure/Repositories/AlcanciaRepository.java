package infrastructure.Repositories;

import core.Entities.Alcancia;

import java.util.ArrayList;

public class AlcanciaRepository {
    private ArrayList<Alcancia> Alcancia = new ArrayList<>();

    public ArrayList<Alcancia> GetAlcancia ()
    {
        Alcancia.add(new Alcancia(100));
        Alcancia.add(new Alcancia(200));
        Alcancia.add(new Alcancia(300));
        Alcancia.add(new Alcancia(400));
        Alcancia.add(new Alcancia(500));
        return Alcancia;
    }
}
