
public class Uso {

	public static void main(String[] args) {
		//Usando construtores apropriados, crie os seguintes objetos:
		Data teste1 = new Data(11, 02, 2010);
		System.out.println(teste1);
		Data teste2 = new Data("12/02/2009");
		System.out.println(teste2);
		Data teste3 = new Data(03, 2009);
		System.out.println(teste3);
		Data teste4 = new Data(10, "fevereiro",2009);
		System.out.println(teste4);
		Data teste5 = new Data(1, 1, 1900);
		System.out.println(teste5);
		Data teste6 = new Data(32, 1, 1900);
		System.out.println(teste6);
	}
}
