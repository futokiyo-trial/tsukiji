package io.github.futokiyo.jougai;


import java.io.Serializable;
import java.util.function.Consumer;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Named;

import io.github.futokiyo.jounai.Maguro;



public class Edomae {

	

	public void hello(){
		CDI.current().select(Maguro.class).get().hello();
	}

}
