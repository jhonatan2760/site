package com.jhonatansouza.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String [] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("CRUD_JPA").createEntityManager();
		
		System.out.println("Tabelas criadas.");
		
	}
	
	
}
