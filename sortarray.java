	import java.util.Scanner; 
	public class sortarray {
			public static void sort(int array[])                     //функція сортування
		{
			for(int d=0;d<array.length;d++)
			{
				for(int i=0;i<array.length;i++)
				{
					if(i!=array.length-1 && array[i]<array[i+1])
					{
						int temp=array[i+1];
						array[i+1]=array[i];
						array[i]=temp;
					}
				}
			}
		}
		
		
		public static void main(String[] args) {					//початок 1 фрагменту
			Scanner input = new Scanner(System.in);
			System.out.println("Enter array length(1 to 10): ");
			int size = input.nextInt(); 
			
			if (size > 1 && size < 10){
				int array[] = new int[size]; 
				System.out.println("Insert array elements:");
		
				 for (int i = 0; i < size; i++) {
					array[i] = input.nextInt(); 
				 }															//кінець 1 фрагменту
		 
				sort(array);												//сортування
		 
				System.out.print ("Inserted array elements:");				//початок 3 фрагменту
				 for (int n = 0; n < size; n++) {
					System.out.print (" " + array[n]); 
					
				 }
			}
			else {
				System.out.print ("Array must be from 1 to 10 characters long");
				
			}
			
			System.out.println();
		}
	}