
import java.util.Scanner;
    /**
     * Hello world!
     *
     */
    public class App
    {

        public static void main( String[] args )
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("\nEnter an operation (+, -, *, /): ");
            char opa = sc.next().charAt(0);
            System.out.println("enter first number");
            int a=sc.nextInt();
            System.out.println("enter second number");
            int b=sc.nextInt();
            int result=0;
            // operation opr=new operation();
            //System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
            if(opa=='+')
            {
                Sum s=new Sum();
                result=s.calci(a,b);
                System.out.println(result);

            }
            else if(opa=='-')
            {
                Difference d=new Difference();
                result=d.calci(a,b);
                System.out.println(result);
            }
            else if(opa=='*')
            {
                Multiplication mu=new Multiplication();
                result=mu.calci(a,b);
                System.out.println(result);
            }
            else if(opa=='/')
            {
                Divide div=new Divide();
                result=div.calci(a,b);
                System.out.println(result);
            }
            else
            {
                System.out.println("enter valid operation");
            }

        }
    }


