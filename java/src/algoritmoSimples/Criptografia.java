package algoritmoSimples;

public class Criptografia {

    // criptografia simples

    public static String substituicaoSimples( String texto){
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            switch (c) {
                case 'a': resultado.append('%'); break;
                case 'e': resultado.append('8'); break;
                case 'i': resultado.append('!'); break;
                case 'o': resultado.append('§'); break;
                case 'u': resultado.append('#'); break;
                default: resultado.append(c);
            }
        }
        return resultado.toString();
    }

    // reverter a criptografia simples

    public static String reversaoSubsSimples(String texto){
        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            switch (c) {
                case '%': resultado.append('a'); break;
                case '8': resultado.append('e'); break;
                case '!': resultado.append('i'); break;
                case '§': resultado.append('o'); break;
                case '#': resultado.append('u'); break;
                default: resultado.append(c);
            }
        }
        return resultado.toString();
    }
    // criptografia: palavras com as letras em ordem invertida

    public static String palavrasInversas(String texto){
        StringBuilder resultado = new StringBuilder(texto);
        return resultado.reverse().toString();
    }

    // reverter palavras com as letras em ordem invertida

    public static String reverterPalavrasInversas(String texto){
        StringBuilder resultado = new StringBuilder(texto);
        return resultado.toString();
    }

}

