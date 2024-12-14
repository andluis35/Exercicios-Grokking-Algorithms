package buscaemlargura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anderson Luis
 */

public class BuscaEmLargura {

    public static void main(String[] args) {
        HashMap<String, List<String>> graph = new HashMap<>();
        
        graph = fillGraph(graph);

        searchForMangoSeller("You", graph);     
    }
    
    public static boolean searchForMangoSeller(String name, HashMap<String, List<String>> graph) {
        ArrayList<String> searched = new ArrayList<>();
        Queue<String> possibleSellersQueue = new LinkedList<>();
        possibleSellersQueue.addAll(graph.get(name));
        
        while(!possibleSellersQueue.isEmpty()) {
            String person = possibleSellersQueue.poll();
            
            if(!searched.contains(person)) {
                if(isMangoSeller(person)) {
                    System.out.println(person + " é um(a) vendedor(a) de manga!");
                    return true;
                }
                else {
                    searched.add(person);
                    possibleSellersQueue.addAll(graph.get(person));
                }
            }
        }
        
        return false;
    }
    
    public static boolean isMangoSeller(String person) {
        return person.endsWith("m");
    }
    
    public static HashMap<String, List<String>> fillGraph(HashMap<String, List<String>> graph) {
        //You are Alice, Bob and Claire's friend
        graph.put("You", Arrays.asList("Alice", "Bob", "Claire"));
        
        //Bob is Anuj and Peggy's friend
        graph.put("Bob", Arrays.asList("Anuj", "Peggy"));
        
        //Alice is Peggy's friend
        graph.put("Alice", Arrays.asList("Peggy"));
        
        //Claire is Thom and Jonny's friend
        graph.put("Claire", Arrays.asList("Thom", "Jonny"));
        
        //Anuj, Peggy, Thom and Jonny have no friends
        graph.put("Anuj", Arrays.asList(""));
        graph.put("Peggy", Arrays.asList(""));
        graph.put("Thom", Arrays.asList(""));
        graph.put("Jonny", Arrays.asList(""));
        
        return graph;
    }
    
    public static void printGraph(HashMap<String, List<String>> graph) {
        for(String key : graph.keySet()) {
            System.out.println("Person: " + key + "\t\t" + "Friends: " + graph.get(key));
        }
    }
    
}
