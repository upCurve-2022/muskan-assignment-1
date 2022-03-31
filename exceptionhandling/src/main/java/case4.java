

class MyException extends Exception {
        public MyException(String s)
        {
            // Call constructor of parent Exception
            super(s);
        }
    }

    // A Class that uses above MyException
    public class case4 {
        // Driver Program
        public static void main(String args[])
        {
            try {
                // Throw an object of user defined exception
                throw new MyException("789");
            }
            catch (MyException ex) {
                System.out.println("Delivery available in your area!");

                // Print the message from MyException object
                System.out.println(ex.getMessage());
            }
        }
    }



