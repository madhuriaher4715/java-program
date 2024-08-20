
import java.util.Scanner;
class Vowels
{
    public static void main(String args[])
    {
        String str;
        Scanner s= new Scanner(System.in);
        System.out.println("enter any string");
        str = s.next();
        System.out.println("vowels in given string are:");
        for( int i = 0; i <= str.length(); i++)
        {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'||  str.charAt(i) == 'u')
            {
                System.out.println(str.charAt(i) + " ");
            }
        }
    }
}