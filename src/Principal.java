
public class Principal {

	public static void main(String[] args) {
		
		Lista listasequencial = new Lista();
		
		System.out.println("A lista est� vazia? " + listasequencial.estaVazia());
		System.out.println("A lista est� cheia? " + listasequencial.estaCheia());
		System.out.println("A lista tem " + listasequencial.tamanho + " elementos.");
		
		//Parte 2 - Criando objetos
		
		Contato c1 = new Contato();
		c1.nome = "Goku";
		c1.telefone = "1111-1111";
		
		Contato c2 = new Contato();
		c2.nome = "Gohan";
		c2.telefone = "2222-2222";
		
		Contato c3 = new Contato();
		c3.nome = "Goten";
		c3.telefone = "3333-3333";
		
		Contato c4 = new Contato();
		c4.nome = "Bulma";
		c4.telefone = "4444-4444";
	
		//Inserindo objetos na lista sequencial
		listasequencial.inserirContato(0, c1);
		listasequencial.inserirContato(1, c2);
		listasequencial.inserirContato(2, c3);
		listasequencial.inserirContato(3, c4);
		listasequencial.inserirContato(2, c4);
		
		//Exibindo lista:
		listasequencial.exibirLista();
		
		//Removendo o elemento da primeira posi��o:
		listasequencial.remover(0);
		
		//Buscar elemento por �ndice:
		System.out.println("Nome do elemento da terceira posi��o �: " + listasequencial.buscar(2).nome);
		
		//Buscar posi��o do elemento c2:
		System.out.println("Posi��o do contato Gohan �: " + listasequencial.retornarPosicao(c2));

	}

}
