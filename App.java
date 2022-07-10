import java.util.Scanner;
public class App {
    public static void main(String[]args){
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
