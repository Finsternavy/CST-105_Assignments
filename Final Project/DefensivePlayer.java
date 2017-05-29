package FinalProject.backend;

public class DefensivePlayer extends NFLPlayer {

    private int soloTackles = 0;
    private int assistedTackles = 0;
    private int totalTackles = 0;
    private int sacks = 0;
    private int interceptions = 0;
    private int safeties = 0;
    private int passDeflections = 0;
    private int defensiveTDs = 0;
    private int forcedFumbles = 0;
    private int fumbleRecoveries = 0;

    public DefensivePlayer(String name, String position, int age, int number, int weight,
            int soloTackles, int assistedTackles, int totalTackles, int sacks, int interceptions,
            int safeties, int passDeflections, int defensiveTDs, int forcedFumbles,
            int fumbleRecoveries) {

        this.name = name;
        this.position = position;
        this.age = age;
        this.number = number;
        this.weight = weight;
        this.soloTackles = soloTackles;
        this.assistedTackles = assistedTackles;
        this.totalTackles = totalTackles;
        this.sacks = sacks;
        this.interceptions = interceptions;
        this.safeties = safeties;
        this.passDeflections = passDeflections;
        this.defensiveTDs = defensiveTDs;
        this.forcedFumbles = forcedFumbles;
        this.fumbleRecoveries = fumbleRecoveries;
    }

    public DefensivePlayer() {

    }

    public void setSoloTackles(int tackles) {
        this.soloTackles = tackles;
    }

    public int getSoloTackles() {
        return this.soloTackles;
    }

    public void setAssistedTackles(int assistedTackles) {
        this.assistedTackles = assistedTackles;
    }

    public int getAssistedTackles() {
        return this.assistedTackles;
    }

    public void setTotalTackles(int totalTackles) {
        this.totalTackles = totalTackles;
    }

    public int getTotalTackles() {
        return this.totalTackles;
    }

    public void setSacks(int sacks) {
        this.sacks = sacks;
    }

    public int getSacks() {
        return this.sacks;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getInterceptions() {
        return this.interceptions;
    }

    public void setSafeties(int safeties) {
        this.safeties = safeties;
    }

    public int getSafeties() {
        return this.safeties;
    }

    public void setPassDeflections(int passDeflections) {
        this.passDeflections = passDeflections;
    }

    public int getPassDeflections() {
        return this.passDeflections;
    }

    public void setDefensiveTDs(int defensiveTDs) {
        this.defensiveTDs = defensiveTDs;
    }

    public int getDefensiveTDs() {
        return this.defensiveTDs;
    }

    public void setForcedFumbles(int forcedFumbles) {
        this.forcedFumbles = forcedFumbles;
    }

    public int getForcedFumbles() {
        return this.forcedFumbles;
    }

    public void setFumbleRecoveries(int fumbleRecoveries) {
        this.fumbleRecoveries = fumbleRecoveries;
    }

    public int getFumbleRecoveries() {
        return this.fumbleRecoveries;
    }

    @Override
    public String celebrate() {
        int c = (int) (Math.random() * 5);
        if (c > 4) {
            return " This defense just got a LOT better!";
        }
        return CELEBRATIONS[c];
    }

    @Override
    public Object[] toArray() {
        return new Object[]{
            this.name,
            this.position,
            this.age,
            this.number,
            this.weight,
            this.soloTackles,
            this.assistedTackles,
            this.totalTackles,
            this.sacks,
            this.interceptions,
            this.safeties,
            this.passDeflections,
            this.defensiveTDs,
            this.forcedFumbles,
            this.fumbleRecoveries
        };
    }

}
