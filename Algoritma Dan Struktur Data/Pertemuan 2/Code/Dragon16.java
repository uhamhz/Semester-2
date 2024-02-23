/**
 * Dragon16
 */
public class Dragon16 {

    int x, y, width, height;

    void moveLeft() {
        x -= 1;
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x += 1;
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y += 1;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.printf("Anda Berada di X : %d Y : %d\n", x  , y );
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }
}