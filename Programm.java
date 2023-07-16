import java.util.Arrays;
import java.util.Scanner;

/**
 * Programm
 */
public class Programm {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in, System.console().charset())) {
            System.out.println("Введите строки через пробел...");
            filterStringsByLength(sc.nextLine().split("\\s"), 3);
        } catch (Exception e) {
            System.out.println("Что-то пошло не так.");
        }
    }

    private static void filterStringsByLength(String[] inArray, int maxLength) {
        int i = 0;
        var outArray = new String[0];
        while (i < inArray.length) {
            if (inArray[i].length() <= maxLength) {
                int oldLength = outArray.length;
                outArray = Arrays.copyOf(outArray, oldLength + 1);
                outArray[oldLength] = inArray[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(outArray));
    }
}
