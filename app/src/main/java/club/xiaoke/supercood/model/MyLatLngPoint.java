package club.xiaoke.supercood.model;

/**
 * @author SHANG01
 * 自定义经纬度坐标描述
 */
public class MyLatLngPoint {
	
	public MyLatLngPoint(double lat, double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	
	double lat;
	double lng;
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}

}
