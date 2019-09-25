package lab2;

/**
 * Representacao da Conta de um estudante, em uma cantina da UFCG.
 * 
 * @author Gabriel Menezes Cabral
 */
public class ContaCantina {
	
	/**
	 * A quantidade de itens de determinado produto que o estudante comprou na cantina.
	 */
	private int qtdItens;
	
	/**
	 * A divida que o aluno tem na cantina, ou seja, o valor total que ainda nao foi pago na cantina por ele.
	 */
	private int divida;
	
	/**
	 * O nome da cantina que ele tem a conta.
	 */
	private String nomeDaCantina;
	
	/**
	 * O valor total da compra dele na cantina, levando em consideracao a quantidade de itens que ele comprou e o preco deles.
	 */
	private int valorTotal;
	
	/**
	 * Constroi uma conta na Cantina para o estudante.
	 * 
	 * @param nomeDaCantina eh o nome da Cantina que le criou uma conta.
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	
	/**
	 * Adicinona ao atributo "qtdItens" a quantidade de itens que ele comprou na Cantina.
	 * Também soma ao atributo "divida" e ao atributo "valorTotal" o valor em Centavos pela compra que ele fez. 
	 * 
	 * @param qtdItens eh a quantidade de itens.
	 * @param valorCentavos eh o valor, em Centavos, que o aluno deve pagar por sua compra na Cantina.
	 */
    public void cadastraLanche(int qtdItens, int valorCentavos) {
    	this.qtdItens += qtdItens;
    	this.divida += valorCentavos;
    	this.valorTotal += valorCentavos;
    }
	
    /**
     * Subtrai o valor em Centavos, da conta que foi paga pelo estudante, do atributo "divida". 
     * 
     * @param valorCentavos eh o valor pago pelo aluno, em Centavos, para ser quitado da sua divida na conta.
     */
    public void pagaConta(int valorCentavos) {
    	this.divida -= valorCentavos;
    }
	
    /**
     * Retorna o inteiro que representa a divida do aluno.
     * 
     * @return a representacao em inteiro da  divida.
     */
    public int getFaltaPagar() {
    	return divida;
    }
	
    /**
     * Retorna a String que representa a conta do aluno na cantina.
     * A representacao segue o formato: "NOME DA CANTINA" "QUANTIDADE DE ITENS" "O VALOR TOTAL DA COMPRA".
     * 
     * @return a representacao em String da conta do estudante na Cantina.
     */
    public String toString() {
    	return nomeDaCantina + " " + qtdItens + " " + valorTotal;
    }
}
