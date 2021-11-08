package enums;

public class EnumEx {
	public static void main(String[] args) {
		MyTransportation t1 = MyTransportation.BUS;
		MyTransportation t2 = MyTransportation.BUS;
		MyTransportation t3 = MyTransportation.TRAIN;
		
		System.out.printf("t1 = %s, %d %n",t1.name(),t1.ordinal());
		System.out.printf("t2 = %s, %d %n",t2.name(),t2.ordinal());
		System.out.printf("t3 = %s, %d %n",t3.name(),t3.ordinal());
	}
}
