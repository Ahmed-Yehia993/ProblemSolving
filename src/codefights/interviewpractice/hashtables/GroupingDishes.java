package codefights.interviewpractice.hashtables;

import java.util.*;

public class GroupingDishes {

    public static void main(String[] args) {
        String[][] sd = {{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}};
        String[][] res = groupingDishes(sd);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    static String[][] groupingDishes(String[][] dishes) {
        Map<String, Set<String>> group = new HashMap<String, Set<String>>();
        for(int i=0; i < dishes.length; ++i) {
            String[] dish = dishes[i];
            String dish_name = dish[0];
            for(int j=1; j < dish.length; ++j) {
                String ingradient = dish[j];
                if(group.containsKey(ingradient)) {
                    group.get(ingradient).add(dish_name);
                } else {
                    Set<String> set = new HashSet<String>();
                    set.add(dish_name);
                    group.put(ingradient, set);
                }
            }
        }

        String[] ingradients = new String[group.size()];
        int index = 0;
        for(String ingradient : group.keySet()) {
            ingradients[index++] = ingradient;
        }
        Arrays.sort(ingradients);
        List<String[]> list =new ArrayList<String[]>();
        for(int i=0; i < group.size(); ++i) {
            String ingradient = ingradients[i];
            Set<String> dish_set = group.get(ingradient);
            if(dish_set.size() < 2) {
                continue;
            }
            index = 0;
            String[] dish_list = new String[dish_set.size()+1];
            for(String dish_name : dish_set) {
                dish_list[index++] = dish_name;
            }
            dish_list[index] = "";
            Arrays.sort(dish_list);
            dish_list[0] = ingradient;
            list.add(dish_list);
        }

        String[][] result = new String[list.size()][];
        for(int i=0; i < list.size(); ++i) {
            result[i] = list.get(i);
        }

        return result;
    }

}
