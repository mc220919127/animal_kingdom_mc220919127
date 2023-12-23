import java.awt.*;

public class WhiteTiger extends Tiger {
    private boolean isInfected;

    // Constructor
    public WhiteTiger() {
        isInfected = false;
    }

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public String toString() {
        return isInfected ? "TGR" : "tgr";
    }

    @Override
    public Action getMove(CritterInfo info) {

        if (info.getFront() == Neighbor.OTHER) {
            isInfected = true;
            return Action.INFECT;
        }
        return super.getMove(info);
    }
}
