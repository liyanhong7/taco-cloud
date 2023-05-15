package com.example.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        // 卷饼、蛋白质、蔬菜、奶酪、酱汁
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
