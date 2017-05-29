package FinalProject.backend;

public abstract class NFLPlayer implements ICelebrator {

    protected String name;
    protected String position;
    protected int age;
    protected int number;
    protected int weight;
    boolean isDrafted = false;

    public NFLPlayer(String name, String position, int age, int number, int weight) {

    }

    public NFLPlayer() {

    }

    public static final String[] CELEBRATIONS = {
        "Dang! Do I have to play for them?",
        "I can't believe I got drafted!", 
        "Casually accepts his fate.", 
        "Sobs uncontrollably.",
        "Raises hands to God in thanks!"
    };

    public static final String[] OFFENSIVEPOSITION = {
        "QB", 
        "RB", 
        "FB", 
        "WR", 
        "TE"
    };
    
    public static final String[] DEFENSIVEPOSITION = {
        "DE", 
        "DT", 
        "LB", 
        "CB", 
        "S"
    };

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void isDrafted(boolean isDrafted) {
        this.isDrafted = true;
        System.out.println(this.getName() + celebrate());

    }

    @Override
    public String celebrate() {
        String playerDrafted = "Yay!!!";
        return playerDrafted;
    }

    public void getPOSITION(int i) {

    }
    
    public Object[] toArray() {
        return new Object[] {
            this.name,
            this.position,
            this.age,
            this.number,
            this.weight
        };
    }
}
