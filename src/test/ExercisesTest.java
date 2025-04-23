package test;

import algorithms.exercises.Exercises;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExercisesTest {
    @Test
    public void testTwoSum() {
        //Arrange
        Exercises exercises = new Exercises();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        //Act
        int[] result = exercises.twoSum(nums, target);

        //Assert
        assertArrayEquals(new int[]{0, 1}, result);
    }

    void assertLinkedListEquals(Exercises.ListNode expected, Exercises.ListNode actual) {
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
        Exercises exercises = new Exercises();
        Exercises.ListNode l1 = new Exercises.ListNode(2, new Exercises.ListNode(4, new Exercises.ListNode(3)));
        Exercises.ListNode l2 = new Exercises.ListNode(5, new Exercises.ListNode(6, new Exercises.ListNode(4)));

        //Act
        Exercises.ListNode result = exercises.addTwoNumbers(l1, l2);

        //Assert
        Exercises.ListNode expected = new Exercises.ListNode(7, new Exercises.ListNode(0, new Exercises.ListNode(8)));
        assertLinkedListEquals(expected, result);
    }

    @Test
    public void testLengthOfLongestSubstring() {
        //Arrange
        Exercises exercises = new Exercises();
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        //Case 1
        //Act
        int result = exercises.lengthOfLongestSubstring(s1);
        //Assert
        assertEquals(3, result);

        //Case 2
        //Act
        result = exercises.lengthOfLongestSubstring(s2);
        //Assert
        assertEquals(1, result);

        //Case 3
        //Act
        result = exercises.lengthOfLongestSubstring(s3);
        //Assert
        assertEquals(3, result);
    }

}
