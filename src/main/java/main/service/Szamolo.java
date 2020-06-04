package main.service;

import main.model.Labels;

import java.util.List;

public class Szamolo {

    public double szamolKredit(List<Labels> labels) {

        double kreditek=0;
        double osszertek=0;

        for (Labels aktualis : labels) {
            if (!aktualis.getJegy().isEmpty() && !aktualis.getKredit().isEmpty()) {
                double jegy = Integer.parseInt(aktualis.getJegy()) * Integer.parseInt(aktualis.getKredit());
                osszertek+=jegy;
                kreditek+=Integer.parseInt(aktualis.getKredit());
            }
        }

        double sulyozottAtlag = osszertek/kreditek;

        return sulyozottAtlag;
    }
}
