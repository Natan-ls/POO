import java.util.Scanner;
public class Principal {
	
	public static void main (String[] args) {
		Data data = new Data(31,01,2025);
		Data data1 = new Data(04,9,2002);
		Pessoa p = new Pessoa("Natan", "M", data1);
		System.out.println(p.getNascimento().calculaTempo(data));
		System.out.println(data.retornaData());
	}
}

