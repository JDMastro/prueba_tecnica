package main;

import infrastructure.Repositories.AlcanciaRepository;
import main.Controllers.AlcanciaController;

public class Main {
    public static void main(String[] args) {
        AlcanciaRepository alcanciaRepository = new AlcanciaRepository();
        AlcanciaController alcanciaController = new AlcanciaController(alcanciaRepository);

        alcanciaController.AddAddMoneda(100);
        alcanciaController.AddAddMoneda(200);
        alcanciaController.AddAddMoneda(300);
        alcanciaController.AddAddMoneda(400);
        alcanciaController.AddAddMoneda(500);
        alcanciaController.AddAddMoneda(600);
        alcanciaController.AddAddMoneda(700);
        alcanciaController.AddAddMoneda(800);


        alcanciaController.GetAlcancia().forEach((n) -> System.out.println(n.getMoneda()));
        //System.out.println(alcanciaController.GetAlcancia());
    }
}
