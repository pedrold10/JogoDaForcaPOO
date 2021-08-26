package JogoDaForca;

import java.io.BufferedReader;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.Line;
import java.util.Arrays;

/**
 * Projeto1 de POO
 * Grupo de alunos:  Pedro Gabriel (Matricula: 20192370019)
 *
 */


public class JogoDaForca {
	private final int N; 
	private String[] palavras; 
	private String[] dicas; 
	private String palavra;
	private int indice = -1; 
	private int acertos; 
	private int erros; 
	private String[] penalidades = {"perna","perna","braço","braço","tronco","cabeça"};
	private String[] arquivos = {"pes.jpg","pernas.jpg","maos.jpg","bracos.jpg","tronco.jpg","cabeca.jpg"};


	public JogoDaForca(String nomearquivo) throws Exception{
		try {
			Scanner arquivo = new Scanner(new File(nomearquivo));
			N = Integer.parseInt(arquivo.nextLine());
			indice = new Random().nextInt(N);
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

	public void iniciar() {
		palavra = "*".repeat(palavras[indice].length());
		char[] palavra2 = palavra.toCharArray();
		palavra = String.valueOf(palavra2);
	}

	public boolean adivinhou(String letra) {
		letra = letra.toUpperCase();
		String palavraReal = palavras[indice].toUpperCase();
		if(palavraReal.contains(letra)) {
			acertos++;
			char[] palavraArray = palavra.toCharArray();
			char[] palavraRealArray= palavraReal.toCharArray();
			for(int i=0; i<palavraReal.length(); i++) {
				if(letra.charAt(0)==palavraRealArray[i]) {
					palavraArray[i] = letra.charAt(0);	
				}
			}
			palavra =  String.valueOf(palavraArray);
			return true;
		}else {
			erros++;
			return false;
		}
	}

	public boolean terminou() {
		if(this.erros==6 || palavras[indice].equals(palavra)) {
			return true;
		}else {
			return false;
		}
	}

	public String getPalavra() {
		return this.palavra;
	}

	public String getDica() {
		return this.dicas[indice];
	}


	public String getPenalidade() {
		return this.penalidades[getErros()-1];
	}


	public int getAcertos() {
		return this.acertos;
	}

	public int getErros() {
		return this.erros;
	}

	public String getResultado() {
		if(acertos>erros) {
			return("Você ganhou");
		}else {
			return("Você foi enforcado");
		}
	}

	
}