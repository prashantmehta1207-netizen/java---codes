class Prime
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int count = 0, num = 2;

        while(count < n)
        {
            int i;
            
            for(i = 2; i <= num / 2; i++)
            {
                if(num % i == 0)
                    break;
            }

            if(i > num / 2)
            {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}
