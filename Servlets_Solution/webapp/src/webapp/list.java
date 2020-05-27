package webapp;

import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "list")
public class list extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        PrintWriter out = response.getWriter();
        out.println("GET DONE!");
        out.print("STUDENT ID: " + request.getParameter("student_id") +
                " FIRST NAME: " + request.getParameter("first_name") +
                " SURNAME: " + request.getParameter("surname") +
                " DATE OF BIRTH: " + request.getParameter("date_of_birth"));
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

        /*PrintWriter out = response.getWriter();
        out.println("GET DONE!");
        out.print("STUDENT ID: " + request.getParameter("student_id") +
                " FIRST NAME: " + request.getParameter("first_name") +
                " SURNAME: " + request.getParameter("surname") +
                " DATE OF BIRTH: " + request.getParameter("date_of_birth"));*/
    }
}
