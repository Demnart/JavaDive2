package SeabattleOOP;

import java.util.Random;

/**
 * Created by Артем on 14.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Random random = new Random();
        int shipRandomCoordinate;
        int shipRandomCoordinate1;
        field.initArr();

        shipRandomCoordinate = random.nextInt(10);
        Ship ship = new Ship(shipRandomCoordinate);
        field.setShip(ship);
        do {
            shipRandomCoordinate1 = random.nextInt(10);
            Ship ship1 = new Ship(shipRandomCoordinate1);
            field.setShip(ship1);
        } while (shipRandomCoordinate == shipRandomCoordinate1);

        System.out.println("Игра началась");

        do {
            field.show();
            int s = player.getShoot();
            field.doShoot(s);

        } while (field.isNotGameOver());
    }
}
