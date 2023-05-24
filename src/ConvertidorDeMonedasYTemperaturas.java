//Alura Challenge Convertidor de Monedas y de Temperatura.

import javax.swing.JOptionPane;

public class ConvertidorDeMonedasYTemperaturas {
    public static void main(String[] args) {
        //Variable para continuar ejecutando el programa
        boolean continuarPrograma = true;

        while (continuarPrograma) {

            // El usuario selecciona qué desea convertir
            String tipoConversion = JOptionPane.showInputDialog(null, "¿Qué deseas convertir?, ¿Moneda ó Temperatura?");

            //Si se seleciona Moneda
            if (tipoConversion.equalsIgnoreCase("moneda")) {

                // Se le pide al usuario ingresar la cantidad de dinero a convertir
                String dinero = JOptionPane.showInputDialog(null, "Introduce la cantidad de dinero a convertir:");
                double cantidad = Double.parseDouble(dinero);

                // Se obtiene la divisa de origen
                String monedaOrigen = JOptionPane.showInputDialog(null, "Introduce la moneda de origen (EUR, USD, MXN):");

                // Se obtiene la divisa de destino
                String monedaDestino = JOptionPane.showInputDialog(null, "Introduce la moneda de destino (EUR, USD, MXN):");

                // Variables para definir los tipos de cambio. Valores de fecha 24/05/23.
                double euroDolar = 1.08;
                double euroPeso = 19.14;
                double dolarPeso = 17.80;

                // Se realiza la conversión
                double resultadoMoneda = 0;

                if (monedaOrigen.equalsIgnoreCase("EUR") && monedaDestino.equalsIgnoreCase("USD")) {
                    resultadoMoneda = cantidad * euroDolar;
                } else if (monedaOrigen.equalsIgnoreCase("EUR") && monedaDestino.equalsIgnoreCase("MXN")) {
                    resultadoMoneda = cantidad * euroPeso;
                } else if (monedaOrigen.equalsIgnoreCase("USD") && monedaDestino.equalsIgnoreCase("EUR")) {
                    resultadoMoneda = cantidad / euroDolar;
                } else if (monedaOrigen.equalsIgnoreCase("USD") && monedaDestino.equalsIgnoreCase("MXN")) {
                    resultadoMoneda = cantidad * dolarPeso;
                } else if (monedaOrigen.equalsIgnoreCase("MXN") && monedaDestino.equalsIgnoreCase("EUR")) {
                    resultadoMoneda = cantidad / euroPeso;
                } else if (monedaOrigen.equalsIgnoreCase("MXN") && monedaDestino.equalsIgnoreCase("USD")) {
                    resultadoMoneda = cantidad / dolarPeso;
                } /*else {
                    JOptionPane.showMessageDialog(null, "Error. El tipo de moneda ingresado no es soportado por el programa");
                    //Mensaje para preguntar al usuario si desea continuar usando el programa
                    JOptionPane.showMessageDialog(null, "¿Deseas realizar otra conversión?");
                    String seleccion = JOptionPane.showInputDialog(null, "Si.                   " + "No.");
                    if(seleccion.equalsIgnoreCase("si")){
                        continuarPrograma = true;
                    }else{
                        continuarPrograma = false;
                    }
                }*/

                // Se muestra el resultado
                JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen + " equivalen a " + resultadoMoneda + " " + monedaDestino);


                //Mensaje para preguntar al usuario si desea continuar usando el programa
                JOptionPane.showMessageDialog(null, "¿Deseas realizar otra conversión?");
                String seleccion = JOptionPane.showInputDialog(null, "Si.                   " + "No.");

                if(seleccion.equalsIgnoreCase("si")){
                    continuarPrograma = true;
                }else{
                    continuarPrograma = false;
                }

            } else if (tipoConversion.equalsIgnoreCase("temperatura")) {

                // Se pregunta al usuario la temperatura a convertir
                String temperatura = JOptionPane.showInputDialog(null, "Introduce los grados de temperatura que deseas convertir:");
                double temp = Double.parseDouble(temperatura);

                // Se obtiene la escala de temperatura de origen
                String escalaOrigen = JOptionPane.showInputDialog(null, "Introduce la escala de temperatura de origen (Celsius, Fahrenheit, Kelvin):");

                // Se obtiene la escala de temperatura de destino
                String escalaDestino = JOptionPane.showInputDialog(null, "Introduce la escala de temperatura de destino (Celsius, Fahrenheit, Kelvin):");

                // Se realiza la conversión
                double resultadoTemperatura = 0;

                if (escalaOrigen.equalsIgnoreCase("Celsius") && escalaDestino.equalsIgnoreCase("Fahrenheit")) {
                    resultadoTemperatura = (temp * 9 / 5) + 32;
                } else if (escalaOrigen.equalsIgnoreCase("Celsius") && escalaDestino.equalsIgnoreCase("Kelvin")) {
                    resultadoTemperatura = (temp + 273.15);
                } else if (escalaOrigen.equalsIgnoreCase("Fahrenheit") && escalaDestino.equalsIgnoreCase("Celsius")) {
                    resultadoTemperatura = (temp - 32) * (5/9);
                } else if (escalaOrigen.equalsIgnoreCase("Fahrenheit") && escalaDestino.equalsIgnoreCase("Kelvin")) {
                    resultadoTemperatura = ((temp - 32) * (5/9)) + (273.15);
                } else if (escalaOrigen.equalsIgnoreCase("Kelvin") && escalaDestino.equalsIgnoreCase("Celsius")) {
                    resultadoTemperatura = (temp - 273.15);
                } else if (escalaOrigen.equalsIgnoreCase("Kelvin") && escalaDestino.equalsIgnoreCase("Fahrenheit")) {
                    resultadoTemperatura = (temp - 273.15) * 9 / 5 + 32;
                }

                JOptionPane.showMessageDialog(null, temp + " grados " + escalaOrigen + " equivalen a " + resultadoTemperatura + " grados " + escalaDestino);

                //Mensaje para preguntar al usuario si desea continuar usando el programa
                JOptionPane.showMessageDialog(null, "¿Deseas realizar otra conversión?");
                String seleccion = JOptionPane.showInputDialog(null, "Si                   " + "No");

                if(seleccion.equalsIgnoreCase("si")){
                    continuarPrograma = true;
                }else{
                    continuarPrograma = false;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error. Ingresa un tipo de conversión válido");
            }

        }
    }
}
