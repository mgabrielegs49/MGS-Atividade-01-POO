public class Mochila {
    String tamanho;
    String cor;
    String modelo;
    String marca;
    Double preço;
    Boolean embalado;

    String empacotado(){
        if (this.embalado == true){
            return ("Está embalado. Favor, não abrir antes do pagamento!\n");
        }
        else{
            return ("Pode dar uma olhada no produto.\n");
        }
    }
    void mostrar (){
        System.out.println("Cor:                     "+this.cor);
        System.out.println("Marca:                   "+this.marca);
        System.out.println("Formato:                 "+this.modelo);
        System.out.println("Tamanho:                 "+this.tamanho);
        System.out.println("Preço:                   R$ "+this.preço+"0");
        System.out.println(this.empacotado());
    }
}