package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

class TextAnalyzer {
    private Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

    public void load(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int position = 0;

            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " .,;?!-\"");

                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken().toLowerCase();

                    if (!map.containsKey(word)) {
                        map.put(word, new ArrayList<Integer>());
                    }
                    map.get(word).add(position);
                    position++;
                }
            }

            reader.close();
            System.out.println(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(String word, int position) {
       if(map.containsKey(word)) {
    	   map.get(word).add(position);
    	   
       }else {
    	   ArrayList<Integer>list = new ArrayList<>();
    	   list.add(position);
    	   map.put(word, list);
    	   System.out.println(map);
       }
    
    }

    public void displayWords() {
        Map<String, ArrayList<Integer>> map = new TreeMap<>(this.map);
        for(Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
        	System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }

    public int countAllWords() {
        int count=0;
        for(String word : map.keySet()) {
        	count+=map.get(word).size();
        }
        System.out.println(count);
        return count;
    }

    public void displayText() {
      int cou = countAllWords();
      String [] content = new String[cou];
      for(String word : map.keySet()) {
    	  for(int i=0; i<map.get(word).size();i++) {
    		  content[map.get(word).get(i)]=word;
    	  }
      }
      for(int i=0;i<content.length;i++) {
    	  System.out.print(content[i]+" ");
      }
      System.out.println();
    }

    public String mostFrequentWord() {
      int max=0;
      String newWord= "";
      for(String word : map.keySet()) {
    	  if(map.get(word).size()>max&&!word.equals(" ")) {
    		  max=map.get(word).size();
    		  newWord=word;
    	  }
      }
     return newWord;
    }

   
}