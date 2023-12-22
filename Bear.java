import java.awt.*;

public class Bear extends Critter{
    boolean polar;
    boolean isSlash;

    //Constructor
    public Bear(boolean polar) {
        this.polar = polar;
        this.isSlash = true;
    }

    @Override
    public Color getColor() {
        return polar ? Color.WHITE : Color.BLACK;
    }


    @Override
    public String toString() {
        isSlash = !isSlash;
        return isSlash ? "/" : "\\";
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }
        else {
            return Action.LEFT;
        }
    }
}
