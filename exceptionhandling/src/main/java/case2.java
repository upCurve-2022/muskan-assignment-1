

    // A Class that uses above MyException
    public class case2 {
        // Driver Program
        public static void main(String args[])
        {
            try {
                // Throw an object of user defined exception
                throw new MyException("789");
            }
            catch (MyException ex) {
                System.out.println("non-delivery zip code");

                // Print the message from MyException object
                System.out.println(ex.getMessage());
            }
        }
    }

