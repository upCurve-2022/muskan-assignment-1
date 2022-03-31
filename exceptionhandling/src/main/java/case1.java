public class case1 {

        public static void main(String args[]) {
            String zipCode = "123,456,789";
            String regex = "\\d{5}(-\\d{4})?";
            System.out.println("The zip code is: " + zipCode);
            System.out.println("Is the above zip code valid? " + zipCode.matches(regex));
        }
    }

