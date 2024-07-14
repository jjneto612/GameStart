import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkWhoBoughtGame {
//user insere um jogo que irá procurado na matriz de vendas. Tentei colocar tudo em lower case de modo a facilitar a procura.
    public static void gameRequsted() throws FileNotFoundException {

        Scanner input=new Scanner(System.in);
        String inputUtilizador;
        System.out.print("Por favor escolha o jogo que pretende pesquisar:");
        inputUtilizador=input.nextLine();
        inputUtilizador.toLowerCase();
        String [][] vendas=fillArray.fillArray("GameStart_Vendas.csv",false);
        String [][] ficheirosClientes=fillArray.fillArray("GameStart_Clientes.csv",false);
        int match=0;
        for (int i = 0; i < vendas.length; i++) {

            for (int j = 0; j < vendas[i].length; j++) {

                if (vendas[i][j].toLowerCase().equals(inputUtilizador)){

                    match++;

                }
            }
        }

        String[] clientes=new String[match];
        int count=match-1;
        String game="";

        for (int i = count; i <clientes.length; i++) {

            for (int j = 0; j < vendas.length; j++) {

                if (vendas[j][4].toLowerCase().equals(inputUtilizador)){

                    game=vendas[j][1];
                    clientes[count]=game;
                    count--;


                }
            }
        }

        for (int i = 0; i < clientes.length; i++) {

            for (int j = 0; j < ficheirosClientes.length; j++) {

                if (clientes[i].equals(ficheirosClientes[j][0])){

                    for (int k = 1; k < 4; k++) {

                        System.out.println(ficheirosClientes[j][k]);
                    }
                }
            }
        }


    }
}
