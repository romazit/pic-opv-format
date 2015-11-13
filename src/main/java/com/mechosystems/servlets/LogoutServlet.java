package com.mechosystems.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author romanm
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/logout"})
 public class LogoutServlet extends HttpServlet {
  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   // Destroys the session for this user.
   request.getSession(false).invalidate();
   String contextPath = request.getContextPath();

   // Redirects back to the initial page.
   //response.sendRedirect(request.getContextPath());
   response.sendRedirect(response.encodeRedirectURL(contextPath + "/f/index.xhtml"));
  }
 }
