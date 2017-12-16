package dk.kea.examples.logic;

import java.util.*;

public class Mapping
{
    HashMap<String, List<String>> map = new HashMap<>();

    private void buildmap()
    {
        CSVReader csvReader = new CSVReader();
        ArrayList<City> arrayList = csvReader.nodeArrayList();

        System.out.println("building map\n.............");

        for (int i = 0; i < arrayList.size(); i++) {

            if (map.get(arrayList.get(i).getCountry()) != null) {
                map.get(arrayList.get(i).getCountry()).add(arrayList.get(i).getCity());
            }

            if (map.get(arrayList.get(i).getCountry()) == null) {
                List<String> list = new ArrayList<>();
                list.add(arrayList.get(i).getCity());

                map.put(arrayList.get(i).getCountry(),list);
            }
        }
    }

    public boolean getCitysInCountries(String country)
    {
        buildmap();

        country = " "+ country;

        if (map.get(country)!=null) {
            List<String> list = map.get(country);

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

            return true;
        }

        return false;
    }
}
