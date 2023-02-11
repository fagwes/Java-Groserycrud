package pages;

import elementos.Elementos;
import metodos.MetodosDeTestes;

public class AddUserPage {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	Elementos elementos = new Elementos();
	
	
public void selectVersion(String Versao) {
	
	metodos.escrever(elementos.version, Versao);
	
	
}

public void cadastrar(String contactFirstName) {
	
}
}
