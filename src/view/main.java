package view;

import java.io.File;
import java.io.IOException;

import controller.Controller;
import interfaces.InterfaceController;

public class main {

	public static void main(String[] args) {
		String path = new File("").getAbsolutePath() + "\\Arquivos";
		String nome = "relatorio";
		InterfaceController sla = new Controller();
		try {
			sla.convertArq(path, nome);
			sla.openFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
