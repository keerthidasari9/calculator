

public class Operation {


    public int a,b;
    public  int calci(int a,int b)
    {
        return 0;
    }
}
class Sum extends Operation
{
    public int calci(int a,int b)
    {
        return a+b;
    }
}
class Difference extends Operation
{
    public int calci(int a,int b)
    {
        return a-b;
    }
}
class Multiplication extends Operation
{
    public int calci(int a,int b)
    {
        return a*b;
    }
}
class Divide extends Operation
{
    public int calci(int a,int b)
    {
        if(b==0)
        {
            return 0;
        }

        return a/b;

    }
}


