package com.voiturier.web;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet("/ServletConnexion")
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
			ServletConnexion.LOG.info("-- Debut -- ");
		}
		WebApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(request.getServletContext());
		String login = request.getParameter("inLogin");
		String pwd = request.getParameter("inPass");

		if ((login != null) && (pwd != null)) {

			try {
				IAuthentificationService serviceAuth = appContext.getBean("AuthentificationService",
						IAuthentificationService.class);
				IUtilisateurEntity utilisateur = serviceAuth.authentifier("dj", "dj");
				// if (utilisateur != null) {
				request.getSession(true).setAttribute("loginUser", login);
				request.getSession(true).setAttribute("pwdUser", pwd);
				// }

				if (ServletConnexion.LOG.isInfoEnabled()) {
					ServletConnexion.LOG.info("Bonjour " + utilisateur.getNom() + " " + utilisateur.getPrenom());
				}

			} catch (Throwable e) {
				ServletConnexion.LOG.fatal("Erreur", e);
				System.exit(-1);
			}
			if (ServletConnexion.LOG.isInfoEnabled()) {
				ServletConnexion.LOG.info("-- Fin -- ");
			}
			request.getRequestDispatcher("map.html").forward(request, response);
			// System.exit(0);
		}
	}

}
