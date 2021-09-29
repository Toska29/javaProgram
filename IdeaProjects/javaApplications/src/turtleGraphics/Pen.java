package turtleGraphics;

import static turtleGraphics.PenPosition.UP;

public class Pen {
    private PenPosition penPosition = UP;
    public PenPosition getPosition() {
        return penPosition;
    }

    public void setPositionTo(PenPosition currentPosition) {
        penPosition = currentPosition;
    }
}
