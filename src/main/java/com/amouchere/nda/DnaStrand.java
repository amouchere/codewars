package com.amouchere.nda;

public class DnaStrand {
    public static String makeComplement(String dna) {
        //Your code

       return  dna.chars()
                .mapToObj(i -> (char) i)
                .map(character -> {
                    if (character.toString().equals("T")) {
                        return "A";
                    } else if (character.toString().equals("A")) {
                        return "T";
                    } else if (character.toString().equals("C")) {
                        return "G";
                    } else if (character.toString().equals("G")) {
                        return "C";
                    } else {
                        return "";
                    }
                }).reduce("", String::concat);

    }

}
