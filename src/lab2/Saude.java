package lab2;

/**
 * Representacao da Saude do estudante, levando em cosideracao tanto o aspecto fisico fisico quanto mental.
 * 
 * @author Gabriel Menezes Cabral
 */
public class Saude {
	
	/**
	 * A saude mental do estudante. Podendo ser "fraca" ou "boa".
	 */
	private String saudeMental;
	
	/**
	 * A saude fisica do estudante. Pondendo ser "fraca" ou "boa".
	 */
	private String saudeFisica;
	
	/**
	 * Constroi uma ficha sobre a saude do aluno.
	 * Inicialmente, a doenca tanto fisica quanto mental sao classificadas como "boa".
	 */
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
	}
	
	/**
	 * Determina a saude mental do aluno, definindo o atributo "saudeMental" com o parametro passado.
	 * 
	 * @param valor eh a classificacao da saude, podendo ser "fraca" ou "boa.
	 */
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}
	
	/**
	 * Determina a saude fisica, do aluno, definindo o atributo "saudeFisica" com o parametro passado.
	 * 
	 * @param valor eh a classificacao da saude, podendo ser "fraca" ou "boa". 
	 */
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}
	
	/**
	 * Retorna a String status, que contem a classificacao da saude do estudante, feita a partir da analise da saude tanto fisica quanto mental do aluno.
	 * Se ambas forem "boa", entao a saude geral dele sera classificada como "boa".
	 * Se uma for "fraca" e a outra "boa", entao a saude geral dele sera classificada como "ok".
	 * Se as duas forem "fraca", entao a saude geral dele sera classificada como "fraca".
	 * Entao essa classificacao sera guardada no status, que por sua vez sera retornado no final. 
	 * 
	 * @return retorna a String status
	 */
	public String getStatusGeral() {
		String status = "";
		if (saudeMental.equals("boa") && saudeFisica.equals("boa")) {
			status =  "boa";
		}
		else if (saudeMental.equals("boa") && saudeFisica.equals("fraca")) {
			status = "ok";
		}
		else if (saudeMental.equals("fraca") && saudeFisica.equals("boa")) {
			status = "ok";
		}
		else if (saudeMental.equals("fraca") && saudeFisica.equals("fraca")) {
			status = "fraca";
		}
		return status;
	}
}
