import com.isep.rpg.Game;
import com.isep.utils.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        // Handle user interrupt, for exemple Ctrl + C                                                                                                    
        Runtime.getRuntime().addShutdownHook(new Thread()                                                                                   
        {                                                                                                                                   
            @Override                                                                                                                       
            public void run()                                                                                                               
            {
                System.out.println("\n\n\u001B[31m" + "/!\\ Interrupt detected /!\\\n" + "\u001B[0m");
            }
        });

        System.out.println("***********************************************************************\n" +
                "*\t     ___      ___    _   _   __      ___ ___ _   _   _   _   _    *\n" +
                "*\t|\\/|  |  |\\ |  |    |_) |_) /__   |   |   | |_   _) / \\ / \\ / \\   * \n" +
                "*\t|  | _|_ | \\| _|_   | \\ |   \\_|   |_ _|_  | |_   _) \\_/ \\_/ \\_/   *\n" +
                "*                                                                     *\n" +
                "***********************************************************************\n" +
                "\n" +
                "\t   *********************************************************\n" +
                "\t   *                                                       *\n" +
                "\t   *   Made by Theophile Wemaere, ISEP student, 2022-2023  *\n" +
                "\t   *                                                       *\n" +
                "\t   *********************************************************\n" +
                "\t\n" +
                "\tWelcome to this mini rpg, entirely programmed in java using OOP.\n" +
                "\t\n" +
                "\tYou can either choose to play using a console or a graphical interface\n" +
                "\t\n" +
                "Please input your choice below :\n" +
                "\n" +
                "[1] Play using console\n" +
                "[2] Play using graphical interface (recommended)\n" +
                "\n");

        Scanner scanner = new Scanner(System.in);
        boolean c = false;
        int choice = 2;
        while(!c)
        {
            try {
                System.out.print("Please enter your choice : ");
                choice = scanner.nextInt();
            } catch(InputMismatchException ime) {
                // do nothing
            }
            if(choice == 1 || choice == 2)
            {
                c = true;
            }
        }

        InputParser parser = null;

        if(choice == 1)
        {
            parser = new ConsoleParser();
        }
        else if(choice == 2)
        {
            parser = new GUIParser();
        }

        Game game = new Game(parser);
        game.start();
    }
}
