
public class prueba {

	public static void main(String[] args) {
	AB<Integer> arbol= new AB<Integer>(); 
	arbol.Agregar(10);
	arbol.Agregar(5);
	arbol.Agregar(4);
	arbol.Agregar(7);
	arbol.Agregar(16);
	arbol.Agregar(2);
	
	
	System.out.println(arbol.toString());
	System.out.println(arbol.altura());
	System.out.println(arbol.Pertenece(5));
	System.out.println(arbol.Pertenece(3));
	//System.out.println("mas chico:"+arbol.nodoMaschico());
	System.out.println(arbol.minimo());
	//System.out.println(arbol.EsHoja(5));
	System.out.println(arbol.EsHoja(4));
	
	}

}
