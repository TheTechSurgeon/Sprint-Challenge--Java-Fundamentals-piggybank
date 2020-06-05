package piggyBank;

public abstract class Coin {
    public abstract int getContent();
    public abstract double getTotal();
    public abstract double getValue();
    public abstract void remove(double num);

    //checks if the requested remove amount is greater than the existing total
    public double check(double total){
        double ttl=total;

        if(ttl>this.getTotal()){
            ttl-=this.getTotal();
            this.remove(this.getContent());
        }else{
            double removed=ttl/this.getValue();
            ttl-=removed*getValue();
            this.remove(removed);
        }
        return ttl;
    }
}