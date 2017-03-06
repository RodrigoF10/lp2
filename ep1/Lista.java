class No{
    private int x;
    private No prox, antes;
    
    public void setX(int x){
        this.x = x;
    }
    public void setProx(No prox){
        this.prox = prox;
    }
    public void setAntes(No antes){
        this.antes = antes;
    }
    public int getX(){
        return this.x;
    }
    public No getProx(){
        return this.prox;
    }
    public No getAntes(){
        return this.antes;
    }
    public int getProX(){
        return getProx().getX();
    }
}

public class Lista{
    private No prim, ult;
    private int cont;
    public Lista(){
        this.cont = 0;
    }
    public void inserir(int x){
        No aux = new No();
        aux.setX(x);
        if(this.cont == 0){
            this.prim = aux;
            this.ult = aux;
            aux.setAntes(prim);
            aux.setProx(ult);
        }
        else{
            this.ult.setProx(aux);
            aux.setAntes(ult);
            this.ult = aux;
            ult.setProx(ult);
        }
        cont++;
    }
    public void remover(int x){
        if(this.cont == 0){
            System.out.println("A lista está vazia");
        }
        else{
            No aux = this.prim;
            int contr = this.cont;
            for(int i = 0 ; i < this.cont; i++){
                if(aux.getX() == x){
                    if(i == 0){
                        this.prim = this.prim.getProx();
                        this.prim.setAntes(this.prim);
                    }
                    else if(i == this.cont){
                        this.ult = this.ult.getAntes();
                        this.ult.setProx(this.ult);
                    }
                    else
                        this.removerMeio(x);
                }
                else{
                    contr--;
                    aux = aux.getProx();
                    if(contr == 0)
                        System.out.println("O item " + x + " não existe na lista");
                }
            }
            this.cont--;
        }
    }
    private void removerMeio(int x){
        No aux = this.prim.getProx();
        No aux2;
        for(int i = 2; i < this.cont; i++){
            if(aux.getX() == x){
                aux2 = aux.getAntes();
                aux2.setProx(aux.getProx());
                aux2 = aux.getProx();
                aux2.setAntes(aux.getAntes());
            }
            aux = aux.getProx();
        }
    }
    public void exibir(){
        No aux = this.prim;
        if(this.cont == 0)
            System.out.println("A lista está vazia");
        else{
            for(int i = 0; i < this.cont; i++){
                System.out.println(aux.getX());
                aux = aux.getProx();
            }
        }
    }
    public String buscar(int x){
        No aux = this.prim;
        int contr = 0;
        String qtd;
        if(this.cont == 0){
            qtd = "A lista está vazia";
        }
        else{
            for(int i = 0; i < this.cont; i++){
                if(aux.getX() == x){
                    contr++;
                }
                aux = aux.getProx();
            }
            qtd = Integer.toString(contr);
        }
        return qtd;
    }
}