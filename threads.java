
class a implements Runnable {
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(90);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class b implements Runnable{
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(90);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class threads{
    public static void main(String[] args) {
        Runnable a = new a();
        Runnable b = new b();
        Thread t = new Thread(a);
        Thread t1 = new Thread(b);

        t.start();
        t1.start();
    }
}