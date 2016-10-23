import java.util.Stack;

public class ArvoreDeExpressao {
	private TreeBinaryNode raiz;
	
	public ArvoreDeExpressao(String exprecao){
		raiz=construir(exprecao);
	}
	
	private TreeBinaryNode construir(String expressao){
		Stack<Character> operador = new Stack<Character>();
		Stack<TreeBinaryNode> nos = new Stack<TreeBinaryNode>();
		String aux="";
		TreeBinaryNode noaux;
		for(int i=0;i<expressao.length();i++){
			if(eOperador(expressao.charAt(i))){
				operador.push(expressao.charAt(i));
				if(!aux.equals("")){
					nos.push(new TreeBinaryNode(aux));
					aux="";
				}
			}else if(Character.getNumericValue(expressao.charAt(i))<10 && Character.getNumericValue(expressao.charAt(i))>=0){
				aux+=expressao.charAt(i);
			}else if(expressao.charAt(i)==')'){
				if(!aux.equals("")){
					nos.push(new TreeBinaryNode(aux));
					aux="";
				}
				noaux=new TreeBinaryNode(operador.pop()+"");
				noaux.setRight(nos.pop());
				noaux.setLeft(nos.pop());
				nos.push(noaux);
			}
		}
		return nos.pop();
	}
	
	private boolean eOperador(char c){
		boolean retorno=false;
		if(c=='+'||c=='-'||c=='*'||c=='/'){
			retorno=true;
		}
		return retorno;
	}
	
	public void percorrer(int modo) {
		if (modo == -1) {
			percorrerPreOrdem(raiz);
		} else if (modo == 0) {
			percorrerEmOrdem(raiz);
		} else {
			percorrerPosOrdem(raiz);
		}
	}
	
	private void percorrerEmOrdem(TreeBinaryNode aux) {
		if (aux != null) {
			if(Character.getNumericValue(aux.getInfo().charAt(0))==-1)
				System.out.print("(");
			//Percorre sub-árvore esquerda em ordem
			percorrerEmOrdem(aux.getLeft());
			//Visita raiz
			System.out.print(aux.getInfo());
			//Percorre sub-árvore direita em ordem
			percorrerEmOrdem(aux.getRight());
			if(Character.getNumericValue(aux.getInfo().charAt(0))==-1)
				System.out.print(")");
		}
	}
	
	private void percorrerPosOrdem(TreeBinaryNode aux) {
		if (aux != null) {
			//Percorre sub-árvore esquerda em pos-ordem
			percorrerPosOrdem(aux.getLeft());
			//Percorre sub-árvore direita em pos-ordem
			percorrerPosOrdem(aux.getRight());
			//Visita raiz
			System.out.print(aux.getInfo() + " ");
		}
	}
	
	private void percorrerPreOrdem(TreeBinaryNode aux) {
		if (aux != null) {
			//Visita raiz
			System.out.print(aux.getInfo() + " ");
			//Percorre sub-árvore esquerda em pré-ordem
			percorrerPreOrdem(aux.getLeft());
			//Percorre sub-árvore direita em pré-ordem
			percorrerPreOrdem(aux.getRight());
		}
	}
}
