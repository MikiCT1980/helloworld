package es.taes;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( final String[] args)
    {

        final String miMensaje = "Mi hola mundo";
        System.out.println (miMensaje);

        final persona p= new persona();
        p.setNombre("Miguel");
        p.setEdad(39);
        
        System.out.println(p);
    }   
}
