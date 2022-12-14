import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class z1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> test = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            Random random = new Random();
            int iNumber = random.nextInt(201)-100;
            test.add(iNumber);
        }
        System.out.println(test);

        System.out.println("Максимальный элемент: " + Collections.max(test));

        int c = 0;
        for(Object i : test) if (Collections.max(test)==i) c= test.indexOf(i);

        System.out.println("Индекс последнего макс элемента: " + c);

        Collections.sort(test);
        System.out.println(test);

        test.removeIf(number -> number<0);
        System.out.println(test);
    }
}