package piggyBank;

public class Quarter extends Coin {
    private static double quarter = 0.25;
    private static int count = 0;

    public Quarter() {
        count++;
        System.out.println("$.25 added for a total of "+ count);
    }
    public Quarter(int num){
        count+=num;
        System.out.println(num+" quarters added for a total of "+ count +" quarters in the bank");
    }


    @Override
    public int getContent() {
        return count;
    }
    @Override
    public double getTotal(){
        return count*quarter;
    }
    @Override
    public double getValue() {
        return quarter;
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
            return count + (count>1?" Quarters":" Quarter");
    }
}
}