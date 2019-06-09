package assignment8;

import java.util.Scanner;

public class apples {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	System.out.println("How many students?");
    	int x = input.nextInt();
    	input.close();
        boolean state[] = new boolean[x];
        for (int i = 1; i < state.length; i++){
            for (int j = i; j < state.length; j++){
                if (j % i == 0){
                    state[j] = !state[j];
                }
            }
            if (state[i] == true){
            	System.out.println("Locker " + i + " is open.");
            }
        }
    }
}
