package Work15;

import java.util.ArrayList;
import java.util.Random;

public class Dump {
    private static ArrayList<String> dumpArray;
    private static final Object LOCK = new Object();

    public static ArrayList<String> getDumpArray() {
        return dumpArray;
    }

    public void setDumpArray(ArrayList<String> dumpArray) {
        this.dumpArray = dumpArray;
    }

    public static ArrayList generateFirstNight(ArrayList<String> dumpArray) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            String nameDetail;
            int generateDetail = random.nextInt(9) + 1;
            nameDetail = getNameDetail(generateDetail);
            Dump.dumpArray = addDetailToDump(dumpArray, nameDetail);
            Dump.dumpArray = dumpArray;
        }
        System.out.println("На свалку выброшено 20 деталей");
        return Dump.dumpArray;
    }

    public static ArrayList generateNightDumpAdd(ArrayList<String> dumpArray) {
        Random random = new Random();
        int countDetail = random.nextInt(4) + 1;
        System.out.println("На свалку выброшено следующее кол-во деталей: " + countDetail);
        String nameDetail;
        for (int i = 0; i < countDetail; i++) {
            int detail = random.nextInt(9) + 1;
            nameDetail = getNameDetail(detail);
            dumpArray = addDetailToDump(dumpArray, nameDetail);
            Dump.dumpArray = dumpArray;
        }
        return dumpArray;
    }

    private static String getNameDetail(int detail) {
        String nameDetail = "";
        switch (detail) {
            case 1:
                nameDetail = "Head";
                break;
            case 2:
                nameDetail = "Body";
                break;
            case 3:
                nameDetail = "LeftArm";
                break;
            case 4:
                nameDetail = "RightArm";
                break;
            case 5:
                nameDetail = "LeftLeg";
                break;
            case 6:
                nameDetail = "RightLeg";
                break;
            case 7:
                nameDetail = "CPU";
                break;
            case 8:
                nameDetail = "RAM";
                break;
            case 9:
                nameDetail = "HDD";
                break;
        }
        return nameDetail;
    }

    public static ArrayList addDetailToDump(ArrayList<String> dumpArray, String detail) {
        synchronized (LOCK) {
            dumpArray.add(detail);
        }
        return dumpArray;
    }

    public static ArrayList takeDetail (ArrayList<String> assistantArray, int indexDetail) {
        synchronized (LOCK) {
            if (indexDetail >= dumpArray.size()) {
                indexDetail =  dumpArray.size() - 1;
            }
            String detail = dumpArray.get(indexDetail);
            dumpArray.remove(indexDetail);
            assistantArray = addDetailToDump(assistantArray, detail);
        }
        return assistantArray;
    }
}
