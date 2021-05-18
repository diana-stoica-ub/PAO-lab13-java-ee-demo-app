package com.university.web;

import com.university.service.SubjectService;
import com.university.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "subjectServlet",
        urlPatterns = "/subject"
)
public class SubjectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SubjectService subjectService = new SubjectService();
        UserService userService = new UserService();

        req.setAttribute("subjects", subjectService.getSubjects());
        req.setAttribute("user", userService.getLoggedInUser());
        RequestDispatcher view = req.getRequestDispatcher("subjects.jsp");
        view.forward(req, resp);

    }
}
