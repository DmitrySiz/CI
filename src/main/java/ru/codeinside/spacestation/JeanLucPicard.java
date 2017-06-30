package ru.codeinside.spacestation;

public class JeanLucPicard implements Captain {

    private final Spaceship spaceship;

    public JeanLucPicard(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    @Override
    public int stateroomsNumber() {

/*        int countSteps = 1;
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
        return countSteps;*/
        int count = 0;
        Room first = spaceship.current();
        if (first.isLightOn() == false) {
            first.turnOn();
        }
        boolean isFounded = false;
        while (!isFounded) {
            count++;
            for (int forwardStep = 0; forwardStep < count; forwardStep++) {
                spaceship.next();
            }
            if (spaceship.current().isLightOn() == true) {
                spaceship.current().turnOff();
            }
            for (int backStep = 0; backStep < count; backStep++) {
                spaceship.previous();
            }
            if (spaceship.current().isLightOn() == false) {
                isFounded = true;
            }
        }

        return count;
    }


}

