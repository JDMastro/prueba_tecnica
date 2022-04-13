package main.Controllers;

import core.Entities.Alcancia;
import infrastructure.Repositories.AlcanciaRepository;

import java.util.ArrayList;

public class AlcanciaController {

    public ArrayList<Alcancia> GetAlcancia ()
    {
        return new AlcanciaRepository().GetAlcancia();
    }

}
