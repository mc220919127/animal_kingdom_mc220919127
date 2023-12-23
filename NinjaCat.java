import java.awt.*;

public class NinjaCat extends Tiger {
    private static int ninjaCount = 0;
    private final int ninjaNumber;
    private final Color[] colors = {Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.BLACK};

    public NinjaCat() {
        ninjaCount++;
        ninjaNumber = ninjaCount;
        getRandomCMYKColor();
    }

    @Override
    public String toString() {
        return "N-" + ninjaNumber;
    }

    @Override
    public Color getColor() {
        return getRandomCMYKColor();
    }

    @Override
    public Action getMove(CritterInfo info) {
        return super.getMove(info);
    }


    private Color getRandomCMYKColor() {
        return colors[random.nextInt(colors.length)];
    }
}
