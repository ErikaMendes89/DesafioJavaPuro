public class App {
    public static void main(String[] args) throws Exception {
       GlobalCounter counter = GlobalCounter.getInstance();


       Thread thread1 = new Thread(() ->{
        for (int i=0; i<10; i++){
       counter.increment();
        }
    });

    Thread thread2 = new Thread(() ->{
        for (int i=0; i<10; i++){
       counter.increment();
        }
    });

    thread1.start();
    thread2.start();

    try{
        thread1.join();
        thread2.join();
    }catch(InterruptedException e){
        e.printStackTrace();
    }


       System.out.println("Valor do contador: " + counter.getCount());
    }
}
