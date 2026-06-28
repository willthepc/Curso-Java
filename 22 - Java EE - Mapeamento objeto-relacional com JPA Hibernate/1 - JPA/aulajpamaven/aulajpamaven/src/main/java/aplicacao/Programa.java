package aplicacao;

import dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class Programa {
    public static void main(String[] args) {
        // ============================ PRIMEIRA PARTE ===============================

//        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//        Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
//        Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
//
//        EntityManagerFactory emf = createEntityManagerFactory("exemplo-jpa");
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin(); // Inicia uma transação com o banco de dados
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit(); // Confirma as alterações que fizemos
//        System.out.println("Pronto!");

        EntityManagerFactory emf = createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 2); //Feito para procurar pelo ID

        //Pessoa p = new Pessoa(2, null, null);

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();



        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
