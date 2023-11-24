package ch.iso.m322.model;

import java.util.ArrayList;


/**
* data store
* 
* @author Kevin Marrer
* @version 20.11.2023
* 
*/


	public interface IDataStore {


		public static final int LIST = 1;
		
		/**
		 * load list
		 * 
		 * @param type (LIST)
		 * @return ArrayList<Eintrag>
		 */
		
		public ArrayList<Eintrag> load(int type);
		
		/**
		 * 
		 * @param ArrayList<Eintrag>
		 * @param type type (LIST)
		 */
		
		public void save(ArrayList<Eintrag> data, int type); 
		
}
