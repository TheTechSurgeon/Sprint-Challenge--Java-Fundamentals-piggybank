package piggyBank;
public class Dime extends Coin {
    private static double dime = 0.10;
    private static int count = 0;

    public Dime() {
        count++;
        System.out.println("1 dime added for a total of "+ count);
    }
    public Dime(int num){

        count+=num;
        System.out.println(num+" dimes added for a total of "+ count +" dimes in the bank");
    }


    @Override
    public int getContent() {
        return count;
    }
    @Override
    public double getTotal(){
        return count*dime;
    }
    @Override
    public double getValue() {
        return dime;
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
            return count + (count>1?" Dimes":" Dime");
        }
    }
}