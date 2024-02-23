/**
 * Dragon16
 */
public class Dragon16 {

    int x, y, width, height;

    void moveLeft() {
        if (x < 0 || x > width) {
            detectCollision(x, y);
        } else {
            x -= 1;
        }
    }

    void moveRight() {
        if (x < 0 || x > width) {
            detectCollision(x, y);
        } else {
            x += 1;
        }
    }

    void moveUp() {
        if (y < 0 || y > height) {
            detectCollision(x, y);
        } else {
            y -= 1;
        }
    }

    void moveDown() {
        if (y < 0 || y > height) {
            detectCollision(x, y);
        } else {
            y += 1;
        }
    }

    void printPosition() {
        System.out.printf("Anda Berada di X : %d Y : %d", x  , y );
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }
}