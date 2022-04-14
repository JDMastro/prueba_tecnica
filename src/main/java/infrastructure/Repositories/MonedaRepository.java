package infrastructure.Repositories;

import core.Exceptions.MonedaValidacion;
import core.Interfaces.IMonedaRepository;


public class MonedaRepository implements IMonedaRepository {

    @Override
    public void VerificarMoneda(int moneda) throws MonedaValidacion {
        if(moneda != 50 &&
           moneda != 100 &&
        moneda != 200 &&
        moneda != 500 &&
        moneda!= 1000)
        {
            throw new MonedaValidacion("La Moneda "+ moneda + " no existe ");
        }
    }
}
