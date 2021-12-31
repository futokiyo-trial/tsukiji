package io.github.futokiyo.jounai;


import java.io.Serializable;
import java.util.function.Consumer;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Named;




@Dependent
public class Maguro implements Serializable {

	private static final long serialVersionUID = 6907444496680914818L;

	public void hello(){
		System.out.println("SushiKuinee");
	}

}
