import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args)
    {
        HashSet<String> test = new HashSet<>();
        HashSet<String> sen = new HashSet<>(
                Arrays.asList("collection", "represents", "group", "of", "objects"));
        try
        {
            Scanner sc = new Scanner(new File("src/test.txt"));
            String[] words = sc.nextLine().split((", |\\. | "));
            sc.close();

            for (String word : words) {
                test.add(word.toLowerCase());
            }

            System.out.println("���������� ���� � ������: "+ words.length
                    + " ������ ���������: "+ test.size() + " �������: " + (words.length-test.size()) );

            HashSet<String> intersection = new HashSet<>(test);
            intersection.retainAll(sen);
            if(intersection.size() == sen.size()){ System.out.println("�� ���� ��������� ����� ��������� �������� �����������"); }
            else { System.out.println("���������� ��������� �������� ����������� �� ���� ���������"); }
        }
        catch (FileNotFoundException e) { System.out.println("���� �� ������"); }
    }
}
