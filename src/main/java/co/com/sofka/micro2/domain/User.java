package co.com.sofka.micro2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor@NoArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String mail;
}
