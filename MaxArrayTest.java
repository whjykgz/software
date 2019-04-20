package wh;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxArrayTest {
	int[] array={2,4,-6,1};
	int[] arraynull={};
	@Test
	public void testMaxSumArray() {
		assertEquals(0, new MaxArray().maxSumArray(arraynull));
		assertEquals(6,new MaxArray().maxSumArray(array));
	}

}
