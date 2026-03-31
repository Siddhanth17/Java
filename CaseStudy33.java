abstract class media {
    protected String title;
    protected int duration;

    public media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    abstract void play();
}

interface playable {
    void playcontent();
}

class movie extends media implements playable {
    public movie(String title, int duration) {
        super(title, duration);
    }

    public void playcontent() {
        if (duration > 0) {
            System.out.println("verifying subscription...");
            play();
        }
    }

    void play() {
        System.out.println("streaming movie: " + title);
    }
}

class audio extends media implements playable {
    public audio(String title, int duration) {
        super(title, duration);
    }

    public void playcontent() {
        play();
    }

    void play() {
        System.out.println("loading ad...");
        System.out.println("playing podcast: " + title);
    }
}

class CaseStudy33 {
    public static void main(String[] args) {
        playable m1 = new movie("inception", 148);
        playable a1 = new audio("tech talk", 30);
        playable m2 = new movie("free short", 15);

        m1.playcontent();
        a1.playcontent();
        m2.playcontent();
    }
}