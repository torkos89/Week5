package edu.dmacc.javaee;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addItemServlet")
public class AddItem extends HttpServlet {
  public List<String> l = new LinkedList<String>();
  public List<String> getList() {
    return l;
  }
  private static final long serialVersionUID = 1L;
  public void AddITem() {
    
  } 
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String s = request.getParameter("store");
    String i = request.getParameter("item");
    //System.out.println("777- s = "+s);
    ListItems.l.add("Store: "+s+"  Items: "+i);
    getServletContext().getRequestDispatcher("/addItem.html").forward(request, response); 
    
  }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
    doGet(request, response);
  }
}
