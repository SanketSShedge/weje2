

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NetflixServlet
 */
@WebServlet("/NetflixServlet")
public class NetflixServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NetflixServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter  writer = response.getWriter();
		writer.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"./font-awesome-4.7.0/css/font-awesome.css\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "    <style>\r\n"
				+ "        *{\r\n"
				+ "            box-sizing: border-box;\r\n"
				+ "        }\r\n"
				+ "        #parent{\r\n"
				+ "            width: 100%;\r\n"
				+ "            height: 735px;\r\n"
				+ "            background-image: url(./Image/1_5lyavS59mazOFnb55Z6znQ.png);\r\n"
				+ "            background-repeat: no-repeat;\r\n"
				+ "            background-size: cover;\r\n"
				+ "            opacity: 0.9;\r\n"
				+ "        }\r\n"
				+ "        #child1{\r\n"
				+ "            height: 80px;\r\n"
				+ "            width: 100%;\r\n"
				+ "            background: transparent;\r\n"
				+ "            display: flex;\r\n"
				+ "        }\r\n"
				+ "        #logo{\r\n"
				+ "            height: 80px;\r\n"
				+ "            width: 300px;\r\n"
				+ "            background-image: url(./Image/Logonetflix.png);\r\n"
				+ "            background-repeat: no-repeat;\r\n"
				+ "            background-size: cover;\r\n"
				+ "            margin-left: 20px;\r\n"
				+ "            margin-top: 10px;\r\n"
				+ "        }\r\n"
				+ "        #nav{\r\n"
				+ "            height: 80px;\r\n"
				+ "            width: 400px;\r\n"
				+ "            margin-left: 750px;\r\n"
				+ "            display: flex;\r\n"
				+ "        }\r\n"
				+ "        #nav1{\r\n"
				+ "            display: flex;\r\n"
				+ "            height: 50px;\r\n"
				+ "            width: 100px;\r\n"
				+ "            margin-top: 15px;\r\n"
				+ "            margin-left: 50px;\r\n"
				+ "            border: 1px solid;\r\n"
				+ "            border-color: white;\r\n"
				+ "        }\r\n"
				+ "        #n1{\r\n"
				+ "            margin-top: 15px;\r\n"
				+ "        }\r\n"
				+ "        #n2{\r\n"
				+ "            height: 45px;\r\n"
				+ "            color: white;\r\n"
				+ "            background: transparent;\r\n"
				+ "            border: none;\r\n"
				+ "        }\r\n"
				+ "        #but{\r\n"
				+ "            height: 40px;\r\n"
				+ "            width: 100px;\r\n"
				+ "            margin-top: 20px;\r\n"
				+ "            margin-left: 50px;\r\n"
				+ "            border: none;\r\n"
				+ "            background-color: red;\r\n"
				+ "            color:white;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "        }\r\n"
				+ "        #inp{\r\n"
				+ "            height: 80px;\r\n"
				+ "            width: 750px;\r\n"
				+ "            margin-left: 380px;\r\n"
				+ "            display: flex;\r\n"
				+ "        }\r\n"
				+ "        #child2{\r\n"
				+ "            align-items: center;\r\n"
				+ "            text-align: center;\r\n"
				+ "            color: white;\r\n"
				+ "            font-size:xx-large;\r\n"
				+ "            margin-top: 150px;\r\n"
				+ "            font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n"
				+ "        }\r\n"
				+ "        #child3{\r\n"
				+ "            align-items: center;\r\n"
				+ "            text-align: center;\r\n"
				+ "            font-size: x-large;\r\n"
				+ "            color: white;\r\n"
				+ "            font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;        \r\n"
				+ "        }\r\n"
				+ "        #email{\r\n"
				+ "            height: 80px;\r\n"
				+ "            width: 500px;\r\n"
				+ "            border: 1px solid;\r\n"
				+ "            font-size: large;\r\n"
				+ "            padding-left: 10px;\r\n"
				+ "            font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n"
				+ "        }\r\n"
				+ "        #but1{\r\n"
				+ "            height: 80px;\r\n"
				+ "            width: 250px;\r\n"
				+ "            border: 1px solid;\r\n"
				+ "            font-size: larger;\r\n"
				+ "            background-color: red;\r\n"
				+ "            border-color: red;\r\n"
				+ "            color: white;\r\n"
				+ "            font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div id=\"parent\">\r\n"
				+ "        <div id=\"child1\">\r\n"
				+ "            <div id=\"logo\"></div>\r\n"
				+ "            <div id=\"nav\">\r\n"
				+ "                <div id=\"nav1\">\r\n"
				+ "                    <div><i id=\"n1\" class=\"fa fa-globe\" aria-hidden=\"true\"></i></div>\r\n"
				+ "                    <select name=\"\" id=\"n2\">\r\n"
				+ "                        <option value=\"English\">English</option>\r\n"
				+ "                        <option value=\"Hindi\">Hindi</option>\r\n"
				+ "                    </select>\r\n"
				+ "                </div>\r\n"
				+ "                <input id=\"but\" type=\"button\" value=\"Sign In\">\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "        <div id=\"child2\">\r\n"
				+ "            <h1>Unlimited movies, <br> TV shows and more.</h1>\r\n"
				+ "            <span>Watch anywhere. Cancel anytime.</span><br><br>\r\n"
				+ "        </div>\r\n"
				+ "        <div id=\"child3\">\r\n"
				+ "            <span>Ready to watch? Enter your Email to create or restart your membership.</span><br><br>\r\n"
				+ "            <div id=\"inp\">\r\n"
				+ "                <div><input type=\"email\" name=\"\" id=\"email\" placeholder=\"Email address\"></div>\r\n"
				+ "                <div><input id=\"but1\" type=\"button\" value=\"Get Started >\"></div>\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
