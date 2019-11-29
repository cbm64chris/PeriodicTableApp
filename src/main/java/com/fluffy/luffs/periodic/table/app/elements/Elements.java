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
    },
    Neon(10, 20.180, "Ne", "Neon", 18, 2, Type.NobleGas) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Neon.elementName).get();
        }
    },
    Sodium(11, 22.990, "Na", "Sodium", 1, 3, Type.AlkaliMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Sodium.elementName).get();
        }
    },
    Magnesium(12, 24.305, "Mg", "Magnesium", 2, 3, Type.AlkalineEarthMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Magnesium.elementName).get();
        }
    },
    Aluminium(13, 26.982, "Ai", "Aluminium", 13, 3, Type.PostTtransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Aluminium.elementName).get();
        }
    },
    Silicon(14, 28.085, "Si", "Silicon", 14, 3, Type.Metaloid) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Silicon.elementName).get();
        }
    },
    Phosphorus(15, 30.974, "P", "Phosphorus", 15, 3, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Phosphorus.elementName).get();
        }
    },
    Sulfur(16, 32.06, "S", "Sulfur", 16, 3, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Sulfur.elementName).get();
        }
    },
    Chlorine(17, 35.45, "Ci", "Chlorine", 17, 3, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Chlorine.elementName).get();
        }
    },
    Argon(18, 39.95, "Ar", "Argon", 18, 3, Type.NobleGas) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Argon.elementName).get();
        }
    },
    Potassium(19, 39.098, "k", "Potassium", 1, 4, Type.AlkaliMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Potassium.elementName).get();
        }
    },
    Calcium(20, 40.078, "Ca", "Calcium", 2, 4, Type.AlkalineEarthMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Calcium.elementName).get();
        }
    },
    Scandium(21, 44.956, "Sc", "Scandium", 3, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Scandium.elementName).get();
        }
    },
    Titanium(22, 47.867, "Ti", "Titanium", 4, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Titanium.elementName).get();
        }
    },
    Vanadium(23, 50.942, "V", "Vanadium", 5, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Vanadium.elementName).get();
        }
    },
    Chromium(24, 51.996, "Cr", "Chromium", 6, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Chromium.elementName).get();
        }
    },
    Manganese(25, 54.938, "Mn", "Manganese", 7, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Manganese.elementName).get();
        }
    },
    Iron(26, 55.845, "Fe", "Iron", 8, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Iron.elementName).get();
        }
    },
    Cobalt(27, 58.933, "Co", "Cobalt", 9, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Cobalt.elementName).get();
        }
    },
    Copper(28, 63.546, "Cu", "Copper", 10, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Copper.elementName).get();
        }
    },
    Zinc(29, 65.38, "Zn", "Zinc", 11, 4, Type.PostTtransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Zinc.elementName).get();
        }
    },
    Gallium(30, 69.723, "Ga", "Gallium", 12, 4, Type.PostTtransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Gallium.elementName).get();
        }
    },
    Germanium(31, 72.630, "Ge", "Germanium", 13, 4, Type.Metaloid) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Germanium.elementName).get();
        }
    },
    Arsenic(32, 74.922, "As", "Arsenic", 14, 4, Type.Metaloid) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Arsenic.elementName).get();
        }
    },
    Selenium(33, 78.971, "Se", "Selenium", 15, 4, Type.ReactiveNonmetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Selenium.elementName).get();
        }
    },
    Nickel(28, 58.693, "Ni", "Nickel", 15, 4, Type.TransitionMetal) {
        @Override
        public String getDescription() {
            return getDescriptionFromWiki(Nickel.elementName).get();
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
            URL encodedStr = new URL("https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&titles=" + elementName + "&redirects=true");
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
