package dedault;
import java.util.Scanner;
public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter a char");
        char a = S.next().charAt(0);
        System.out.println("Please enter a char");
        char b = S.next().charAt(0);
        System.out.println("Offset is " + (b-a));
    }
}