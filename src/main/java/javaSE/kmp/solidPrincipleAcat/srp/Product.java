package javaSE.kmp.solidPrincipleAcat.srp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private double price;
    private Size size;
    private Color color;

    public Product(){

    }
}

