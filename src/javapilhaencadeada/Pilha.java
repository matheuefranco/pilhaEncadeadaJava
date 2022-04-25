
package javapilhaencadeada;


public class Pilha {
    
    No topo = null;

    public void push(Tdado dado){
        No novoNo = new No();
        No refAuxiliar = topo;
        novoNo.setDado(dado);
        topo = novoNo;
        topo.setProx(refAuxiliar);
    }

    public Tdado pop(){
            No aux = topo;
            topo = topo.getProx();
            return aux.getDado();
    }

    public Tdado top(){
        return topo.getDado();
    }

    public boolean isEmpty(){
        return topo == null?true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No noAuxiliar = topo;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getProx();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
    
}
