public class Lambdas {
    
        public static void main(String[] args) {
            
            Printable lambdaPrintable = s -> System.out.println("Meow" +  s);
            printThing(lambdaPrintable);
        }

        static void printThing(Printable thing) {
            thing.print("!");
        }
    }
    
    
 