import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintingCategory {
//Método que ao receber um input sobre qual categoria o user pretende analisar irá printar na consola todos os jogos que pertencem a essa categoria.
    public static void printingPublisher() throws FileNotFoundException {

        String[][] sales=MostLucrativeGames.top5MostLucrativeGames(fillArray.fillArray("GameStart_Vendas.csv",false));
        Scanner input=new Scanner(System.in);
        String [][] categoryAndPublisher=new String[sales.length][sales[0].length+1];
        categoryAndPublisher=sales;
        String[][] vendas=fillArray.fillArray("GameStart_Vendas.csv",false);
        System.out.print("Por favor escolha a categoria que pretende analisar:");
        String choice=input.nextLine();
        System.out.println("**" + choice + "**");
        for (int i = 0; i < sales.length; i++) {

            String currentGame=sales[i][0];
            for (int j = 0; j < vendas.length; j++) {

                if (currentGame.equals(vendas[j][4])){

                    categoryAndPublisher[i][1]=vendas[j][2];
                    break;
                }

            }
        }

        String editora;
        boolean stop=true;
        String[] publisher=new String[50];
        int n=0;
        for (int i = 0; i< categoryAndPublisher.length; i++) {

            if (categoryAndPublisher[i][2].equals(choice)){

                editora=categoryAndPublisher[i][1];

                for (int j = 0; j < categoryAndPublisher.length; j++) {

                    if (categoryAndPublisher[j][2].equals(choice)&& categoryAndPublisher[j][1].equals(editora)){


                    }
                }
                publisher[n]=editora;
                n++;
            }
        }



        int match=0;
        for (int i = 0; i < publisher.length; i++) {

            if (publisher[i]!=null){

                match++;
            }
        }

        String []compare=new String[match];
        int index=0;
        for (int i = 0; i < compare.length; i++) {

            if (publisher[i]!=null){

                compare[i]=publisher[i];
            }
        }

        String[] editoras=compare;


        for (int i = 0; i < compare.length; i++) {

            for (int j = i+1; j < editoras.length; j++) {

                if (compare[i].equals(editoras[j])){

                    editoras[j]="x";
                }
            }
        }

        int newMatch=0;
        for (int i = 0; i < editoras.length; i++) {

            if (!editoras[i].equals("x")){

                newMatch++;
            }
        }

        String[] finalEditora=new String[newMatch];

        int x=0;
        for (int i = 0; i < finalEditora.length - (finalEditora.length-1); i++) {

            for (int j = i; j < editoras.length; j++) {

                if (!editoras[j].equals("x")){

                    finalEditora[x]=editoras[j];
                    x++;
                }
            }
        }

        int counter=0;
        for (int i = 0; i< finalEditora.length; i++) {

            editora=finalEditora[i];
            System.out.println("__"+ editora+ "__");
            for (int j = 0; j < categoryAndPublisher.length; j++) {

                if (categoryAndPublisher[j][2].equals(choice)&& categoryAndPublisher[j][1].equals(editora)){

                    System.out.println(categoryAndPublisher[j][0]);
                }
            }
            System.out.println();
        }


    }

    public static String[] uniquePublishers() throws FileNotFoundException {

        String [][]vendasCategorias=fillArray.fillArray("GameStart_Vendas.csv",false);
        String [][] categorias=fillArray.fillArray("GameStart_Vendas.csv",false);

        for (int i = 0; i < vendasCategorias.length; i++) {

            for (int j = i+1; j < categorias.length; j++) {

                if (vendasCategorias[i][2].equals(categorias[j][2])){

                    categorias[j][2]=null;
                }
            }
        }

        int match=0;

        for (int i = 0; i < categorias.length; i++) {

            if (categorias[i][2]!=null){

                match++;
            }
        }

        int index=0;
        String[] publisherNoDuplicates=new String[match];

        for (int j = 0; j < categorias.length; j++) {

            if(categorias[j][2]!=null){

                publisherNoDuplicates[index]=categorias[j][2];
                index++;
            }
        }

        return publisherNoDuplicates;
    }



}
