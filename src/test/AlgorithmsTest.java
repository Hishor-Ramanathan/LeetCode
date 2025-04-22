package test;

import algorithms.Algorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {
    @Test
    public void testTwoSum() {
        //Arrange
        algorithms.Algorithms algorithms = new algorithms.Algorithms();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        //Act
        int[] result = algorithms.twoSum(nums, target);

        //Assert
        assertArrayEquals(new int[]{0, 1}, result);
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
        Algorithms.ListNode l1 = new Algorithms.ListNode(2, new Algorithms.ListNode(4, new Algorithms.ListNode(3)));
        Algorithms.ListNode l2 = new Algorithms.ListNode(5, new Algorithms.ListNode(6, new Algorithms.ListNode(4)));

        //Act
        Algorithms.ListNode result = algorithms.addTwoNumbers(l1, l2);

        //Assert
        Algorithms.ListNode expected = new Algorithms.ListNode(7, new Algorithms.ListNode(0, new Algorithms.ListNode(8)));
        assertLinkedListEquals(expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring() {
        //Arrange
        Algorithms algorithms = new Algorithms();
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        //Case 1
        //Act
        int result = algorithms.lengthOfLongestSubstring(s1);
        //Assert
        assertEquals(3, result);

        //Case 2
        //Act
        result = algorithms.lengthOfLongestSubstring(s2);
        //Assert
        assertEquals(1, result);

        //Case 3
        //Act
        result = algorithms.lengthOfLongestSubstring(s3);
        //Assert
        assertEquals(3, result);
    }

}
