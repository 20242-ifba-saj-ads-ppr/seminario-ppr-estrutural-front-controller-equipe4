class Dispatcher {
    private ProdutoController produtoController;
    private CarrinhoController carrinhoController;
    private PedidoController pedidoController;

    public Dispatcher() {
        this.produtoController = new ProdutoController();
        this.carrinhoController = new CarrinhoController();
        this.pedidoController = new PedidoController();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("LISTAR_PRODUTOS")) {
            produtoController.listarProdutos();
        } else if (request.equalsIgnoreCase("DETALHES_PRODUTO")) {
            produtoController.detalhesProduto(1); // ID fictício
        } else if (request.equalsIgnoreCase("ADICIONAR_CARRINHO")) {
            carrinhoController.adicionarAoCarrinho(1); // ID fictício
        } else if (request.equalsIgnoreCase("VER_CARRINHO")) {
            carrinhoController.verCarrinho();
        } else if (request.equalsIgnoreCase("FINALIZAR_PEDIDO")) {
            pedidoController.finalizarPedido();
        } else {
            System.out.println("Requisição desconhecida: " + request);
        }
    }
}