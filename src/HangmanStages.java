public class HangmanStages {

    public final char a = 92;

    public void stage1() {
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

    public void stage2() {
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

    public void stage3() {
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

    public void stage4() {
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

    public void stage5() {
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

    public void stage6() {
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

    public void stage7() {
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

    public void stage8() {
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
