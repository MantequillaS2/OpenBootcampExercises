package homework;

public class Exercise3 {
    public static void main(String[] args){

        String[] words = {"Today", "i", "saw", "the", "whole", "world"};
        String totalWords = "";

        for(int i = 0; i < words.length; i++){
            totalWords = totalWords + words[i];
        }
        System.out.println(totalWords);

    }
}
