package LettersinClassActivity;

import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) {
        BigDecimal wisconsin =  new BigDecimal("5726398.00");
        BigDecimal california = new BigDecimal("38041430.00");
        BigDecimal texas  = new BigDecimal("26059203.00");
        BigDecimal texasMoney = new BigDecimal("3.23");

        BigDecimal wisconsinLetters = california.multiply(wisconsin);
        BigDecimal texasLetters = wisconsinLetters.multiply(texas);
        BigDecimal texasCost = texasLetters.multiply(texasMoney);

        System.out.println("Wisconsin Letters: " + wisconsinLetters);
        System.out.println("Texas Letters: " + texasLetters );
        System.out.println("Cost of Texas Letters: $" + texasCost);

    }
}
