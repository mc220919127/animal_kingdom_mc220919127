import java.awt.*;

public class Giant extends Critter {
    private int count = 0;

    // Constructor
    public Giant() {
        // The constructor doesn't need to do anything specific for Color.GRAY since getColor() will always return Color.GRAY
    }
    
    @Override
    public Color getColor() {
        return Color.GRAY;
    }
    
    @Override
    public String toString() {

        if (count < 6) {
            return "fee";
        } else if (count < 12) {
            return "fie";
        } else if (count < 18) {
            return "foe";
        } else {
            return "fum";
        }
    }


    @Override
    public Action getMove(CritterInfo info) {
        count = (count + 1) % 24;
        
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        
        if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}
