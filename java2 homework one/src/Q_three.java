public class Q_three
{
    public static void main(String[] args)
    {
        int[] X = {1 , 2 , 3 };
        int[] Y = {4 , 5};
        int[] Z = new int[5];
        System.arraycopy(X, 0, Z, 0, X.length);
        System.arraycopy(Y, 0,Z,3,Y.length);
        for (int i : Z)
        {
            System.out.println(i);
        }
    }
}