package EjercicioPedro;

public class Tiradas implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Dado.aumentarContador(Dado.lanzarDado());
        }



    }
}
