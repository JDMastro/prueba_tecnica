package infrastructure.Repositories;

import core.Entities.Alcancia;
import core.Interfaces.IAlcanciaRepository;

import java.util.ArrayList;

public class AlcanciaRepository implements IAlcanciaRepository {
    private ArrayList<Alcancia> Alcancia = new ArrayList<>();

    @Override
    public ArrayList<Alcancia> GetAlcancia() {
        /*Alcancia.add(new Alcancia(100));
        Alcancia.add(new Alcancia(200));
        Alcancia.add(new Alcancia(300));
        Alcancia.add(new Alcancia(400));
        Alcancia.add(new Alcancia(500));
        Alcancia.add(new Alcancia(600));
        Alcancia.add(new Alcancia(700));*/
        return Alcancia;
    }

    @Override
    public void AddMoneda(int moneda) {
        Alcancia.add(new Alcancia(moneda));
    }
}
