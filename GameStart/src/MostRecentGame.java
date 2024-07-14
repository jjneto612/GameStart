import java.io.FileNotFoundException;

public class MostRecentGame {
//Método retornará uma String que representará o jogo mais recente a ser vendido. Reutilizei a matriz dos jogos sem duplicados.
    public static String mostRecentGame() throws FileNotFoundException {

        String[][] recentGames=MostLucrativeGames.top5MostLucrativeGames(fillArray.fillArray("GameStart_Vendas.csv",false));
        String game="";
        for (int i = recentGames.length-1; i <recentGames.length ; i++) {

            game=recentGames[i][0];
        }

        return game;
    }
}
