package net.ramptors.jee.compro.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.ramptors.jee.compro.entidad.Usuario;
import net.ramptors.jee.compro.entidad.Venta;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-03-23T19:54:23")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Usuario> usuario;
    public static volatile SingularAttribute<Cliente, String> id;
    public static volatile SingularAttribute<Cliente, String> upperId;
    public static volatile SingularAttribute<Cliente, Date> horaFavorita;
    public static volatile SingularAttribute<Cliente, Integer> version;
    public static volatile SingularAttribute<Cliente, Date> nacimiento;
    public static volatile SingularAttribute<Cliente, Venta> ventaActual;

}