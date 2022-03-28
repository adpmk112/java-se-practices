package javaSE.kmp.solidPrincipleAcat.ocp;

import javaSE.kmp.solidPrincipleAcat.srp.Color;
import javaSE.kmp.solidPrincipleAcat.srp.Product;

public class ColorCondition implements Condition<Product> {
    private Color color;

    public ColorCondition(Color color){
        this.color = color;
    }

    @Override
    public boolean isMatched(Product item) {
        return item.getColor() == this.color;
    }
}
