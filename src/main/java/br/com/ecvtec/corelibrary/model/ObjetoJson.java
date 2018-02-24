package br.com.ecvtec.corelibrary.model;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjetoJson extends HashMap<String, Object>{

	private static final long serialVersionUID = 6101831264015913584L;

	public ObjetoJson() {
		super();
	}

	public ObjetoJson(int initialCapacity) {
		super(initialCapacity);
	}

}
