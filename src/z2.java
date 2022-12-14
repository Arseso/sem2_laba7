import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class z2 {
    public static void main(String[] args)
    {
        LinkedList<Double> test = new LinkedList<>();
        for (int i = 0; i < 10; i++)
        {
            Random random = new Random();
            double iNumber = random.nextDouble(201.0)-100.0;
            double scale = Math.pow(10, 3);
            double result = Math.ceil(iNumber * scale) / scale;
            test.add(result);
        }
        System.out.println(test);

        Collections.sort(test);Collections.reverse(test);
        System.out.println(test);

        int c = 0;
        for (double x: test) if (x == 0) c += 1;

        if(c>0) System.out.println("В списке " + c + " нулевых элемента");
        else System.out.println("В списке нет нулевых элементов");

        System.out.println("Первый элемент: "+ test.peekFirst() + " Последний элемент: "+test.peekLast()+
                " Среднее: "+(test.peekFirst()+test.peekLast())/2);

        test.add(Math.round(test.size()/2),(test.peekFirst()+test.peekLast())/2);
        System.out.println(test);
    }
}
