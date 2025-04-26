import java.lang.reflect.Array;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) {
        Login login =new Login();
        login.registrarme(new Usuario("Estudillo","123"));

        Scanner entradaDatos=new Scanner(System.in);
        String miUsuario=entradaDatos.nextLine();
        String miPassword=entradaDatos.nextLine();
        try {
            login.verificaAcceso(miUsuario,miPassword);
            System.out.println("Acceso concedido");
        }catch (NoExisteUsuario e){
            System.out.println("No fue posible loguearse"+e.getMessage());
        }
    }
}

class NoExisteUsuario extends Exception{
    public NoExisteUsuario(String mensaje){
        super(mensaje);
    }
}

class Usuario{
    private String usuario;
    private String password;
    public Usuario(String user,String pwd){
        this.usuario=user;
        this.password=pwd;
    }


    public String getUsuario(){
        return this.usuario;
    }

    public String getPassword(){
        return this.password;
    }
}

class Login{
    ArrayList<Usuario> listaUsuarios;

    public Login(){
        listaUsuarios=new ArrayList<>();
    }

    public void registrarme(Usuario user){
        listaUsuarios.add(user);
    }

    public void verificaAcceso(String user,String pwd)throws NoExisteUsuario{
        for(Usuario usuario:listaUsuarios){
            if(usuario.getUsuario().equals(user) && usuario.getPassword().equals(pwd))
                return;
        }
        throw new NoExisteUsuario("Usuario no encontrado");
    }
}