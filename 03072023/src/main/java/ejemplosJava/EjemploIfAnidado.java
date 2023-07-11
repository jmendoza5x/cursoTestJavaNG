package ejemplosJava;

public class EjemploIfAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperatura=26;
		if(temperatura>15) {
			if(temperatura>25) {
				System.out.println("la temperatura es "+temperatura+" a la playa");
			}
			else{
				System.out.println("la temperatura es "+temperatura+ " a la montaña");
			}
		}
		else {
			System.out.println("A descansar...");
		}
	}

}
