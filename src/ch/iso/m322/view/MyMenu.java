package ch.iso.m322.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ch.iso.m322.controller.DeleteItemsListener;
import ch.iso.m322.controller.DeleteSelectedItemListener;
import ch.iso.m322.controller.ExitListener;
import ch.iso.m322.ressources.MenuConstants;


public class MyMenu extends JMenuBar {

	private static final long serialVersionUID = 1946531818542677119L;

	public MyMenu() {
		super();
		createToolsMenu();
	}



	private void createToolsMenu() {
		
		final JMenu menuTools = new JMenu(MenuConstants.MENU_TOOLS);
		final JMenuItem itemExit = new JMenuItem(MenuConstants.MENU_TOOLS_EXIT);
		final JMenuItem itemDelete = new JMenuItem(MenuConstants.MENU_TOOLS_DEL);
		final JMenuItem itemDeleteSelected = new JMenuItem(MenuConstants.MENU_TOOLS_DEL_SELECTED);
		
		itemExit.addActionListener(new ExitListener());
		itemDelete.addActionListener(new DeleteItemsListener());
		itemDeleteSelected.addActionListener(new DeleteSelectedItemListener());
		
		menuTools.add(itemDelete);
		menuTools.add(itemDeleteSelected);
		menuTools.add(itemExit);
		this.add(menuTools);
	}
}
