public class whileLoop {
    public static void Check_if_number_is_in_range(int number,int rangeStart,int rangeEnd )
    {
        while (number >= rangeStart && number <= rangeEnd)
        {
            System.out.println(number+" is in range!:) "+ rangeStart+":"+rangeEnd);
            return;
        }
        System.out.println(number+"is not in range!:(( "+ rangeStart+":"+rangeEnd);

    }
    
}
