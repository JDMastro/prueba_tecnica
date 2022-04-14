package main.Controllers;

import core.Exceptions.MonedaValidacion;
import infrastructure.Repositories.AlcanciaRepository;
import infrastructure.Repositories.MonedaRepository;


public class AlcanciaController {

    private AlcanciaRepository _alcanciaRepository;
    private MonedaRepository _monedaRepository;
    public AlcanciaController(AlcanciaRepository alcanciaRepository) {

        _alcanciaRepository = alcanciaRepository;
        _monedaRepository = new MonedaRepository();
    }

    public void AddAddMoneda (int moneda)
    {
        try {
            _monedaRepository.VerificarMoneda(moneda);
            _alcanciaRepository.AddMoneda(moneda);
        } catch (MonedaValidacion e) {
            System.out.println(e.getMessage());
        }

    }

    public int CantidadDeMonedasEnlaAlcancia() {
        return _alcanciaRepository.CantidadDeMonedasEnlaAlcancia();
    }

    public int DineroTotalEnLaAlcancia() {
        return _alcanciaRepository.DineroTotalEnLaAlcancia();
    }

    public int CantidadDeMonedasEnlaAlcanciaPorDenominacion(int moneda) {
        try {
            _monedaRepository.VerificarMoneda(moneda);
            return _alcanciaRepository.CantidadDeMonedasEnlaAlcanciaPorDenominacion(moneda);
        } catch (MonedaValidacion e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public int DineroTotalEnLaAlcanciaPorDenominacion(int moneda) {
        try {
            _monedaRepository.VerificarMoneda(moneda);
            return _alcanciaRepository.DineroTotalEnLaAlcanciaPorDenominacion(moneda);
        } catch (MonedaValidacion e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

}
