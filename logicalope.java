public class logicalope {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        System.out.println("and:"+(a&b));
        System.out.println("oR:"+(a|b));
        System.out.println("xor:"+(a^b));//if both the input is same then true if different it becomes false
        System.out.println("not:"+(!a));
        System.out.println("shorthand and:"+(a&&b));//same like and but it is short hand and(a=a&a&b)
        System.out.println("shorthand or:"+(a||b));//same like and but it is short hand or(a=a|a|b)
        System.out.println((a&b)|(a&!b));

    }
    
}
