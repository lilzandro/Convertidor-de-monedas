package main;

import javax.swing.JOptionPane;

public class App extends Convertidor {
    public static void main(String[] args) {
        Convertidor instancia = new Convertidor();

        // Opciones a elegir
        String[] opciones = { "Conversor de divisas", "Conversor de temperatura" };
        String[] opcionesConversor = { "Pesos Colombianos a Dolares", "Pesos Colombianos a Euros",
                "Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a Yen Japonés",
                "Pesos Colombianos a Won sur-coreano", "Dolar a Pesos COL", "Euro a Pesos COL",
                "Libras Esterlinas a Pesos COL",
                "Yen Japonés a Pesos COL", "Won sul-coreano a Pesos COL" };
        String[] valoresConversion = {
                "Dolar", "Euro", "Esterlinas", "Yen-Japones", "Won-Sur", "Dolar a pesos", "Euros a pesos",
                "Libras a pesos", "Yen-Japones a pesos", "Won-Surcoreano a pesos"
        };

        // Muestra un cuadro de diálogo con las opciones y obtiene la opción
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Por favor, elige una opción:",
                "Opciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0] // Opción preseleccionada
        );

        // Verifica la opción seleccionada y muestra el mensaje correspondiente
        if (seleccion != null) {
            // Verificar si la selección es "Conversor de divisas"
            switch (seleccion) {
                case "Conversor de divisas":
                    boolean continuarPrograma = true;
                    while (continuarPrograma) {
                        String seleccionMoneda = (String) JOptionPane.showInputDialog(
                                null,
                                "Elija la moneda a la que desea convertir",
                                "Opciones",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                opcionesConversor,
                                opcionesConversor[0] // Opción preseleccionada
                        );

                        if (seleccionMoneda == null) {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                            continuarPrograma = false;
                        }
                        if (seleccionMoneda != null) {
                            // Solicitar el valor hasta que sea numérico
                            double valorNumero = 0.0;
                            boolean valorValido = false;
                            do {
                                String valorStr = JOptionPane.showInputDialog(null,
                                        "Ingresa la cantidad que desea convertir");
                                try {
                                    valorNumero = Double.parseDouble(valorStr);
                                    valorValido = true;
                                } catch (NumberFormatException e) {
                                    // Si el valor ingresado no es numérico, mostrar un mensaje de error
                                    JOptionPane.showMessageDialog(null, "Error: Ingresa un valor numérico válido.");
                                }
                            } while (!valorValido);

                            // Buscar la opción seleccionada y realizar la conversión si es válida
                            boolean opcionEncontrada = false;
                            for (int i = 0; i < opcionesConversor.length; i++) {
                                if (seleccionMoneda.equals(opcionesConversor[i])) {
                                    instancia.convertidor(valorNumero, valoresConversion[i]);
                                    opcionEncontrada = true;
                                    break;
                                }
                            }
                            // Si no se encuentra la opción, mostrar un mensaje de error
                            if (!opcionEncontrada) {
                                JOptionPane.showMessageDialog(null, "Opción de conversión inválida.");
                            }
                            int continuar = JOptionPane.showInternalConfirmDialog(null, "¿Desea continuar?",
                                    "información",
                                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

                            if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                                JOptionPane.showMessageDialog(null, "Programa finalizado");
                                continuarPrograma = false;
                            }
                        }
                    }
                    break;
                case "Conversor de temperatura":
                    JOptionPane.showMessageDialog(null, "Seleccionaste la Opción 2");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción válida.");
            }
        } else {
            // Si el usuario cierra el cuadro de diálogo sin seleccionar nada
            JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción.");
        }

    }

}
