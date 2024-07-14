import java.io.FileNotFoundException;
import java.util.Scanner;

public class Admin_Menu {
//Método que irá criar o menu do admin.
    public static void adminMenuStart() throws FileNotFoundException {

        Scanner input=new Scanner(System.in);

        boolean correctValidation=validatingAdmin.validatingAdmin();
        if (correctValidation){

            int choice=11;
            System.out.println("Seja bem-vindo.");
            while (choice!=0){

                System.out.println("Escloha umas das seguintes opções: \n1.Consultar ficheiros\n2.Analisar total de vendas.\n3.Analisar total de lucro\n4.Pesquisa de cliente\n5.Jogo mais caro\n6.Melhores Clientes\n7.Melhor categoria\n8.Pesquisa Vendas\n9.Top 5 Jogos\n10.Bottom 5 jogos\n0.Sair");
                choice=input.nextInt();
                switch (choice){

                    case 1:

                        boolean stop=true;
                        while (stop){

                            System.out.print("Consultar ficheiros. Por favor indique quais do seguintes ficheiros pretende consultar:\n");
                            System.out.println("1.Clientes\n2.Admins\n3.Categorias\n4.Vendas\n0.Sair");
                            int choice1=input.nextInt();
                            if (choice1==1){

                                readPrintFiles.readFiles(fillArray.fillArray("GameStart_Clientes.csv",false),false);
                            } else if (choice1==2) {

                                readPrintFiles.readFiles(fillArray.fillArray("GameStart_Admins.csv",true),true);

                            } else if (choice1==3) {

                                readPrintFiles.readFiles(fillArray.fillArray("GameStart_Categorias.csv",false),false);
                            } else if (choice1==4) {

                                readPrintFiles.readFiles(fillArray.fillArray("GameStart_Vendas.csv",false),false);
                            } else if (choice1==0) {

                                System.out.println("Vamos agora voltar ao mennu anterior");
                                stop=false;
                            }
                        }
                        break;

                    case 2:

                        double totalSales= TotalSales.totalSales();

                        System.out.println(totalSales);
                        break;

                    case 3:

                        double totalProfit=TotalProfit.salesByCategory();
                        System.out.println(totalProfit);
                        break;

                    case 4:

                        SearchClient.getClient();

                        break;

                    case 5:

                        mostExpensiveGame.clientsWhoBought();
                        break;

                    case 6:

                        bestClients.getBestClients();
                        System.out.println();
                        break;

                    case 7:

                        ProfitCategory.profitCategory();
                        break;

                    case 8:

                        checkWhoBoughtGame.gameRequsted();
                        break;

                    case 9:
                        MostLucrativeGames.top5Games(MostLucrativeGames.top5MostLucrativeGames(fillArray.fillArray("GameStart_Vendas.csv",false)));
                        break;

                    case 10:

                        MostLucrativeGames.bottom5Games(MostLucrativeGames.top5MostLucrativeGames(fillArray.fillArray("GameStart_Vendas.csv",false)));
                        break;

                    case 0:

                        PrintCopyright.printCopyright("GameStart_Copyright.txt");
                        break;

                    default:

                        System.out.println("Opção inválida.");
                }

        }
    }
}

}