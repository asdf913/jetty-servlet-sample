package jakarta.servlet.http;

import java.io.IOException;
import java.io.OutputStream;

import jakarta.servlet.ServletException;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = -5176135849319893425L;

	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		//
		try (final OutputStream os = response != null ? response.getOutputStream() : null) {
			//
			if (os != null) {
				//
				os.write("Hello World".getBytes());
				//
			} // if
				//
		} // try
			//
	}

}