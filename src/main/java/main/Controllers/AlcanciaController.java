package main.Controllers;

import core.Entities.Alcancia;
import infrastructure.Repositories.AlcanciaRepository;

import java.util.ArrayList;

public class AlcanciaController {

    private AlcanciaRepository _alcanciaRepository;
    public AlcanciaController(AlcanciaRepository alcanciaRepository) {
        _alcanciaRepository = alcanciaRepository;
    }

    public ArrayList<Alcancia> GetAlcancia ()
    {
        return _alcanciaRepository.GetAlcancia();
    }

    public void AddAddMoneda (int moneda)
    {
        _alcanciaRepository.AddMoneda(moneda);
    }

    public int CantidadDeMonedasEnlaAlcancia() {
        return _alcanciaRepository.CantidadDeMonedasEnlaAlcancia();
    }

    public int DineroTotalEnLaAlcancia() {
        return _alcanciaRepository.DineroTotalEnLaAlcancia();
    }

    public int CantidadDeMonedasEnlaAlcanciaPorDenominacion(int moneda) {
        return _alcanciaRepository.CantidadDeMonedasEnlaAlcanciaPorDenominacion(moneda);
    }

    public int DineroTotalEnLaAlcanciaPorDenominacion(int moneda) {
        return _alcanciaRepository.DineroTotalEnLaAlcanciaPorDenominacion(moneda);
    }

}
