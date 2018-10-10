package br.edu.up.jpa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.up.jpa.dominio.*;
import br.edu.up.jpa.repository.*;

@Service
public class VendasService {

	@Autowired
	public CabecalhoOrdemVendasRepository CabecalhoOrdemVendasRepository;

	@Autowired
	public CarrinhoComprasRepository CarrinhoComprasRepository;

	@Autowired
	public CartaoCreditoPessoaRepository CartaoCreditoPessoaRepository;

	@Autowired
	public CartaoCreditoRepository CartaoCreditoRepository;

	@Autowired
	public ClienteRepository ClienteRepository;

	@Autowired
	public HistoricoCotasVendasPessoasRepository HistoricoCotasVendasPessoasRepository;

	@Autowired
	public HistoricoTerritorioVendasRepository HistoricoTerritorioVendasRepository;

	@Autowired
	public LojaRepository LojaRepository;

	@Autowired
	public MoedaRepository MoedaRepository;

	@Autowired
	public OfertaEspecialProdutoRepository OfertaEspecialProdutoRepository;

	@Autowired
	public OfertaEspecialRepository OfertaEspecialRepository;

	@Autowired
	public PaisRegiaoRepository PaisRegiaoRepository;

	@Autowired
	public PessoaVendaRepository PessoaVendaRepository;

	@Autowired
	public ProdutoRepository ProdutoRepository;

	@Autowired
	public RazaoOrdemVendasCabecalhoRepository RazaoOrdemVendasCabecalhoRepository;

	@Autowired
	public RazaoVendasRepository RazaoVendasRepository;

	@Autowired
	public TerritorioVendasRepository TerritorioVendasRepository;

	@Autowired
	public TipoCambioRepository TipoCambioRepository;


	public Iterable<CabecalhoOrdemVendas> listarCabecalhoOrdemVendas(){
		return CabecalhoOrdemVendasRepository.findAll();
	}

	public Iterable<CarrinhoCompras> listarCarrinhoCompras(){
		return CarrinhoComprasRepository.findAll();
	}

	public Iterable<CartaoCreditoPessoa> listarCartaoCreditoPessoa(){
		return CartaoCreditoPessoaRepository.findAll();
	}

	public Iterable<CartaoCredito> listarCartaoCredito(){
		return CartaoCreditoRepository.findAll();
	}

	public Iterable<Cliente> listarCliente(){
		return ClienteRepository.findAll();
	}

	public Iterable<HistoricoCotasVendasPessoas> listarHistoricoCotasVendasPessoas(){
		return HistoricoCotasVendasPessoasRepository.findAll();
	}

	public Iterable<HistoricoTerritorioVendas> listarHistoricoTerritorioVendas(){
		return HistoricoTerritorioVendasRepository.findAll();
	}

	public Iterable<Loja> listarLoja(){
		return LojaRepository.findAll();
	}

	public Iterable<Moeda> listarMoeda(){
		return MoedaRepository.findAll();
	}

	public Iterable<OfertaEspecialProduto> listarOfertaEspecialProduto(){
		return OfertaEspecialProdutoRepository.findAll();
	}

	public Iterable<OfertaEspecial> listarOfertaEspecial(){
		return OfertaEspecialRepository.findAll();
	}

	public Iterable<PaisRegiao> listarPaisRegiao(){
		return PaisRegiaoRepository.findAll();
	}

	public Iterable<PessoaVenda> listarPessoaVenda(){
		return PessoaVendaRepository.findAll();
	}
	public Iterable<Produto> listarProduto(){
		return ProdutoRepository.findAll();
	}

	public Iterable<RazaoOrdemVendasCabecalho> listarRazaoOrdemVendasCabecalho(){
		return RazaoOrdemVendasCabecalhoRepository.findAll();
	}

	public Iterable<RazaoVendas> listarRazaoVendas(){
		return RazaoVendasRepository.findAll();
	}

	public Iterable<TerritorioVendas> listarTerritorioVendas(){
		return TerritorioVendasRepository.findAll();
	}

	public Iterable<TipoCambio> listarTipoCambio(){
		return TipoCambioRepository.findAll();
	}

	public CartaoCredito createCartaoCredito(CartaoCredito cartaocredito) {

		return CartaoCreditoRepository.save(cartaocredito);

	}

}
