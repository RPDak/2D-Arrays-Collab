import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Array2TEST {
	
	// example arrays for testing
		private int[][] squarepos, squareneg, sorted, reverse, jagged, tall, wide, negative;
			
		@Before public void setUp() {
		   sorted = new int[][] {
			   {1,2,3,4},
			   {5,6,7,8},
			   {9,10,11,12},
			   {13,14,15,16}
		   };
		   reverse = new int[][] {
			   {16,15,14,13},
			   {12,11,10,9},
			   {8,7,6,5},
			   {4,3,2,1}
		   };
		   squarepos = new int[][] {
			   {2,2,3,4},
			   {5,8,7,8},
			   {0,10,3,12},
			   {13,22,15,8}
		   };
		   squareneg = new int[][] {
			   {-1,-4,-22,-18},
			   {-20,-6,-3,-1},
			   {-99,-15,-18,-6},
			   {-7,-7,-6,-12}
		   };
		   jagged = new int[][] {
			   {1,2},
			   {3,4,6},
			   {8,0,1,9},
			   {-2,-20,-33},
			   {0}
		   };
		   tall = new int[][] {
			   {0,1},
			   {2,3},
			   {9,5},
			   {4,-20},
			   {18,16},
			   {20,20}
		   };
		   wide = new int[][] {
			   {1,2,3,4,5,6},
			   {9,8,7,6,5,4},
			   {2,8,1,4,2,5}
		   };
		   negative = new int[][] {
			   {-3,-4,-12},
			   {-5,-7,-13},
			   {-20,-18,-1}
		   };
	    }

		@Test public void testGetTotal() {
			assertEquals(136, Array2Exercises.getTotal(sorted));
		}

		@Test public void testGetAverage() {
			assertEquals(8.5, Array2Exercises.getAverage(sorted), 0.00);
		}
		
		@Test public void testGetRowTotal() {
			assertEquals(10, Array2Exercises.getRowTotal(sorted, 0));
		}
		
		@Test public void testGetColumnTotal() {
			assertEquals(28, Array2Exercises.getColumnTotal(sorted, 0));
		}
		
		@Test public void testGetHighestInRow() {
			assertEquals(4, Array2Exercises.getHighestInRow(sorted, 0));
		}
		
		@Test public void testGetLowestInRow() {
			assertEquals(1, Array2Exercises.getLowestInRow(sorted, 0));
		}
		
		@Test public void testGetHighestInColumn() {
			assertEquals(13, Array2Exercises.getHighestInColumn(sorted, 0));
		}
		
		@Test public void testGetLowestInColumn() {
			assertEquals(1, Array2Exercises.getLowestInColumn(sorted, 0));
		}
		
		@Test public void testGetBottomLeftToTopRightDiagonalSum() {
			assertEquals(34, Array2Exercises.getBottomLeftToTopRightDiagonalSum(sorted));
		}
		
		@Test public void testGetTopLeftToBottomRightDiagonalSum() {
			assertEquals(34, Array2Exercises.getTopLeftToBottomRightDiagonalSum(sorted));
		}
		
		@Test public void testIsArraySorted() {
			assertEquals(true, Array2Exercises.isArraySorted(sorted));
			assertEquals(false, Array2Exercises.isArraySorted(reverse));
			assertEquals(false, Array2Exercises.isArraySorted(squarepos));
			assertEquals(false, Array2Exercises.isArraySorted(squareneg));
		}
		
		@Test public void testIsArrayReversed() {
			assertEquals(true, Array2Exercises.isArrayReversed(reverse));
		}
		
		@Test public void testIsJaggedArray() {
			assertEquals(true, Array2Exercises.isJaggedArray(jagged));
			assertEquals(false, Array2Exercises.isJaggedArray(wide));
			assertEquals(false, Array2Exercises.isJaggedArray(squareneg));
		}
		
		@Test public void testIsSquareArray() {
			assertEquals(true, Array2Exercises.isSquareArray(sorted));
			assertEquals(false, Array2Exercises.isSquareArray(jagged));
			assertEquals(false, Array2Exercises.isSquareArray(tall));
			assertEquals(false, Array2Exercises.isSquareArray(wide));
		}
		
		@Test public void testIsRectangularArray() {
			assertEquals(true, Array2Exercises.isRectangularArray(wide));
			assertEquals(true, Array2Exercises.isRectangularArray(tall));
			assertEquals(false, Array2Exercises.isRectangularArray(jagged));
			assertEquals(true, Array2Exercises.isRectangularArray(squareneg));
			assertEquals(true, Array2Exercises.isRectangularArray(squarepos));
		}

}
