package core.Interfaces;

import core.Entities.Alcancia;

import java.util.ArrayList;

public interface IAlcanciaRepository {

    ArrayList<Alcancia> GetAlcancia ();
    void AddMoneda(int moneda);
}
