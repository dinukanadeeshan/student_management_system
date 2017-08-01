package entity;

import entity.Designation;
import entity.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-28T23:15:31")
@StaticMetamodel(Parent.class)
public class Parent_ { 

    public static volatile SingularAttribute<Parent, Student> studentrank;
    public static volatile SingularAttribute<Parent, Designation> designationid;
    public static volatile SingularAttribute<Parent, String> fM;
    public static volatile SingularAttribute<Parent, Integer> id;

}