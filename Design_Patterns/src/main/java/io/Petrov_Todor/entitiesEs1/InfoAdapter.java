package io.Petrov_Todor.entitiesEs1;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return calcolaEta(info.getDataDiNascita());
    }

    private int calcolaEta(LocalDate dataDiNascita) {
        LocalDate oggi = LocalDate.now();
        return Period.between(dataDiNascita, oggi).getYears();
    }
}
