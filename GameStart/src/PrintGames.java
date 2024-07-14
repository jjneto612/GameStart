import java.io.FileNotFoundException;

public class PrintGames {
//Método que printará para a consola todos os jogos vendidos sem duplicados.
    public static void printGames() throws FileNotFoundException {

        String[][] recentGames=MostLucrativeGames.top5MostLucrativeGames(fillArray.fillArray("GameStart_Vendas.csv",false));

        for (int i = 0; i < recentGames.length; i++) {

            System.out.println(recentGames[i][0]);
        }
    }
}
