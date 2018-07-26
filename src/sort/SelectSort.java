package sort;

public class SelectSort {
	public static void main(String[] args) {
		Data[] arr = Data.getArr();
		Data.print(arr);
		System.out.println("-----------------");
		sort(arr);
	}
	/**
	 * 选择排序
	 */
	private static void sort(Data[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int k=i;k<arr.length;k++) {
				if(arr[k].number<arr[minIndex].number) {
					minIndex = k;
				}
			}
			if(minIndex!=i) {
				Data.exchange(arr, minIndex, i);
			}
			Data.print(arr);
		}
	}
}
