public class HangmanStages {

    public static final char a = 92;

    public static void stage1() {
        System.out.println("XXXXXXX        ");
        System.out.println("X     X        ");
        System.out.println("X    ___       ");
        System.out.println("X   (. .)      ");
        System.out.println("X    ___       ");
        System.out.println("X              ");
        System.out.println("X              ");
        System.out.println("X              ");
        System.out.println("X              ");
        System.out.println("X              ");
        System.out.println("X              ");
        System.out.println("X              ");
    }

    public static void stage2() {
        System.out.println("XXXXXXX        ");
        System.out.println("X     X        ");
        System.out.println("X    ___       ");
        System.out.println("X   (. .)      ");
        System.out.println("X    ___       ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X              ");
        System.out.println("X              ");
        System.out.println("X              ");
    }

    public static void stage3() {
        System.out.println("XXXXXXX        ");
        System.out.println("X     X        ");
        System.out.println("X    ___       ");
        System.out.println("X "+a+" (. .)  ");
        System.out.println("X  "+a+" ___   ");
        System.out.println("X   "+a+" X    ");
        System.out.println("X    "+a+"X    ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X              ");
        System.out.println("X              ");
        System.out.println("X              ");
    }

    public static void stage4() {
        System.out.println("XXXXXXX        ");
        System.out.println("X     X        ");
        System.out.println("X    ___       ");
        System.out.println("X "+a+" (. .) /");
        System.out.println("X  "+a+" ___ / ");
        System.out.println("X   "+a+" X /  ");
        System.out.println("X    "+a+"X/   ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X              ");
        System.out.println("X              ");
        System.out.println("X              ");
    }

    public static void stage5() {
        System.out.println("XXXXXXX        ");
        System.out.println("X     X        ");
        System.out.println("X    ___       ");
        System.out.println("X "+a+" (. .) /");
        System.out.println("X  "+a+" ___ / ");
        System.out.println("X   "+a+" X /  ");
        System.out.println("X    "+a+"X/   ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X    /         ");
        System.out.println("X   /          ");
        System.out.println("X              ");
    }

    public static void stage6() {
        System.out.println("XXXXXXX        ");
        System.out.println("X     X        ");
        System.out.println("X    ___       ");
        System.out.println("X "+a+" (. .) /");
        System.out.println("X  "+a+" ___ / ");
        System.out.println("X   "+a+" X /  ");
        System.out.println("X    "+a+"X/   ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X    / "+a+"   ");
        System.out.println("X   /   "+a+"  ");
        System.out.println("X              ");
    }

    public static void stage7() {
        System.out.println("XXXXXXX        ");
        System.out.println("X     X        ");
        System.out.println("X    ___  "+a+"");
        System.out.println("X "+a+" (. .) /");
        System.out.println("X  "+a+" ___ / ");
        System.out.println("X   "+a+" X /  ");
        System.out.println("X    "+a+"X/   ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X    / "+a+"   ");
        System.out.println("X   /   "+a+"  ");
        System.out.println("X              ");
    }

    public static void stage8() {
        System.out.println("XXXXXXX        ");
        System.out.println("X     X        ");
        System.out.println("X /  ___  "+a);
        System.out.println("X "+a+" (. .) /");
        System.out.println("X  "+a+" ___ / ");
        System.out.println("X   "+a+" X /  ");
        System.out.println("X    "+a+"X/   ");
        System.out.println("X     X        ");
        System.out.println("X     X        ");
        System.out.println("X    / "+a+"   ");
        System.out.println("X   /   "+a+"  ");
        System.out.println("X              ");
    }
}
