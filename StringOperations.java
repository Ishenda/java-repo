public class StringOperations {
    public static void main (String args[]) {

        String str1 = new String("Hello");
        String str2 = "hello";
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals("Hello")); //true
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.startsWith("He")); //true
        System.out.println(str2.endsWith("lo"));//true
        System.out.println (str1.compareTo(str2));//negative value
        System.out.println(str1.compareToIgnoreCase(str2));//0
        System.out.println(str1.indexOf("l")+" and "+str1.indexOf("k")); //2 and -1
        System.out.println("hellooo".lastIndexOf('o'));//6
        System.out.println("unhappy".substring(2) +"  and "+"smiles always".substring(1,6));//happy and miles
        System.out.println("to".concat("get").concat("her")); //together
        System.out.println("mesquite in your cellar".replace("e","o"));//mosquito in your collar
        System.out.println(" Hi! mr.Tobes ".trim());//Hi! mr.Tobes
        System.out.println(String.valueOf(10) +" , "+String.valueOf(3.4343)+" and "+String.valueOf(true));//10 , 3.4343 and true
        System.out.println("hello there".toUpperCase().concat(" and ").concat("HELLOW THERE".toLowerCase()));

        //operation on StringBuffer
        System.out.println("\nResult specific for StringBuffer\n");
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb.length());//11
        System.out.println(sb.capacity());//27 (16 character room is added if no character size is specified)
        System.out.println(sb.charAt(4));//o
        System.out.println(sb.append(" here is").append(" a java programmer"));
        System.out.println(sb.insert(5, "!!!"));
        System.out.println(sb.delete(5, 8));
        System.out.println(sb.replace(12, 37, ""));
        System.out.println(sb.reverse());
    }
}