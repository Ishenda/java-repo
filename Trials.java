public class Trials {
    public double myMethod(int number) {
        return Math.sqrt(number);
    }
    public static void main (String[] args) {
        int num ='a';
        char num2 =97;
        int numb3 = (int) 89.789;
        float numb4 = (float) 6.7;
        System.out.println(num);
        System.out.println(num2);
        System.out.println(numb3);
        System.out.println(numb4+"\n");

    for (int i=0; i<10; i++){
        if (i==5) break;
        System.out.println("Rule#"+i);
    }   

    //nested for loop
    for (int i=0; i<3; i++) {
        for (int j=2;j<4;j++) {
            System.out.println(i+"  "+j);
        }
    } 
    System.out.println("\n");

    Trials obj = new Trials();
    System.out.println(obj.myMethod(16));
    }
}

