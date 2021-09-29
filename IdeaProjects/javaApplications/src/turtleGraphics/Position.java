package turtleGraphics;

import java.util.Objects;

public class Position {
    private int columnPosition;
    private int rowPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public void setColumnPosition(int numberOfSteps){
        columnPosition = numberOfSteps;
    }

    public void setRowPosition(int numberOfSteps) {
        rowPosition = numberOfSteps;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(columnPosition, rowPosition);
//    }

    public boolean equals(Object anotherPosition){
        if (anotherPosition == null) return false;
        if (!anotherPosition.getClass().isInstance(this)) return false;
        Position comparedPosition = (Position) anotherPosition;
        boolean columnAreEqual = columnPosition == comparedPosition.columnPosition;
        boolean rowAreEqual = rowPosition == comparedPosition.rowPosition;
        return columnAreEqual & rowAreEqual;
        //if(columnPosition == comparedPosition.columnPosition && rowPosition == comparedPosition.rowPosition) return true;
    }

    @Override
    public String toString() {
        return "Position{" +
                " rowPosition = " + rowPosition +
                ", columnPosition = " + columnPosition +

                '}';
    }
}
