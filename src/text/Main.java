package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static text.Text.modifyTextList;

public class Main {
    public static void main(String[] args) {

        List<String> texts = new ArrayList<>(Arrays.asList(
                "Ez egy rövid szöveg.",
                "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
                "Ez is egy rövid szöveg.",
                "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."));
        modifyTextList(texts);
        System.out.println(texts);
    }
}
