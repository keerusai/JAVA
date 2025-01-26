public class Explicittc {
    public static void main(String args[])
    {
        byte b=10;
        char ch ='a';
        int i=100;
        long l=10000;
        float f= 10.0f;
        //explicit variables(note:which we are changing must be at the first)
        //change float to int
        i=(int)f;
        System.out.println("int  " +i+  "float   "+f);
    }
}
