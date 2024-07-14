import java.io.FileNotFoundException;
import java.util.Arrays;

public class MostLucrativeGames {
//Método retornará uma matriz sem jogos duplicados e com colunas a para a categoria e total de lucro de cada jogo.
    public static String[][] top5MostLucrativeGames(String[][] matrizVendas) throws FileNotFoundException {

        matrizVendas=fillArray.fillArray("gameStart_Vendas.csv",false);
        String game="";
        String[][] games=new String[matrizVendas.length][2];
        String[] uniqueGames=new String[matrizVendas.length];
        String[][] compare=fillArray.fillArray("GameStart_Vendas.csv",false);
        uniqueGames[0]=matrizVendas[0][4];

        int count=0;

        for (int i = 0; i < matrizVendas.length; i++) {

            for (int j = i+1; j < compare.length; j++) {

                if (matrizVendas[i][4].equals(compare[j][4])){

                    compare[j][4]=null;
                }

            }
        }

        int match=0;
        for (int i = 0; i < compare.length; i++) {

            for (int j = 4; j < compare[i].length-1; j++) {

                if (compare[i][j] != null){

                    match++;
                }
            }
        }

        String[] finalUniqueGames=new String[match];

        int n=0;

            for (int j = 0; j < compare.length; j++) {

                if(compare[j][4]!=null){

                    finalUniqueGames[n]=compare[j][4];
                    n++;
                }
            }

            String currentGame="";
            String category="";
            String[][] gamesProfit=new String[match][3];
        for (int i = 0; i < finalUniqueGames.length; i++) {

            double total=0;
            currentGame=finalUniqueGames[i];
            for (int j = 0; j < matrizVendas.length; j++) {

                if (matrizVendas[j][4].equals(currentGame)){

                    total+=Double.parseDouble(matrizVendas[j][5]);
                    category=matrizVendas[j][3];

                }

            }

            gamesProfit[i][0]=currentGame;
            gamesProfit[i][1]=Double.toString(total);
            gamesProfit[i][2]=category;
        }

        String[][] categorias = fillArray.fillArray("GameStart_Categorias.csv",false);

        //o problema
        for (int i = 0; i < categorias.length; i++) {

            String currentcategory=categorias[i][0];
            double total=0;
            Double rate=Double.parseDouble(categorias[i][1]);
            rate=rate/100;
            for (int j = 0; j < gamesProfit.length; j++) {

                if (currentcategory.equals(gamesProfit[j][2])){

                    total=Double.parseDouble(gamesProfit[j][1]) *rate;
                    gamesProfit[j][1]=Double.toString(total);
                }

            }
        }

        return gamesProfit;


    }
//Método que printará para a consola o top 5 de jogos mais rentáveis.
    public static void top5Games(String[][] matriz){

        String[] num;

        for (int i = 0; i < matriz.length-1; i++) {

            if(Double.parseDouble(matriz[i][1])>Double.parseDouble(matriz[i+1][1])){

                num=matriz[i];
                matriz[i]=matriz[i+1];
                matriz[i+1]=num;
                i=-1;


            }
        }

        for (int i = matriz.length-1; i > matriz.length-6; i--) {

            for (int j = 2; j < matriz[i].length; j++) {

                System.out.print(matriz[i][0]);
            }
            System.out.println();
        }
    }
//Método que printará para a consola o top 5 dos jogos menos rentáveis.
    public static void bottom5Games(String[][] matriz){

        String[] num;

        for (int i = 0; i < matriz.length-1; i++) {

            if(Double.parseDouble(matriz[i][1])>Double.parseDouble(matriz[i+1][1])){

                num=matriz[i];
                matriz[i]=matriz[i+1];
                matriz[i+1]=num;
                i=-1;
            }
    }

        for (int i = 0; i < 5; i++) {

            for (int j = 2; j < matriz[i].length; j++) {

                System.out.print(matriz[i][0]);
            }
            System.out.println();
        }
}

}
