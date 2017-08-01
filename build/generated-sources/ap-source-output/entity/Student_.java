package entity;

import entity.Parent;
import entity.School;
import entity.Sibiline;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-28T23:15:31")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile ListAttribute<Student, Sibiline> sibilineList;
    public static volatile SingularAttribute<Student, String> address;
    public static volatile SingularAttribute<Student, Integer> shy;
    public static volatile SingularAttribute<Student, School> schoolid;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Integer> rank;
    public static volatile SingularAttribute<Student, String> telephone;
    public static volatile ListAttribute<Student, Parent> parentList;

}