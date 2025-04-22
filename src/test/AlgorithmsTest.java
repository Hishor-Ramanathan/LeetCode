package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlgorithmsTest {
    @Test
    public void testTwoSum() {
        //Arrange
        algorithms.Algorithms algorithms = new algorithms.Algorithms();
        int[]nums = new int[]{2,7,11,15};
        int target = 9;
        int[] expected = new int[]{0,1};

        //Act
        int[] result = algorithms.twoSum(nums,target);

        //Assert
        assertArrayEquals(expected, result);
    }
}
