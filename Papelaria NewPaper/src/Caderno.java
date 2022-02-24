public class Caderno {
    String capa;
    String matérias;
    String marca;
    int folhas;
    Double preço;
    Boolean embalado;

    String empacotado(){
        if (this.embalado == true){
            return ("Está embalado. Favor, não abrir antes do pagamento!\n");
        }
        else{
            return ("Está aberto. Pode folhear!\n");
        }
    }
    void mostrar (){
        System.out.println("Marca:                    "+this.marca);
        System.out.println("Modelo:                   "+this.capa);
        System.out.println("Número de matérias:       "+this.matérias);
        System.out.println("Número de páginas:        "+this.folhas);
        System.out.println("Preço:                    R$ "+this.preço+"0");
        System.out.println(this.empacotado());
    }
}