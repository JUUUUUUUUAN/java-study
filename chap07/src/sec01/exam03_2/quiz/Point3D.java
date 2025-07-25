package sec01.exam03_2.quiz;

public class Point3D extends Point {
	protected int z;
	
	public Point3D(int x, int y, int z) {
		// 부모 클래스가 책임지는 초기화는 부모 생성자에 맡기는 게 좋음
		super(x, y);
        this.z = z;
    }
	
	public String location() {
//		return "x= " + x + ", y= " + y + ", z= " + z;
		return super.location() + ", z= " + z;
    }
	
}
