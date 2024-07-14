import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TotalProfit {

//Método que retornará como double o total de lucro da loja.
    public static double salesByCategory() throws FileNotFoundException {


        String[][] categorias=fillArray.fillArray("GameStart_Categorias.csv",false);
        String [][] vendas=fillArray.fillArray("GameStart_Vendas.csv",false);
        String [][] categoriasMargem=new String[vendas.length][categorias[0].length];

        double marginProfit=0;
        int n=0;
        String category="";
        double rate=0;

        for (int i = 0; i < categorias.length; i++) {

            //for (int j = 0; j < categorias[i].length; j++) {

                category=categorias[i][0];
                rate=Double.parseDouble(categorias[i][1]);
                rate=rate/100;

                for (int k = 0; k < vendas.length; k++) {

                    for (int l = 0; l < vendas[i].length; l++) {

                        if (vendas[k][l].equals(category)){

                            marginProfit+=Double.parseDouble(vendas[k][l+2]) *rate;
                            break;
                        }
                    }
                //}
            }

        }

        return marginProfit;


    }

    public static void totalMargin(String[][] arrayVendas) throws FileNotFoundException {


        File categoriasFile=new File("GameStart_Categorias.csv");

        Scanner sc=new Scanner(categoriasFile);

        String linhas = sc.nextLine();
        String[][] arrayCategorias = new String[16][2];

        String[] linhas1 = linhas.split(";");
        int count = 0;
        int minus = 15;
        while (sc.hasNextLine()) {

            linhas = sc.nextLine();
            linhas1 = linhas.split(";");

            for (int i = count; i < arrayCategorias.length - minus; i++) {

                for (int j = 0; j < arrayCategorias[i].length; j++) {

                    arrayCategorias[i][j] = linhas1[j];
                }
            }
            count++;
            minus--;
        }

        int n= arrayVendas.length-1;
        int m=arrayVendas[0].length-1;
        double totalMargin=0;
        double marginRate=0;
        double num=0;

        for (int i = 0; i < arrayCategorias.length; i++) {

            String category="";
            for (int j = 0; j < arrayCategorias[i].length-1; j++) {

                category=arrayCategorias[i][j];
                marginRate=Double.parseDouble(arrayCategorias[i][1]);

            }

            for (int linhasVendas = 0; linhasVendas < arrayVendas.length-n; linhasVendas++) {

                for (int j = 5; j <arrayVendas[i].length ; j++) {

                    if (arrayVendas[linhasVendas][j].equals(category)){

                        num=Double.parseDouble(arrayVendas[linhasVendas][j]);

                    }

                    totalMargin+=num;
                    totalMargin=totalMargin/marginRate;
                }

            }

            n--;
        }

    }
}
