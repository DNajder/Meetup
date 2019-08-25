package sdainalproject.meetup.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString(exclude = "password")
public class UserRegisterDto {

    @NonNull
    @Size(max = 50)
    String name;

    @Pattern(regexp = ".+@.+")
    @Email
    String email;


    @Size(min = 8, max = 30)
    String password;

}

