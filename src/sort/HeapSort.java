package sort;

public class HeapSort {
	public static void main(String[] args) {
		Data[] arr = Data.getArr();
		Data.print(arr);
		System.out.println("-----------------");
		sort(arr);
	}
	/**
	 * 堆排序
	 */
	private static void sort(Data[] arr) {
		for(int i=0;i<arr.length;i++) {
			int len = arr.length-i;
			createBigRootHeap(arr,len);
			Data.exchange(arr, 0, len-1);
			Data.print(arr);
		}
	}
	/**
	 * @param arr 母数组
	 * @param length 子数组长度
	 */
	private static void createBigRootHeap(Data[] arr, int length) {
//		最后一个非叶子结点 length/2-1
		for(int i=length/2-1;i>=0;i--) {
			int lastNotLeafIndex = i;
			exchangeRoot(arr,length,lastNotLeafIndex);//完成lastNotLeafIndex节点以下的大根堆创建
		}
	}
	
	/**
	 * 从某个节点开始，递归往下构建大根堆
	 * @param arr 母数组
	 * @param length 子数组长度
	 * @param lastNotLeafIndex 最后一个非叶子节点
	 */
	private static void exchangeRoot(Data[] arr,int length, int lastNotLeafIndex) {
		int leftChildIndex = 2*lastNotLeafIndex+1;
		int rightChildIndex = 2*lastNotLeafIndex+2;
		int maxValueIndex = lastNotLeafIndex;
		if(rightChildIndex<length&&arr[maxValueIndex].number<arr[rightChildIndex].number) {
			maxValueIndex = rightChildIndex;
		}
		if(leftChildIndex<length&&arr[maxValueIndex].number<arr[leftChildIndex].number) {
			maxValueIndex = leftChildIndex;
		}
		if(maxValueIndex!=lastNotLeafIndex) {
			Data.exchange(arr, maxValueIndex, lastNotLeafIndex);
			exchangeRoot(arr,length,maxValueIndex);
		}
	}
}
