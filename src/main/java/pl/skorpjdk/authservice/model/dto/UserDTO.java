package pl.skorpjdk.authservice.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDTO {
    private String username;
    private String password;
}
