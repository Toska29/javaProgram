package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

class TurtleTest {
    Turtle turtle;
    Pen pen;

    @BeforeEach
    public void startTestWithThis(){
        turtle = new Turtle();
        pen = turtle.getPen();
    }

    @Test
    void testThatTurtleHasAPen(){
        //given
        Turtle turtle = new Turtle();
        //when
        Pen pen = turtle.getPen();
        //assert
        assertNotNull(pen);
    }

    @Test
    public void testThatPenIsUpByDefault(){
        //given
        Turtle turtle = new Turtle();
        //when
        Pen pen = turtle.getPen();
        //assert
        assertSame(PenPosition.UP, pen.getPosition());

    }

    @Test
    public void testThatTurtleCanTurnPenDown(){
        //given
        Turtle turtle = new Turtle();
        Pen pen = turtle.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
        //when
        turtle.penDown();
        //assert
        assertSame(PenPosition.DOWN, turtle.getPen().getPosition());
    }

    @Test
    public void testThatTurtleCanTurnPenUp(){
        //given
        Turtle turtle = new Turtle();
        Pen pen = turtle.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
        turtle.penDown();
        assertSame(PenPosition.DOWN, turtle.getPen().getPosition());
        //when
        turtle.penUp();
        //assert
        assertSame(PenPosition.UP, turtle.getPen().getPosition());
    }

    @Test
    @DisplayName("Turtle can turn right while facing east test")
    public void testThatTurtleCanTurnRight1(){
        //given
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing south test")
    public void testThatTurtleCanTurnRight2(){
        //given
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing west test")
    public void testThatTurtleCanTurnRight3(){
        //given
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing NORTH test")
    public void testThatTurtleCanTurnRight4(){
        //given
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        assertSame(EAST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing east test")
    public void testThatTurtleCanTurnLeft1(){
        assertSame(EAST, turtle.getCurrentDirection());
        //when
        turtle.turnLeft();
        //assert
        assertSame(NORTH, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing north test")
    public void testThatTurtleCanTurnLeft2(){
        //given
        turtle.turnLeft();
        //when
        turtle.turnLeft();
        //assert
        assertSame(WEST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing WEST test")
    public void testThatTurtleCanTurnLeft3(){
        //given
        turtle.turnLeft();
        turtle.turnLeft();
        //when
        turtle.turnLeft();
        //assert
        assertSame(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing south test")
    public void testThatTurtleCanTurnLeft4(){
        //given
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        //when
        turtle.turnLeft();
        //assert
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingEast(){
        //given
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        //when
        turtle.moveForward(5);
        //assert
       assertEquals(new Position(0,5), turtle.getCurrentPosition());

    }
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingSouth(){
        //given
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        //when
        turtle.moveForward(5);
        //assert
        assertEquals(new Position(5,0), turtle.getCurrentPosition());

    }

    @Test
    public void testThatTurtleCanMoveForwardWhileFacingWest(){
        //given
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        //when
        turtle.moveForward(5);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
    }
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingNorth(){
        //given
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        //when
        turtle.moveForward(5);
        assertEquals(new Position(5,0), turtle.getCurrentPosition());

    }

    @Test
    public void turtleCanWriteOnSketchpadWhileFacingEastTest(){
        //given
        turtle.penDown();
        assertSame(EAST, turtle.getCurrentDirection());
        SketchPad sketchpad = new SketchPad(5,5);
        //when
        turtle.writeOn(sketchpad, 4);
        //assert
        int[][] floor = sketchpad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(0, sketchpad.getFloor()[0][4]);
        sketchpad.displayFloor();
    }
    public void turtleCanWriteOnSketchpadWhileFacingNorthWhenPenUpThenPenDownTest(){
        //given
        turtle.penDown();
        assertSame(EAST, turtle.getCurrentDirection());
        System.out.println(turtle.getCurrentPosition());
        SketchPad sketchPad = new SketchPad(5,5);
        turtle.writeOn(sketchPad, 4);
        sketchPad.displayFloor();
        System.out.println(turtle.getCurrentPosition());
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
        //when
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.writeOn(sketchPad,4);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[1][3]);
        assertEquals(1, floor[2][3]);
        assertEquals(1, floor[3][3]);
        assertEquals(0, floor[4][3]);
        sketchPad.displayFloor();
    }

    @Test
    public void turtleCanWriteOnSketchpadWhileFacingSouthTest(){
        //given
        turtle.penDown();
        assertSame(EAST, turtle.getCurrentDirection());
        System.out.println(turtle.getCurrentPosition());
        SketchPad sketchPad = new SketchPad(5,5);
        turtle.writeOn(sketchPad, 4);
        sketchPad.displayFloor();
        System.out.println(turtle.getCurrentPosition());
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
        //when
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.writeOn(sketchPad,4);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[1][3]);
        assertEquals(1, floor[2][3]);
        assertEquals(1, floor[3][3]);
        assertEquals(0, floor[4][3]);
        sketchPad.displayFloor();
    }

    @Test
    public void turtleCanWriteOnSketchpadWhileFacingWestTest(){
        //given
        turtle.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        turtle.writeOn(sketchPad, 4);
        turtle.turnRight();
        turtle.writeOn(sketchPad,4);
        assertSame(SOUTH, turtle.getCurrentDirection());
        assertEquals(new Position(4,4), turtle.getCurrentPosition());
        //when
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.writeOn(sketchPad, 4);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[3][3]);
        assertEquals(1, floor[3][2]);
        assertEquals(1, floor[3][1]);
        assertEquals(1, floor[3][0]);
        sketchPad.displayFloor();
    }

    @Test
    public void turtleCanWriteOnSketchpadWhileFacingNorthTest(){
        //given
        turtle.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        turtle.writeOn(sketchPad, 4);
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.writeOn(sketchPad, 4);
        assertEquals(new Position(4,4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.writeOn(sketchPad,4);
        assertEquals(new Position(4, 0), turtle.getCurrentPosition());
        //when
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
        turtle.writeOn(sketchPad, 4);
        System.out.println(turtle.getCurrentPosition());
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        sketchPad.displayFloor();

    }
}