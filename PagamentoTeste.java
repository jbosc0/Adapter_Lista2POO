public class PagamentoTeste {

    public static void testPPay(PPay pay) {

        System.out.println("---- Testando PPay ----");
        System.out.println("Número do cartão: " + pay.getCustCardNo());
        System.out.println("Nome do dono: " + pay.getCardOwnerName());
        System.out.println("Validade: " + pay.getCardExpMonthDate());
        System.out.println("CVV: " + pay.getCVVNo());
        System.out.println("Valor: " + pay.getTotalAmount());
        System.out.println("------------------------\n");
    }

    public static void main(String[] args) {

        MPay legado = new MpayImpl();

        legado.setCreditCardNo("5555333322221111");
        legado.setCustomerName("Maria Oliveira");
        legado.setCardExpMonth("07");
        legado.setCardExpYear("2029");
        legado.setCardCVVNo((short) 987);
        legado.setAmount(599.90);

        PPay adaptado = new MPayAdapter(legado);

        testPPay(adaptado);
    }
}
