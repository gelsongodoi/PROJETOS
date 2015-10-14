package br.unisinos.financeiro.test.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.usuario.Usuario;

public class HibernateUtilTest {

	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;

	public static synchronized Session getSession() {
		
		if (factory == null) {
			Configuration config = new Configuration()
					.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
					.setProperty("hibernate.connection.url", "jdbc:postgresql:financeiro")
					.setProperty("hibernate.connection.username", "postgres")
					.setProperty("hibernate.connection.password", "postgres")
					.setProperty("hibernate.show_sql", "true")
					.setProperty("hibernate.hbm2ddl.auto", "create-drop")
					//.setProperty("hibernate.hbm2ddl.auto", "update")
					//.setProperty("hibernate.hbm2ddl.auto", "none")
					.addAnnotatedClass(Usuario.class)
					.addAnnotatedClass(Conta.class);

			serviceRegistry = new ServiceRegistryBuilder()
									.applySettings(config.getProperties())
										.buildServiceRegistry();
			factory = config.buildSessionFactory(serviceRegistry);
		}
		
		return factory.openSession();
	}

}