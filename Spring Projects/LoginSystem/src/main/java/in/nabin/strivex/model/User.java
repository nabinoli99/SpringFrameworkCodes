package in.nabin.strivex.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {
    private String name;
    private String email;
    private String password;
    private String city;

//    // IMPORTANT: You must have a No-Argument Constructor
//    public User() {}


}