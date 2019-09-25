package lab2;

/**
 * Representacao da conta de um estudante no Laboratorio. 
 * Em que se tem o espaço total da conta, e o aluno pode consumir ou liberar espaço nela.
 * 
 * @author Gabriel Menezes Cabral
 */
public class ContaLaboratorio {
	
	/**
	 * A cota maxima, ou seja, o limite de espaco disponivel de MegaBytes que o estudante pode preencher na conta dele.
	 * Representada por um numero inteiro.
	 */
	private int cotaMaxima;
	
	/**
	 * Quantidade de MegaBytes ocupados na conta do aluno.
	 * Representada por um numero inteiro.
	 */
	private int quantidadeMegaBytesAtual;
	
	/**
	 * O nome do Laboratorio que o estudante esta cadastrado.
	 */
	private String nomeLaboratorio;
	
	/**
	 * Constroi uma conta em determinado Laboratorio para o estudante, com uma cota máximo de 2000 MegaBytes disponibilizado para o aluno.
	 * 
	 * @param nomeLaboratorio cria uma conta com o nome do Laboratorio.
	 */
	public ContaLaboratorio(String nomeLaboratorio) {
		this(nomeLaboratorio, 2000);
	}
	
	/**
	 * Constroi uma conta em determinado Laboratorio para o estudante, com uma cota máximo de MegaBytes disponibilizado para o aluno.
	 * 
	 * @param nomeLaboratorio o nome do Laboratorio ao qual a conta vai ser vinculada.
	 * @param cotaMaxima o espaco maximo da conta, no padrao MegaBytes.
	 */
	public ContaLaboratorio(String nomeLaboratorio, int cotaMaxima) {
		this.nomeLaboratorio = nomeLaboratorio;
		
		this.cotaMaxima = cotaMaxima;
	}
	
	/**
	 * Adiciona no atributo "quantidadeMegaBytesAtual", a quantidade de MegaBytes consumida pelo aluno.
	 * 
	 * @param mbytes a quantidade de MegaBytes consumida pela aluno. 
	 */
	public void consomeEspaco(int mbytes) {
		this.quantidadeMegaBytesAtual += mbytes;
	}

	/**
	 * Diminui no atributo "quantidadeMegaBytesAtual", a quantidade de MegaBytes liberada pelo aluno.
	 * 
	 * @param mbytes a quantidade de MegaBytes liberada pelo aluno.
	 */
	public void liberaEspaco(int mbytes) {
		this.quantidadeMegaBytesAtual -= mbytes;  
	}

	/**
	 * Retorna um valor Booleano: "true" ou "false".
	 * "true" se o atributo "quantidadeMegaBytesAtual" for maior ou igual ao atributo cotaMaxima.
	 * "false" se não obedecer a essa condicao.
	 * 
	 * @return "true" ou "false" de acordo com a condição passada.
	 */
	public boolean atingiuCota() {
		return quantidadeMegaBytesAtual >= cotaMaxima;
	}
	
	/**
	 * Retorna a String que representa a conta do estudante em determinado laboratorio, 
	 * juntamente com a quantidade de MegaBytes consumida por ele e a cota maxima permitada.
	 * A representação segue o formato: "NOME DO LABORATORIO" "QUANTIDADE DE MEGABYTES USADA"/"COTA MAXIMA".
	 * 
	 * @return a representação da conta do aluno com o nome do laboratorio, além da quantidade de MegaBytes usada e a cota maxima. 
	 */
	public String toString() {
		return nomeLaboratorio + " "+ quantidadeMegaBytesAtual + "/" + cotaMaxima;
	}
}
