package service;

import bean.User;
import dao.MusicDao;
import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/isExistPlaylistServlet")
public class isExistPlaylistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String playlist = request.getParameter("playlist");
        Integer uid = ((User)request.getSession().getAttribute("user")).getUid();
        MusicDao dao = MusicDao.getInstance();
        if(dao.isExistPlaylist(uid, playlist)){
            response.getWriter().print("Exist");
        }else{
            response.getWriter().print("Not Exist");
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
