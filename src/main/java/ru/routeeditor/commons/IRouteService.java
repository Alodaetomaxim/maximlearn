package ru.routeeditor.commons;

import java.util.List;

/**
 * Created by mark on 07.04.17.
 */
public interface IRouteService {
    public List<Route> list(int limit, int offset);

    public List<GeoPointContainer> loadGeometry(long id);
}
