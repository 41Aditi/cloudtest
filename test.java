package ab;
import java.util.Arrays;
import java.util.Random;
public class test
{
    public static void shuffle(int num[])
    {
        for (int i = num.length - 1; i >= 1; i--)
        {
            Random r = new Random();

            int j = r.nextInt(i + 1);

            swap(num, i, j);
        }
    }
    private static void swap(int[] num, int i, int j) {
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
    }
    public static void main (String[] args)
    {
        int[] num = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original Array: "+Arrays.toString(num));
        shuffle(num);
        System.out.println("Shuffle Array: "+Arrays.toString(num));
    }
}

