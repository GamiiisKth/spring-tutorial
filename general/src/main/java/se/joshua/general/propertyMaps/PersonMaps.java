package se.joshua.general.propertyMaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class PersonMaps {

    private String userName;
    private Integer ssn;


    private Map<Integer, String> stringMap = new HashMap<>();

    public PersonMaps() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public Map<Integer, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<Integer, String> stringMap) {
        this.stringMap = stringMap;
    }


    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringMap.entrySet().forEach(stringBuilder::append);
        return String.valueOf(Collections.singletonList(stringBuilder.toString()));

    }
}
