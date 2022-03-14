package co.edu.escuelaing;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * @author Juank544
 * SparkWebServer
 */
public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
        get("/hello", (req,res) -> "Hello docker!");
    }

    private static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
