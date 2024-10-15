package ru.orbitel.server.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientContract {
    private long contractId;
    private  long clientId;
}

