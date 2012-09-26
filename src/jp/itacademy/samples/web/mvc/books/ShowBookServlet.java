package jp.itacademy.samples.web.mvc.books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowBookServlet
 */
@WebServlet("/mvc/books/")
public class ShowBookServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		List<Book> books = new ArrayList<>();

		Author akutagawa = new Author("ó¥îVâÓ<script>alert('Ç‚Ç†ÅAÇ⁄Ç≠ó¥îVâÓ!')</script>",
				"äHêÏ");
		Author dazai = new Author("é°", "ëæç…");

		books.add(new Book("óÖê∂ñÂ", akutagawa, 800, 3));
		books.add(new Book("íwÂÅÇÃéÖ", akutagawa, 500, 5));
		books.add(new Book("êlä‘é∏äi", dazai, 1000, 0));
		req.setAttribute("books", books);

		req.getRequestDispatcher("/WEB-INF/mvc/books/index.jsp").forward(req,
				res);

	}

}
