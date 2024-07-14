import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Método que printará para a consola os catálogos gráficos disponiveis.
public class PrintingGraphics {

    public static void printingGraphics() throws FileNotFoundException {

        Scanner sc;
        String linha;

        Scanner input=new Scanner(System.in);
        int choice=-1;
        while (choice!=0){

            System.out.println("Por favor escolha o jogo que deseja. Temos os seguintes jogos:\n1.Call of Duty\n2.Fifa\n3.Hollow Knight\n4.Minecraft\n5.Mortal kombat\n6.Over Cooked\n7.Witcher 3\n0.Sair");
            choice=input.nextInt();

            switch (choice){

                case 1:

                    File file=new File("CatalogoGrafico/callOfDuty.txt");

                    sc=new Scanner(file);

                    while (sc.hasNextLine()){

                        linha=sc.nextLine();
                        System.out.println(linha);
                    }

                    break;


                case 2:

                    File file1=new File("CatalogoGrafico/fifa.txt");

                    sc=new Scanner(file1);

                    while (sc.hasNextLine()){

                        linha=sc.nextLine();
                        System.out.println(linha);
                    }

                    break;
                case 3:

                    File file2=new File("CatalogoGrafico/hollowKnight.txt");

                    sc=new Scanner(file2);

                    while (sc.hasNextLine()){

                        linha=sc.nextLine();
                        System.out.println(linha);
                    }

                    break;

                case 4:

                    File file3=new File("CatalogoGrafico/minecraft.txt");

                    sc=new Scanner(file3);

                    while (sc.hasNextLine()){

                        linha=sc.nextLine();
                        System.out.println(linha);
                    }

                    break;

                case 5:

                    File file4=new File("CatalogoGrafico/mortalKombat.txt");

                    sc=new Scanner(file4);

                    while (sc.hasNextLine()){

                        linha=sc.nextLine();
                        System.out.println(linha);
                    }

                    break;

                case 6:

                    File file5=new File("CatalogoGrafico/overcooked.txt");

                    sc=new Scanner(file5);

                    while (sc.hasNextLine()){

                        linha=sc.nextLine();
                        System.out.println(linha);
                    }

                    break;

                case 7:

                    File file6=new File("CatalogoGrafico/witcher3.txt");

                    sc=new Scanner(file6);

                    while (sc.hasNextLine()){

                        linha=sc.nextLine();
                        System.out.println(linha);
                    }

                    break;

                case 0:

                    System.out.println("Sair.");

                    break;

                default:

                    System.out.println("Por favor escolha uma opção válida.");


            }
        }
    }
}
