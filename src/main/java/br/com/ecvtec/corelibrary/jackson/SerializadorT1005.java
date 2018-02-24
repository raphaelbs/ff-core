package br.com.ecvtec.corelibrary.jackson;

import java.io.IOException;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.ecvtec.corelibrary.model.T1005;

public class SerializadorT1005 extends StdSerializer<Set<T1005>>{

	private static final long serialVersionUID = -7847677526767217084L;

	public SerializadorT1005() {
		this(null);
	}
	
	public SerializadorT1005(Class<Set<T1005>> t) {
		super(t);
	}

	@Override
	public void serialize(Set<T1005> t1005s, JsonGenerator jgen, SerializerProvider provider) 
			throws IOException {
		jgen.writeStartArray();
		for(T1005 t1005 : t1005s)
			if(t1005.getC3_1005_1002()==null)
				jgen.writeObject(t1005);
		jgen.writeEndArray();
	}

}
