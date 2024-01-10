import java.util.Scanner;

public class diary 
{
    // Ayşegül Yıldız

    private static Scanner scan;
    public static void main(String[] args) 
    {
        scan = new Scanner( System.in );
        int pageNum;
        int pageSize;
        int choice;

        // ask for page number and size input
        System.out.print("Enter number of pages: ");
        pageNum = scan.nextInt();
        System.out.println();
        System.out.print( "Enter page size: " );
        pageSize = scan.nextInt();
        System.out.println("---------------------------");
        Notebook noteb = new Notebook( pageNum, pageSize );
        do
        {
            // print menu and get the choice input
            System.out.println("What do you want to do? \n(1) Take a note \n(2) Browse notebook \n(3) Exit");
            System.out.print("Your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            System.out.println();

            // if user chooses first option then take note data as input and pass it to noteb object
            if ( choice == 1 )
            {
                System.out.print("Enter Note: ");
                String note = scan.nextLine();
                noteb.writeNote(note);
                System.out.println(" \n ---------------------------");
            }

            // if user chooses second option then display the notebook
            else if ( choice == 2 )
            {
                System.out.println( "Here's your notebook: " );
                noteb.printNotebook();
                System.out.println();
            }

            // if user enters 3 then terminate the program
        }while( choice != 3 );
        scan.close();         
    }
}
