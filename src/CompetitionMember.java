public class CompetitionMember extends Member {
    private static final long serialVersionUID = 1L; // Unique identifier for Serializable classes
    private String competition;

    public CompetitionMember(String name, int age, String competition) {
        super(name, age);
        this.competition = competition;
    }

    public String getCompetition() {
        return competition;
    }

    @Override
    public String toString() {
        return "CompetitionMember{name='" + getName() + "', age=" + getAge() + ", competition='" + competition + "'}";
    }
}
