package com.example.osmdroiddemomap;

import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import android.app.Activity;
import android.os.Bundle;

// This is all you need to display an OSM map using osmdroid
public class OsmMainActivity extends Activity {

    private MapView         mMapView;
    private MapController   mMapController;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.osm_main);
        mMapView = (MapView) findViewById(R.id.mapview);
        mMapView.setTileSource(TileSourceFactory.MAPNIK);
        mMapView.setBuiltInZoomControls(true);
        mMapView.setMultiTouchControls(true);
        mMapController = mMapView.getController();
        mMapController.setZoom(13);
        GeoPoint gPt = new GeoPoint(51921700, 4481100);
        //Centre map near Rotterdam center
        mMapController.setCenter(gPt);

        
        //Implement into activity!!!
    }
}
