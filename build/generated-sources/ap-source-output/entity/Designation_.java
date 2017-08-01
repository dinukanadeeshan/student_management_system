package entity;

import entity.Parent;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-28T23:15:31")
@StaticMetamodel(Designation.class)
public class Designation_ { 

    public static volatile SingularAttribute<Designation, String> name;
    public static volatile SingularAttribute<Designation, Integer> id;
    public static volatile ListAttribute<Designation, Parent> parentList;

}