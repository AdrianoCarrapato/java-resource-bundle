package br.edu.ifpb.padroes;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Exemplo utilizando {@link ResourceBundle} para Strings internacionalizadas.
 * 
 * @author diogo.moreira
 */
public class Loader {

	public static void main(String[] args) {
		
		/*
		 * Aqui o local da nossa aplicação. A classe Locale contem um enum com vários locais
		 * Incluindo US. Ao utilizar "Locale.getDefault()", temos o local definido pela JVM, que é
		 * o mesmo da máquina que ela está instalada.
		 */
		Locale locale = Locale.getDefault();
		
		/*
		 * O nome 'base' para o nosso arquivo de Strings internacionalizadas.
		 * Veja dentro de src/main/resources que temos 2 arquivos que começam com "i18n"
		 * Isso é o basename! O que complementa o nome do arquivo é a que linguagem ele
		 * pertence! "en_US" no caso de Inglês Americano ou "pt_BR" para Português do Brasil
		 */
		String basename ="i18n";
		
		/*
		 * Recuperamos o ResourceBundle para a localidade que definimos
		 */
		ResourceBundle resourceBundle = ResourceBundle.getBundle(basename, locale);
		
		/*
		 * Imprimimos as Strings, independente de que linguagem esteja sendo utilizada.
		 * Perceba que os nomes das chaves são os mesmos dentro dos dois arquivos
		 */
		System.out.println(resourceBundle.getString("app.name"));
		System.out.println(resourceBundle.getString("app.author"));
		System.out.println(resourceBundle.getString("app.copyright"));
	}

}
