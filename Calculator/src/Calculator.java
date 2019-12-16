public class Calculator
{
    public static void main ( String[] args)
    {
        int x=5,y=2;
        char c='-';
        System.out.println("citeste primul numar x="+x);

        System.out.println("citeste al doilea numar y="+y);

        System.out.println("operatia c="+c);

        switch(c)
        {
            case '+' : System.out.println("x+y="+(x+y));
                break;
            case '-' : System.out.println("x-y="+(x-y));
                break;
            case '*' : System.out.println("x*y="+ (x*y));
                break;
            case '/' : System.out.println("x/y="+(x/y));
                break;
            case '%' : System.out.println("x%y="+(x%y));
                break;
            default: System.out.println(c+" operator invalid");
        }
    }
}