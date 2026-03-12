import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoucherValidatorAI {
    private String codVoucher;
    private double procentReducere;
    private double valoareMinimaCos;
    private int utilizariRamase;
    private boolean esteActiv;

    // Constructor
    public VoucherValidatorAI(String codVoucher, double procentReducere, double valoareMinimaCos, int utilizariRamase) {
        this.codVoucher = codVoucher;
        this.procentReducere = procentReducere;
        this.valoareMinimaCos = valoareMinimaCos;
        this.utilizariRamase = utilizariRamase;
        this.esteActiv = true;
    }

    public boolean esteValidPentruCos(String codIntrodus, double valoareTotalaCos) {
        return false;
    }

    public void consumaVoucher() {
    }

    public double calculeazaSumaRedusa(double valoareInitiala) {
        return 0.0;
    }

    public void dezactiveazaVoucher() {
    }

    public String obtineMotivRespingere(String codIntrodus, double valoareTotalaCos) {
        return "";
    }
}