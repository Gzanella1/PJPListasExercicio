package listasJavaBasico.ListaReforcoJava;

public class questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valacoes=1000*32.87;
		//0,02 sobre o valor das açoes 
		double comissaoCompra=valacoes*0.02;
		double vendaValTotal = 1000*33.92;
		double comissaoVenda= vendaValTotal*0.02;
		double lucro= vendaValTotal-comissaoVenda-valacoes-comissaoVenda;		
	
        // Impressão formatada com duas casas decimais
        System.out.printf("Valor pago pelas ações:      R$ %,.2f%n", valacoes);
        System.out.printf("Comissão na compra (2%%):    R$ %,.2f%n", comissaoCompra);
        System.out.printf("Valor recebido na venda:     R$ %,.2f%n", vendaValTotal);
        System.out.printf("Comissão na venda (2%%):     R$ %,.2f%n", comissaoVenda);
        System.out.printf("Lucro (ou prejuízo):         R$ %,.2f%n", lucro);

	}

}
