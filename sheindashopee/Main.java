public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.processarRequisicao("LISTAR_PRODUTOS", "usuario1");
        frontController.processarRequisicao("ADICIONAR_CARRINHO", "usuario1");
        frontController.processarRequisicao("FINALIZAR_PEDIDO", "usuario1");
        frontController.processarRequisicao("REQUISICAO_INVALIDA", "usuario1");
    }
}