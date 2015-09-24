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
import com.voiturier.service.IUtilisateurService;

/**
 * Servlet implementation class ServletMdpo
 */
@WebServlet("/ServletMdpo")
public class ServletMdpo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static Log LOG = LogFactory.getLog(ServletMdpo.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletMdpo() {
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
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {
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
		if (ServletMdpo.LOG.isInfoEnabled()) {
			ServletMdpo.LOG.info("-- Debut -- ");
		}
		WebApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(request.getServletContext());
		String email = request.getParameter("email");
		String mdp = request.getParameter("mdp");

		if (email != null) {

			try {
				IUtilisateurService serviceUtilisateur = appContext.getBean("UtilisateurService",
						IUtilisateurService.class);
				IUtilisateurEntity utilisateur = serviceUtilisateur.mdpoublier(email);
				if (utilisateur != null) {
					// request.getSession(true).setAttribute("loginUser",
					// email);
					request.getSession(true).setAttribute("mdp", mdp);
					// ok
				} else {
					// pas ok
				}

				if (ServletMdpo.LOG.isInfoEnabled()) {
					ServletMdpo.LOG.info("Bonjour il ya une erreur ");
				}

			} catch (Throwable e) {
				ServletMdpo.LOG.fatal("Erreur", e);
			}
			if (ServletMdpo.LOG.isInfoEnabled()) {
				ServletMdpo.LOG.info("-- Fin -- ");
			}
			request.getRequestDispatcher("pwd-recovery.jsp").forward(request, response);
		}

	}
}
