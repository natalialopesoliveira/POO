import java.util.*;

public class SimpleJava2DExample {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Set<Integer> s = new TreeSet<Integer>();

		// adiciona os valores 99,45,13,99 na lista 'l'
		l.add(new Integer(99));
		l.add(new Integer(45));
		l.add(new Integer(13));
		l.add(new Integer(99));

		// adiciona os valores 99,45,13,99 no mapa 'm',
		// inclui também uma chave para cada valor
		m.put(new Integer(1), new Integer(99));
		m.put(new Integer(2), new Integer(45));
		m.put(new Integer(3), new Integer(13));
		m.put(new Integer(4), new Integer(99));
		
		// adiciona os valores 99,45,13,99 no conjunto 's'
    	s.add(new Integer(99));
    	s.add(new Integer(45));
    	s.add(new Integer(13));
    	s.add(new Integer(99));

    	// exibe o conteúdo de cada coleção com o toString nativo:
    	System.out.println("Lista: " + l);
    	System.out.println("Mapa: " + m);
    	System.out.println("Conjunto: " + s);

	}
}
