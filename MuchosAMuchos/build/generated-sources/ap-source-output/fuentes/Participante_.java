package fuentes;

import fuentes.Proyecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-14T22:03:02")
@StaticMetamodel(Participante.class)
public class Participante_ { 

    public static volatile SingularAttribute<Participante, Integer> clavePar;
    public static volatile SetAttribute<Participante, Proyecto> proyectos;
    public static volatile SingularAttribute<Participante, String> nombre;

}