package net.ramptors.jee.compro.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.ramptors.jee.compro.entidad.Cliente;
import net.ramptors.jee.compro.entidad.DetalleDeVenta;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-03-23T19:54:23")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fechaHoraDeEntrega;
    public static volatile SingularAttribute<Venta, Cliente> cliente;
    public static volatile SingularAttribute<Venta, String> direccionDeEntrega;
    public static volatile ListAttribute<Venta, DetalleDeVenta> detalles;
    public static volatile SingularAttribute<Venta, Long> id;
    public static volatile SingularAttribute<Venta, Integer> version;
    public static volatile SingularAttribute<Venta, Date> registro;

}