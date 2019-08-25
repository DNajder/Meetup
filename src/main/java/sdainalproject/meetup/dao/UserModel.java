package sdainalproject.meetup.dao;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
//@Table(name = "user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Integer id;
    String name;
    String email;
}