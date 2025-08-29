package Multithreading.UsingThreadClass;

public class A extends Thread{

    public void run(){
        for(int i=0; i<100;i++){
            System.out.println("Hiiiii");
        }
    }
    public static void main(String[] args) {
        A o1 = new A();
        B o2 = new B();
        o1.start();
        o2.start();
    }
}
