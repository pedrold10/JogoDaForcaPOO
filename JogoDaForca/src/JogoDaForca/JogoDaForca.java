package JogoDaForca;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.Line;
import java.util.Arrays;

/**
 * Projeto1 de POO
 * Grupo de alunos:  ???
 *
 */


public class JogoDaForca {
	private final int N; // quantidade de palavras do arquivo (lido do arquivo)
	private String[] palavras; // um array com as N palavras (lidas do arquivo)
	private String[] dicas; // um array com as N dicas (lidas do arquivo)
	private String palavra;
	private int indice = -1; // indice da palavra sorteadado jogo
	private int acertos; // total de acertos do jogo
	private int erros; // total de erros do jogo
	private String[] penalidades = {"perna","perna","bra�o","bra�o","tronco","cabe�a"};
	private String[] arquivos = {"pes.jpg","pernas.jpg","maos.jpg","bracos.jpg","tronco.jpg","cabeca.jpg"};
	 /*� retorna true, caso a letra exista dentro da palavra sorteada e
	retorna false, caso contr�rio. Al�m disso, o m�todo marca as posi��es encontradas e contabiliza X
	acertos para as X ocorr�ncias da letra encontrada dentro da palavra ou contabiliza 1 erro para a
	inexist�ncia da letra na palavra.*/

	public JogoDaForca(String nomearquivo) throws Exception{
		try {
			Scanner arquivo = new Scanner(new File(nomearquivo));
			N = Integer.parseInt(arquivo.nextLine());
			palavras = new String[N]; 
			dicas    = new String[N];
			String linha;
			int counter = 0;
			while(arquivo.hasNextLine()) {
				linha = arquivo.nextLine();
				String[] partes = linha.split(";");
				palavras[counter] = partes[0];
				dicas[counter] = partes[1];		
				//String[] letras = palavra.split("");
				counter++;
			}
			arquivo.close();
		}
		catch(Exception e){
			throw new Exception("Arquivo inexistente");
		}
	}

		int sorteio = new Random().nextInt(N);
	public void iniciar() {
		palavra = palavras[sorteio];
		String letra;
		for(int i=0 ; i<palavra.length(); i++) {
			letra = palavra.substring(i, i+1); //obt�m a letra da posi��o i
			System.out.println(letra);
			palavra = "*".repeat(palavra.length());
			char[] palavra2 = palavra.toCharArray();
			palavra = String.valueOf(palavra2);
		}
	}

	public boolean adivinhou(String letra) {
		if(palavra.contains(letra)) {
			acertos+=1;
			for(int i=0; i<palavra.length(); i++) {
				char[] palavraArray= palavra.toCharArray();
				if(letra.equals(palavraArray[i])) {
				}
			return true;
			}
		}else {
			erros++;
			return false;
		}
		return letra != null;
	}

	public boolean terminou() {
		if(this.erros==6 || this.acertos==palavra.length()) {
			return true;
		}else {
			return false;
		}
	}

	public String getPalavra() {
		return palavra;
	}

	public String getDica() {
		return dicas[sorteio];
	}


	public String getPenalidade() {
		return penalidades[getErros()-1];
	}

	public int getAcertos() {
		return this.acertos;
	}

	public int getErros() {
		return this.erros;
	}

	public String getResultado() {
		if(acertos==palavras[]) {
			
		}
	}

	
}