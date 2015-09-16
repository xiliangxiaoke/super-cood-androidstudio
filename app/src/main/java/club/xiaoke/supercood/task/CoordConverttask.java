package club.xiaoke.supercood.task;

import club.xiaoke.supercood.constants.CoordType;
import android.content.Context;
import android.os.AsyncTask;

public class CoordConverttask {
	
	double lat;
	double lng;
	int originCoordType;
	int resultCoordType;
	Context context;
	double reslat;
	double reslng;

	public CoordConverttask(double lat, double lng, int originCoordType,
			int resultCoordType,
			Context context) {
		
		this.lat = lat;
		this.lng = lng;
		this.originCoordType = originCoordType;
		this.resultCoordType = resultCoordType;
		this.context = context;
		
		//执行转换
		switch(originCoordType){
		case CoordType.CT_WGS84:
		case CoordType.CT_GOOGLE_EARTH:
		case CoordType.CT_GPS_DEVICE:
			WGS84_OTHER();
			break;
		case CoordType.CT_BD09:
			break;
		case CoordType.CT_GCJ02:
		case CoordType.CT_GOOGLE_MAP:
		case CoordType.CT_AMAP_GAODE:
		case CoordType.CT_TECENT:
			break;
		
		}
	}
	
	private void WGS84_OTHER(){
		switch(resultCoordType){
		case CoordType.CT_WGS84:
		case CoordType.CT_GOOGLE_EARTH:
		case CoordType.CT_GPS_DEVICE:
			
			break;
		case CoordType.CT_BD09:
			break;
		case CoordType.CT_GCJ02:
		case CoordType.CT_GOOGLE_MAP:
		case CoordType.CT_AMAP_GAODE:
		case CoordType.CT_TECENT:
			break;
		
		}
	}

	
}
