import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Client_Menu {
//Método que irá criar o menu para o cliente.
    public static void clientMenuStart() throws FileNotFoundException {

        Scanner input=new Scanner(System.in);
        System.out.println("Olá. Seja bem-vindo.");
        int choice=-1;
        while (choice!=0){
            System.out.println();
            System.out.println("Escolha uma das seguintes opções:\n1.Registo cliente\n2.Procurar estacionamento\n3.Imprimir catálogo de jogos\n4.Imprimir catálogos gráficos\n5.Imprimir catálogo de editora\n6.Imprimir catálogo de categoria\n7.Imprimir jogo mas recente\n0.Sair");
            choice=input.nextInt();
            switch (choice){

                case 1:

                    AddingnewClient.addingNewUser();
                    break;

                case 2:

                    ParkingSpot.triangularNumbers();
                    break;

                case 3:

                    String[][] games = MostLucrativeGames.top5MostLucrativeGames(fillArray.fillArray("GameStart_Vendas.csv",false));
                    String game="";
                    for (int i = 0; i <games.length ; i++) {

                        game=games[i][0];
                        System.out.println(game);
                    }

                    break;

                case 4:

                    PrintingGraphics.printingGraphics();

                    break;

                case 5:

                    PrintingPublishers.printingPublishers();

                    break;

                case 6:

                    PrintingCategory.printingPublisher();

                    break;

                case 7:

                    String mostRecentGame=MostRecentGame.mostRecentGame();
                    System.out.println(mostRecentGame);
                    break;

                case 0:

                    PrintCopyright.printCopyright("GameStart_Copyright.txt");

                    break;
            }
        }
    }
}
