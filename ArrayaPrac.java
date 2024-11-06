import java.util.Arrays;

public class ArrayaPrac {
    public static void main(String[] args){
        String[] fruits = {"mango", "apple","guava","tomato"};
        fruits[0]="kale";
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

    }
}
