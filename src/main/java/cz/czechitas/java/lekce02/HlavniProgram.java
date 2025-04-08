package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        //TODO tady bude kód

        zofka.turnLeft(90);
        nakresliDomecek();
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(100);
        nakresliNozicky();
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(90);
        nakresliNozicky();
        zofka.turnRight(45);
    }

    public void nakresliDomecek() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }

        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    public void nakresliNozicky() {
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(30);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(30);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(30);
    }
}
