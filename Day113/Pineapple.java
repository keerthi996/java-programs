final class Pineapple implements Fruits{
    private int quantity;
    private double cost;
    Pineapple(int quantity,double cost){
        this.cost=cost;
        this.quantity=quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }
    
}