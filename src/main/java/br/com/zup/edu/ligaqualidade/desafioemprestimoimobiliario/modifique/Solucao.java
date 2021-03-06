package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import java.util.ArrayList;
import java.util.List;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.dto.GenericInstanceDTO;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.factory.AddresserFactory;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.factory.InstancesFactory;

public class Solucao {

	private static final InstancesFactory factory = new InstancesFactory();

	private static final AddresserFactory addresser = new AddresserFactory();
	
	public static String processMessages(List<String> messages) {

		List<GenericInstanceDTO> objects = new ArrayList<>();

		messages.parallelStream().forEach(row -> objects.add(factory.create(row)));

		return addresser.addressAccordingEventSchema(objects);
	}


}