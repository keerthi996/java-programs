class MethodChainingEx1 {
    public static void main(String[] args) {
        Person p1 = new Person().setName("Chinni").setAge(15).setGender('F');
        System.out.println(p1);
    }
}

class Person {
    private String name;
    private char gender;
    private int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    // Getters and toString() method

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
