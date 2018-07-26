package sort;

public class MergeSort {
	private static Data[] temp;
	private static int index = 0;
	public static void main(String[] args) {
		Data[] arr = Data.getArr();
		temp = new Data[arr.length];
		Data.print(arr);
		System.out.println("-----------------");
		sort(arr);
	}
	/**
	 * 归并排序
	 */
	private static void sort(Data[] arr) {
		partSort(arr,1);
	}
	private static void partSort(Data[] arr, int len) {
		if(len>=arr.length) {
			return;
		}
		for(int i=0,k=i+len;i<arr.length;i+=2*len,k=i+len) {
			int indexI=i;
			int indexK=k;
			int endI = (i+len-1);
			if(endI>=arr.length) {
				endI = arr.length-1;
			}
			int endK = (k+len-1);
			if(endK>=arr.length) {
				endK = arr.length-1;
			}
			while(indexI<=endI && indexK<=endK) {
				if(arr[indexI].number>arr[indexK].number) {
					temp[index++] = arr[indexK++];
				}else if(arr[indexI].number<arr[indexK].number){
					temp[index++] = arr[indexI++];
				}else {
					temp[index++] = arr[indexI++];
					temp[index++] = arr[indexK++];
				}
			}
			while(indexI<=endI) {
				temp[index++] = arr[indexI++];
			}
			while(indexK<=endK) {
				temp[index++] = arr[indexK++];
			}
			Data.print(temp);
		}
		System.out.println();
		index = 0;
		Data[] d = arr;
		arr = temp;
		temp = d;
		for(int i=0;i<temp.length;i++)temp[i] = null;
		partSort(arr, len*2);
	}
}
