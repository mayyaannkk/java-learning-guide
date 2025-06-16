package org.mayank.learningJava.enums;

public class EnumsDemo {
    enum Level {
        INFO(0, "Informative message", 0x00aa00),
        WARNING(5, "Warning message", 0xFFA500),
        ERROR(9, "Error message", 0xA30000);

        private final int severity;
        private final String label;
        private final int color;

        Level(int severity, String label, int color) {
            this.severity = severity;
            this.label = label;
            this.color = color;
        }

        public int getSeverity() {
            return severity;
        }

        public String getLabel() {
            return label;
        }

        public int getColor() {
            return color;
        }

    }

    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("Output of all the defined values in the Level enum:\n");
        for (Level level : Level.values()) {
            System.out.println("Level " + level.name()
                    + "\n\tSeverity: " + level.getSeverity()
                    + "\n\tLabel: " + level.getLabel()
                    + "\n\tColor: " + level.getColor());
        }
    }
}
