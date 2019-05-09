
public class Usuario {

	public static void main(String[] args) {
		FormaGeometrica x = new Retangulo();
		((Retangulo)x).setComprimento(5);
		((Retangulo)x).setLargura(5);
		System.out.println(x.area());
	}
}
