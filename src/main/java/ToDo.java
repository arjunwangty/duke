public class ToDo extends Task {
    public ToDo(String s) {
        super(s);
    }

    public String toString() {
        return "[T]" + this.getStatusIcon() + this.description;
    }
}
