package Map;

import java.util.ArrayList;

public class MyMap<Obj1, Obj2> {
    private final ArrayList<Obj1> keys;
    private final ArrayList<Obj2> values;

    public MyMap(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(Obj1 key, Obj2 value){
        if (keys.contains(key)){
            values.set(keys.indexOf(key), value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public Obj2 get(Obj1 key){
        if (keys.contains(key)){
            return values.get(keys.indexOf(key));
        }

        return null;
    }

    public Obj2 remove(Obj1 key){
        if (keys.contains(key)){
            int index = keys.indexOf(key);

            keys.remove(index);
            Obj2 value = values.get(index);

            values.remove(index);

            return value;
        }

        return null;
    }

    /* For checking purposes */

    @Override
    public String toString() {
        StringBuilder myMap = new StringBuilder("\nMAP CONTENTS: \n");

        for (int i = 0; i < keys.size(); i++){
            myMap.append(keys.get(i)).append(" : ").append(values.get(i)).append("\n");
        }

        return myMap.toString();
    }
}
