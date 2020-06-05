package piggyBank;

public class Dollar extends Coin {
    private static double dollar = 1;
    private static int count = 0;

    public Dollar() {
        count++;
        System.out.println("$1 added for a total of "+ count);
    }

    public Dollar(int num){
        count+=num;
        System.out.println("$"+num+" added for a total of "+ count);
    }

    @Override
    public int getContent() {
        return count;
    }
    @Override
    public double getTotal(){
        return count*dollar;
    }
    @Override
    public double getValue() {
        return dollar;
    }
    @Override
    public void remove(double num) {
        count-=num;
    }
    @Override
    public String toString() {
        return "$"+count;
    }
}