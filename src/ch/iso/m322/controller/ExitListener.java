package ch.iso.m322.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import ch.iso.m322.util.ReferenceFinder;

public class ExitListener implements ActionListener {

	@Override

	public void actionPerformed(ActionEvent e) {
		Component item = (Component) e.getSource();
		JFrame frame = ReferenceFinder.findFrame(item);
		frame.setVisible(true);
		frame.dispose();

		// force exit
		System.exit(0);
	}

}
