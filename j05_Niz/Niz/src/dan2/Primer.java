package dan2;

public class Primer {

	public static void main(String[] args) {
		// sortiranje niza
		
		int arr[] = {10,9,8,8,7,6,5,4,3,3,2,2,1 };
		int n = arr.length;
		int tmp = 0;
		System.out.println("Originalni niz od " + n + " elemenata.");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		int b = 0; // brojač prolazaka
		// rastući redosled: 1 2 3 4 5 
		// ok bubble sort, nxn prolazaka
		/*
		for(int i=0; i < n; i++) {
			for(int j=0; j<n;j++) {
				if(arr[j] > arr[i]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				b++;
			}
		} 
		*/
		// bubble sort simplex <= n*n prolazaka
		/*
		for(int i=0; i < n; i++) {			
			for(int j=i; j<n;j++) {
				if(arr[j] < arr[i]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;				
				}
				b++;
			}			
		} 
		*/
		// kvik sort  < n*n prolazaka (najmanje prolazaka)
		
		
		int p = n - 1;		
		for(int i=0; i< n; i++) {
			for (int j = 0; j < p; j++) {
				if( arr[j] > arr[p]) {
					tmp = arr[j];
					arr[j] = arr[p];
					arr[p] = tmp;
				}		
				b++;
			}
			p--;			
		}
		
		System.out.println("\nSortirano. Rastući redosled? " + b);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}
