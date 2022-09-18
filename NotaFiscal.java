package ProjetoCafeteria;

public class NotaFiscal extends Cliente {
	
	private double total;
	private String produtos;
	private double valorUnit;
	
	public NotaFiscal(double total, String produtos, double valorUnit) {
		super(produtos, dataNascimento, produtos, produtos, produtos, dataNascimento);
		this.total = total;
		this.produtos = produtos;
		this.valorUnit = valorUnit;
	}
                                             



	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public double getValorUnit() {
		return valorUnit;
	}

	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;

}
}