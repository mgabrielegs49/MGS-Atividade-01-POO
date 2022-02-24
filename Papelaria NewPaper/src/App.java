public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.println("Seja bem vindo(a) à Papelaria NewPaper! \nDê uma olhada em nossos produtos!\n");
        
        BlocoDeNotas bloco1 = new BlocoDeNotas();
        bloco1.cor = "Amarelo";
        bloco1.formato = "Quadrado";
        bloco1.tamanho = "Grande";
        bloco1.marca = "Tilibra";
        bloco1.preço = 4.00;
        bloco1.embalado = false;
        bloco1.mostrar();

        BlocoDeNotas bloco2 = new BlocoDeNotas();
        bloco2.cor = "Verde";
        bloco2.formato = "Quadrado";
        bloco2.tamanho = "Pequeno";
        bloco2.marca = "Post-It";
        bloco2.preço = 2.00;
        bloco2.embalado = false;
        bloco2.mostrar();

        BlocoDeNotas bloco3 = new BlocoDeNotas();
        bloco3.cor = "Rosa";
        bloco3.formato = "Coração";
        bloco3.tamanho = "Pequeno";
        bloco3.marca = "Post-It";
        bloco3.preço = 3.00;
        bloco3.embalado = true;
        bloco3.mostrar();

        BlocoDeNotas bloco4 = new BlocoDeNotas();
        bloco4.cor = "Azul";
        bloco4.formato = "Retângular";
        bloco4.tamanho = "Grande";
        bloco4.marca = "Faber-Castell";
        bloco4.preço = 5.00;
        bloco4.embalado = false;
        bloco4.mostrar();

        BlocoDeNotas bloco5 = new BlocoDeNotas();
        bloco5.cor = "Laranja";
        bloco5.formato = "Quadrado";
        bloco5.tamanho = "Pequeno";
        bloco5.marca = "Post-It";
        bloco5.preço = 2.00;
        bloco5.embalado = true;
        bloco5.mostrar();

        //////////////// Borracha ///////////////////
        Borracha borracha1 = new Borracha();
        borracha1.cor = "Cinza";
        borracha1.formato = "Oval";
        borracha1.tamanho = "Pequena";
        borracha1.marca = "Tilibra";
        borracha1.preço = 1.00;
        borracha1.embalado = false;
        borracha1.mostrar();

        Borracha borracha2 = new Borracha();
        borracha2.cor = "Laranja";
        borracha2.formato = "Círculo";
        borracha2.tamanho = "Média";
        borracha2.marca = "Clean";
        borracha2.preço = 1.00;
        borracha2.embalado = false;
        borracha2.mostrar();

        Borracha borracha3 = new Borracha();
        borracha3.cor = "Branca";
        borracha3.formato = "Retângular";
        borracha3.tamanho = "Grande";
        borracha3.marca = "Faber-Castell";
        borracha3.preço = 3.00;
        borracha3.embalado = true;
        borracha3.mostrar();

        Borracha borracha4 = new Borracha();
        borracha4.cor = "Roxa";
        borracha4.formato = "Gatinho";
        borracha4.tamanho = "Média";
        borracha4.marca = "Disney";
        borracha4.preço = 4.00;
        borracha4.embalado = true;
        borracha4.mostrar();

        Borracha borracha5 = new Borracha();
        borracha5.cor = "Rosa";
        borracha5.formato = "Retângular";
        borracha5.tamanho = "Pequena";
        borracha5.marca = "Tilibra";
        borracha5.preço = 2.00;
        borracha5.embalado = false;
        borracha5.mostrar();
        
        //////////////// Caderno ///////////////////
        Caderno caderno1 = new Caderno();
        caderno1.folhas = 256;
        caderno1.capa = "Capa dura rosa";
        caderno1.matérias = "16";
        caderno1.marca = "Tilibra";
        caderno1.preço = 30.00;
        caderno1.embalado = false;
        caderno1.mostrar();
        
        Caderno caderno2 = new Caderno();
        caderno2.folhas = 50;
        caderno2.capa = "Capa mole verde";
        caderno2.matérias = "1";
        caderno2.marca = "Tilibra";
        caderno2.preço = 15.00;
        caderno2.embalado = true;
        caderno2.mostrar();

        Caderno caderno3 = new Caderno();
        caderno3.folhas = 50;
        caderno3.capa = "Capa dura azul";
        caderno3.matérias = "1";
        caderno3.marca = "Stiff";
        caderno3.preço = 7.50;
        caderno3.embalado = false;
        caderno3.mostrar();

        Caderno caderno4 = new Caderno();
        caderno4.folhas = 150;
        caderno4.capa = "Fichário";
        caderno4.matérias = "10 divisórias";
        caderno4.marca = "Faber-Castell";
        caderno4.preço = 15.00;
        caderno4.embalado = true;
        caderno4.mostrar();

        Caderno caderno5 = new Caderno();
        caderno5.folhas = 192;
        caderno5.capa = "Capa mole rosa";
        caderno5.matérias = "12";
        caderno5.marca = "Foroni";
        caderno5.preço = 28.90;
        caderno5.embalado = false;
        caderno5.mostrar();

        //////////////// Caneta ////////////////////
        Caneta caneta1 = new Caneta();
        caneta1.corCaneta = "Vermelha";
        caneta1.marca = "Compactor";
        caneta1.modelo = "Esferográfica 0.7";
        caneta1.corTinta = "Vermelho";
        caneta1.preço = 3.00;
        caneta1.tampado = true;
        caneta1.mostrar();

        Caneta caneta2 = new Caneta();
        caneta2.corCaneta = "Rosa";
        caneta2.marca = "Leo&Leo";
        caneta2.modelo = "Caneta Pincel";
        caneta2.corTinta = "Rosa";
        caneta2.preço = 8.00;
        caneta2.tampado = true;
        caneta2.mostrar();

        Caneta caneta3 = new Caneta();
        caneta3.corCaneta = "Azul";
        caneta3.marca = "Compactor";
        caneta3.modelo = "Trillux 0.32";
        caneta3.corTinta = "Azul";
        caneta3.preço = 3.00;
        caneta3.tampado = true;
        caneta3.mostrar();

        Caneta caneta4 = new Caneta();
        caneta4.corCaneta = "Amarela";
        caneta4.marca = "Jet Lux";
        caneta4.modelo = "Esferográfica 0.7";
        caneta4.corTinta = "Azul";
        caneta4.preço = 2.00;
        caneta4.tampado = false;
        caneta4.mostrar();

        Caneta caneta5 = new Caneta();
        caneta5.corCaneta = "Preta";
        caneta5.marca = "Faber-Castell";
        caneta5.modelo = "Caneta Pincel";
        caneta5.corTinta = "Preto";
        caneta5.preço = 10.00;
        caneta5.tampado = true;
        caneta5.mostrar();

        ///////////////// Mochila //////////////////
        Mochila mochila1 = new Mochila();
        mochila1.cor = "Marrom";
        mochila1.marca = "Travelux";
        mochila1.modelo = "Para Laptop";
        mochila1.tamanho = "Grande";
        mochila1.preço = 270.00;
        mochila1.embalado = false;
        mochila1.mostrar();

        Mochila mochila2 = new Mochila();
        mochila2.cor = "Preta";
        mochila2.marca = "Nike";
        mochila2.modelo = "Com rodinhas";
        mochila2.tamanho = "Grande";
        mochila2.preço = 150.00;
        mochila2.embalado = false;
        mochila2.mostrar();

        Mochila mochila3 = new Mochila();
        mochila3.cor = "Rosa";
        mochila3.marca = "Santino";
        mochila3.modelo = "Escolar, com alças para a costa";
        mochila3.tamanho = "Média";
        mochila3.preço = 70.00;
        mochila3.embalado = false;
        mochila3.mostrar();

        Mochila mochila4 = new Mochila();
        mochila4.cor = "Azul";
        mochila4.marca = "Travelux";
        mochila4.modelo = "Estilo bolsa";
        mochila4.tamanho = "Média";
        mochila4.preço = 107.00;
        mochila4.embalado = true;
        mochila4.mostrar();

        Mochila mochila5 = new Mochila();
        mochila5.cor = "Roxa";
        mochila5.marca = "Onbongo";
        mochila5.modelo = "Feminino";
        mochila5.tamanho = "Pequeno";
        mochila5.preço = 100.00;
        mochila5.embalado = true;
        mochila5.mostrar();
    
    }
}
