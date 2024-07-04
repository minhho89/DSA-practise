package test.twoPointers;

import org.junit.jupiter.api.Test;
import twoPointers.MoveZeroes;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @Test
    void test1() {
        int[] nums = new int[]{0,1,0,3,12};
        MoveZeroes.moveZeroes(nums);
    }



}
