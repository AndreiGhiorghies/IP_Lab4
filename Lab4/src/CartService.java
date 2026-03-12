import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartService {
    private String idCosCumparaturi;
    private double valoareTotala;
    private int numarProduse;

    public CartService(String idCosCumparaturi, double valoareTotala, int numarProduse) {
        this.idCosCumparaturi = idCosCumparaturi;
        this.valoareTotala = valoareTotala;
        this.numarProduse = numarProduse;
    }

    public void aplicaDiscount(double procentReducere) {

    }

    public void adaugaProdus(double pretProdus, int cantitateAdaugata) {

    }

    public void eliminaProdus(double pretProdus, int cantitateEliminata) {

    }

    public void golesteCos() {

    }

}