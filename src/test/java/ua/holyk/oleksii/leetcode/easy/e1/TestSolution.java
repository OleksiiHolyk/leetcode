/*
 * Copyright Oleksii Holyk(c) 2021.
 */

package ua.holyk.oleksii.leetcode.easy.e1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestSolution {
    Solution solution;

    @BeforeAll
    public void setUp() {
        solution = new Solution();
    }

    @Test
    void testCases() {
        assertArrayEquals(solution.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assertArrayEquals(solution.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assertArrayEquals(solution.twoSum(new int[]{3, 3}, 6), new int[]{0, 1});
    }
}
