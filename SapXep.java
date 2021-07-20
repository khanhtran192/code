import java.util.Random;
public class SapXep {
    public void RandomInput(){
        Random rd = new Random(); 
        int[] A = new int[100]; // lay mang co do dai bang 5
            for(int i=0; i<A.length; i++){
                A[i] = rd.nextInt(); // lay random cac gia tri trong mang
            }
        // BubbleSort(A);
		// SelectSort(A);
		// InsertionSort(A);
		InterchangeSort(A);
		
		// long startTime = System.nanoTime();
		// quickSort(A, 0, 100-1);
		// long endTime   = System.nanoTime();
		// long totalTime = endTime - startTime;
		// System.out.println("Execution time in nanoseconds Quick Sort: " + totalTime);
    }

    public void BubbleSort(int [] A){
		int a = A[0];
		long startTime = System.nanoTime(); 
		
		for (int i=0; i<A.length; i++){
			for (int j = i+1; j<A.length; j++){
				if(A[i] > A[j]){
					a=A[j];
					A[j]=A[i];
					A[i]=a;
				}
			}
		}
        long endTime   = System.nanoTime(); 
		long totalTime = endTime - startTime; 
		
		System.out.println("Execution time in nanoseconds Bubble Sort: " + totalTime);
    }

    public void InsertionSort(int [] A){
		long startTime = System.nanoTime();
		int temp, j, i;
		for (i=1; i<A.length;i++){
			j = i;
			temp = A[i];
			while (j>0 && temp<A[j - 1]) {
				A[j] = A[j-1];
				j = j-1;			
			}
			A[j] = temp;
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("Execution time in nanoseconds Insertion Sort: " + totalTime);
	}

    public void SelectSort(int [] A){
		long startTime = System.nanoTime();
		
		int i, j,min, temp;
		for (i = 0; i <A.length-1; i++){
			min = i;
			for (j = i+1; j<A.length; j++){
				if(A[j] < A[min]){
					min = j;
				}
			}
			temp = A[i];
			A[i] = A[min];
			A[min] = temp;
		}
        long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println("Execution time in nanoseconds Selection Sort  : " + totalTime);
	}

	public void InterchangeSort(int[]A){
		int temp;
		long startTime = System.nanoTime();
		for(int i = 0; i < A.length - 1; i++) {
            for(int j = i + 1; j < A.length - 1; j++) {
				if(A[i] > A[j]){
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		
		System.out.println("Execution time in nanoseconds Interchange Sort  : " + totalTime);
	}

	public static void quickSort(int[] A, int left, int right){
		long startTime = System.nanoTime();
        if (A == null || A.length == 0)
          return;
        if (left >= right)
          return;
        int middle = left + (right - left) / 2;
        int pivot = A[middle];
        int i = left, j = right;
        while (i <= j) {
            while (A[i] < pivot){
                i++;
            }
            while (A[j] > pivot){
                j--;
            }
            if (i <= j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(A, left, j);
        if (right > i)
            quickSort(A, i, right);
		
    }

    public static void main(String[] args) {
        SapXep X = new SapXep();
            X.RandomInput();
    }
}
