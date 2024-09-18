package io.Petrov_Todor.entitiesEs1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();

        System.out.println("Nome completo: " + this.nomeCompleto);
        System.out.println("Età: " + this.eta);
    }
}
