public class Operators {
    public static void main (String[] args) {
        int a=4, b=12, c= 4, d=2;
        
        //preferences of operators
        int n1= a+ b*c +d; //54
        int n2=a+ b*(c+d); //76
        int n3= b/a * c/d; //6
        int n4= b/a + c/d; //5
        int n5 = -a+15%c-d;//-3
        int n6= (a++ - -b) / 2*c;//32
        int n7= 2*++b;//26

        System.out.println("\nn1= "+n1);
        System.out.println("n2= "+n2);
        System.out.println("n3= "+n3);
        System.out.println("n4= "+n4);
        System.out.println("n5= "+n5);
        System.out.println("n6= "+n6);
        System.out.println("n7= "+n7);
    }
}