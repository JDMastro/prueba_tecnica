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

}
