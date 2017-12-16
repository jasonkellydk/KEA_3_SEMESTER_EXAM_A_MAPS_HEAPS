package dk.kea.examples;

import dk.kea.ExampleInterface;
import dk.kea.examples.logic.Mapping;

public class MapsExample implements ExampleInterface
{
    @Override
    public String getDescription()
    {
        return "This example will demonstrate maps";
    }

    @Override
    public String getName()
    {
        return "Maps example";
    }

    @Override
    public void runExample()
    {
        Mapping mapping = new Mapping();

        if (!mapping.getCitysInCountries("Australia")) {
            System.out.println("Could not find Australia");
        }
    }
}
