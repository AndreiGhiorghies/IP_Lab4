public class Main {
    public static void main(String[] args) {
        CartService cosulMeu = new CartService("CART-7741", 600.0, 4);

        cosulMeu.adaugaProdus(100.0, 1);
        cosulMeu.eliminaProdus(50.0, 1);

        VoucherValidatorAI validator = new VoucherValidatorAI("REDUCERE20", 20.0, 500.0, 50);

        boolean esteValid = validator.esteValidPentruCos("REDUCERE20", 650.0);

        double reducere = validator.calculeazaSumaRedusa(650.0);

        String motiv = validator.obtineMotivRespingere("REDUCERE20", 400.0);

        validator.consumaVoucher();

        validator.dezactiveazaVoucher();
    }
}