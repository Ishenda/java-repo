public class Basics {

    public static void main(String args[]) {
       System.out.println("\nMaximum int value= "+Integer.MAX_VALUE);
       System.out.println("Minimum int value= "+Integer.MIN_VALUE);

       int a=28 ,b=-10;
       System.out.println("\na/b= "+(a/b));
       System.out.println("a%b= "+(a%b));

       float myNum=79.9f;  double myNum2=79.9;
       System.out.println("\nnumber1= "+myNum+"\nnumber2= "+myNum2);
       System.out.println("Their sum= "+(myNum+myNum2));

    //character operations 
    char z = 'a'+25;
    System.out.println("\n"+Character.getNumericValue(z));
    }
}