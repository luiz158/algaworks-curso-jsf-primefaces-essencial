package com.algaworks.erp.repository;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.jboss.weld.environment.se.StartMain;
import org.jboss.weld.environment.se.events.ContainerInitialized;

@Singleton
public class WeldSe {

	public static void main(String[] args) {
		StartMain.main(args);
	}

	@Inject
	private Empresas empresas;

	public void run(@Observes ContainerInitialized event) {
		// Nesse projeto, para usar assim é preciso alterar o escopo do
		// produtor de EntityManager de @RequestScoped
		// para @ApplicationScoped dentro de EntityManagerProducer.
		System.out.println("Todas as empresas: " + empresas.todas());
	}

	// public static void main(String[] args) {
	// Weld weld = new Weld();
	//
	// WeldContainer weldContainer = weld.initialize();
	// Instance<Object> instance = weldContainer.instance();
	//
	// WeldSe weldSe = instance.select(WeldSe.class).get();
	// weldSe.run();
	//
	// weldContainer.shutdown();
	//
	// System.out.println("Fim!");
	// }
	//
	// @Inject
	// private Empresas empresas;
	//
	// public void run() {
	// // Nesse projeto, para usar assim é preciso alterar o escopo do
	// // produtor de EntityManager de @RequestScoped
	// // para @ApplicationScoped dentro de EntityManagerProducer.
	//
	// System.out.println("Todas as empresas: " + empresas.todas());
	// }
}
