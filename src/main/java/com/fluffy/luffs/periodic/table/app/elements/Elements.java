package com.fluffy.luffs.periodic.table.app.elements;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import javafx.scene.paint.Color;
import org.json.JSONObject;
import org.json.JSONTokener;

public enum Elements {

    Hydrogen(1, 1.008, "H", "Hydrogen", 1, 1, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Hydrogen.getElementName()).get();
        }
    },
    Helium(2, 4.002602, "He", "Helium", 18, 1, Type.NobleGas) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Helium.elementName).get();
        }
    },
    Lithium(3, 6.94, "Li", "Lithium", 1, 2, Type.AlkaliMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Lithium.elementName).get();
        }
    },
    Beryllium(4, 9.0121831, "Be", "Beryllium", 2, 2, Type.AlkalineEarthMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Beryllium.elementName).get();
        }
    },
    Boron(5, 10.81, "B", "Boron", 13, 2, Type.Metaloid) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Boron.elementName).get();
        }
    },
    Carbon(6, 12.011, "C", "Carbon", 14, 2, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Carbon.elementName).get();
        }
    },
    Nitrogen(7, 14.007, "N", "Nitrogen", 15, 2, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Nitrogen.elementName).get();
        }
    },
    Oxygen(8, 15.999, "O", "Oxygen", 16, 2, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Oxygen.elementName).get();
        }
    },
    Fluorine(9, 18.998403163, "F", "Fluorine", 17, 2, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Fluorine.elementName).get();
        }
    };

    private final int atomicNumber;
    private final double atomicMass;
    private final String symbol;
    private final String elementName;
    private final int group;
    private final int period;
    private final Type type;

    Elements(int atomicNumber, double atomicMass, String symbol, String elementName, int group, int period, Type type) {
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
        this.symbol = symbol;
        this.elementName = elementName;
        this.group = group;
        this.period = period;
        this.type = type;
    }

    public String getElementName() {
        return this.elementName;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getGroup() {
        return group;
    }

    public int getPeriod() {
        return period;
    }

    public Type getType() {
        return type;
    }

    public abstract String getDescription();

    private static Optional<String> getDescriptionFromWiki(String elementName) {
        try {
            URL encodedStr = new URL("https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&titles="+elementName+"&redirects=true");
            JSONObject jsonObject = new JSONObject(new JSONTokener(encodedStr.openStream()));
            JSONObject obj = jsonObject.getJSONObject("query").getJSONObject("pages");
            return Optional.of(obj.getJSONObject(obj.keySet().stream().findFirst().get()).getString("extract"));
        } catch (IOException ex) {
            return Optional.empty();
        }
    }

    enum Type {
        NobleGas(Color.rgb(192, 255, 255)),
        ReactiveNonmetal(Color.rgb(240, 255, 143)),
        PostTtransitionMetal(Color.rgb(153, 153, 255)),
        TransitionMetal(Color.rgb(255, 192, 192)),
        Actinide(Color.rgb(255, 153, 204)),
        Lan­thanide(Color.rgb(255, 191, 255)),
        AlkalineEarthMetal(Color.rgb(255, 222, 173)),
        AlkaliMetal(Color.rgb(255, 102, 102)),
        Metaloid(Color.rgb(204, 204, 153));

        private final Color color;

        private Type(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }
    }

}
