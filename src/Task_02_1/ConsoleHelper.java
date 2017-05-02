package Task_02_1;

public class ConsoleHelper
{
    public void start()
    {
        boolean exit = false ;

        ArrayHolder array = new ArrayHolder(ReadConsole.readArrayInt());
        while (!exit)
        {
            System.out.println("Select action: \n 0: exit \n 1: sort \n 2: search ");
            switch (ReadConsole.readSring())
            {
                case "0":
                    System.out.println("Goodbye");
                    exit = true;
                    break;
                case "1":
                    array.sortArray();
                    System.out.println(array.toString());
                    break;
                case "2":
                    System.out.print("Enter value: ");
                    String searchIndex =  array.search(ReadConsole.readInt());
                    System.out.println(searchIndex.equals("") ? "no found" : "Index: " + searchIndex ) ;
                    break;
                default:
                    System.out.println("Select one of the menu items!");
            }

        }
    }
}