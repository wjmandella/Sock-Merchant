// My solution to the HackerRank problem "Sock Merchant."
// https://www.hackerrank.com/challenges/sock-merchant/problem

import java.util.ArrayList;
import java.util.Scanner;

public class SockMerchantApp {
    static int sockMerchant(int n, int[] ar) {
        // Complete this function
    	ArrayList<Integer>tempArray1 = new ArrayList<>();
    	ArrayList<Integer>tempArray2 = new ArrayList<>();
    	
    	for(int i = 0; i < ar.length; i++) {
    		tempArray1.add(ar[i]);
    	}
    
    	for(int j = 0; j < tempArray1.size(); j++) {
    		for(int k = j +1; k < tempArray1.size(); k++) {
    			if(tempArray1.get(j)== null) {
    				continue;
    			}
    			else if (tempArray1.get(j) == tempArray1.get(k)) {
    				tempArray2.add(tempArray1.get(j));
    				tempArray1.set(k, null);
    				System.out.println(tempArray2.toString());
    				break;
    			}
    		}
    	}
    	
    	return tempArray2.size();
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of socks in pile, n (integer 1 - 100): ");
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            System.out.print("Enter a color number for a sock, c (integer 1 - 100): ");
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
        in.close();
    }
}
