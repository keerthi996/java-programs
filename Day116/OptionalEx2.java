import java.util.Optional;

class OptionalEx2{
    public static void main(String[] args){
        Optional<String> optionalValue = Optional.empty();

        //Using orElse() method

        String value = optionalValue.orElse("Default Value");
        System.out.println("Value: " + value);

        //using ifPresent() method
        Optional<String> optionalStr = Optional.of("Hello");
        
        //using map() function
        Optional<Integer> lengthOptional = optionalStr.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length: " + length));






    }
}