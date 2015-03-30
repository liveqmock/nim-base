package com.poweruniverse.nim.base.utils;

import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONNull;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

public class NimJSONObject {
	private JSONObject json = null;
	
	public NimJSONObject() {
		super();
		this.json = new JSONObject();
	}

	public NimJSONObject(JSONObject json) {
		super();
		this.json = json;
	}

	public Object put (Object key,Object value){
		if(value!=null){
			if(value instanceof NimJSONObject){
				value = ((NimJSONObject)value).getJSON();
			}else if(value instanceof NimJSONArray){
				value = ((NimJSONArray)value).getJSON();
			}
		}
		
		return json.put(key, value);
	}
	
	
	public Object get(String key){
		Object val = json.get(key);
		if(val instanceof JSONObject){
			val = new NimJSONObject((JSONObject)val);
		}else if(val instanceof JSONArray){
			val = new NimJSONArray((JSONArray)val);
		}
		return val;
	}
	public String getString(String key){
		return json.getString(key);
	}
	
	public boolean getBoolean(String key){
		return json.getBoolean(key);
	}
	public double getDouble(String key){
		return json.getDouble(key);
	}

	public int getInt(String key){
		return json.getInt(key);
	}
	
	public boolean has(String key){
		return json.has(key);
	}


	public NimJSONArray getJSONArray(String key){
		return new NimJSONArray(json.getJSONArray(key));
	}

	public NimJSONObject getJSONObject(String key){
		return new NimJSONObject(json.getJSONObject(key));
	}
	public long getLong(String key){
		return json.getLong(key);
	}
	public JSONObject getJSON(){
		return json;
	}

    public static NimJSONObject fromObject(Object object) {
	   return new NimJSONObject(JSONObject.fromObject(object));
    }

//	public String toString() {
//		return this.json.toString().replaceAll("\"\'null\'\"", "\"null\"");
//	}
	
	public String toString() {
      if( this.json.isNullObject() ){
         return JSONNull.getInstance().toString();
      }
      try{
         Iterator keys = this.json.keys();
         
         StringBuffer sb = new StringBuffer( "{" );

         while( keys.hasNext() ){
            if( sb.length() > 1 ){
               sb.append( ',' );
            }
            String o = keys.next().toString();
            sb.append( JSONUtils.quote( o.toString() ) );
            sb.append( ':' );
            Object val = this.get( o );
            if(val instanceof JSONNull){
            	sb.append("\"null\"");
            }else if(val instanceof NimJSONObject){
            	sb.append(val.toString());
            }else if(val instanceof NimJSONArray){
            	sb.append(val.toString());
            }else{
            	sb.append( JSONUtils.valueToString(val) );
            }
            
         }
         sb.append( '}' );
         return sb.toString();
      }catch( Exception e ){
         return null;
      }
   }
}
