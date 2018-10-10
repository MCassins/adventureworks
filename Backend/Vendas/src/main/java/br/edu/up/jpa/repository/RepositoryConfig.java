package br.edu.up.jpa.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import br.edu.up.jpa.dominio.*;



@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		super.configureRepositoryRestConfiguration(config);
		config.exposeIdsFor(CabecalhoOrdemVendas.class);
		config.exposeIdsFor(CarrinhoCompras.class);
		config.exposeIdsFor(CartaoCreditoPessoa.class);
		config.exposeIdsFor(CartaoCredito.class);
		config.exposeIdsFor(Cliente.class);
		config.exposeIdsFor(HistoricoCotasVendasPessoas.class);
		config.exposeIdsFor(HistoricoTerritorioVendas.class);
		config.exposeIdsFor(Loja.class);
		config.exposeIdsFor(Moeda.class);
		config.exposeIdsFor(OfertaEspecialProduto.class);
		config.exposeIdsFor(OfertaEspecial.class);
		config.exposeIdsFor(PaisRegiao.class);
		config.exposeIdsFor(PessoaVenda.class);
		config.exposeIdsFor(Produto.class);
		config.exposeIdsFor(RazaoOrdemVendasCabecalho.class);
		config.exposeIdsFor(RazaoVendas.class);
		config.exposeIdsFor(TerritorioVendas.class);
		config.exposeIdsFor(TipoCambio.class);
		
	}
	
}
