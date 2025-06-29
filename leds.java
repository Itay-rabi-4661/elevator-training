public class leds extends  elev {
        private String color = ""; // "" = ללא צבע
        private int cycleCount = 0;
    
        // שלב 1 - הגדרת צבע או הסרתו
        public void setColor(String newColor) {
            if (newColor == null || newColor.isEmpty()) {
                System.out.println("צבע הוסר");
                color = "";
            } else {
                System.out.println("צבע חדש הוגדר: " + newColor);
                color = newColor;
            }
        }
    
        // שלב 2 - עדכון צבע כל 3 מחזורים
        public void updateColorEvery3Cycles() {
            if (!color.isEmpty() && cycleCount % 3 == 0) {
                System.out.println(">> עדכון צבע לפי שלב 2: " + color + " (מחזור " + cycleCount + ")");
            }
        }
    
        // שלב 3 - שינוי צבע פעם ב-2 וב-4 מחזורים
        public void changeColorInEvenCycles() {
            if (!color.isEmpty()) {
                if (cycleCount % 2 == 0) {
                    System.out.println("-- שינוי צבע במחזור זוגי (שלב 3 - כל 2 מחזורים)");
                }
                if (cycleCount % 4 == 0) {
                    System.out.println("-- שינוי צבע במחזור כפול של 4 (שלב 3 - כל 4 מחזורים)");
                }
            }
        }
    
        // הדמיית ריצה
        public void runCycles(int totalCycles) {
            for (cycleCount = 1; cycleCount <= totalCycles; cycleCount++) {
                System.out.println("\nמחזור: " + cycleCount);
                updateColorEvery3Cycles();
                changeColorInEvenCycles();
            }
        }
    
        public static void main(String[] args) {
            ColorManager manager = new ColorManager();
    
            // שלב 1 - הגדרת צבע
            manager.setColor("אדום");
    
            // הדמיה של ריצה של 10 מחזורים
            manager.runCycles(10);
    
            // שלב 1 - הסרת צבע
            manager.setColor("");
        }
    }
    

 

