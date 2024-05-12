import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String[] currenciesCode = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
        int currenciesLength = currenciesCode.length;
        int opcion = 0;
        String menu = """
                ************************************************
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                ************************************************
                """;
        String cantidadMensaje;
        String mensajeDeError;
        int aCambiar;
        int cambio;
        int cantidadACambiar;
        String divisa;
        String divisaObjetivo;
        String uriCambio;
        String currencyExchange;



        while (opcion != 7) {
            System.out.println(menu);
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    cantidadMensaje = "Ingresa la cantidad que deseas cambiar: ";
                    mensajeDeError = "Opción invalida";
                    aCambiar = 6;
                    cambio = 1;
                    cantidadACambiar = Input.inputNumber(cantidadMensaje, mensajeDeError, 0);

                    divisa = currenciesCode[aCambiar - 1];
                    divisaObjetivo = currenciesCode[cambio - 1];
                    uriCambio = "https://v6.exchangerate-api.com/v6/9045684bf9f6b7c25c300f23/pair/"
                            + divisa + "/" + divisaObjetivo + "/" + cantidadACambiar;

                    currencyExchange = Conexion.FetchHTTP(uriCambio);
                    CurrencyExchangeAPI currencyExchangeAPI = gson.fromJson(currencyExchange, CurrencyExchangeAPI.class);
                    Divisa currency = new Divisa(currencyExchangeAPI);

                    System.out.println(cantidadACambiar + " dólares son: " + currency.getConversion() + " pesos argentinos.");
                    break;

                case 2:
                    cantidadMensaje = "Ingresa la cantidad que deseas cambiar: ";
                    mensajeDeError = "Opción invalida";
                    aCambiar = 1;
                    cambio = 6;
                    cantidadACambiar = Input.inputNumber(cantidadMensaje, mensajeDeError, 0);

                    divisa = currenciesCode[aCambiar - 1];
                    divisaObjetivo = currenciesCode[cambio - 1];
                    uriCambio = "https://v6.exchangerate-api.com/v6/9045684bf9f6b7c25c300f23/pair/"
                            + divisa + "/" + divisaObjetivo + "/" + cantidadACambiar;

                    currencyExchange = Conexion.FetchHTTP(uriCambio);
                    CurrencyExchangeAPI currencyExchangeAPI1 = gson.fromJson(currencyExchange, CurrencyExchangeAPI.class);
                    Divisa currency1 = new Divisa(currencyExchangeAPI1);

                    System.out.println(cantidadACambiar + " pesos argentinos son: " + currency1.getConversion() + " dólares.");
                    break;
                case 3:
                    cantidadMensaje = "Ingresa la cantidad que deseas cambiar: ";
                    mensajeDeError = "Opción invalida";
                    aCambiar = 6;
                    cambio = 3;
                    cantidadACambiar = Input.inputNumber(cantidadMensaje, mensajeDeError, 0);

                    divisa = currenciesCode[aCambiar - 1];
                    divisaObjetivo = currenciesCode[cambio - 1];
                    uriCambio = "https://v6.exchangerate-api.com/v6/9045684bf9f6b7c25c300f23/pair/"
                            + divisa + "/" + divisaObjetivo + "/" + cantidadACambiar;

                    currencyExchange = Conexion.FetchHTTP(uriCambio);
                    CurrencyExchangeAPI currencyExchangeAPI2 = gson.fromJson(currencyExchange, CurrencyExchangeAPI.class);
                    Divisa currency2 = new Divisa(currencyExchangeAPI2);

                    System.out.println(cantidadACambiar + " dólares son: " + currency2.getConversion() + " reales brasileños.");
                    break;
                case 4:
                    cantidadMensaje = "Ingresa la cantidad que deseas cambiar: ";
                    mensajeDeError = "Opción invalida";
                    aCambiar = 3;
                    cambio = 6;
                    cantidadACambiar = Input.inputNumber(cantidadMensaje, mensajeDeError, 0);

                    divisa = currenciesCode[aCambiar - 1];
                    divisaObjetivo = currenciesCode[cambio - 1];
                    uriCambio = "https://v6.exchangerate-api.com/v6/9045684bf9f6b7c25c300f23/pair/"
                            + divisa + "/" + divisaObjetivo + "/" + cantidadACambiar;

                    currencyExchange = Conexion.FetchHTTP(uriCambio);
                    CurrencyExchangeAPI currencyExchangeAPI3 = gson.fromJson(currencyExchange, CurrencyExchangeAPI.class);
                    Divisa currency3 = new Divisa(currencyExchangeAPI3);

                    System.out.println(cantidadACambiar + " reales brasileños son : " + currency3.getConversion() + " dólares.");
                    break;
                case 5:
                    cantidadMensaje = "Ingresa la cantidad que deseas cambiar: ";
                    mensajeDeError = "Opción invalida";
                    aCambiar = 6;
                    cambio = 5;
                    cantidadACambiar = Input.inputNumber(cantidadMensaje, mensajeDeError, 0);

                    divisa = currenciesCode[aCambiar - 1];
                    divisaObjetivo = currenciesCode[cambio - 1];
                    uriCambio = "https://v6.exchangerate-api.com/v6/9045684bf9f6b7c25c300f23/pair/"
                            + divisa + "/" + divisaObjetivo + "/" + cantidadACambiar;

                    currencyExchange = Conexion.FetchHTTP(uriCambio);
                    CurrencyExchangeAPI currencyExchangeAPI4 = gson.fromJson(currencyExchange, CurrencyExchangeAPI.class);
                    Divisa currency4 = new Divisa(currencyExchangeAPI4);

                    System.out.println(cantidadACambiar + " dólares son: " + currency4.getConversion() + " pesos colombianos.");
                    break;
                case 6:
                    cantidadMensaje = "Ingresa la cantidad que deseas cambiar: ";
                    mensajeDeError = "Opción invalida";
                    aCambiar = 5;
                    cambio = 6;
                    cantidadACambiar = Input.inputNumber(cantidadMensaje, mensajeDeError, 0);

                    divisa = currenciesCode[aCambiar - 1];
                    divisaObjetivo = currenciesCode[cambio - 1];
                    uriCambio = "https://v6.exchangerate-api.com/v6/9045684bf9f6b7c25c300f23/pair/"
                            + divisa + "/" + divisaObjetivo + "/" + cantidadACambiar;

                    currencyExchange = Conexion.FetchHTTP(uriCambio);
                    CurrencyExchangeAPI currencyExchangeAPI5 = gson.fromJson(currencyExchange, CurrencyExchangeAPI.class);
                    Divisa currency5 = new Divisa(currencyExchangeAPI5);

                    System.out.println(cantidadACambiar + " pesos colombianos: " + currency5.getConversion() + " dólares.");
                    break;
                case 7:
                    System.out.println("Gracias por trbajar con el Conversor de Monedas");
                    break;

            }
        }
    }
}
