public class implicittc {
    //it is done automatically by the java compiler
    public static void main(String args[])
    {
        //decalare and initialize the variables(note : byte->boolean->char->int->float->long->double we can change only like this)
        byte b=10;
        boolean bo=true;
        char ch = 'a';//note: while we give any charcters except in print anywhere we must use only single quotes
        int i=100;
        float f=100.0f;
        long l=2000;
        double d=200000;

        //implicit casting
        //lets convert int to float(first must be higher that is float then smaller)
        f=i;
        System.out.println("int="+i+" float+"+f);

        //lets convert float to double
        d=f;
        System.out.println("float=" +f+  "double ="+d);

    }
}
