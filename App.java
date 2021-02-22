import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class App{
    public static void main(String[] args){
        List<String> employeeNames = new ArrayList<String>();
        HashSet<Integer> ids = new HashSet<Integer>();
        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
        employeeNames.add("Steve");
        employeeNames.add("Jeff");
        employeeNames.add("Susan");
        employeeNames.add("Linnea");
        employeeNames.add("Anthony");
        employeeNames.add("Thomas");
        ids.add(12345);
        ids.add(22459);
        ids.add(88888);
        ids.add(69420);
        ids.add(86753);
        ids.add(13579);
        int i = 0;
        for (int id : ids){
            employeeMap.put(id, employeeNames.get(i));
            i++;
        }

        for (int id: employeeMap.keySet()){
            System.out.println(id + " " + employeeMap.get(id));
        }

        StringBuilder idsBuilder = new StringBuilder();
        for (int id : ids){
            idsBuilder.append(id + "-");
        }
        System.out.println(idsBuilder.toString());

        StringBuilder nameBuilder = new StringBuilder();
        for (String name : employeeNames){
            nameBuilder.append(name + " ");
        }
        System.out.println(nameBuilder.toString());
    }
}