public class Sample
{
    private  static int count;
    private static String[] arr={"ThisThis", "is", "an", "example", "of", "text", "justification."};
    public static void main(String[] args)
    {
       while (count< arr.length){
           if (arr[count++].length()<8)
               break;
       }
        System.out.println(count);
    }
}