package main;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Convertidor {
    DecimalFormat formatearDecimal = new DecimalFormat("#.##");

    public void convertidor(double valor, String divisa) {

        switch (divisa) {
            case "Dolar":
                double totalDolares = valor * 0.00025667877;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Pesos COL son: " + formatearDecimal.format(totalDolares)
                                + "$ Dolares");
                break;
            case "Euro":
                double totalEuros = valor * 0.00023203931;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Pesos COL son: " + formatearDecimal.format(totalEuros)
                                + " \u20AC  Euros");
                break;
            case "Esterlinas":
                double totalEsterlinas = valor * 0.00019874889;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Pesos COL son: " + formatearDecimal.format(totalEsterlinas)
                                + "\u00A3 Libras Esterlinas");
                break;
            case "Yen-Japones":
                double totalYen = valor * 0.036296988;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Pesos COL son: " + formatearDecimal.format(totalYen)
                                + "\u00A5 Yen Japonés");
                break;
            case "Won-Sur":
                double totalWon = valor * 0.32602657;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Pesos COL son: " + formatearDecimal.format(totalWon)
                                + "\u20A9 Won sur-coreano");
                break;
            case "Dolar a pesos":
                double dolarAPesos = valor * 3922.18;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Dolares son: " + formatearDecimal.format(dolarAPesos)
                                + "$ Pesos COL");
                break;
            case "Euros a pesos":
                double eurosAPesos = valor * 4313.96;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Euros son: " + formatearDecimal.format(eurosAPesos)
                                + "$ Pesos COL");
                break;
            case "Libras a pesos":
                double librasAPesos = valor * 5034.76;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Libras Esterlinas son: " + formatearDecimal.format(librasAPesos)
                                + "$ Pesos COL");
                break;
            case "Yen-Japones a pesos":
                double yenJaponesAPesos = valor * 27.57;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Yen Japonés son: " + formatearDecimal.format(yenJaponesAPesos)
                                + "$ Pesos COL");
                break;
            case "Won-Surcoreano a pesos":
                double wonAPesos = valor * 3.07;
                JOptionPane.showMessageDialog(null,
                        valor + "$ Won Sur-Coreano son: " + formatearDecimal.format(wonAPesos)
                                + "$ Pesos COL");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error, Ingrese los valores correctos");
        }
    }

}
