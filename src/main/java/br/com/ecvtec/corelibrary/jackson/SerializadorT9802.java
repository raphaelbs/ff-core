package br.com.ecvtec.corelibrary.jackson;

import java.io.IOException;
import java.util.Comparator;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.ecvtec.corelibrary.model.T9802;

public class SerializadorT9802 extends StdSerializer<T9802>{

	private static final long serialVersionUID = -6271893704993267147L;

	public SerializadorT9802() {
		this(null);
	}
	
	public SerializadorT9802(Class<T9802> t) {
		super(t);
	}

	@Override
	public void serialize(T9802 t9802, JsonGenerator jgen, SerializerProvider provider) 
			throws IOException {
		if(t9802.getC5_9802_9802() != null) return;
		jgen.writeStartObject();
		jgen.writeNumberField("c1_9802", t9802.getC1_9802());
		if(t9802.getC3_9802() != null) jgen.writeStringField("c3_9802", t9802.getC3_9802());
		jgen.writeObjectField("c4_9802_5002", t9802.getC4_9802_5002());
		if(t9802.getC6_9802() != null) jgen.writeStringField("c6_9802", t9802.getC6_9802());
		jgen.writeNumberField("c7_9802", t9802.getC7_9802());
		if(t9802.getC8_9802_801() != null) jgen.writeObjectField("c8_9802_801", t9802.getC8_9802_801());
		if(t9802.getT9802C5() == null || t9802.getT9802C5().isEmpty()){
			jgen.writeEndObject();
			return;
		}
		t9802.getT9802C5().sort(new Comparator<T9802>() {
			@Override
			public int compare(T9802 o1, T9802 o2) {
				return o1.getC7_9802() - o2.getC7_9802();
			}
		});
		jgen.writeArrayFieldStart("t9802C5");
		for(T9802 t9802o : t9802.getT9802C5()){
			t9802o.setC5_9802_9802(null);
			jgen.writeObject(t9802o);
		}
		jgen.writeEndArray();
		jgen.writeEndObject();
	}

}
