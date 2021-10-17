package task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReplaceOperation {

    public Map<String, String> createMap() {
        Map<String, String> keyValueMap = new HashMap<>();
        keyValueMap.put("gjgj", "5");
        keyValueMap.put("gkfgk", "8");
        keyValueMap.put("sksk", "12");
        keyValueMap.put("hkkh", "15");
        return keyValueMap;
    }

    public Map<String, Collection<String>> replaceKeyAndValues(Map<String, String> keyValueMap) {
        Set<String> keys = keyValueMap.keySet();

        Map<String, Collection<String>> valueKeyMap = new HashMap<>();

        for (Map.Entry<String, String> item : keyValueMap.entrySet()) {
            valueKeyMap.put(item.getValue(), keys);
        }

        for (Map.Entry pairEntry : valueKeyMap.entrySet()) {
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }
        return valueKeyMap;
    }
}
