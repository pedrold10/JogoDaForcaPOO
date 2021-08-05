//Aluno: Pedro Gabriel 					
//Matrícula:20192370019

package JogoDaForca;

import java.nio.file.Paths;
import java.util.Scanner;

public class JogoDaForca{
	private final int N = 0;
	private String[] palavras; // um array com as N palavras (lidas do arquivo)
	private String[] dicas; // um array com as N dicas (lidas do arquivo)
	private String palavra; // a palavra sorteada
	private int indice =-1; // posição (0 a N-1) da palavra sorteada no array
	private int acertos=0; // total de letras adivinhadas na palavra
	private int erros=0; // total de tentativas erradas
	private String[] penalidades = {"pés","pernas","mãos","braços","tronco","cabeça"};
	private String[] arquivos = {"pes.jpg","pernas.jpg","maos.jpg","bracos.jpg","tronco.jpg","cabeca.jpg"};
	public JogoDaForca(String words){
		Path caminho = Paths.get(null);
	}
	public int getN() {
		return N;
	}
	public String[] getPalavras() {
		return palavras;
	}
	public void setPalavras(String[] palavras) {
		this.palavras = palavras;
	}
	public String[] getDicas() {
		return dicas;
	}
	public void setDicas(String[] dicas) {
		this.dicas = dicas;
	}
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	public int getAcertos() {
		return acertos;
	}
	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}
	public int getErros() {
		return erros;
	}
	public void setErros(int erros) {
		this.erros = erros;
	}
	public String[] getPenalidades() {
		return penalidades;
	}
	public void setPenalidades(String[] penalidades) {
		this.penalidades = penalidades;
	}
	public String[] getArquivos() {
		return arquivos;
	}
	public void setArquivos(String[] arquivos) {
		this.arquivos = arquivos;
	}
}
