import java.util.Scanner;

public class Q_one
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] X = new int[5];
        System.out.println("Enter 5 elements: ");
        for (int i = 0; i < X.length; i++)
        {
            X[i]=in.nextInt();
        }
        for (int j : X)
        {
            System.out.println(j);
        }
    }
}