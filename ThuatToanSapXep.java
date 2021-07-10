
import java.util.Scanner;

public class ThuatToanSapXep {
    public void Input(){
		int n;
		int [] A;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Nhap so phan tu cua day: ");
		n=keyboard.nextInt();
		A = new int[n];
		System.out.println("Nhap day");
		for(int i=0;i<n;i++)
		{
			System.out.print("Nhap phan tu thu "+(i+1)+" cua day: ");
			A[i]=keyboard.nextInt();
		}
		System.out.print("Day cua ban la: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i] + " ");
		}
		menu(A);
    }

	static boolean isNotExit = true;
	public void menu(int [] A) {
        System.out.println("1. BUBBLE SORT");
        System.out.println("2. QUICK SORT");
        System.out.println("3. SELECTION SORT");
        System.out.println("4. INSERTION SORT");
		System.out.println("5. THOAT");
        

        Scanner keyboard = new Scanner(System.in);
        int seleted = keyboard.nextInt();
        switch (seleted) {
            case 1:
                BubbleSort(A);
                break;
            case 2:
                QuickSort(A);
                break;
            case 3:
                SelectSort(A);
                break;
			case 4:
				InsertionSort(A);
				break;
            case 5:
                isNotExit = false;
                break;
        }
    }

	public void QuickSort(int [] A){
		//
	}

	public void SelectSort(int [] A){
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
		System.out.println("Day sap xep thep Selection Sort");
		Result(A);
	}

	public void InsertionSort(int [] A){
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
		System.out.println("Day sap xep thep Insertion Sort");
		Result(A);
	}

    public void BubbleSort(int [] A){
		int a = A[0];
		for (int i=0; i<A.length; i++){
			for (int j = i+1; j<A.length; j++){
				if(A[i] > A[j]){
					a=A[j];
					A[j]=A[i];
					A[i]=a;
				}
			}
		}
		System.out.println("Day sap xep theo Bubble Sort");
		Result(A);
    }



	public static void Result(int [] A){
		for (int i=0; i<A.length; i++){
			System.out.print(A[i] + " ");
		}
	}
	public static void main(String[] args) {
		ThuatToanSapXep X = new ThuatToanSapXep();
		X.Input();
	}
}