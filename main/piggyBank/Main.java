package piggyBank;

    public class Main {
        public static void main(String[] args) {
            //most of the computations are spread out amongst the PiggyBank class and individual coin classes

            //creates the PiggyBank collection.
            PiggyBank piggyBank=new PiggyBank();

            //adds and prints coins/dollars
            piggyBank.add(new Quarter());
            piggyBank.add(new Dime());
            piggyBank.add(new Dollar(5));
            piggyBank.add(new Nickel(3));
            piggyBank.add(new Dime(7));
            piggyBank.add(new Dollar());
            piggyBank.add(new Penny(10));

            //gets total
            piggyBank.printBank();

            //tests stretch/removal
            System.out.println("\n*** Removal ***");
            piggyBank.remove(1.50);
        }
    }