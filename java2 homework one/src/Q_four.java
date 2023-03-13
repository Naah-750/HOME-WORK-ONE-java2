import java.util.Scanner;

public class Q_four
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int X , Y;
        System.out.println("Enter arrays sizes respectively:");
        X=in.nextInt();
        Y=in.nextInt();
        int[] X = new int[X];
        int[] Y = new int[Y];
        boolean check = true;
        System.out.println("Enter array1 elements:");
        for (int i = 0; i < X.length; i++)
        {
            X[i]=in.nextInt();
        }
        System.out.println("Enter array2 elements:");
        for (int i = 0; i < Y.length; i++)
        {
            Y[i]=in.nextInt();
        }
        if (X.length == Y.length)
        {
            for (int i = 0; i < X.length; i++)
            {
                if (X[i]!=Y[i]) check = false;
            }
        }
        else check = false;
        if (check == true)
            System.out.println("The arrays are equal");
        else
            System.out.println("The arrays are not equal");
    }
}