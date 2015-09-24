package com.voiturier.web;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.voiturier.service.IUtilisateurService;
import com.voiturier.service.ex.ErreurTechniqueException;

/**
 * Servlet implementation class ServletInscriptionUtilisateur
 */
@WebServlet("/ServletInscriptionUtilisateur")
public class ServletInscriptionUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletInscriptionUtilisateur() {
		super();
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {

	}

	/**
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* Récupération des champs du formulaire. */
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("emailUtilisateur");
		String mdp = request.getParameter("mdpUtilisateur");
		WebApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(request.getServletContext());

		IUtilisateurService serv = appContext.getBean(IUtilisateurService.class);
		VueParticulierBean vp = new VueParticulierBean(prenom, nom, email, mdp);
		try {
			serv.inscription(vp);
		} catch (NullPointerException | ErreurTechniqueException e) {
			e.printStackTrace();
			// gestion message
			request.getServletContext().getRequestDispatcher("/inscription.jsp").forward(request, response);
			return;
		}
		// message ok
		request.getServletContext().getRequestDispatcher("/connexion.jsp").forward(request, response);

	}

}
