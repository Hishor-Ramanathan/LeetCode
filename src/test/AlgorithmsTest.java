package test;
import algorithms.Algorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void assertLinkedListEquals(Algorithms.ListNode expected, Algorithms.ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }
    @Test
    public void testAddTwoNumbers() {
        //Arrange
        Algorithms algorithms = new Algorithms();
        Algorithms.ListNode l1 = new Algorithms.ListNode(2,new Algorithms.ListNode(4,new Algorithms.ListNode(3)));
        Algorithms.ListNode l2 = new Algorithms.ListNode(5,new Algorithms.ListNode(6,new Algorithms.ListNode(4)));
        Algorithms.ListNode expected = new Algorithms.ListNode(7,new Algorithms.ListNode(0,new Algorithms.ListNode(8)));

        //Act
        Algorithms.ListNode result = algorithms.addTwoNumbers(l1,l2);

        //Assert
        assertLinkedListEquals(expected,result);
    }
}
