public class Deadline extends Task {

    protected String time;

    Deadline(String description, String time) {
        super(description);
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("[D]%s(by:%s)", super.toString(), time);
    }

    @Override
    public String toSaveString() {
        return String.format("%s || deadline || %s || %s", super.toSaveString(), this.description, this.time);
    }
}
