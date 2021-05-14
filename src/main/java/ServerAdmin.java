import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

public class ServerAdmin {
  private static final String HOST = "localhost";
  private static final int PORT = 6789;

  public static void main(String[] args) throws IOException {
    HttpServer server = HttpServerFactory.create("http://" + HOST + ":" + PORT + "/");
    server.start();

    System.out.println("Server running!");
    System.out.println("Server started on: http://" + HOST + ":" + PORT);
  }
}
