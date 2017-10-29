package Work15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Scientist {
    private String name;
    private Assistant assistant;
    private HashMap<String, Integer> robotMap = new HashMap<>();
    private int count = 0;

    public Scientist(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public Scientist(String name, Assistant assistant) {
        this.name = name;
        this.robotMap = robotMap;
        this.assistant = assistant;
    }

    public void getDetail (ArrayList<String> pickAssistArray) {
        int size = pickAssistArray.size();
        for (int i = 0; i < size; i++) {
            if (robotMap.get(pickAssistArray.get(i)) != null) {
                robotMap.put(pickAssistArray.get(i), robotMap.get(pickAssistArray.get(i)) + 1);
            } else {
                robotMap.put(pickAssistArray.get(i), 1);
            }
        }
        pickAssistArray.removeAll(pickAssistArray);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createRobot() {
        List<String> robotArray = Arrays.asList("Head", "Body", "LeftArm", "RightArm", "LeftLeg", "RightLeg", "CPU", "RAM", "HDD");
        while (robotMap.size() == 9) {
            for (String value: robotArray) {
                if (robotMap.get(value) > 1) {
                    robotMap.put(value, robotMap.get(value) - 1);
                } else {
                    robotMap.remove(value);
                }
            }
            System.out.println(getName() + " создал робота!");
            count++;
        }
        //System.out.println(robotMap);
        //System.out.println(count);
    }

    public void setRobotMap(HashMap<String, Integer> robotMap) {
        this.robotMap = robotMap;
    }
}
