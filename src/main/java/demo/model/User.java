package demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseModel {

    private Integer id;
    private String username;
    private String password;
    private String role;
}