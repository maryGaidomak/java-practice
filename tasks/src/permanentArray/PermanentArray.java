package permanentArray;
import java.util.Arrays;

public class PermanentArray {
    private int[] array;

    public PermanentArray(int... numbers) {
        this.array = new int[numbers.length];
        System.arraycopy(numbers, 0, this.array, 0, array.length);
    }

    public  PermanentArray(PermanentArray anotherArray) {
        this.array = new int[anotherArray.size()];
        System.arraycopy(anotherArray.toArray(), 0, this.array, 0, array.length);
    }

    public int get(int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс " + index + " вне границ массива!");
        }
        return array[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс " + index + " вне границ массива!");
        }
        array[index] = value;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public int size() {
        return array.length;
    }

    public int[] toArray() {
        return Arrays.copyOf(array, array.length);
    }

    @Override
    public String toString()  {
        String result = "[ ";
        if (!isEmpty()) {
            for (int num : array) {
                result += num + ", ";
            }
            result = result.substring(0, result.length() - 2);
        }
        return result + " ]";
    }

}
