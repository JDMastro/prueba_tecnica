package core.Interfaces;

import core.Entities.Alcancia;

import java.util.ArrayList;

public interface IAlcanciaRepository {

    ArrayList<Alcancia> GetAlcancia ();
    void AddMoneda(int moneda);
    int CantidadDeMonedasEnlaAlcancia();
    int DineroTotalEnLaAlcancia();
    int CantidadDeMonedasEnlaAlcanciaPorDenominacion(int moneda);

    int DineroTotalEnLaAlcanciaPorDenominacion(int moneda);
}
