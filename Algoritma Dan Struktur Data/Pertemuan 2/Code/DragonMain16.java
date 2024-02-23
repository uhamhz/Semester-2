public class DragonMain16 {
    public static void main(String[] args) {
        Dragon16 player = new Dragon16();
        player.x = 2;
        player.y = 3;
        player.width = 3;
        player.height = 3;
        player.printPosition();
        player.moveDown();
        player.printPosition();
    }
}
