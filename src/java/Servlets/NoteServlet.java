/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author i5
 */
public class NoteServlet extends HttpServlet {

    
    @Override  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //used to decide what jsp to use
        // getting the value of the edit link
        String edit = request.getParameter("edit");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            Note note = new Note(br.readLine(), br.readLine());
            
            request.setAttribute("note",note);
            //setting default title and content
//            String title = br.readLine();
//            String contents = br.readLine();
//            request.setAttribute("title", title);
//            request.setAttribute("contents", contents);
        
        //when the link is not clicked the element is = null
        if(edit == null){
//            //read note.txt
            
            
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }
        //whne link is clicked the elemt has a value
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //getting updated title and content
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        //creating Note object
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        
        //write to note.txt
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        pw.println(note.getTitle());
        pw.println(note.getContents());
        pw.close();
//        
//        //read note.txt, set title and contents to new input
//        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
//        String fTitle = br.readLine();
//        String fContents = br.readLine();
//        request.setAttribute("title", fTitle);
//        request.setAttribute("contents", fContents);
        
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }

}
