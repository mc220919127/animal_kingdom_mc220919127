import java.awt.*;

public class Bear extends Critter {
    boolean polar;
    boolean isSlash;

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
    public Critter.Action getMove(CritterInfo info) {
        if (info.getFront() == Critter.Neighbor.OTHER) {
            return Critter.Action.INFECT;
        } else if (info.getFront() == Critter.Neighbor.EMPTY) {
            return Critter.Action.HOP;
        } else {
            return Critter.Action.LEFT;
        }
    }
}
