package ch.iso.m322.controller;

import java.util.ArrayList;
import java.util.Iterator;

import ch.iso.m322.model.Eintrag;
import ch.iso.m322.model.DataStore;
import ch.iso.m322.model.IDataStore;

public class EintragLoader implements Iterator<Eintrag> {

	private ArrayList<Eintrag> data;
	private int elm;
	
	public EintragLoader() {
		this.data = new ArrayList<Eintrag>();
		this.elm = 0;
		
		loadData();
	}
	
	private void loadData() {
		IDataStore store = new DataStore();
		this.data = store.load(IDataStore.LIST);
	}
	
	
	@Override
	public boolean hasNext() {
		return (this.elm < data.size());
	}

	@Override
	public Eintrag next() {
		return data.get(this.elm++);
	}


}
