package programming_questions.enums;

public class Task {

    private String name;
    private Status status;
    private Priority priority;
    private Level level;

    public Task(String name, Status status, Priority priority, Level level) {
        setName(name);
        setStatus(status);
        setPriority(priority);
        setLevel(level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
