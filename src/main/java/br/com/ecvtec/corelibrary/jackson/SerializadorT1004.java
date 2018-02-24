package br.com.ecvtec.corelibrary.jackson;

import java.io.IOException;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.ecvtec.corelibrary.model.T1004;

public class SerializadorT1004 extends StdSerializer<Set<T1004>>{

	private static final long serialVersionUID = -2607543657120831029L;

	public SerializadorT1004() {
		this(null);
	}
	
	public SerializadorT1004(Class<Set<T1004>> t) {
		super(t);
	}

	@Override
	public void serialize(Set<T1004> t1004s, JsonGenerator jgen, SerializerProvider provider) 
			throws IOException {
		jgen.writeStartArray();
		for(T1004 t1004 : t1004s)
			if(t1004.getC3_1004_1002()==null)
				jgen.writeObject(t1004);
		jgen.writeEndArray();
	}

}
