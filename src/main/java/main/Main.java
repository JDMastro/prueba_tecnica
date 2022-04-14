package main;

import infrastructure.Repositories.AlcanciaRepository;
import main.Controllers.AlcanciaController;

import java.util.Scanner;

public class Main {
    AlcanciaRepository alcanciaRepository = new AlcanciaRepository();
    AlcanciaController alcanciaController = new AlcanciaController(alcanciaRepository);

    public static void main(String[] args) {
        Main main = new Main();
        main.StartMenu();
    }

    public void StartMenu()
    {
        Scanner opcionPorConsola = new Scanner(System.in);
        int opcion = 0;

        System.out.println("***********************************************************************");
        System.out.println("*                           ALCANCIA MENU                             *");
        System.out.println("***********************************************************************");
        System.out.println("* 1) Agregar Monedas a la alcancia                                    *");
        System.out.println("* 2) Saber cuantas monedas hay dentro de la alcancia                  *");
        System.out.println("* 3) Saber cuanto dinero hay en la alcancia                           *");
        System.out.println("* 4) Saber cuantas monedas hay dentro de la alcancia por denominacion *");
        System.out.println("* 5) Saber cuanto dinero hay en la alcancia por denominacion          *");
        System.out.println("* 6) Salida del programa                                              *");
        System.out.println("***********************************************************************");

        System.out.print("Selecciona la opcion : ");
        opcion = opcionPorConsola.nextInt();
        SeleccionarOpcionDelMenu(opcion);
    }

    public void SeleccionarOpcionDelMenu(int opcion)
    {
        switch (opcion){
            case 1 :
                AddAddMonedaAlaAlcancia();
                StartMenu();
                break;
            case 2 :
                CantidadDeMonedasEnlaAlcancia();
                StartMenu();
                break;
            case 3 :
                DineroTotalEnLaAlcancia();
                StartMenu();
                break;
            case 4 :
                CantidadDeMonedasEnlaAlcanciaPorDenominacion();
                StartMenu();
                break;
            case 5 :
                DineroTotalEnLaAlcanciaPorDenominacion();
                StartMenu();
                break;
        }
    }

    public void AddAddMonedaAlaAlcancia()
    {
        Scanner opcionPorConsola = new Scanner(System.in);
        int moneda = 0;
        boolean colocarTodasLasMonedas = false;
        System.out.println("En caso de que se quiera devolver al menu principal presione el numero 0 ");

        while (!colocarTodasLasMonedas)
        {
            System.out.print("Ingresa la moneda : ");
            moneda = opcionPorConsola.nextInt();

            if(moneda == 0)
                colocarTodasLasMonedas = true;
            else
                alcanciaController.AddAddMoneda(moneda);
        }

    }

    public void CantidadDeMonedasEnlaAlcancia()
    {
        System.out.println("Cantidad de monedas en la alcancia : "+ alcanciaController.CantidadDeMonedasEnlaAlcancia());
        Scanner opcionPorConsola = new Scanner(System.in);
        int moneda = 0;
        boolean colocarTodasLasMonedas = false;

        while (!colocarTodasLasMonedas)
        {
            System.out.print("Presiona 0 para regresar al menu principal : ");
            moneda = opcionPorConsola.nextInt();

            if(moneda == 0)
                colocarTodasLasMonedas = true;
        }
    }

    public void DineroTotalEnLaAlcancia()
    {
        System.out.println("Dinero Total en la alcancia : "+ alcanciaController.DineroTotalEnLaAlcancia());
        Scanner opcionPorConsola = new Scanner(System.in);
        int moneda = 0;
        boolean colocarTodasLasMonedas = false;

        while (!colocarTodasLasMonedas)
        {
            System.out.print("Presiona 0 para regresar al menu principal : ");
            moneda = opcionPorConsola.nextInt();

            if(moneda == 0)
                colocarTodasLasMonedas = true;
        }
    }

    public void CantidadDeMonedasEnlaAlcanciaPorDenominacion()
    {
        System.out.println("Presiona 0 para regresar al menu principal : ");

        Scanner opcionPorConsola = new Scanner(System.in);

        int moneda = 0;
        boolean colocarTodasLasMonedas = false;

        while (!colocarTodasLasMonedas)
        {
            System.out.print("Ingresa la denominacion de la moneda : ");
            moneda = opcionPorConsola.nextInt();

            if(moneda == 0)
                colocarTodasLasMonedas = true;
            else
                System.out.println("Cantidad de monedas por denominacion : "+alcanciaController.CantidadDeMonedasEnlaAlcanciaPorDenominacion(moneda));

            System.out.println(" ");
        }
    }

    public void DineroTotalEnLaAlcanciaPorDenominacion()
    {
        System.out.println("Presiona 0 para regresar al menu principal : ");

        Scanner opcionPorConsola = new Scanner(System.in);

        int moneda = 0;
        boolean colocarTodasLasMonedas = false;

        while (!colocarTodasLasMonedas)
        {
            System.out.print("Ingresa la denominacion de la moneda : ");
            moneda = opcionPorConsola.nextInt();
            if(moneda == 0)
                colocarTodasLasMonedas = true;
            else
                System.out.println("Dinero total de monedas por denominacion : "+alcanciaController.DineroTotalEnLaAlcanciaPorDenominacion(moneda));

            System.out.println(" ");
        }
    }

}
