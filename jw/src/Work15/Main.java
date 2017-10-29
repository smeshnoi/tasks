package Work15;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Assistant assistant1 = new Assistant("Федор");
        Assistant assistant2 = new Assistant("Антон");
        Scientist scientist1= new Scientist("Botan", assistant1);
        Scientist scientist2= new Scientist("Fedot", assistant2);
        Dump.generateFirstNight(new ArrayList<>());
        for (int i = 1; i <= 100; i++) {
            NightDump threadDump = new NightDump();
            NightAssistant thread1 = new NightAssistant(scientist1, assistant1);
            NightAssistant thread2 = new NightAssistant(scientist2, assistant2);
            threadDump.start();
            thread1.start();
            thread2.start();
            try {
                threadDump.join();
                thread1.join();
                thread2.join();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(scientist1.getName() + " создал " + scientist1.getCount() + " роботов");
        System.out.println(scientist2.getName() + " создал " + scientist2.getCount()  + " роботов");
    }

    public static class NightDump extends Thread{

        @Override
        public void run() {
            Dump.generateNightDumpAdd(Dump.getDumpArray());
        }
    }

    public static class NightAssistant extends Thread{
        private Assistant assistant;
        private Scientist scientist;

        public NightAssistant(Scientist scientist, Assistant assistant) {
            this.scientist = scientist;
            this.assistant = assistant;
        }

        @Override
        public void run() {
            scientist.getDetail(assistant.generateNightAssistant());
            scientist.createRobot();
        }
    }
}
