import static java.util.Arrays.sort;

public class OptionalTask1 { //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) {
        int max;
        int min;
        int [] array_number = {22333, 1233, 12323434, 1, 21, 344, 323567};
        sort(array_number);

        for (int i = 0; i<array_number.length; i++) {
            System.out.print(array_number[i] + " ");
        }
    }

}
