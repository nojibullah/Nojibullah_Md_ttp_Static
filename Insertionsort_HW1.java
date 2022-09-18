//MD Nojibullah
//HW1
//CISC 3220
import java.util.Arrays;
public class Insertionsort_HW1 {
	  public static void main(String[] args) {
		int array[] = {2,8,4,3,1,6,3};
		int i , j , k;
		for (i=0;i<= array.length-1;i++) {
			for (j=i; j<=array.length-1;j++) {
				if(array[i]<array[j]) {
					k = array[i];
					array[i]=array[j];
					array[j]=k;
					}
				}
			}
		System.out.println("Desceending order:");
			for ( i=0; i<=array.length-1; i++) { 
				System.out.println( array[i]);
			}
		
	 }
}

