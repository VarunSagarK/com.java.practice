public class accessingNonstatic
{
    static int var = 10; // non-static variable
    public static void main(String args[])
    {
        System.out.println("Value of the 'var' is:" + var); //accessing non-static variable from static method
    }
}