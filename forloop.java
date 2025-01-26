public class forloop {
    public static void main(String args[])
    {
        int even_sum =0;
        int odd_sum =0;
        
        for(int i=0;i<=10;i++)
        {
            if(i%2==0){
                even_sum=even_sum+i;

            }else{
               odd_sum=odd_sum+i;
            }
            System.out.println("sum of numbers of even: "+even_sum);
            System.out.println("sum of numbers of odd: "+odd_sum);
        }

    }
}
