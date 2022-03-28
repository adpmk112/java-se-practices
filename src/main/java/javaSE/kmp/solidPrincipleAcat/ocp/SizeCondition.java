package javaSE.kmp.solidPrincipleAcat.ocp;

import javaSE.kmp.solidPrincipleAcat.srp.Product;
import javaSE.kmp.solidPrincipleAcat.srp.Size;

public class SizeCondition implements Condition<Product> {
    private Size size;
    public SizeCondition(Size size)
    {
        this.size = size;
    }
    @Override
    public boolean isMatched(Product item) {
        return item.getSize() == size;
    }
}
