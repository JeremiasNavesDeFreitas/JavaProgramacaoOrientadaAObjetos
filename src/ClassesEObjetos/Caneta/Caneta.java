package ClassesEObjetos.Caneta;
public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    //Status
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    //Métodos
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Impossíel rabiscar. Caneta tampada.");
        }else{
            System.out.println("Rabiscando....");
        }
    }
    void tampar(){
        this.tampada=true;
    }
    void destampar(){
        this.tampada=false;
    }
}
