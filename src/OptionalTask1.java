import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class OptionalTask1 { //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) throws IOException {
        String command;
        int max;
        int min;     // вводить с консоли
        boolean i = true;
        ArrayList<Integer> array_number = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("Enter the number or stop: ");
        while (i) {
           command = br.readLine();
           if (!command.equals("stop")) {
               System.out.print("Enter the number or stop: ");
               a = Integer.parseInt(command);
               array_number.add(a);
           }
            else {
                i = false;
           }
        }
        Collections.sort(array_number);
        if (array_number.get(0).equals(array_number.get(array_number.size()-1))) {
            min = array_number.get(0);
            max = array_number.get(array_number.size() - 1);
            System.out.println("min: " + min);

            for (int j = 1; j < array_number.size(); j++) {
                if (min == array_number.get(j + 1)) {
                    min = array_number.get(j);
                    System.out.println("min: " + min);
                }
            }

            System.out.println("max: " + max);
            for (int k = array_number.size()-1; k >= 0 ; k--){
                if (max == array_number.get(k)) {
                    System.out.print("max: " + " ");
                }
            }
        }
        else {
            System.out.println("min = max = " + array_number.get(0));
        }

    }
}
