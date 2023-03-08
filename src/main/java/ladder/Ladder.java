package ladder;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private final int space;
    private final int height;
    private final List<Line> lines;

    public Ladder(int space, int height) {
        this.space = space;
        this.height = height;
        this.lines = new ArrayList<>();
        this.makeRandomLadder();
    }

    private void makeRandomLadder() {
        for (int i = 0; i < height; i++) {
            lines.add(new Line(space));
        }
    }

    public void drawLadder() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            builder.append(" ".repeat(2));
            lines.get(i).drawLine(builder);
            builder.append(System.lineSeparator());
        }
        System.out.println(builder);
    }
}
