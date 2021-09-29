package turtleGraphics;

import static turtleGraphics.Direction.*;
import static turtleGraphics.PenPosition.DOWN;
import static turtleGraphics.PenPosition.UP;

public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);


    public Pen getPen() {
        return pen;
    }

    public void penDown() {
      pen.setPositionTo(DOWN);
    }

    public void penUp() {
        pen.setPositionTo(UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch(currentDirection){
            case NORTH: changeCurrentDirectionTo(EAST);
                break;
            case WEST:
                changeCurrentDirectionTo(NORTH);
                break;
            case SOUTH:
                changeCurrentDirectionTo(WEST);
                break;
            case EAST:
                changeCurrentDirectionTo(SOUTH);
                break;
        }

    }

    private void changeCurrentDirectionTo(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void turnLeft() {
        switch(currentDirection){
            case SOUTH: changeCurrentDirectionTo(EAST);
            break;
            case WEST:
                changeCurrentDirectionTo(SOUTH);
                break;
            case NORTH:
                changeCurrentDirectionTo(WEST);
                break;
            case EAST:
                changeCurrentDirectionTo(NORTH);
                break;
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int numberOfSteps) {
        if (currentDirection == EAST) {
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps);
        }
        if(currentDirection == SOUTH){
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps);
        }
        if(currentDirection == WEST){
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() - numberOfSteps);
        }
        if(currentDirection == NORTH){
            currentPosition.setRowPosition(currentPosition.getRowPosition() - numberOfSteps);
        }
    }
    private void increaseColumnPositionBy(int numberOfStep){
        this.currentPosition.setColumnPosition(numberOfStep);
    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps) { //uses a relationship

        if (this.pen.getPosition() == PenPosition.DOWN){
            if(this.currentDirection == EAST){
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                int[][] floor = sketchPad.getFloor();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition][columnPosition+i] = 1;
                }
            }

            if(this.currentDirection == SOUTH){
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                int[][] floor = sketchPad.getFloor();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition+i][columnPosition-1] = 1;
                }
            }
            if(this.currentDirection == WEST){
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition() - 1;
                int[][] floor = sketchPad.getFloor();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition-1][columnPosition-i] = 1;
                }
                //currentPosition.setColumnPosition(currentPosition.getColumnPosition() - (numberOfSteps * 2));
            }
            if(this.currentDirection == NORTH){
                int rowPosition = currentPosition.getRowPosition()-1;
                int columnPosition = currentPosition.getColumnPosition();
                int[][] floor = sketchPad.getFloor();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition-i][columnPosition] = 1;
                }
                //currentPosition.setRowPosition(currentPosition.getRowPosition() - (numberOfSteps * 2));
            }

        }
        moveForward(numberOfSteps);
    }
}
