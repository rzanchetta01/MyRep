package Ex_Feitos.abs.entities;
/*package abs.entities;

import java.text.DecimalFormat;

public class pFisica extends Pessoa {

    private Double gastoSaude;
    DecimalFormat formatador = new DecimalFormat("0.00");

    public pFisica(Double gastoSaude, String nome, Double renAnual) {
        super(nome, renAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    public Double calImposto() {
        Double imp = 0.00;
        Double impSaude = 0.00;
        if (getRenAnual() <= 20000 && gastoSaude > 0) {
            imp = getRenAnual() * 0.15;
            impSaude = gastoSaude / 2;
        }
        if (getRenAnual() <= 20000 && gastoSaude <= 0) {
            imp = getRenAnual() * 0.15;
        }

        if (getRenAnual() > 20000 && gastoSaude > 0) {
            imp = getRenAnual() * 0.25;
            impSaude = gastoSaude / 2;
        }
        if (getRenAnual() <= 20000 && gastoSaude <= 0) {
            imp = getRenAnual() * 0.25;
        }
        return imp + impSaude;

    }
    
    public String toString() {
        return "Imposto pago por " + getNome() + ": " + formatador.format(calImposto());
       
    }

}
*/