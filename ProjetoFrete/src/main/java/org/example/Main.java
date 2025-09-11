package org.example;

public class Main {

    //metodo que calcula o frete de entrega
    public static double calcularFrete(Distancia distancia, String empresa){
        double taxa;

        //aqui a gente define a porcentagem da taxa de acordo com a empresa informada,
        //ignorando as letras maiusculas e minusculas na entrada de texto do usuario
        if (empresa.equalsIgnoreCase("ABC")) {
            taxa = 0.1;
        } else if(empresa.equalsIgnoreCase("CBA")){
            taxa = 0.2;
        } else if(empresa.equalsIgnoreCase("XPTO")){
            taxa = 0.3;
        } else {
            //no caso da empresa não existir, a taxa é 0
            taxa = 0.0;
        }

        return distancia.valor * taxa;
    }

    public static void main(String[] args) {
        //instanciando um objeto Distancia chamado d1
        Distancia d1 = new Distancia(36.5);

        //chamada do metodo calcularFrete, passando o objeto d1
        // e uma String da respectiva empresa
        double freteABC = calcularFrete(d1, "ABC");
        double freteCBA = calcularFrete(d1, "CBA");
        double freteXPTO = calcularFrete(d1, "XPTO");


        //exibição dos resultados do frete calculado, para as tres opçoes
        System.out.println("Frete da empresa ABC ficou: R$ " + freteABC + " para a distância de " + d1.valor + "km");
        System.out.println("Frete da empresa CBA ficou: R$ " + freteCBA + " para a distância de " + d1.valor + "km");
        System.out.println("Frete da empresa XPTO ficou: R$ " + freteXPTO + " para a distância de " + d1.valor + "km");
    }
}