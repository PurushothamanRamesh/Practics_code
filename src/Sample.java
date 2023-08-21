public class Sample
{
    static int i;
    public static void main(String[] args)
    {
        System.out.println(i);//CE
        Sample t=new Sample();
        System.out.println(t.i);
        t.methodOne();
    }
    public void methodOne()
    {
        System.out.println(i);
    }
}