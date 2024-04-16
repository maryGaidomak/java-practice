package city;

import java.util.*;

public class City {
    private final String name;
    private final Map<City, Integer> routes;

    public City(String name) {
        this.name = name;
        this.routes = new HashMap<>();
    }

    public void addRoute(City city, int cost) {
        if (routes.containsKey(city))
            throw new IllegalArgumentException("Маршрут уже существует");
        routes.put(city, cost);
    }

    public void removeRoute(City city) {
        routes.remove(city);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (routes.isEmpty())
            return name;
        sb.append(name).append(" -> ");
        Set<Map.Entry<City, Integer>> entries = routes.entrySet();
        for (Map.Entry<City, Integer> entry : entries) {
            sb.append(entry.getKey().name).append(": ").append(entry.getValue()).append(", ");
        }
        return !sb.isEmpty() ? sb.substring(0, sb.length() - 2) : sb.toString();
    }

    public String getName() {
        return name;
    }

    public Map<City, Integer> getRoutes() {
        return routes;
    }

}
