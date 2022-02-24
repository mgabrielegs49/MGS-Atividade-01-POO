public class Caneta {
    String modelo;
    String corTinta;
    String corCaneta;
    String marca;
    Double preço;
    Boolean tampado;

    String empacotado(){
        if (this.tampado == true){
            return ("Destampe e teste a caneta.\n");
        }
        else{
            return ("Teste a caneta.\n");
        }
    }
    void mostrar (){
        System.out.println("Cor exterior da caneta:  "+this.corCaneta);
        System.out.println("Marca:                   "+this.marca);
        System.out.println("Modelo:                  "+this.modelo);
        System.out.println("Cor da tinta:            "+this.corTinta);
        System.out.println("Preço:                   R$ "+this.preço+"0");
        System.out.println(this.empacotado());
    }
}