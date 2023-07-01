package com.backend.portfolio;


import com.backend.portfolio.exceptions.UsuarioFoundException;
import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.ExperienciaLaboral;
import com.backend.portfolio.model.Rol;
import com.backend.portfolio.model.Usuario;
import com.backend.portfolio.model.UsuarioRol;
import com.backend.portfolio.services.EducacionService;
import com.backend.portfolio.services.ExperienciaLaboralService;
import com.backend.portfolio.services.UsuarioService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class PortfolioApplication implements CommandLineRunner{
    
    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private EducacionService educacionService;
    
    @Autowired
    private ExperienciaLaboralService experienciaLaboralService;
    
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    
    public static void main(String[] args) {
	SpringApplication.run(PortfolioApplication.class, args);
    }
        

        
    @Override
    public void run(String... args) throws Exception {

        /* try {
            
            
            Usuario usuario = new Usuario();

			usuario.setNombre("Jorge");
			usuario.setApellido("Zimmermann");
			usuario.setUsername("jorgezimmer");
			usuario.setPassword(bCryptPasswordEncoder.encode("jorgezimmer"));
			usuario.setEmail("jorgezimmer95@gmail.com");
			usuario.setTelefono("988212020");
                        usuario.setDni("38775495");
                        usuario.setEnabled(true);
                        usuario.setFotoPerfil("fotodeperfil");
                        usuario.setSobre_mi("Yo");
                        
                        
            Rol rol = new Rol();
            rol.setId(1L);
            rol.setNombre("ADMIN");

            Set<UsuarioRol> usuarioRoles = new HashSet<>();
            UsuarioRol usuarioRol = new UsuarioRol();
            usuarioRol.setRol(rol);
            usuarioRol.setUsuario(usuario);
            usuarioRoles.add(usuarioRol);
         
            Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
            System.out.println("Usuario Guardado: " + usuarioGuardado.getUsername());
         
           /*
            Educacion educacion = new Educacion();
            educacion.setId(2L);
            educacion.setNombre("Tecnico electromecanico");
            educacion.setTipoEducacion("tecnica");
            educacion.setFechaInicio("01/01/2007");
            educacion.setFechaFin("01/01/2014");
            educacion.setUsuario(usuario);
            
            Set<Educacion> listaEducacion;
            listaEducacion = new HashSet<>();
            listaEducacion.add(educacion);
            //System.out.println("se cargo educacion " + educacion);
            
            //ExperienciaLaboral experienciaLaboral1 = new ExperienciaLaboral();
     
            Educacion educacionGuardada = educacionService.guardarEducacion(educacion);
            System.out.println("Educacion Guardado: " + educacionGuardada.getNombre());
            //System.out.println("se guardo educacion ");
           
            //experienciaLaboralService.guardarExperienciaLaboral(experienciaLaboral1);
            //System.out.println("se guardo ExperienciaLaboral ");
            //Set<ExperienciaLaboral> listaExperienciaLaboral = new HashSet<>();
            //listaExperienciaLaboral.add(experienciaLaboral1);

            //Set<Educacion> listaEducacion = new HashSet<>();
            //listaEducacion.add(educacion);
            ExperienciaLaboral experiencia = new ExperienciaLaboral();
            experiencia.setNombreEmpresa("Crediser Argentina SA");
            experiencia.setTipoEmpleo("Relacion de dependencia - Medio tiempo");
            experiencia.setDescripcion("descripcion");
            experiencia.setFechaInicio("01/06/20019");
            experiencia.setFechaFin("Actual");
            experiencia.setUsuario(usuario);
           
            Set<ExperienciaLaboral> listaexperiencia;
            listaexperiencia = new HashSet<>();
            listaexperiencia.add(experiencia);
            //System.out.println("se cargo educacion " + educacion);
            
            //ExperienciaLaboral experienciaLaboral1 = new ExperienciaLaboral();
     
            ExperienciaLaboral experienciaGuardada = experienciaLaboralService.guardarExperienciaLaboral(experiencia);
            System.out.println("Educacion Guardado: " + educacionGuardada.getNombre());
            

            
        } catch (UsuarioFoundException exception) {
            exception.printStackTrace();
        }*/
}

    }

