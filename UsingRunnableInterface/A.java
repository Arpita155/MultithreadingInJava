package Multithreading.UsingRunnableInterface;

public class A implements Runnable{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(i);
            try {
                Thread.sleep(1);
            }catch (Exception e){
                System.out.println("Now it can handle everything");
            }
        }
    }

    public static void main(String[] args) {
        Thread o1 = new Thread(new A());
        o1.start();
        Thread o2 = new Thread(new B());
        o2.start();
    }
}
