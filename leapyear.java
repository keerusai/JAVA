import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapyear {
    public static void main(String args[]) throws IOException{
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //to get leap year
        System.out.println("Enter the year:");
        int year=Integer.parseInt(br.readLine());
        //logic
        if((year%400==0)||((year%4==0)&&(year %100 !=0)))
        System.out.println("year"+year+"is a leap year");
        else{
            System.out.println("year"+year+"is not a leap year");
        }
 
        
    }

}
}
