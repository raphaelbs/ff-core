package br.com.ecvtec.corelibrary.jackson;

import java.io.IOException;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.ecvtec.corelibrary.model.T1003;

public class SerializadorT1003 extends StdSerializer<Set<T1003>>{

	private static final long serialVersionUID = 5600845705377583568L;

	public SerializadorT1003() {
		this(null);
	}
	
	public SerializadorT1003(Class<Set<T1003>> t) {
		super(t);
	}

	@Override
	public void serialize(Set<T1003> t1003s, JsonGenerator jgen, SerializerProvider provider) 
			throws IOException {
		jgen.writeStartArray();
		for(T1003 t1003 : t1003s)
			if(t1003.getC3_1003_1002()==null)
				jgen.writeObject(t1003);
		jgen.writeEndArray();
	}

}
