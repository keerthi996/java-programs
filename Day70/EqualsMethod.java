// program to illustrate equals method in Object class
class EqualsMethod{
    public static void main(String[] args) {
        Duck d1 = new Duck();
        d1.age = 15;
        d1.weight = 120.25;
        Duck d2 = new Duck();
        d2.age = 15;
        d2.weight=120.25;
        Duck2 d3 = new Duck2();
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3)); 
    }
}
class Duck extends Object{
    int age;
    double weight;
    void sound(){
        System.out.println("Quak Quak");
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(this.getClass() != obj.getClass())
            return false;
        Duck duck = (Duck) obj;
        return age == duck.age && Double.compare(duck.weight,weight)==0;
    }
}
class Duck2 {
    int age;
    int weight;
    void sound(){
        System.out.println("Quak Quak");
    }
}