import java.util.*;
public class Letter{
    public static void main(String[] args) {
        for(char ch='a'; ch<='z';ch++){
            System.out.print(ch);
            System.out.print(Character.toUpperCase(ch) + " ");
        }
    }
}    