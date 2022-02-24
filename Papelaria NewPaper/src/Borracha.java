public class Borracha {
    String tamanho;
    String cor;
    String formato;
    String marca;
    Double preço;
    Boolean embalado;

    String empacotado(){
        if (this.embalado == true){
            return ("Está embalado. Favor, não abrir antes do pagamento!\n");
        }
        else{
            return ("Está aberto. Pode testar!\n");
        }
    }
    void mostrar (){
        System.out.println("Cor:                     "+this.cor);
        System.out.println("Marca:                   "+this.marca);
        System.out.println("Formato:                 "+this.formato);
        System.out.println("Tamanho:                 "+this.tamanho);
        System.out.println("Preço:                   R$ "+this.preço+"0");
        System.out.println(this.empacotado());
    }
}