package demo.spring.conditional.user.model;

import lombok.Value;

import java.util.UUID;

@Value
public class User {
    UUID uuid;
    String name;
}
