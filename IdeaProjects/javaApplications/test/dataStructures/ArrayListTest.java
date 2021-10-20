package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    List myArrayList;
    @BeforeEach
    public void startEachTestWith(){
        myArrayList = new ArrayList();
    }
    @Test
    public void arrayListCanBeCreated(){
        List myArrayList = new ArrayList();
        assertNotNull(myArrayList);
    }

    @Test
    public void newArrayListIsEmptyTest(){
        List myArrayList = new ArrayList();
        assertTrue(myArrayList.isEmpty());
    }

    public void addElement_ArrayListShouldNotBeEmpty(){
        //when
        myArrayList.add(34);
        //assert
        assertFalse(myArrayList.isEmpty());
    }

    public void addXRemoveX_ArrayListShouldBeEmpty(){
        //when
        myArrayList.add(34);
        myArrayList.remove(34);
        //assert
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void addXAndY_removeY_arrayShouldNotBeEmpty(){
        //when
        myArrayList.add(34);
        myArrayList.add(45);
        myArrayList.remove(45);
        //assert
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void removeFromEmptyArrayList_shouldThrowException(){
        assertThrows(IllegalArgumentException.class, () -> myArrayList.remove(23));
    }

    @Test
    public void addElement_arrayListSizeincreases(){
        myArrayList.add(34);
        assertEquals(1, myArrayList.size());
    }
    @Test
    public void addTwoElements_arrayListSizeIncreases(){
        myArrayList.add(34);
        myArrayList.add(45);
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void replaceElementInArrayList(){
        myArrayList.add(34);
        myArrayList.add(94, 0);
        assertEquals(94, myArrayList.get(0));
    }

    @Test
    public void addThreeElement_getSecondByIndex(){
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);

        assertEquals(32, myArrayList.get(1));
    }

    @Test
    public void getTheIndexOfElementTest(){
     myArrayList.add(34);
     myArrayList.add(45);
     myArrayList.add(90);

     assertEquals(0, myArrayList.getIndexOf(32));
    }
    @Test
    public void arraylistIsElasticTest(){
        myArrayList.add(46);
        myArrayList.add(23);
        myArrayList.add(47);
        myArrayList.add(39);
        myArrayList.add(43);

        assertEquals(5, myArrayList.size());
        assertEquals(6, myArrayList.getCapacity());
        myArrayList.add(70);
        myArrayList.add(71);
        assertEquals(7, myArrayList.size());
        assertEquals(12, myArrayList.getCapacity());
    }
    @Test
    public void removeElementAtIndex_whileOtherElementFillUpThePositionTest(){
        myArrayList.add(56);
        myArrayList.add(34);
        myArrayList.add(13);
        myArrayList.add(45);
        assertEquals(4, myArrayList.size());
        myArrayList.remove(34);
        myArrayList.remove(13);
        myArrayList.add(60);
        assertEquals(3, myArrayList.size());
        assertEquals(45,myArrayList.get(1));
        assertEquals(60,myArrayList.get(2));

    }

    @Test
    void insertElementAtAnyIndex_whileOthersTakeNewPositionTest(){
        //given
        myArrayList.add(56);
        myArrayList.add(34);
        myArrayList.add(13);
        myArrayList.add(45);
        assertEquals(4, myArrayList.size());
        //when
        myArrayList.insert(70, 3);
        myArrayList.insert(80,4);
        //assert
        assertEquals(70, myArrayList.get(3));
        assertEquals(80, myArrayList.get(4));
        assertEquals(45, myArrayList.get(5));
    }
}
