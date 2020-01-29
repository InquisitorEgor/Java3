package firstTask;


import java.util.ArrayList;
import java.util.Arrays;

@FunctionalInterface
interface Addition {
    int calculate(int x, int y);
}

@FunctionalInterface
interface Subtraction {
    int calculate(int x, int y);
}

@FunctionalInterface
interface Multiplication {
    int calculate(int x, int y);
}

@FunctionalInterface
interface Division {
    int calculate(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = {1, 2};
        Double[] doubleArr = {3.2, 4.5};
        String[] stringArr = {"Hi", "Jon"};
        swap(intArr);
        swap(doubleArr);
        swap(stringArr);
        ArrayList<Integer> arrayList1 = toArrayList(intArr);
        ArrayList<Double> arrayList2 = toArrayList(doubleArr);
        ArrayList<String> arrayList3 = toArrayList(stringArr);


        Addition addition = ((x, y) -> x + y);
        Subtraction subtraction = ((x, y) -> x - y);
        Division division = ((x, y) -> x / y);
        Multiplication multiplication = ((x, y) -> x * y);

        System.out.println(addition.calculate(4, 5));
        System.out.println(subtraction.calculate(4, 5));
        System.out.println(division.calculate(4, 5));
        System.out.println(multiplication.calculate(4, 5));

    }

    private static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }


    private static <T> void swap(T[] arr) {
        T temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}

