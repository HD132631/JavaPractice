package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=1; i<=10; i++) {
			arr[i-1] = '*';
			for(int j=0; j<10; j++) {
				if(arr[j] == '*') {
					System.out.print('*');
				}
				else {
					System.out.print(arr[j]);
				}
			}
			arr[i-1] = i;
			System.out.println("");
		}
			

	}

}
