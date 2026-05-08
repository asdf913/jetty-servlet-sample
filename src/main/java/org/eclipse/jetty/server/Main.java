package org.eclipse.jetty.server;

import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;

import jakarta.servlet.http.MainServlet;

public class Main {

	public static void main(final String[] args) throws Exception {
		//
		final ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
		//
		servletContextHandler.setContextPath("/");
		//
		servletContextHandler.addServlet(new ServletHolder(new MainServlet()), "/");
		//
		final Server server = new Server(8080);
		//
		server.setHandler(servletContextHandler);
		//
		server.start();
		//
		server.join();
		//
	}

}