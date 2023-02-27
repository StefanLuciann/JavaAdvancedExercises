package AdvancedLiveCodingex12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Zoo {

    private Map<String, Integer> numberOfAnimalBySpecies = new HashMap<>();

    public int getNumberOfAllAnimals(){
        return numberOfAnimalBySpecies.values()
                .stream().
                mapToInt(value -> value).sum();
    }

    public Map<String, Integer> getAnimalsCount(){
        return new HashMap<>(numberOfAnimalBySpecies);
    }

    public void addAnimals(String species, int numberOfAnimals){
        if(!numberOfAnimalBySpecies.containsKey(species)){
            numberOfAnimalBySpecies.put(species, numberOfAnimals);
        } else{
            int currentNumberOfAnimals= numberOfAnimalBySpecies.get(species);
            numberOfAnimalBySpecies.put(species,currentNumberOfAnimals + numberOfAnimals);
        }
    }

    public List<Map.Entry<String,Integer>> getAnimalsCountSorted(){
        return numberOfAnimalBySpecies.entrySet().stream()
                .sorted((entry1, entry2)-> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toList());
    }
}
