package wh;

import java.util.Scanner;

public class MaxArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] array = new int[6];
		for(int i=0;i<array.length;i++){
			array[i]=scanner.nextInt();
		}
		int max=maxSumArray(array);
		System.out.println(max);
	}
	public static int maxSumArray(int[] array){
		if(array.length==0 || array==null){
			return 0;
		}
		int sum=0;
		int max=0;
		for(int i=0;i<array.length;i++){
			if(sum<=0){
				sum=array[i];
			}else{
				sum+=array[i];
			}
			if(sum>max){
				max=sum;
			}
		}
		return max;
	}
}
