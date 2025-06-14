public class Loja {
	
	public static void main (String[] args) {
		Livro livro = new Livro(1, "Java para Leigos", "Java", 128.00, "Barry Burd", 12345);
		Revista revista = new Revista(2, "O craque da copa?", "Futebol", 99.89, "07/04/2014", 1388);
		Cd cd = new Cd(3, "A Música Do Mundo", "5 Músicas De Vários Países", 41.00, "Azul music", 25);
		Dvd dvd = new Dvd(4, "Cinema Faroeste", "Faroeste", 114.90, "Faroeste", 556);
		
		System.out.println(livro.getDecricao());
		System.out.println("Autor: "+livro.getAutor()+"\nisbn: "+livro.getIsbn());
		System.out.println("____________");
		System.out.println(revista.getDecricao());
		System.out.println("Data: "+revista.getData()+"\nNumero: "+revista.getNumero());
		System.out.println("____________");
		System.out.println(cd.getDecricao());
		System.out.println("Artista: "+cd.getArtista()+"\nFaixas: "+cd.getFaixas());
		System.out.println("____________");
		System.out.println(dvd.getDecricao());
		System.out.println("Gênero: "+dvd.getGenero()+"\nDuração: "+dvd.getDuracao());
		System.out.println("____________");
	
	}
}

