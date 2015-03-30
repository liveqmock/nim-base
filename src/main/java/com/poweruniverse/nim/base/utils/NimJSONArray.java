package com.poweruniverse.nim.base.utils;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class NimJSONArray {
		private List<NimJSONObject> array = null;
		
		public NimJSONArray() {
			super();
			this.array = new ArrayList<NimJSONObject>();
		}
	
		public NimJSONArray(JSONArray array) {
			super();
			this.array = new ArrayList<NimJSONObject>();
			if(array!=null){
				for(int i=0;i<array.size();i++){
					this.array.add(new NimJSONObject(array.getJSONObject(i)));
				}
			}
			
		}

	   public void add( JSONObject value ) {
		   this.array.add(new NimJSONObject(value));
	   }

	   public boolean add( NimJSONObject value ) {
	      return this.array.add( value);
	   }

	   public NimJSONObject get( int index ) {
		   return this.array.get(index);
	   }

	   public NimJSONObject getJSONObject( int index ) {
		   return this.array.get(index);
	   }

	   public int size() {
		   return this.array.size();
	   }

	   public String toString() {
		   
		  try{
			  if(this.size()==0){
				   return "[]";
			   }
			  StringBuffer ab = new StringBuffer();
			  
			  ab.append("[");
			  for(int i=0;i<this.size();i++){
				  if(i>0){
					  ab.append(",");
				  }
				  ab.append(this.array.get(i).toString());
			   }
			  ab.append("]");
	         return ab.toString();
	      }catch( Exception e ){
	         return null;
	      }
	   }
	  
	   public JSONArray getJSON() {
		   if(this.array == null){
			   return null;
		   }
		   JSONArray aa = new JSONArray();
		   for(int i=0;i<this.size();i++){
			   aa.add(this.array.get(i).getJSON());
			}
		   return aa;
	   }
	   
	   public static NimJSONArray fromObject(Object object) {
		   return new NimJSONArray(JSONArray.fromObject(object));
	   }
	   
}
