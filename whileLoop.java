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

    public static void Practice1(String[]args){
        //ForLoopPractice.Nested_Loop_Sample('|',10,20);
        //MathUtil.Pow_Of_X(2, 4);""
        //whileLoop.Check_if_number_is_in_range(1,100);
        
        final int SENTINEl = -999;
        Scanner Reader = new Scanner(System.in);
        while(true)
        {
            System.out.println("Please enter value:");
            int value = Reader.nextInt();
            if(value != SENTINEl)
            {
                System.out.println("processing value="+ value );
            }
            else
            {
                break;
            }
        }              
        Reader.close(); 
    }
    
}
