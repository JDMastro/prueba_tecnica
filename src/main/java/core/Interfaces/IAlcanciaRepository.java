package core.Interfaces;

import core.Entities.Alcancia;

import java.util.ArrayList;

public interface IAlcanciaRepository {

    void AddMoneda(int moneda);
    int CantidadDeMonedasEnlaAlcancia();
    int DineroTotalEnLaAlcancia();
    int CantidadDeMonedasEnlaAlcanciaPorDenominacion(int moneda);

    int DineroTotalEnLaAlcanciaPorDenominacion(int moneda);
}
