import java.io.FileNotFoundException;

public class mostExpensiveGame {
//Método que deverá receber como argumento a matriz das vendas e retornará uma String que representará o jogo mais caro.
    public static String getMostExpensiveGame(String[][] matrizVendas){

        double mostExpensive=Double.parseDouble(matrizVendas[0][5]);
        String game=matrizVendas[0][4];
        for (int i = 0; i <matrizVendas.length; i++) {

            for (int j = 0; j < matrizVendas[i].length; j++) {

                if (Double.parseDouble(matrizVendas[i][5])>mostExpensive){

                    game=matrizVendas[i][4];
                }
            }
        }

        return game;
    }
//Printará para a consola todos os clientes que compraram o jogo mais caro
    public static void clientsWhoBought() throws FileNotFoundException {

        String mostExpensiveGame=getMostExpensiveGame(fillArray.fillArray("GameStart_Vendas.csv",false));
        System.out.println("O jogo mais caro é: " + mostExpensiveGame);
        String[][] vendas= fillArray.fillArray("gameStart_Vendas.csv",false);
        int match=0;
        for (int i = 0; i < vendas.length; i++) {

            for (int j = 0; j < vendas[i].length; j++) {

                if (vendas[i][j].equals(mostExpensiveGame)){

                    match++;
                }
            }
        }

        String [] names=new String[match];
        String game="";
        int count=0;

        for (int i = 0; i < names.length-5; i++) {

            for (int j = 0; j < vendas.length; j++) {

                if (vendas[j][4].equals(mostExpensiveGame)){

                    game=vendas[j][1];
                    names[count]=game;
                    count++;

                }
            }


        }

        String[][] clients=fillArray.fillArray("GameStart_Clientes.csv",false);

        System.out.println("Os seguintes clientes compraram o jogo:");
        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j <clients.length ; j++) {

                for (int k = 0; k < clients[j].length; k++) {

                    if (names[i].equals(clients[j][k])){

                        System.out.println(clients[j][1]);
                    }
                }
            }
        }


    }
}
