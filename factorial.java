import java.util.Scanner;
public class factorial {
        public static void main(String[] args) {
            int num,fact=1;
            Scanner sc=new Scanner(System.in);
            //to read integer
            System.out.println("Enter the num");
            num=sc.nextInt();
            //logic
            while(num>0){
                fact=num*fact;
                num--;
            }
            System.out.println("the factorial is:"+fact);
        }
}
    

