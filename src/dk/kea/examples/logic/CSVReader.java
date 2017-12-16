package dk.kea.examples.logic;

import java.io.*;
import java.util.ArrayList;

public class CSVReader
{
    public ArrayList<City> nodeArrayList()
    {
        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(classLoader.getResource("resources/Cities.csv").getFile());

        String csvFile = file.toString();

        BufferedReader br = null;

        String line = "";

        String cvsSplitBy = ";";

        ArrayList<City> arrayList = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                int longitude;

                int degree = Integer.parseInt(country[2]);

                int minutes = Integer.parseInt(country[3]);

                if (country[4].equals("S")) {
                    longitude = degree + (minutes / 60) *- 1;
                } else {
                    longitude = degree + (minutes / 60);
                }

                int latitude;

                degree = Integer.parseInt(country[5]);
                minutes = Integer.parseInt(country[6]);

                if (country[7].equals("w")) {
                    latitude=degree+(minutes / 60);
                } else {
                    latitude=degree+(minutes / 60) *- 1;
                }

                City node = new City(country[0], country[1], longitude, latitude);

                arrayList.add(node);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return arrayList;
    }
}