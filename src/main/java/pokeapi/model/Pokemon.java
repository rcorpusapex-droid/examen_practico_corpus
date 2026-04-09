package pokeapi.model;

import java.util.List;

public class Pokemon {
    private int id;
    private String name;
    private int height;
    private int weight;
    private List<AbilitySlot> abilities;
    private List<TypeSlot> types;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public List<AbilitySlot> getAbilities() {
        return abilities;
    }

    public List<TypeSlot> getTypes() {
        return types;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();

        resultado.append("Pokemon encontrado").append("\n");
        resultado.append("Id: ").append(id).append("\n");
        resultado.append("Nombre: ").append(name).append("\n");
        resultado.append("Altura: ").append(height).append("\n");
        resultado.append("Peso: ").append(weight).append("\n");

        resultado.append("Tipos: ");
        if (types != null && !types.isEmpty()) {
            for (int i = 0; i < types.size(); i++) {
                resultado.append(types.get(i).getType().getName());

                if (i < types.size() - 1) {
                    resultado.append(", ");
                }
            }
        } else {
            resultado.append("No disponibles");
        }

        resultado.append("\n");
        resultado.append("Habilidades: ");

        if (abilities != null && !abilities.isEmpty()) {
            for (int i = 0; i < abilities.size(); i++) {
                resultado.append(abilities.get(i).getAbility().getName());

                if (i < abilities.size() - 1) {
                    resultado.append(", ");
                }
            }
        } else {
            resultado.append("No disponibles");
        }

        return resultado.toString();
    }
}
