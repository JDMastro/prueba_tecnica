package main;

import infrastructure.Repositories.AlcanciaRepository;
import main.Controllers.AlcanciaController;

public class Main {
    public static void main(String[] args) {
        AlcanciaRepository alcanciaRepository = new AlcanciaRepository();
        AlcanciaController alcanciaController = new AlcanciaController(alcanciaRepository);

        alcanciaController.AddAddMoneda(100);
        alcanciaController.AddAddMoneda(200);
        alcanciaController.AddAddMoneda(200);
        alcanciaController.AddAddMoneda(500);
        alcanciaController.AddAddMoneda(500);
        alcanciaController.AddAddMoneda(500);
        alcanciaController.AddAddMoneda(500);


        alcanciaController.GetAlcancia().forEach((n) -> System.out.println(n.getMoneda()));

        System.out.println("Cantidad de monedas : "+ alcanciaController.CantidadDeMonedasEnlaAlcancia());

        System.out.println("Dinero Total : "+ alcanciaController.DineroTotalEnLaAlcancia());

        System.out.println("Cantidad de monedas por denominacion : "+ alcanciaController.CantidadDeMonedasEnlaAlcanciaPorDenominacion(100));

        System.out.println("Dinero total por denominacion : "+ alcanciaController.DineroTotalEnLaAlcanciaPorDenominacion(500));


        //System.out.println(alcanciaController.GetAlcancia());
    }
}
