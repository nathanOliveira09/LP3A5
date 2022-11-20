import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class TesteForkJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForkJoinPool pool = new ForkJoinPool();
		
		int[] A = {1,5,6,2,15,9,19,20,25,30};
		
		System.out.println("Array antes de ser ordenado: " + Arrays.toString(A));
		
		QuicksortForkJoinHoare QuickSortForkJoin = new QuicksortForkJoinHoare(A);
		pool.invoke(QuickSortForkJoin);
		System.out.println("Array depois de ser ordenado: " + Arrays.toString(A));

	}

}
