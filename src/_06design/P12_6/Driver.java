package _06design.P12_6;

import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/11/5.
 */
public class Driver {
    public static void main(String[] args) {
        int score = 0;
        int level = 1;
        boolean flag = true;
        System.out.println("Welcome to the arithmetic game!\n");
        System.out.println("If you want to start, please press s, if you want to quit," +
                " please press q");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        while (!str.equals("S") && !str.equals("s")) {
            if (str.equals("Q") || str.equals("q"))
                return;
            else {
                System.out.println("Please press s or q: ");
                str = in.next();
            }
        }
        while (flag) {
            if (level == 1) {
                LevelOne level1 = new LevelOne();
                level1.show();
                if (level1.test() == true){
                    score++;
                    System.out.println("\nCongratulations! You get " +
                            score + " point(s)\n");
                    if (score == 5){
                        score = 0;
                        level ++;
                    }
                    continue;
                } else {
                    System.out.println("\nSorry, you answer is wrong!\n");
                    level1.show();
                    if (level1.test() == true){
                        score++;
                        System.out.println("\nCongratulations! You get " +
                                score + " point(s)\n");
                        if (score == 5){
                            score = 0;
                            level ++;
                        }
                        continue;
                    } else {
                        System.out.println("\nSorry, you answer is wrong again!\n");
                        System.out.println("\nIf you want to quit, please press q, " +
                                "\nif not, please press anything else: ");
                        str = in.next();
                        if (str.equals("Q") || str.equals("q")){
                            return;
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (level == 2) {
                LevelTwo level2 = new LevelTwo();
                level2.show();
                if (level2.test()){
                    score++;
                    System.out.println("\nCongratulations! You get " +
                            score + " point(s)\n");
                    if (score == 5){
                        score = 0;
                        level ++;
                    }
                    continue;
                } else {
                    System.out.println("\nSorry, you answer is wrong!\n");
                    level2.show();
                    System.out.println();
                    if (level2.test()){
                        score++;
                        System.out.println("\nCongratulations! You get " +
                                score + " point(s)\n");
                        if (score == 5){
                            score = 0;
                            level ++;
                        }
                        continue;
                    } else {
                        System.out.println("\nSorry, you answer is wrong again!\n");
                        System.out.println("\nIf you want to quit, please press q, " +
                                "\nif you want to restart from level 1, press 1, " +
                                "\nif you want to continue with level 2, please press anything else: ");
                        str = in.next();
                        if (str.equals("Q") || str.equals("q")){
                            return;
                        } else if (str.equals("1")){
                            level = 1;
                            score = 0;
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (level == 3) {
                LevelThree level3 = new LevelThree();
                level3.show();
                if (level3.test()){
                    score++;
                    System.out.println("\nCongratulations! You get " +
                            score + " point(s)\n");
                    if (score % 5 == 0){
                        System.out.println("\nYou have get " + score + " marks, if you want to quit, " +
                                "please press q, \nif you want to restart from level 1, " +
                                "please press 1, \nif you want to restart from level 2, " +
                                "please press 2, \nif you just want to continue with level 3, " +
                                "press anything else: ");
                        str = in.next();
                        if (str.equals("Q") || str.equals("q")){
                            return;
                        } else if (str.equals("1")){
                            level = 1;
                            score = 0;
                        } else if (str.equals("2")){
                            level = 2;
                            score = 0;
                        }
                    }
                    continue;
                } else {
                    System.out.println("\nSorry, you answer is wrong!\n");
                    level3.show();
                    if (level3.test()){
                        score++;
                        System.out.println("\nCongratulations! You get " +
                                score + " point(s)\n");
                        if (score % 5 == 0){
                            System.out.println("\nYou have get " + score + " marks, if you want to quit, " +
                                    "please press q, \nif you want to restart from level 1, " +
                                    "\nplease press 1, \nif you want to restart from level 2, " +
                                    "please press 2, \nif you just want to continue with level 3, " +
                                    "press anything else: ");
                            str = in.next();
                            if (str.equals("Q") || str.equals("q")){
                                return;
                            } else if (str.equals("1")){
                                level = 1;
                                score = 0;
                            } else if (str.equals("2")){
                                level = 2;
                                score = 0;
                            }
                        }
                        continue;
                    } else {
                        System.out.println("\nSorry, you answer is wrong again!\n");
                        System.out.println("\nIf you want to quit, please press q, " +
                                "\nif you want to restart from level 1, press 1, " +
                                "\nif you want to restart from level 2, press 2, " +
                                "\nif you want to continue with level 3, please press anything else: ");
                        str = in.next();
                        if (str.equals("Q") || str.equals("q")){
                            return;
                        } else if (str.equals("1")){
                            level = 1;
                            score = 0;
                            continue;
                        } else if (str.equals("2")){
                            level = 2;
                            score = 0;
                            continue;
                        }else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}
