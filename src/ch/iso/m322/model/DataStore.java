package ch.iso.m322.model;

import java.util.ArrayList;

public class DataStore implements IDataStore {

	@Override
	public ArrayList<Eintrag> load(int type) {

		ArrayList<Eintrag> data = new ArrayList<>();

		data.add(new Eintrag("Eintrag 1"));
		data.add(new Eintrag("Eintrag 2"));
		data.add(new Eintrag("Eintrag 3"));
		data.add(new Eintrag("Eintrag 4"));

		return data;
	}

	@Override
	public void save(ArrayList<Eintrag> data, int type) {

	}

}
