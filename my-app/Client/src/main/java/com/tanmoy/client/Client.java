package com.tanmoy.client;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

}

