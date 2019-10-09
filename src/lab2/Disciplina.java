package lab2;

import java.util.Arrays;

/**
 * Representação de uma disciplina que o estudante esta cursando.
 * 
 * @author Gabriel Menezes Cabral
 */
public class Disciplina {
	
	/**
	 * Horas de estudo da disciplina, representada por um numero inteiro.
	 */
	private int horas;
	
	/**
	 * Eh a media das notas do estudante na disciplina.
	 * Ou seja, a soma das 4 notas do aluno, dividido por 4.
	 * Representada por um numero com casa decimal.
	 */
	private double media;
	
	/**
	 * Um Array que guarda as 4 notas do aluno na disciplina.
	 * Inicialmente esse Array contem todas as 4 notas com o valor "0.0" que vao 
	 * sendo substituidas pelas notas que sao passadas como parametros no metodo "cadastraNotas".
	 */
	private double[] notas;
	
	/**
	 * O nome da disciplina que o estudante esta cursando.
	 */
	private String nomeDaDisciplina;
	
	/**
	 * Constroi uma disciplina a partir do nome dela.
	 * Ele tambem esta determinando o tamanho do Array "notas", que no caso é de tamanho 4.
	 * 
	 * @param nomeDaDisciplina eh o nome da disciplina. 
	 */
	public Disciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.notas = new double[4];
	}
	
	/**
	 * Soma ao atributo "cadastraHoras" a quantidade de horas passado no parametro.
	 * 
	 * @param horas eh a quantidade de horas de estudo da discilpina.
	 */
	public void cadastraHoras(int horas) {
		this.horas += horas;
	}
	
	/**
	 * Adiciona ao Array "notas" as notas que o estudante tirou na discilpina. Essas notas sao numeros com casa decimal.
	 * 
	 * @param nota eh a numeracao da prova, se eh a primeira(1), a segunda(2), a terceira(3) ou a quarta(4).
	 * @param valorNota eh a pontuacao que ele atingiu naquela prova.
	 */
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota -1] = valorNota;
	}
	/**
	*Metodo responsável por calcular média das notas na dsiciplina
	*
	*/
	public double calculaMedia(){
		return (this.notas[0] + this.notas[1] + this.notas[2] + this.notas[3])/4;
	}
	
	/**
	 * Retorna um valor Booleano "true" ou "false".
	 * "true" se a media for maior ou igual a 7.0.
	 * "false" se essa condicao nao for obedecida.
	 * 
	 * @return um valor Booleano "true" ou "false".
	 */
	public boolean aprovado() {
		if ((this.calculaMedia) >= 7){
			return true;
		}
		return false;
	}
	
	/**
	 * Retorna a String que representa a disciplina, juntamente com as horas de estudo, 
	 * a media necessaria pra passar e um Array com as notas do estudante na disciplina.
	 * A representacao segue o formato: "NOME DA DISCIPLINA" "HORAS" "MEDIA	NECESSARIA" "ARRAY COM AS NOTAS".
	 * 
	 * @return a representacao da disciplina que o aluno esta cursando, com a quantidade de horas, a media suficiente pra passar, e um Array coma as notas dele.
	 */
	public String toString() {
		return nomeDaDisciplina + " " + horas + " " + media + " " + Arrays.toString(notas);
	}
}
