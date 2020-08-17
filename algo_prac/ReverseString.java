public class ReverseString
{
    public static void main(String args[])
    {
        String str1= "Varun Sagar";
        String rev_str2 = "";
        for(int i = str1.length()-1; i>=0; i--)
        {
            rev_str2 = rev_str2 + str1.charAt(i);
        }
        System.out.println("Reversed string for "+ str1+ " is: " +rev_str2);
    }
}