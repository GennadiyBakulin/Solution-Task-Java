import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MinMaxInArray {
    public static void main(String[] args) {

        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 600) - 300;
        }
        System.out.println("Original array = : " + Arrays.toString(array));


        List<Integer> intArr = Arrays.asList(array);
        int indxMax = IntStream.range(0, intArr.size())
                .reduce((a, b) -> intArr.get(a) < intArr.get(b) ? b : a).getAsInt();
        int indxMin = IntStream.range(0, intArr.size())
                .reduce((a, b) -> intArr.get(a) > intArr.get(b) ? b : a).getAsInt();
        System.out.println("max element: " + array[indxMax]);
        System.out.println("min element: " + array[indxMin]);


        array[indxMax] = array[indxMin];
        System.out.println("Final array: " + Arrays.toString(array));

    }

}
