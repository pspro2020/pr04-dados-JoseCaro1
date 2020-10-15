package EjercicioPedro;

import java.util.Random;

public class Dado {
    private  int dado1 = 0;
    private  int dado2 = 0;
    private  int dado3 = 0;
    private  int dado4 = 0;
    private  int dado5 = 0;
    private  int dado6 = 0;

     Dado() {

    }

    protected int lanzarDado() {
        Random random = new Random();

        return random.nextInt(6) + 1;


    }

    protected synchronized void aumentarContador(int num) {
        if (num == 1) {
            dado1++;
        } else if (num == 2) {
            dado2++;
        } else if (num == 3) {
            dado3++;
        } else if (num == 4) {
            dado4++;
        } else if (num == 5) {
            dado5++;
        } else if (num == 6){
            dado6++;
        }
    }

    public void showCounters(){
        double total=dado1+dado2+dado3+dado4+dado5+dado6;
        System.out.printf("Número 1: %d veces\n" +
                "Número 2: %d veces\n" +
                "Número 3: %d veces\n" +
                "Número 4: %d veces\n" +
                "Número 5: %d veces\n" +
                "Número 6: %d veces\n" +
                "Total de veces: %d + %d + %d + %d + %d + %d = %.0f",dado1,dado2,dado3,dado4,dado5,dado6,dado1,dado2,dado3,dado4,dado5,dado6,total);
    }
}
