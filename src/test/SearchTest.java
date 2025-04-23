package test;

import algorithms.exercises.Exercises;
import algorithms.search.Search;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTest {
    @Test
    public void testBinarySearch(){
        //Arrange
        Search search = new Search();
        int[] nums = new int[]{2, 7, 11, 15, 19, 21, 23, 24, 24, 28, 50, 100};
        int number = 23;

        //Act
        boolean result = search.binarySearch(nums, number);

        //Assert
        assertTrue(result);
    }

    @Test
    public void testTwoCrystalBall(){
        //Arrange
        Search search = new Search();
        boolean[] floors = new boolean[]{false,false,false,false,false,true,true,true,true,true,true};

        //Act
        int result = search.twoCrystalBall(floors);

        //Assert
        assertEquals(6,result);
    }
}
