package sort;

public class Data {
	public int number;
	public String tag = "";
	public Data(int data, String tag) {
		this.number = data;
		this.tag = tag;
	}
	public Data(int data) {
		this.number = data;
	}
	public static Data[] getArr() {
		return new Data[] {new Data(750),new Data(666),new Data(128),new Data(985),new Data(863,"A"),
				new Data(10),new Data(400),new Data(863,"B"),new Data(211),new Data(233),};
	}
	public static void print(Data[] data) {
		for(int i=0;i<data.length-1;i++) {
			System.out.print(data[i]!=null?(data[i].number+data[i].tag+"\t"):"-\t");
		}
		System.out.println(data[data.length-1]!=null?(data[data.length-1].number+data[data.length-1].tag+"\t"):"-\t");
	}
	public static void exchange(Data[] datas,int i1,int i2) {
		Data temp = datas[i1];
		datas[i1] = datas[i2];
		datas[i2] = temp;
	}
	
	@Override
	public String toString() {
		return ""+number;
	}
	
}
