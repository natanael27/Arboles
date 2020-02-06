

public class AB<T>{
	private Nodo<T> raiz;
	
	public AB(){
		this.raiz= null;
		}
	@Override
	public String toString() {
		return raiz.toString();
	}

	public class Nodo<T>{
		private T info;
		private Nodo<T> izq;
		private Nodo<T> der;
		
		public Nodo(T inf){
			this.info=inf;
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			sb.append(toString(raiz));
			sb.append("]");
			return sb.toString();
		}
		private String toString(Nodo raiz) {
			if(raiz== null) {
				return "-";
				}
			return(raiz.info.toString()+"/"+toString(raiz.der)+"/"+toString(raiz.izq));
		}
		public T getInfo() {
			return this.info;
		}
		public Nodo<T> getIzq() {
			return this.izq;
		}
		public Nodo<T> getDer() {
			return this.der;
		}
		
	
	}
	
		public void Agregar(T elem) {
			Nodo<T> nuevo = new Nodo<T>(elem);
			if(raiz == null) {
				raiz = nuevo;
			}else {
				Agregar(raiz,nuevo);
			}
		}
	
		private void Agregar(Nodo<T> raiz,Nodo<T> nuevo ) {
			if(raiz.izq==null ){
				raiz.izq=nuevo;
			}else {
				if(raiz.der==null) {
					raiz.der=nuevo;
				}else {
					Agregar(raiz.der, nuevo);
				}
			}
		}
		public Nodo<T> getIzq() {
			return raiz.izq;
		}
		public void setIzq(Nodo<T> izq) {
			this.raiz.izq = izq;
		}
		public Nodo<T> getDer() {
			return raiz.der;
		}
		public void setDer(Nodo<T> der) {
			this.raiz.der = der;
		}
		public T getInfo() {
			return raiz.info;
		}
		public void setInfo(T info) {
		this.raiz.info = info;
	}

    public boolean Pertenece(int ent){
	return Pertenece(raiz,ent);
	}
	private boolean Pertenece(Nodo<T> raiz,int ent){
		if(raiz == null) {
			return false;
		}
		if(altura()==1 && raiz.getInfo().equals(ent)){
			return true; 
		} if(altura()==1 && (!raiz.getInfo().equals(ent))){
			return false;
		} return (raiz.getInfo().equals(ent)) || Pertenece(raiz.getIzq(),ent) || Pertenece(raiz.getDer(),ent);
	} 
	public int altura(){
		return altura(raiz);
	}
	private int altura(Nodo<T> raiz){
		if(raiz==null){
				return 0;
		}
		return 1+Math.max(altura(raiz.getIzq()),altura(raiz.getDer()));
}
	
	public int minimo() {
	if (raiz != null) {
		return minimo(raiz);
	}
	return -1;
	}		
	
	private int minimo(Nodo nodo) {
		if (nodo == null) {
		return 5000000;
	}else {
		return Math.min((int)nodo.info, Math.min(minimo(nodo.izq), minimo(nodo.der)));
}
}
	public boolean EsHoja(int info) {
		Nodo<Integer> nuevo= new Nodo<Integer>(info);
		
		if(raiz.equals(nuevo)&& raiz.izq==null && raiz.der==null) {
			return false;
		}return EsHoja2(nuevo);
	}
	private boolean EsHoja2(Nodo<Integer> nodo) {
		if(altura()>=2 && nodo.izq==null && nodo.der==null){
		System.out.println("entro");
			return true;
	}return false; 
	}
	}
	
	

