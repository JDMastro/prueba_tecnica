package infrastructure.Repositories;

import core.Entities.Alcancia;
import core.Interfaces.IAlcanciaRepository;

import java.util.ArrayList;

public class AlcanciaRepository implements IAlcanciaRepository {
    private ArrayList<Alcancia> Alcancia = new ArrayList<>();

    private int cantidadDeDinero = 0;
    private int cantidadDeMonedaPorDenominacion = 0;
    private int cantidadDeDineroPorDenominacion = 0;

    private int ObtenerLaCantidadDeDineroEnLaAlcancia()
    {
        cantidadDeDinero = 0;
        Alcancia.forEach((n) -> cantidadDeDinero+= n.getMoneda() );
        return cantidadDeDinero;
    }

    private int ObtenerLaCantidadDeDineroEnLaAlcanciaPorDenominacion(int moneda)
    {
        cantidadDeDineroPorDenominacion = 0;
        Alcancia.forEach((n) -> {
            if(n.getMoneda() == moneda)
                cantidadDeDineroPorDenominacion+=n.getMoneda();
        } );
        return cantidadDeDineroPorDenominacion;
    }

    private int ObtenerLaCantidadDeMonedaEnLaAlcanciaPorDenominacion(int moneda)
    {
        cantidadDeMonedaPorDenominacion = 0;
        Alcancia.forEach((n) -> {
            if(n.getMoneda() == moneda)
                cantidadDeMonedaPorDenominacion++;
        });
        return cantidadDeMonedaPorDenominacion;
    }

    @Override
    public void AddMoneda(int moneda) {
        Alcancia.add(new Alcancia(moneda));
    }

    @Override
    public int CantidadDeMonedasEnlaAlcancia() {
        return Alcancia.size();
    }

    @Override
    public int DineroTotalEnLaAlcancia() {
        return ObtenerLaCantidadDeDineroEnLaAlcancia();
    }

    @Override
    public int CantidadDeMonedasEnlaAlcanciaPorDenominacion(int moneda) {
        return ObtenerLaCantidadDeMonedaEnLaAlcanciaPorDenominacion(moneda);
    }

    @Override
    public int DineroTotalEnLaAlcanciaPorDenominacion(int moneda) {
        return ObtenerLaCantidadDeDineroEnLaAlcanciaPorDenominacion(moneda);
    }
}
