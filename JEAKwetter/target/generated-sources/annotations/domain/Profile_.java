package domain;

import domain.Profile;
import domain.Role;
import domain.Tweets;
import java.sql.Blob;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-08T20:26:34")
@StaticMetamodel(Profile.class)
public class Profile_ { 

    public static volatile SingularAttribute<Profile, String> website;
    public static volatile SingularAttribute<Profile, String> password;
    public static volatile ListAttribute<Profile, Role> role;
    public static volatile ListAttribute<Profile, Profile> following;
    public static volatile ListAttribute<Profile, Profile> profile;
    public static volatile SingularAttribute<Profile, String> name;
    public static volatile SingularAttribute<Profile, String> bio;
    public static volatile SingularAttribute<Profile, String> location;
    public static volatile SingularAttribute<Profile, Long> id;
    public static volatile ListAttribute<Profile, Tweets> tweets;
    public static volatile SingularAttribute<Profile, Blob> picture;
    public static volatile SingularAttribute<Profile, String> username;

}