import java.awt.*;
import java.util.Random;

public class NinjaCat extends Tiger {
    private static int ninjaCount = 0;
    private int ninjaNumber;
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
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
