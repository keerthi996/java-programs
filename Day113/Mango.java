final class Mango implements Fruits{
    private int quantity;
    private double cost;
    Mango(int quantity,double cost){
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