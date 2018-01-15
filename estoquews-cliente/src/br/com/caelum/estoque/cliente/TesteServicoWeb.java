package br.com.caelum.estoque.cliente;

public class TesteServicoWeb {

	public static void main(String[] args) {
		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSPort();
		Filtros filtros = new Filtros();
		Filtro filtro = new Filtro();
		filtro.setNome("Iphone");
		filtro.setTipo("Livro");
		filtros.getFiltro().add(filtro);
		System.out.println(cliente.todosOsItens(filtros));
	}
}
