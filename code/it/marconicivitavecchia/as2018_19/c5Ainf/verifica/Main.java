
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Ainf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Verifica in laboratorio");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(500,500);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1> SSh First Aid </h1>");
		
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<div style=display table>");
		sb.append("<div style=display table-row>");
		sb.append("alias");
		sb.append("</div>");
		sb.append("</div>");
		sb.append("<div style=display table-row>");
		sb.append("raspberry");
		sb.append("</div>");
		sb.append("<div style=display table-row>");
		sb.append("coreswitch");
		sb.append("</div>");
		
		
		
		
		
		
		
	    // TODO Convertire lo StringBuilder in String
		String htmltext = sb.toString();
		
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmltext));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

