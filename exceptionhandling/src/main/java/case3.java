
    public class case3
    {
        //user defined method
        public static void divide()
        {
            try
            {
//raised divide by zero exception
                int a = 100/0;
            }
            catch (Exception e)
            {
//prints exception message
                System.out.println(e);
            }
        }
        //main() method
        public static void main(String args[])
        {
//calling user defined method
            divide();
        }
    }

