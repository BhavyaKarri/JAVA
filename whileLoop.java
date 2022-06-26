import java.util.Scanner;

public class whileLoop {

    public static void Check_if_number_is_in_range(int rangeStart,int rangeEnd )
    {
        while (true)
        {
            System.out.println("To terminate the loop please enter an integer within the givin range "+ rangeStart+ " : "+rangeEnd);
            Scanner Reader = new Scanner (System.in);
            int number = Reader.nextInt();
            if(number >= rangeStart && number <= rangeEnd){
                System.out.println("Please enter an integer Value ");
                System.out.println(number+" is in range!:) "+ rangeStart+":"+rangeEnd);
                break;

            }
            
        }

    }
    

    public static void Check_if_number_is_in_range(int number,int rangeStart,int rangeEnd )
    {
        while (number >= rangeStart && number <= rangeEnd)
        {
            System.out.println(number+" is in range!:) "+ rangeStart+":"+rangeEnd);
            return;
        }
        System.out.println(number+" is not in range!:(( "+ rangeStart+":"+rangeEnd);

    }
    
}
