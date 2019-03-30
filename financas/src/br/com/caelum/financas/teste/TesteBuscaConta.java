package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		Conta conta = em.find(Conta.class, 1);
		System.out.println(conta.getTitular());
		System.out.println(conta.getNumero());
		
		
		/*
		 * conta.setTitular("João"); conta.setAgencia("123");
		 * System.out.println(conta.getTitular());
		 * 
		 * em.getTransaction().commit(); em.close();
		 */

//		EntityManager em2 = new JPAUtil().getEntityManager();
//		em2.getTransaction().begin();
//		
//		conta.setTitular("Leonardo");
//		em2.merge(conta);
//		
//		
//		em2.getTransaction().commit();
//		em2.close();		

	}
}
