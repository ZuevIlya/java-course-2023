package edu.hw4.Task20;

import edu.hw4.Animal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task20 {

    private Task20() {

    }

    public static Map<String, String> getAnimalErrors(List<Animal> list) {
        Map<String, String> validationErrorsMap = new HashMap<>();
        for (Animal animal: list) {
            StringBuilder errorsString = new StringBuilder();
            // Вызов функций
            if (validateName(animal) != null) {
                errorsString.append(" ").append("Name");
            }
            if (validateType(animal) != null) {
                errorsString.append(" ").append("Type");
            }
            if (validateSex(animal) != null) {
                errorsString.append(" ").append("Sex");
            }
            if (validateAge(animal) != null) {
                errorsString.append(" ").append("Age");
            }
            if (validateHeight(animal) != null) {
                errorsString.append(" ").append("Height");
            }
            if (validateWeight(animal) != null) {
                errorsString.append(" ").append("Weight");
            }
            if (!errorsString.isEmpty()) {
                validationErrorsMap.put(animal.name(), String.valueOf(errorsString).substring(1));
            }
        }
        return validationErrorsMap;
    }

    private static ValidationError validateName(Animal animal) {
        if (animal.name().isEmpty()) {
            return new ValidationError("Name", "Empty name");
        }
        return null;
    }

    private static ValidationError validateType(Animal animal) {
        if (animal.type() == null) {
            return new ValidationError("Type", "You need to choose the type");
        }
        return null;
    }

    private static ValidationError validateSex(Animal animal) {
        if (animal.sex() == null) {
            return new ValidationError("Sex", "Sex is null");
        }
        return null;
    }

    private static ValidationError validateAge(Animal animal) {
        if (animal.age() < 0) {
            return new ValidationError("Age", "Age cannot be negative");
        }
        if (animal.type() == null) {
            return null;
        }
        switch (animal.type()) {
            case CAT:
                if (animal.age() > 17) {
                    return new ValidationError("Age", "Cats don't live that long");
                } else {
                    return null;
                }
            case DOG:
                if (animal.age() > 15) {
                    return new ValidationError("Age", "Dogs don't live that long");
                } else {
                    return null;
                }
            case BIRD:
                if (animal.age() > 25) {
                    return new ValidationError("Age", "Birds don't live that long");
                } else {
                    return null;
                }
            case FISH:
                if (animal.age() > 12) {
                    return new ValidationError("Age", "Fishes don't live that long");
                } else {
                    return null;
                }
            case SPIDER:
                if (animal.age() > 3) {
                    return new ValidationError("Age", "Spiders don't live that long (Exception - spider-man");
                } else {
                    return null;
                }
            default:
                break;
        }
        return null;
    }

    private static ValidationError validateHeight(Animal animal) {
        if (animal.height() < 0) {
            return new ValidationError("Height", "Height cannot be negative");
        }
        if (animal.type() == null) {
            return null;
        }
        switch (animal.type()) {
            case CAT:
                if ((animal.height() < 10) || (animal.height() > 60)) {
                    return new ValidationError("Height", "Cats can't have that much height");
                } else {
                    return null;
                }
            case DOG:
                if ((animal.height() < 20) || (animal.height() > 80)) {
                    return new ValidationError("Height", "Dogs can't have that much height");
                } else {
                    return null;
                }
            case BIRD:
                if ((animal.height() < 10) || (animal.height() > 80)) {
                    return new ValidationError("Height", "Birds can't have that much height");
                } else {
                    return null;
                }
            case FISH:
                if ((animal.height() < 7) || (animal.height() > 300)) {
                    return new ValidationError("Height", "Fishes can't have that much height");
                } else {
                    return null;
                }
            case SPIDER:
                if ((animal.height() < 0.100) || (animal.height() > 10)) {
                    return new ValidationError("Height", "Spiders can't have that much height");
                } else {
                    return null;
                }
            default:
                break;
        }
        return null;
    }

    private static ValidationError validateWeight(Animal animal) {
        if (animal.weight() < 0) {
            return new ValidationError("Weight", "Height cannot be negative");
        }
        if (animal.type() == null) {
            return null;
        }
        switch (animal.type()) {
            case CAT:
                if ((animal.weight() < 2.5) || (animal.weight() > 6.5)) {
                    return new ValidationError("Weight", "Cats can't have that much weight");
                } else {
                    return null;
                }
            case DOG:
                if ((animal.weight() < 2) || (animal.weight() > 60)) {
                    return new ValidationError("Weight", "Dogs can't have that much weight");
                } else {
                    return null;
                }
            case BIRD:
                if ((animal.weight() < 0.005) || (animal.weight() > 19)) {
                    return new ValidationError("Weight", "Birds can't have that much weight");
                } else {
                    return null;
                }
            case FISH:
                if ((animal.weight() < 0.100) || (animal.weight() > 3)) {
                    return new ValidationError("Weight", "Fishes can't have that much weight");
                } else {
                    return null;
                }
            case SPIDER:
                if ((animal.weight() < 0.100) || (animal.weight() > 15)) {
                    return new ValidationError("Weight", "Spiders can't have that much weight");
                } else {
                    return null;
                }
            default:
                break;
        }
        return null;
    }
}
