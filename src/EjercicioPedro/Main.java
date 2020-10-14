package EjercicioPedro;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Thread hiloDado1 = new Thread(new Tiradas(), "Thread 1");
        Thread hiloDado2 = new Thread(new Tiradas(), "Thread 2");
        Thread hiloDado3 = new Thread(new Tiradas(), "Thread 3");

        hiloDado1.start();
        hiloDado2.start();
        hiloDado3.start();
        hiloDado1.join();
        hiloDado2.join();
        hiloDado3.join();

        hiloDado1.interrupt();
        hiloDado2.interrupt();
        hiloDado3.interrupt();

        Dado.showCounters();

    }


}
