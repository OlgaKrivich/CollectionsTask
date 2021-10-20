package task3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.RandomStringUtils;

public class ReplaceOperation {

    public <K, V> Map<? extends K, ? extends V> createNonConvertedMap(int numberOfSets) {
        Map<K, V> nonConvertedMap = new HashMap<>();
        for (int i = 0; i < numberOfSets; i++) {
            String key = RandomStringUtils.randomNumeric(2);
            String value = RandomStringUtils.randomNumeric(4);
            nonConvertedMap.put((K) key, (V) value);
        }
        return nonConvertedMap;
    }

    public <K, V> Map<V, Collection<K>> replaceKeyWithValue(Map<? extends K, ? extends V> map) {

        Map<V, Collection<K>> convertedMap = new HashMap<>();

        for (K key : map.keySet()) {
            V valueConvertedMap = map.get(key);
            Collection<K> keysConvertedMap = Collections.singletonList(key);
            convertedMap.put(valueConvertedMap, keysConvertedMap);
        }

        for (Entry<V, Collection<K>> pairEntry : convertedMap.entrySet()) {
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }
        return convertedMap;
    }
}

