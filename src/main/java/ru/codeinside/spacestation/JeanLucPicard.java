package ru.codeinside.spacestation;

public class JeanLucPicard implements Captain {

    private final Spaceship spaceship;

    public JeanLucPicard(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    @Override
    public int stateroomsNumber() {

        int countSteps = 1;
        boolean isFounded = false;
        Room first = spaceship.current();
        if (first.isLightOn() == false) {
            first.turnOn();
        }

        while (isFounded) {

            for (int stepForward = 0; stepForward < countSteps; ++stepForward) {
                spaceship.next();
                countSteps++;
            }

            if (spaceship.current().isLightOn()) {
                spaceship.current().turnOff();
                for (int stepPrevious = 0; stepPrevious < countSteps; stepPrevious++) {
                    spaceship.previous();
                }
                if (!spaceship.current().isLightOn()) {
                    isFounded = true;
                }
            } else {
                spaceship.next();
                countSteps++;
            }
        }
        return countSteps;


/*        for (int i = 0; i <= count; i++) {
            spaceship.next();
            count++;
            System.out.println("ШАГ ВПЕРЕД " + count);
            Room next = spaceship.current();
            if (next.isLightOn() == true) {
                next.turnOff();
                System.out.println("ВЫКЛЮЧИЛИ СВЕТ");
                for (int j = 0; j < count; j++) {
                    spaceship.previous();
                    System.out.println("ШАГ НАЗАД " + count);
                }
                Room previous = spaceship.current();
                if (previous.isLightOn() == false) {
                    System.out.println("КОНЕЦ");
                    break;
                }

            }

        }*/

    }


}

