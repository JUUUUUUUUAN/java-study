package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calcularor = new Calculator();
		System.out.println("원면적: " + calcularor.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적: " + computer.areaCircle(r));
		System.out.println();
	}

}
