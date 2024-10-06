package ru.orbitel.server.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



@Table(name = "client_contracts")
public class ClientContract {
    @Id
    private @Column("contract_id") long contractId;
    @Id
    private @Column("client_id") long clientId;


    public long getContractId() {
        return contractId;
    }

    public void setContractId(long contractId) {
        this.contractId = contractId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public ClientContract(long contractId, long clientId) {
        this.contractId = contractId;
        this.clientId = clientId;
    }

    public ClientContract() {
    }

    @Override
    public String toString() {
        return "ClientContract{" +
                "contractId=" + contractId +
                ", clientId=" + clientId +
                '}';
    }
}

