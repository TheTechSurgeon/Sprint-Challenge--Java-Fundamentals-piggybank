package piggyBank;

public class Nickel extends Coin {
    private static double nickel = 0.5;
    private static int count = 0;

    public Nickel() {
        count++;
        System.out.println("1 nickle added for a total of "+ count);
    }
    public Nickel(int num){
        count+=num;
        System.out.println(num+" nickles added for a total of "+ count +" nickles in the bank");
    }

    @Override
    public int getContent() {
        return count;
    }
    @Override
    public double getTotal(){
        return count*nickel;
    }
    @Override
    public double getValue() {
        return nickel;
    }
    @Override
    public void remove(double num) {
        count-=num;
    }
    @Override
    public String toString() {
        if (count == 0) {
            return "";
        } else {
            return count + (count>1?" Nickles":" Nickle");
        }
    }
}