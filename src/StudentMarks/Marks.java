package StudentMarks;

public class Marks {
    public Subject telugu;
    public Subject hindi;
    public Subject english;
    public Subject maths;
    public Subject science;
    public Subject social;

    public Marks(Subject telugu,Subject hindi,Subject english,Subject maths,
                 Subject science,Subject social) {
        this.telugu = telugu;
        this.hindi = hindi;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.social = social;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "telugu=" + telugu +
                ", hindi=" + hindi +
                ", english=" + english +
                ", maths=" + maths +
                ", science=" + science +
                ", social=" + social +
                '}';
    }
}
