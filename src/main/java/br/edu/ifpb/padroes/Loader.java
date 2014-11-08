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
		 * Aqui o local da nossa aplica��o. A classe Locale contem um enum com v�rios locais
		 * Incluindo US. Ao utilizar "Locale.getDefault()", temos o local definido pela JVM, que �
		 * o mesmo da m�quina que ela est� instalada.
		 */
		Locale locale = Locale.getDefault();
		
		/*
		 * O nome 'base' para o nosso arquivo de Strings internacionalizadas.
		 * Veja dentro de src/main/resources que temos 2 arquivos que come�am com "i18n"
		 * Isso � o basename! O que complementa o nome do arquivo � a que linguagem ele
		 * pertence! "en_US" no caso de Ingl�s Americano ou "pt_BR" para Portugu�s do Brasil
		 */
		String basename ="i18n";
		
		/*
		 * Recuperamos o ResourceBundle para a localidade que definimos
		 */
		ResourceBundle resourceBundle = ResourceBundle.getBundle(basename, locale);
		
		/*
		 * Imprimimos as Strings, independente de que linguagem esteja sendo utilizada.
		 * Perceba que os nomes das chaves s�o os mesmos dentro dos dois arquivos
		 */
		System.out.println(resourceBundle.getString("app.name"));
		System.out.println(resourceBundle.getString("app.author"));
		System.out.println(resourceBundle.getString("app.copyright"));
	}

}
