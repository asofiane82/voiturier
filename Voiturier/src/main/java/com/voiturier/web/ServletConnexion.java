package com.voiturier.web;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.voiturier.entity.IUtilisateurEntity;
import com.voiturier.service.IAuthentificationService;

/**
 * Servlet implementation class ServletConnexion
 */
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static Log LOG = LogFactory.getLog(ServletConnexion.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletConnexion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (ServletConnexion.LOG.isInfoEnabled()) {
			ServletConnexion.LOG.info("-- Debut -- " + this.getClass());
		}
		WebApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(request.getServletContext());
		String login = request.getParameter("inLogin");
		String pwd = request.getParameter("inPass");

		if ((login != null) && (pwd != null)) {
			IUtilisateurEntity utilisateur = null;
			try {
				IAuthentificationService serviceAuth = appContext.getBean(IAuthentificationService.class);
				utilisateur = serviceAuth.authentifier(login, pwd);
				if (utilisateur != null) {
					if (ServletConnexion.LOG.isInfoEnabled()) {
						ServletConnexion.LOG.info("Bonjour " + utilisateur.getNom() + " " + utilisateur.getPrenom());
					}
					request.getSession(true).setAttribute("utilisateur", utilisateur);
				} else {
					request.setAttribute("autFailed", "login ou mot de passe non valide");
					request.getRequestDispatcher("connexion.jsp").forward(request, response);
					return;
				}

			} catch (Throwable e) {
				ServletConnexion.LOG.fatal("Erreur", e);
				System.exit(-1);
			}
			if (ServletConnexion.LOG.isInfoEnabled()) {
				ServletConnexion.LOG.info("-- Fin -- " + this.getClass());
			}
			request.getRequestDispatcher("map.html").forward(request, response);
		}
	}

}
