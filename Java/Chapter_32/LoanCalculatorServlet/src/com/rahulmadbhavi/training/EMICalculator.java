
package com.rahulmadbhavi.training;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EMICalculator")
public class EMICalculator extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public EMICalculator()
	{
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		boolean isValid = false;
		double payment = 0.0;
		String errorMessage = "";
		
		String principalString = request.getParameter("principal");
		String yearsString = request.getParameter("years");
		String roiString = request.getParameter("roi");
	
		double principal = 0.0;
		double years = 0.0;
		double roi = 0.0;
		
		try
		{
			if(principalString == null || yearsString == null || roiString == null)
			{
				errorMessage = "All fields are requierd.";
				
				throw (new Exception());
			}
			else if(principalString.length() == 0 || yearsString.length() == 0 || roiString.length() == 0)
			{
				errorMessage = "All fields are requierd.";
				
				throw (new Exception());
			}
			
			
			principal = Double.parseDouble(principalString);
			years = Double.parseDouble(yearsString);
			roi = Double.parseDouble(roiString) / 100.0;
			
			if(principal <= 0 || years <= 0 || roi <= 0)
			{
				errorMessage = "All values must be positive";
				
				throw (new Exception());
			}
			
			isValid = true;
			
			payment = (roi * principal / 12) / (1.0 - Math.pow((roi / 12) + 1, - (12 * years)));
		}
		catch(NumberFormatException e)
		{
			errorMessage = "Invalid data.";
		}
		catch(Exception e)
		{
			
		}		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("principal", principalString);
		session.setAttribute("years", yearsString);
		session.setAttribute("roi", roiString);
		
		session.setAttribute("isValid", isValid);
		if(isValid)
		{
			session.setAttribute("payment", payment);			
		}
		else
		{
			session.setAttribute("error", errorMessage);
		}
		
		String nextJSP = request.getContextPath() + "/index.jsp";
		response.sendRedirect(nextJSP);
		//RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		//dispatcher.forward(request, response);
	}
}
