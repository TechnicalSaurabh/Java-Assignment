public class Pattern_7 {
    public static void main(String[] args)
    {
        int n = 6;
        for (int i = 0; i  <  n; i++)
        {
            for (int j = n - 1; j  >  i; j--)
            {
                System.out.print(" ");
            }
            if (i == 0 || i == n - 1)
            {
                for (int k = 0; k  <= i; k++)
                {
                    System.out.print("* ");
                }
            } else
            {
                System.out.print("*");
                for (int k = 1; k  <  i; k++)
                {
                    System.out.print("  ");
                }
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
