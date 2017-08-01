package entity;

import entity.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-28T23:15:31")
@StaticMetamodel(School.class)
public class School_ { 

    public static volatile SingularAttribute<School, String> name;
    public static volatile ListAttribute<School, Student> studentList;
    public static volatile SingularAttribute<School, Integer> id;

}