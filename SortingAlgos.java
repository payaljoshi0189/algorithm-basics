class SortingAlgos {

	public void SelectSort(int[] a){
		int min = 0;
		for(int i = 0; i < a.length; i++){
			min = i;
			for(int j = i; j < a.length; j++){
				if(a[j] < a[min])
					min = j;
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}


	public static void main(String args[]){
		SortingAlgos sort = new SortingAlgos();
		int[] a = new int[]{100, 15, 35, 70, 10, 5};
		sort.SelectSort(a);

		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
}