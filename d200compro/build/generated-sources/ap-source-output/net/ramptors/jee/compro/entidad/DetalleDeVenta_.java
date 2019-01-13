package net.ramptors.jee.compro.entidad;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import net.ramptors.jee.compro.entidad.DetalleDeVentaPK;
import net.ramptors.jee.compro.entidad.Producto;
import net.ramptors.jee.compro.entidad.Venta;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-03-23T19:54:23")
@StaticMetamodel(DetalleDeVenta.class)
public class DetalleDeVenta_ { 

    public static volatile SingularAttribute<DetalleDeVenta, BigDecimal> precio;
    public static volatile SingularAttribute<DetalleDeVenta, Venta> venta;
    public static volatile SingularAttribute<DetalleDeVenta, DetalleDeVentaPK> id;
    public static volatile SingularAttribute<DetalleDeVenta, Long> cantidad;
    public static volatile SingularAttribute<DetalleDeVenta, Producto> producto;
    public static volatile SingularAttribute<DetalleDeVenta, Integer> version;

}