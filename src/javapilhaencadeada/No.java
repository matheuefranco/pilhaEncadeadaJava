package javapilhaencadeada;

public class No {
    private Tdado dado;
    private No prox = null;

    public Tdado getDado() {
        return dado;
    }


    public void setDado(Tdado dado) {
        this.dado = dado;
    }


    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
        @Override
    public String toString() {
        return "No{" +
                "dado=" + getDado() +
                '}';
    }
}
