class A extends Thread{
    public void run(){
        for(int i = 1; i<5;i++){
            System.out.println("Thread A: "+ i);
        }
        System.out.println("exit thread A");
    }

}
class B extends Thread{
    public void run(){
        for(int j=1;j<5;j++){
            System.out.println("Thread B: "+j);
        }
        System.out.println("exit thread B");
    }
}
class C extends Thread{
    public void run(){
        for (int k=1;k<5;k++){
            System.out.println("Thread C; "+k);
        }
        System.out.println("exit thread C");
    }
}

class ThreadTest{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
        b.start();
        c.start();
    }
}