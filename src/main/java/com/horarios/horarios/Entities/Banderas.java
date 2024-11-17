package com.horarios.horarios.Entities;
import jakarta.persistence.*;

@Entity
@Table(name = "banderas")
public class Banderas {
    @Id
    @Column(name = "bandera_id" , length = 6)
    private String banderaId;

    @Column(name = "bandera", length = 20)
    private String bandera;

    public String getBanderaId() {
        return banderaId;
    }

    public void setBanderaId(String banderaId) {
        this.banderaId = banderaId;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

}

