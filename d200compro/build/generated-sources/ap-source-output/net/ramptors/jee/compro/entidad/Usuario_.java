package net.ramptors.jee.compro.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.ramptors.jee.compro.entidad.Rol;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-03-23T19:54:23")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SetAttribute<Usuario, Rol> roles;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile SingularAttribute<Usuario, String> id;
    public static volatile SingularAttribute<Usuario, String> upperId;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, Integer> version;

}