package sdainalproject.meetup.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.NonNull;

import javax.validation.constraints.*;

@Getter
@Setter
@ToString(exclude = "password")
public class UserRegisterDto {

    @NotBlank(message = "WPISZ NAZWĘ UŻTKOWNIKA")
    @Size(max = 50)
    String name;

    @NotBlank
    @Pattern(regexp = ".+@.+")
    @Email(message = "WPISZ POPRAWNY ADRES E-MAIL")
    String email;

@NotBlank(message = "WPISZ POPRAWNE HASŁO")
    @Size(min = 8, max = 30)
    String password;

}

