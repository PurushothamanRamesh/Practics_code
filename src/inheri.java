class parent{
    public void run(){
        System.out.println("parent");
    }
}
class child extends parent{
    public void run() {
        System.out.println("child");
    }
    public void sta(){
        System.out.println("start");
    }
}
public class inheri {
    public static void main(String[] args) {
        parent p=new child();
        p.run();
      //  p.sta();

    }

}
