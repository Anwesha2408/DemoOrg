 package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstApp
 */
public class FirstApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	PrintWriter out=response.getWriter();
	String userName =request.getParameter("age");
	Map <String,List<String>>projects=new HashMap<>();
	List<String> projectA=new ArrayList<>();
	List<String> projectB=new ArrayList<>();
	projectA.add("User-A");
	projectA.add("User-B");
	projectA.add("User-C");
	projectB.add("User-D");
	projectB.add("User-E");
	projectB.add("User-F");
	projects.put("projectA", projectA);
	projects.put("projectB", projectB);
	int c = 0;
	for(Map.Entry<String, List<String>> entry:projects.entrySet()) {
		/*if(entry.getKey().contains(userName))
			out.println("vvv");
*/	if(entry.getValue().contains(userName)) {
	out.println("The user "+userName+" is allocated to the project "+entry.getKey());
	c=1;
	break;
}

	
}
	if(c==0)
	out.println("Ther user "+userName +" is not allocated");
}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
