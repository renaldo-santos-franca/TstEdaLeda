import java.util.*;

class Insere_Ultimo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		int[] nums = new int[array.length];

		for(int i=0; i<nums.length; i++){
			
			nums[i] = Integer.parseInt(array[i]);

		}

		int aux, i = nums.length - 1;
		while(i >= 1 && nums[i] < nums[i - 1]){
			
			aux = nums[i];
			nums[i] = nums[i-1];
			nums[i-1] = aux;
			i--;	
		}

		System.out.println(Arrays.toString(nums));
	}

}
