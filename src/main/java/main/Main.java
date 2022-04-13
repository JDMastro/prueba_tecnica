package main;

import main.Controllers.AlcanciaController;

public class Main {
    public static void main(String[] args) {
        AlcanciaController alcanciaController = new AlcanciaController();

        alcanciaController.GetAlcancia().forEach((n) -> System.out.println(n.getMoneda()));
        //System.out.println(alcanciaController.GetAlcancia());
    }
}
