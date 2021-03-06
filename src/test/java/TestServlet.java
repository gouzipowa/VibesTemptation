

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.type.descriptor.java.UUIDTypeDescriptor.ToBytesTransformer;

import com.mps.vibestemptation.model.Product;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager manager = Persistence.createEntityManagerFactory("VibesTemptation")
				.createEntityManager();
		
		manager.getTransaction().begin();
		
		Product cake = new Product("caake", Float.valueOf("12.5"), Byte.valueOf("1"), "somePath", Float.valueOf("3.1"), 5, "this is a cake", "ushsoifjpjdoihifhofhfsdhfoudshfisdhofhsdouhfo");
		manager.persist(cake);
		
		manager.getTransaction().commit();
		manager.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
