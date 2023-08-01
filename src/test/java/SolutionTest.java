import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionTest {
    @Test
    public void permuteUniqueTest1(){
        int[] nums = {1,1,2};
        List<List<Integer>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1,1,2)),
                new ArrayList<>(List.of(1,2,1)),
                new ArrayList<>(List.of(2,1,1))
        ));

        List<List<Integer>> actual = new Solution().permuteUnique(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void permuteUniqueTest1(){
        int[] nums = {1,2,3};
        List<List<Integer>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1,2,3)),
                new ArrayList<>(List.of(1,3,2)),
                new ArrayList<>(List.of(2,1,3)),
                new ArrayList<>(List.of(2,3,1)),
                new ArrayList<>(List.of(3,1,2)),
                new ArrayList<>(List.of(3,2,1))
        ));

        List<List<Integer>> actual = new Solution().permuteUnique(nums);
        Assert.assertEquals(expected, actual);
    }
}
