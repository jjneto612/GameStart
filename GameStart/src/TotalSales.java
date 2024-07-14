import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TotalSales {
//Método que retornará o total de vendas da loja.
    public static double totalSales() throws FileNotFoundException {

        File fileSales = new File("GameStart_Vendas.csv");
        Scanner sc = new Scanner(fileSales);

        String linhas = sc.nextLine();
        String[][] arrayVendas = new String[175][6];

        String[] linhas1 = linhas.split(";");
        int count = 0;
        int minus = 174;
        while (sc.hasNextLine()) {

            linhas = sc.nextLine();
            linhas1 = linhas.split(";");

            for (int i = count; i < arrayVendas.length - minus; i++) {

                for (int j = 0; j < arrayVendas[i].length; j++) {

                    arrayVendas[i][j] = linhas1[j];
                }
            }
            count++;
            minus--;
        }

        double[] totalSales = new double[arrayVendas.length];
        double total = 0;
        int count1 = 0;
        int setter=174;
        for (int i = 0; i < arrayVendas.length; i++) {

            String[] sales;
            for (int j = arrayVendas[i].length-1; j < arrayVendas[i].length; j++) {

                sales = arrayVendas[i][j].split("\\.");
                total = (Double.parseDouble(sales[0]) * 1) + (Double.parseDouble(sales[1])/100);

                for (int l = count1; l < totalSales.length - setter; l++) {

                    totalSales[l] = total;

                }
                setter--;
                count1++;
            }
        }

        double grossSales=0;

        for (int i = 0; i < totalSales.length; i++) {

            grossSales+=totalSales[i];
        }

        return grossSales;
    }

}
