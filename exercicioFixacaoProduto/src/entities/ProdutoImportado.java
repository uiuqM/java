package entities;

public class ProdutoImportado extends Produto{
	private Double taxaAlfandega;
	
	public ProdutoImportado() {
		super();
	}
	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}
	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	@Override
	public String etiqueta() {
		return getNome()+" - R$"+String.format("%.2f", valorTotal())+
				" Taxa alfandega: "+String.format("%.2f", taxaAlfandega);
	}
	public Double valorTotal() {
		return preco+taxaAlfandega;
	}
}
