package sdainalproject.meetup.dao;

import lombok.Data;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    @Column(name = "name", unique = true)
    String name;

    @Column(name = "emial")
    String email;

    @Column(name = "password_hash")
    String passwordHash;

    @ManyToMany
    private Set<RoleModel> roles;
}