import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    private final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
    private Color currentColor;
    int count = 0;
    Random random = new Random();

    public Tiger() {
        chooseRandomColor();
    }

    @Override
    public Color getColor() {
        if (count % 3 == 0) {
            chooseRandomColor();
        }
        return currentColor;
    }

    @Override
    public String toString() {
        return "TGR";
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }

        if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        }

        if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }

        return Action.HOP;
    }

    private void chooseRandomColor() {
        currentColor = colors[random.nextInt(colors.length)];
    }
}
