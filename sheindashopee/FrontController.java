
class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    
    private boolean autenticar(String usuario) {
        System.out.println("Autenticando usuário: " + usuario);
       
        return true;
    }

    
    private void registrarLog(String request) {
        System.out.println("Log: Requisição recebida - " + request);
    }

    public void processarRequisicao(String request, String usuario) {

        registrarLog(request);

        if (autenticar(usuario)) {

            dispatcher.dispatch(request);
        } else {
            System.out.println("Falha na autenticação.");
        }
    }
}