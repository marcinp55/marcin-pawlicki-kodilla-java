package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(final String bun, final int burgers, final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigMacBuilder {
        private String bun = "";
        private int burgers = 0;
        private String sauce = "";
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            if (bun.equals("Normal") || bun.equals("Sesame")) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Bun should be Normal or Sesame.");
            }
        }

        public BigMacBuilder burgers(int burgers) {
            if (burgers >= 1) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("You must have at least one burger.");
            }
        }

        public BigMacBuilder sauce(String sauce) {
            if (sauce.equals("Standard") || sauce.equals("1000") || sauce.equals("Barbecue")) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Sauce should be Standard, 1000 or Barbecue");
            }
        }

        public BigMacBuilder ingredient(String ingredient) {
            if (ingredient.equals("Lettuce") || ingredient.equals("Onion") || ingredient.equals("Bacon") || ingredient.equals("Cucumber") || ingredient.equals("Chilli") || ingredient.equals("Mushrooms") || ingredient.equals("Shrimps") || ingredient.equals("Cheese")) {
                this.ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Available ingredients: Lettuce, Onion, Bacon, Cucumber, Chilli, Mushroom, Shrimps, Cheese");
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
