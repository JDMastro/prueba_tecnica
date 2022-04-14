package core.Interfaces;

import core.Exceptions.MonedaValidacion;

public interface IMonedaRepository {
    void VerificarMoneda(int moneda) throws MonedaValidacion;
}
