package programming_questions.enums;

public class Main {

    public static void main(String[] args) {

        Task task = new Task("Avishi Ganepola", Status.IN_PROGRESS, Priority.MEDIUM, Level.INTERMEDIATE);

        System.out.println("Task Details:");
        System.out.println("Name: " + task.getName());
        System.out.println("Status: " + task.getStatus());
        System.out.println("Priority: " + task.getPriority());
        System.out.println("Level: " + task.getLevel());
    }
}
