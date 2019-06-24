import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColecaoSorteioTreeSet implements Serializable {
	private Set<Sorteio> numeros;
	
	ColecaoSorteioTreeSet() {
		numeros = new TreeSet<Sorteio>();
	}
}
