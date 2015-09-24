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

import com.voiturier.service.IEtablissementService;
import com.voiturier.service.VueEtablissement;
import com.voiturier.service.ex.ErreurTechniqueException;

/**
 * Servlet implementation class ServletInscriptionEtablissement
 */
@WebServlet("/ServletInscriptionEtablissement")
public class ServletInscriptionEtablissement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletInscriptionEtablissement() {
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
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* Récupération des champs du formulaire. */
		String raisonsociale = request.getParameter("raisonSociale");
		String typeEtablissement = request.getParameter("typeEtablissement");
		String siret = request.getParameter("siret");
		String adresse = request.getParameter("adresse");
		String codePostal = request.getParameter("codePostal");
		String ville = request.getParameter("ville");
		String nomContact = request.getParameter("nomContact");
		String fonction = request.getParameter("fonction");
		String emailEtablissement = request.getParameter("emailEtablissement");
		String mdpEtablissement = request.getParameter("mdpEtablissement");
		WebApplicationContext appContext = WebApplicationContextUtils
				.getWebApplicationContext(request.getServletContext());

		IEtablissementService serv = appContext.getBean(IEtablissementService.class);
		VueEtablissement ve = new VueEtablissement(raisonsociale, typeEtablissement, "0102030405", "mimi.com",
				nomContact, emailEtablissement, fonction, mdpEtablissement, adresse, codePostal, ville, siret,
				Integer.valueOf(1));
		try {
			serv.inscription(ve);

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
