package ru.routeeditor.services;

import ru.routeeditor.commons.GeoPointContainer;
import ru.routeeditor.commons.IRouteService;
import ru.routeeditor.commons.Route;
import ru.routeeditor.commons.RouteTypes;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sichev on 07.04.2017.
 */
public class IRoutService implements IRouteService{
    @Override
    public List<Route> list(int limit, int offset) {
        List<Route> routs = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            routs.add(new Route((long) i, "Route # "+i, "Zalupa "+i+" zalupa", Instant.now(), RouteTypes.GEO_CALC));
        }

        return routs;
    }

    @Override
    public List<GeoPointContainer> loadGeometry(long id) {

        List<GeoPointContainer> geometries = new LinkedList<GeoPointContainer>();

        for (int i = 0; i < 100; i++) {
            geometries.add(new GeoPointContainer((double) i*6.66,(double) i*3.14));
        }

        return geometries;
    }
}
