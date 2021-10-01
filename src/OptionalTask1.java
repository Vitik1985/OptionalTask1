import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class OptionalTask1 { //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину. При условии: без повторов чисел
    public static void main(String[] args) throws IOException {
        String command;
        int max, number_max;
        int min, number_min;     // вводить с консоли
        boolean i = true;
        ArrayList<String> array_number = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("Enter the number or stop: ");
        while (i) {
            command = br.readLine();
            if (!command.equals("stop")) {
                System.out.print("Enter the number or stop: ");
                array_number.add(command);
            } else {
                i = false;
            }
        }
        max = array_number.get(0).length();
        min = array_number.get(0).length();
        number_min = Integer.parseInt(array_number.get(0));
        number_max = Integer.parseInt(array_number.get(0));

        for(int j = 0; j < array_number.size(); j++) {
            if (min > array_number.get(j).length()) {
                min = array_number.get(j).length();
                number_min = Integer.parseInt(array_number.get(j));
            }
            if (max < array_number.get(j).length()) {
                max = array_number.get(j).length();
                number_max = Integer.parseInt(array_number.get(j));
            }

        }
        System.out.println("Максимальная длинна числа: " + max + " , максимальное число: " + number_max);
        System.out.println("Минимальная длинна числа: " + min + " , минимальное число: " + number_min);
    }
}
