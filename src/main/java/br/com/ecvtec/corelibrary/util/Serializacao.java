package br.com.ecvtec.corelibrary.util;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializacao {

	public static Map<String,Object> getMapFromJSON(String jsonEntidade){
		String json = jsonEntidade;
		Map<String,Object> map = new HashMap<>();
		ObjectMapper mapper = new ObjectMapper();
		try { 
		    //convert JSON string to Map
		    map = mapper.readValue(json, new TypeReference<HashMap<String,Object>>(){});
		} catch (Exception e) {
		    e.printStackTrace(System.out);
		}
		
		return map;
	}
        
        public static void serializaoGenericaPorReflexao(Object entidadePOJO, 
                Map<String, Object> generico) 
                throws IllegalArgumentException, 
                NoSuchFieldException, 
                SecurityException, 
                IllegalAccessException 
        {
            Class entidadeReflection = entidadePOJO.getClass();
            Field[] propriedades = entidadeReflection.getFields();
            for(Field prop : propriedades){

                Object valorProp = generico.get(prop.getName());

                if(prop.getType().isPrimitive()){
                    entidadePOJO
                            .getClass()
                            .getField(prop.getName())
                            .set(entidadePOJO, valorProp);
                }else if(prop.getType().isArray()){
                    ArrayList<Object> valorArray = (ArrayList<Object>) generico.get(prop.getName());
                    entidadePOJO
                            .getClass()
                            .getField(prop.getName())
                            .set(entidadePOJO, valorArray) ;
                }else if(prop.getType().isInstance(prop.getType())){

                }
            }
        }
}
