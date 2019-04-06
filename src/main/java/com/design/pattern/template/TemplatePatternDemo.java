package com.design.pattern.template;

/**
 * @create: 2019/04/06 12:08
 */

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
