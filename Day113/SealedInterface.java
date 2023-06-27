class SealedInterface{
    public static void main(String[] args){
        Mango m=new Mango(10,459.98);
        if(m instanceof Fruits){
            System.out.println(m.getCost());
        }

    }
}
