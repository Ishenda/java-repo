//The program demonstrates charAt(),length() and getChars() methods
public class Strings {
    public static void main (String[] args) {
       String str = "Hellow there";
        
       char charArray[] = new char[5];
       String output = "str: "+str;
       output +="\nThe length of str: "+str.length();
       output +="\nThe reversed string is: ";
       //printing the string in reverse order using for loop
       for (int count =str.length()-1; count>=0; count--) {
        output +=str.charAt(count);
       }
       System.out.println(output);

       //opearation of getChars()
       String str2 = new String ("Welcome to CoICT");
       char str3[] = new char[7];
      
      try {
         str2.getChars(2,9,str3,0);
         //System.out.println ("\nThe copied string is: " + new String(str3));  //print lcome t
         System.out.print("\nThe copied string is:");
         System.out.println(str3);   //print lcome t
      }
      catch (Exception ex) {
        System.out.println("Something went wrong: "+ex);
      }
      finally {
        System.out.println ("\nProgramming makes hacking life easy (0 ^ 0)");
      }
    }

}